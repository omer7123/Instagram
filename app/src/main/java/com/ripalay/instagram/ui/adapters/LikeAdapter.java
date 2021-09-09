package com.ripalay.instagram.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ripalay.instagram.databinding.HomeItemBinding;
import com.ripalay.instagram.databinding.LikeItemBinding;
import com.ripalay.instagram.ui.models.LikeModel;

import java.util.ArrayList;

public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.ViewHolder> {
    private ArrayList<LikeModel> list = new ArrayList<>();

    public void setList(ArrayList<LikeModel> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LikeAdapter.ViewHolder(LikeItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

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
        private LikeItemBinding binding;

        public ViewHolder(@NonNull LikeItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(LikeModel likeModel) {
            binding.avaIv.setImageResource(likeModel.getAvatar());
            binding.nameTv.setText(likeModel.getName());
            binding.timeTv.setText(likeModel.getTime());
            binding.recIv.setImageResource(likeModel.getRec());

        }
    }
}
