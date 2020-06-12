package com.example.holleworld.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.holleworld.R;
import com.example.holleworld.gridview.GridViewActivity;

public class GridRecycleViewActivity extends AppCompatActivity {
    private RecyclerView mRvGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycle_view);
        mRvGrid = findViewById(R.id.rv_grid);
        mRvGrid.setLayoutManager(new GridLayoutManager(GridRecycleViewActivity.this,3));
        mRvGrid.setAdapter(new GridAdapter(GridRecycleViewActivity.this, new GridAdapter.OnClickGridItemListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(GridRecycleViewActivity.this,"recycle点击..." + pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
