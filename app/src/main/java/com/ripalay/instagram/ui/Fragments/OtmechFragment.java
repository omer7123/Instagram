package com.ripalay.instagram.ui.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ripalay.instagram.R;
import com.ripalay.instagram.databinding.FragmentOtmechBinding;
import com.ripalay.instagram.ui.adapters.OtmechAdapter;

import java.util.ArrayList;

public class OtmechFragment extends Fragment {
    private ArrayList<Integer> list = new ArrayList<>();
    private OtmechAdapter adapter = new OtmechAdapter();
    private FragmentOtmechBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOtmechBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();
    }

    private void initRecycler() {
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        list.add(R.drawable.ic_post);
        adapter.setList(list);
        binding.otmechTv.setAdapter(adapter);

    }
}