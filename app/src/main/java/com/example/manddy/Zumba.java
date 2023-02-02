package com.example.manddy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Zumba extends AppCompatActivity {
    Button button5;
    TextView number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zumba);
        button5 = findViewById(R.id.zumbabutton);
        button5.setOnClickListener(v -> {
            Toast.makeText(Zumba.this, "Class Booked", Toast.LENGTH_SHORT).show();
            Intent int2 = new Intent(Zumba.this, ViewActivity.class);
            TextView number = findViewById(R.id.number);
            startActivity(int2);
            finish();
        });
    }
}