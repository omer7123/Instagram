package com.ripalay.instagram.ui.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ripalay.instagram.R;
import com.ripalay.instagram.databinding.FragmentLikeBinding;
import com.ripalay.instagram.ui.adapters.LikeAdapter;
import com.ripalay.instagram.ui.models.LikeModel;

import java.util.ArrayList;

public class LikeFragment extends Fragment {
    private ArrayList<LikeModel> list = new ArrayList<>();
    private FragmentLikeBinding binding;
    private LikeAdapter adapter = new LikeAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLikeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();
    }

    private void initRecycler() {
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        list.add(new LikeModel(R.drawable.ic_ava, "Ilya liked your photo", "2h", R.drawable.ic_rec));
        adapter.setList(list);
        binding.likeRv.setAdapter(adapter);
    }
}