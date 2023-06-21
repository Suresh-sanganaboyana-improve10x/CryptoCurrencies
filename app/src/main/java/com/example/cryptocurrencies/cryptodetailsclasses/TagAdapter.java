package com.example.cryptocurrencies.cryptodetailsclasses;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocurrencies.databinding.TagItemBinding;
import com.example.cryptocurrencies.pojoclass.Tags;

import java.util.List;

public class TagAdapter extends RecyclerView.Adapter<TagViewHolder> {

    private List<Tags> tags;


    void setTags(List<Tags> tags) {
        this.tags = tags;
    }


    @NonNull
    @Override
    public TagViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TagItemBinding binding = TagItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        TagViewHolder tagViewHolder = new TagViewHolder(binding);
        return tagViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TagViewHolder holder, int position) {
        Tags tags1 = tags.get(position);
        holder.binding.setTags(tags1);
    }

    @Override
    public int getItemCount() {
        return tags.size();
    }
}
