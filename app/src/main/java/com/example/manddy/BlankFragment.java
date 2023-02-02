package com.example.manddy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

     View fragment1View;
     ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragment1View = inflater.inflate(R.layout.fragment_blank, container, false);
        listView= fragment1View.findViewById(R.id.listview);
        return fragment1View;

    }

}