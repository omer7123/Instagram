package com.ripalay.instagram.ui.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ripalay.instagram.R;
import com.ripalay.instagram.databinding.FragmentHomeBinding;
import com.ripalay.instagram.ui.adapters.HomeRecycler;
import com.ripalay.instagram.ui.models.HomeModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private ArrayList<HomeModel> list = new ArrayList<>();
    private HomeRecycler adapter = new HomeRecycler();
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();
    }

    private void initRecycler() {
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));
        list.add(new HomeModel(R.drawable.ic_lenta,"September 27", "opisanie"));

        adapter.setList(list);
        binding.homeRv.setAdapter(adapter);
    }
}