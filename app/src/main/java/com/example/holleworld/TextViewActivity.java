package com.example.holleworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv4;
    private TextView mTv5;
    private TextView mTv7;
    private TextView mTv8;
    private TextView mTv9;
    private TextView mTv10;
    private TextView mTv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv4 = findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//设置中划线
        mTv4.getPaint().setAntiAlias(true);//去除锯齿
        mTv5 = findViewById(R.id.tv_5);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//添加下划线
        mTv7 = findViewById(R.id.tv_7);
        mTv7.setSelected(true);
        mTv8 = findViewById(R.id.tv_8);
        mTv8.setSelected(true);
        mTv9 = findViewById(R.id.tv_9);
        mTv9.setSelected(true);
        mTv10 = findViewById(R.id.tv_10);
        mTv10.setSelected(true);
        mTv11 = findViewById(R.id.tv_11);
        mTv11.setSelected(true);
    }
}
