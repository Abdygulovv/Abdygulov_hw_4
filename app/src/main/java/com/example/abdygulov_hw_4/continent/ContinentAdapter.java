package com.example.abdygulov_hw_4.continent;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.abdygulov_hw_4.OnClick;
import com.example.abdygulov_hw_4.databinding.ItemContinentBinding;
import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
    private ArrayList<Continent> continentArrayList;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<Continent> continentArrayList, OnClick onClick) {
        this.continentArrayList = continentArrayList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(continentArrayList.get(position));
        holder.itemView.setOnClickListener(view -> {
            onClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentArrayList.size();
    }
}

class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;

    public ContinentViewHolder(@NonNull ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Continent continent) {
        binding.tvContinent.setText(continent.getContinentName());
        Glide.with(binding.imgContinent).load(continent.getImgContinent()).into(binding.imgContinent);
    }
}



