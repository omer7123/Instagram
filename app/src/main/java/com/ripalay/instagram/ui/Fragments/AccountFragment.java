package com.ripalay.instagram.ui.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ripalay.instagram.R;
import com.ripalay.instagram.databinding.FragmentAccountBinding;
import com.ripalay.instagram.ui.adapters.ViewPagerAdapter;

import java.util.ArrayList;

public class AccountFragment extends Fragment {
    private FragmentAccountBinding binding;
    private ArrayList<Fragment> list = new ArrayList<>();
    private ViewPagerAdapter adapter = new ViewPagerAdapter(this);

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

    }

    private void initViewPager() {
        list.add(new PostsFragment());
        list.add(new OtmechFragment());
        adapter.setList(list);
        binding.viewPager.setAdapter(adapter);
    }
}