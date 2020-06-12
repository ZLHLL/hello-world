package com.example.holleworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.holleworld.util.ToastUtil;

public class ToastActivity extends AppCompatActivity {
    private Button mBtnToast1,mBtnToast2,mBtnToast3,mBtnToast4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mBtnToast1 = findViewById(R.id.btn_toast1);
        mBtnToast2 = findViewById(R.id.btn_toast2);
        mBtnToast3 = findViewById(R.id.btn_toast3);
        mBtnToast4 = findViewById(R.id.btn_toast4);
        OnClick onClick = new OnClick();
        mBtnToast1.setOnClickListener(onClick);
        mBtnToast2.setOnClickListener(onClick);
        mBtnToast3.setOnClickListener(onClick);
        mBtnToast4.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_toast1:
                    Toast.makeText(getApplicationContext(),"toast",Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_toast2:
                    Toast toastCenter = Toast.makeText(getApplicationContext(),"居中toast",Toast.LENGTH_SHORT);
                    toastCenter.setGravity(Gravity.CENTER,0,0);
                    toastCenter.show();
                    break;
                case R.id.btn_toast3:
                    Toast toastCustom = new Toast(getApplicationContext());
                    LayoutInflater layoutInflater = LayoutInflater.from(ToastActivity.this);
                    View view = layoutInflater.inflate(R.layout.layout_toast,null);
                    TextView textView = view.findViewById(R.id.tv_toast);
                    ImageView imageView = view.findViewById(R.id.iv_toast1);
                    imageView.setImageResource(R.drawable.flower2);
                    textView.setText("自定义toast");
                    toastCustom.setView(view);
                    toastCustom.setDuration(Toast.LENGTH_LONG);
                    toastCustom.show();
                    break;
                case R.id.btn_toast4:
                    ToastUtil.showMsg(getApplicationContext(),"包装过的Toast");
                    break;
            }
        }
    }
}
