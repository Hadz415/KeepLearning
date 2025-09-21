package com.example.keeplearning;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_layout); //设置内容视图
        tvHello = findViewById(R.id.tv_hello);

        tvHello.setText("你好");
        tvHello.setTypeface(Typeface.createFromAsset(getAssets(), "ST"));
    }
}