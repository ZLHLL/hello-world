package com.example.holleworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.holleworld.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HorAdapter extends RecyclerView.Adapter<HorAdapter.HorViewHolder> {

    Context mContext;
    OnClickItemListener mListener;
    public HorAdapter(Context context,OnClickItemListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public HorAdapter.HorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        HorViewHolder horViewHolder = new HorViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_hor_item, parent, false));
        return horViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HorAdapter.HorViewHolder holder, final int position) {
            holder.textView.setText("水平滚动");
            holder.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onClick(position);
                }
            });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class HorViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public HorViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_hortitle);
        }
    }

    public interface OnClickItemListener{
        void onClick(int pos);
    }

}
