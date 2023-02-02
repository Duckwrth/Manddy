package com.example.manddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Pilates extends AppCompatActivity {
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilates);
        button2 = (Button) findViewById(R.id.pilatesbutton);

        button2.setOnClickListener(v -> {
            Toast.makeText(Pilates.this, "Class Booked", Toast.LENGTH_SHORT).show();
            Intent int2 = new Intent(Pilates.this, ViewActivity.class);
            startActivity(int2);
            finish();
        });
    }
}