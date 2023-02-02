package com.example.manddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Yoga extends AppCompatActivity {
    Button button0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        button0 = (Button) findViewById(R.id.yogabutton);

        button0.setOnClickListener(v -> {
            Toast.makeText(Yoga.this, "Class Booked", Toast.LENGTH_SHORT).show();
            Intent int2 = new Intent(Yoga.this, ViewActivity.class);
            startActivity(int2);
            finish();
        });
    }
}