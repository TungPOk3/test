package com.example.appcooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }

    public void goToCanhDetail(View v) {
        // Thực hiện các thao tác để chuyển trang, ví dụ:
        Intent canh = new Intent(this, CHITIETDANHMUC_Canh.class);
        startActivity(canh);
    }
    }
