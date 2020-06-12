package com.example.holleworld.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.holleworld.R;
import com.example.holleworld.gridview.GridViewActivity;

public class RecyclerViewActivity extends AppCompatActivity {
    private Button mBtnLinear;
    private Button mBtnHor;
    private Button mBtnGrid;
    private Button mBtnPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mBtnLinear = findViewById(R.id.btn_linear);
        mBtnHor = findViewById(R.id.btn_hor);
        mBtnGrid = findViewById((R.id.btn_grid));
        mBtnPu = findViewById(R.id.btn_pu);
        initSetOnClickListener();
    }

    private void initSetOnClickListener(){
        OnClick onClick = new OnClick();
        mBtnLinear.setOnClickListener(onClick);
        mBtnHor.setOnClickListener(onClick);
        mBtnGrid.setOnClickListener(onClick);
        mBtnPu.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_linear:
                    intent = new Intent(RecyclerViewActivity.this,LinearRecyclerViewActivity.class);
                    break;
                case R.id.btn_hor:
                    intent = new Intent(RecyclerViewActivity.this,HorRecyclerViewActivity.class);
                    break;
                case R.id.btn_grid:
                    intent = new Intent(RecyclerViewActivity.this, GridRecycleViewActivity.class);
                    break;
                case R.id.btn_pu:
                    intent = new Intent(RecyclerViewActivity.this, PuRecycleViewActivity.class);
            }
            startActivity(intent);
        }
    }
}
