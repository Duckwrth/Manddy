package com.example.manddy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        BlankFragment fragment1=new BlankFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragement1, fragment1).commit();
    }
}