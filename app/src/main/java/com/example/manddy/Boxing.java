package com.example.manddy;

import static com.example.manddy.R.id.boxingbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Boxing extends AppCompatActivity {
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boxing);
        button4 = (Button) findViewById(boxingbutton);
        button4.setOnClickListener(v -> {
            Toast.makeText(Boxing.this, "Class Booked", Toast.LENGTH_SHORT).show();
            Intent int2 = new Intent(Boxing.this, ViewActivity.class);
            startActivity(int2);
            finish();
        });
    }
}