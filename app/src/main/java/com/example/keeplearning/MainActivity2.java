package com.example.keeplearning;

import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView tvHello;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_layout); //设置内容视图
        tvHello = findViewById(R.id.tv_hello);

        tvHello.setTypeface(Typeface.createFromAsset(getAssets(), "STCAIYUN.TTF"));
        //跑马灯效果
        tvHello.setSelected(true);

        editText = findViewById(R.id.etAccount);
        editText.setText("请输入文本");
        editText.setSelection(editText.getText().toString().length());

        ImageView ivPic = findViewById(R.id.iv_pic);
    }
}