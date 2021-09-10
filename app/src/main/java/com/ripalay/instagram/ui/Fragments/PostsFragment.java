package com.ripalay.instagram.ui.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ripalay.instagram.R;
import com.ripalay.instagram.databinding.FragmentPostsBinding;
import com.ripalay.instagram.ui.adapters.PostAdapter;

import java.util.ArrayList;

public class PostsFragment extends Fragment {
    private FragmentPostsBinding binding;
    private ArrayList<Integer> list = new ArrayList<>();
    private PostAdapter adapter = new PostAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPostsBinding.inflate(inflater);

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
        adapter.setList(list);
        binding.postRv.setAdapter(adapter);
    }
}