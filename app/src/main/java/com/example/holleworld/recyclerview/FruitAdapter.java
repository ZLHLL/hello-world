package com.example.holleworld.recyclerview;

import android.view.ViewGroup;

import com.example.holleworld.recyclerview.bean.Fruit;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FruitAdapter extends RecyclerView.Adapter {
    private List<Fruit> mFruitList;



    public FruitAdapter(List<Fruit> fruitList) {
        this.mFruitList = fruitList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
