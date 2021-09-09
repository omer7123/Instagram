package com.ripalay.instagram.ui.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ripalay.instagram.R;
import com.ripalay.instagram.databinding.FragmentAccountBinding;
import com.ripalay.instagram.ui.adapters.ViewPagerAdapter;

import java.io.IOException;
import java.util.ArrayList;

public class AccountFragment extends Fragment {
    static final int GALLERY_REQUEST = 1;
    private FragmentAccountBinding binding;
    private ArrayList<Fragment> list = new ArrayList<>();
    // private ViewPagerAdapter adapter = new ViewPagerAdapter(this);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAccountBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewPager();
        binding.editProfile.setOnClickListener(v -> {
            Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
            photoPickerIntent.setType("image/*");
            startActivityForResult(photoPickerIntent, GALLERY_REQUEST);
        });


    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


    Bitmap bitmap = null;
        switch(requestCode) {
            case GALLERY_REQUEST:
                if(resultCode == Activity.RESULT_OK){
                    Uri selectedImage = data.getData();
                    try {
                        bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), selectedImage);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    binding.accAva.setImageBitmap(bitmap);
                }
        }
    }


    private void initViewPager() {
/*        list.add(new PostsFragment());
        list.add(new OtmechFragment());
        adapter.setList(list);
        binding.viewPager.setAdapter(adapter);*/
    }
}