package com.example.keeplearning;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    TextView tvContent;
    private Button btnChangeJava;
    private Button btnToastShort;
    private Button btnToastLong;

//    private final String[] content = {
//            "打搅",
//            "睡觉",
//            "打乌蒙",
//            "打CHUNITHM",
//            "打明日方舟",
//            "吃饭",
//            "学习"
//    };

    private String[] content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2); //设置内容视图
        tvContent = findViewById(R.id.tv_content);
        btnChangeJava = findViewById(R.id.btn_change_java);
        btnToastShort = findViewById(R.id.btn_short);
        btnToastLong = findViewById(R.id.btn_long);

        content = getResources().getStringArray(R.array.myStrArray);

        for (int i = 0; i < content.length; i++) {
            Log.d("tag", "------content------" + content[i]);
        }

//        btnChangeJava.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tvContent.setText("Java");
//            }
//        });

        btnToastShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "请输入文本", Toast.LENGTH_SHORT).show();
            }
        });

        btnToastLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Please enter content", Toast.LENGTH_LONG).show();
            }
        });
        btnChangeJava.setOnClickListener(this);
    }



    public void changeText(View view){
        Log.d("tag", "-----改变前-----" + tvContent.getText());
        Random random = new Random();
        int index = random.nextInt(content.length);
        String newStr = content[index];
        tvContent.setText(newStr);
        Log.d("tag", "-----改变后-----" + tvContent.getText());
    }

    @Override
    public void onClick(View v) {
        tvContent.setText("Please enter content");
    }
}