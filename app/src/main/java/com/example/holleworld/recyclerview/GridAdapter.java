package com.example.holleworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.holleworld.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.gridViewHolder> {

    private Context mContext;
    private OnClickGridItemListener mListener;

    public GridAdapter(Context context,OnClickGridItemListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public GridAdapter.gridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        gridViewHolder gridViewHolder = new gridViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_grid_rv_item, parent, false));
        return gridViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.gridViewHolder holder, final int position) {
        holder.textView.setText("网格布局");
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 300;
    }

    class gridViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public gridViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }

    public interface OnClickGridItemListener{
        void onClick(int pos);
    }
}
