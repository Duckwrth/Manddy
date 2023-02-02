package com.example.manddy;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.listview);

        java.util.List<String> list = new ArrayList<>();
        list.add("Yoga");
        list.add("Pilates");
        list.add("Tai Chi");
        list.add("Boxing");
        list.add("Zumba");
        list.add("Spin");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, (java.util.List) list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            if(position==0){
                //clicked Yoga
                Intent r=new Intent(List.this ,Yoga.class );
                r.putExtra("extra", id);
                startActivity(new Intent(List.this,Yoga.class));

            }else if(position==1){
                //clicked Pilates
                Intent r=new Intent(List.this ,Pilates.class );
                r.putExtra("extra", id);
                startActivity(new Intent(List.this,Pilates.class));
            }else if (position==2){
                //clicked Tai Chi
                Intent r=new Intent(List.this ,TaiChi.class );
                r.putExtra("extra", id);
                startActivity(new Intent(List.this,TaiChi.class));
            }else if(position==3){
                //clicked Boxing
                Intent r=new Intent(List.this ,Boxing.class );
                r.putExtra("extra", id);
                startActivity(new Intent(List.this,Boxing.class));
            }else if(position==4){
                //clicked Zumba
                Intent r=new Intent(List.this ,Zumba.class );
                r.putExtra("extra", id);
                startActivity(new Intent(List.this,Zumba.class));
            }else if(position==5){
                //clicked Spin
                Intent r=new Intent(List.this ,Spin.class );
                r.putExtra("extra", id);
                startActivity(new Intent(List.this,Spin.class));
            }else{

            }
        });
    }
}