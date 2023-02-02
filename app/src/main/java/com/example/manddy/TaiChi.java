package com.example.manddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class TaiChi extends AppCompatActivity {
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tai_chi);

        button3 = (Button) findViewById(R.id.bookbutton);
        button3.setOnClickListener(v -> {
            Toast.makeText(TaiChi.this, "Class Booked", Toast.LENGTH_SHORT).show();
            Intent int2 = new Intent(TaiChi.this, ViewActivity.class);
            startActivity(int2);
            finish();
        });
    }
}