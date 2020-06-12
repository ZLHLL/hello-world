package com.example.holleworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.holleworld.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PuAdapter extends RecyclerView.Adapter<PuAdapter.PuViewHolder> {

    private Context mContext;
    private OnClickPuItemListener mListener;

    public PuAdapter(Context context,OnClickPuItemListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public PuAdapter.PuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PuViewHolder puViewHolder = new PuViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_pu_item, parent, false));
        return puViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PuAdapter.PuViewHolder holder, final int position) {
        if(position % 2 == 0){
            holder.imageView.setImageResource(R.drawable.flower1);
        }else{
            holder.imageView.setImageResource(R.drawable.flower3);
        }
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    class PuViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public PuViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_pu);
        }
    }

    public interface OnClickPuItemListener{
        void onClick(int pos);
    }
}
