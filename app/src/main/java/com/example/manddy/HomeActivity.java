package com.example.manddy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity{
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn1 = findViewById(R.id.viewclass);
        btn2 = findViewById(R.id.bookclass);
        btn3 = findViewById(R.id.details);
        btn4 = findViewById(R.id.info);

        btn1.setOnClickListener(v -> {
            Intent int1 = new Intent(HomeActivity.this, ViewActivity.class);
            startActivity(int1);
            finish();
        });
        btn2.setOnClickListener(v -> {
            Intent int2 = new Intent(HomeActivity.this, List.class);
            startActivity(int2);
            finish();
        });
        btn3.setOnClickListener(v -> {
            Intent int3 = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(int3);
            finish();
        });

        btn4.setOnClickListener(v -> {
            Intent int4 = new Intent(HomeActivity.this, About.class);
            startActivity(int4);
            finish();
        });

    }
}