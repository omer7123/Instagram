package com.ripalay.instagram.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ripalay.instagram.databinding.HomeItemBinding;
import com.ripalay.instagram.ui.models.HomeModel;

import java.util.ArrayList;

public class HomeRecycler extends RecyclerView.Adapter<HomeRecycler.ViewHolder> {
    private ArrayList<HomeModel> list = new ArrayList<>();

    public void setList(ArrayList<HomeModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(HomeItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private HomeItemBinding binding;

        public ViewHolder(@NonNull HomeItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(HomeModel homeModel) {
            binding.fotoIv.setImageResource(homeModel.getImageView());
            binding.dateTv.setText(homeModel.getData());
            binding.descriptionTv.setText(homeModel.getDescrib());
        }
    }
}
