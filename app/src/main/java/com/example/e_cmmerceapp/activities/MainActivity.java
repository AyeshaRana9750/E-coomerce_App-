package com.example.e_cmmerceapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.e_cmmerceapp.adapters.categaryAdapter;
import com.example.e_cmmerceapp.databinding.ActivityMainBinding;
import com.example.e_cmmerceapp.modal.categarymodel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
      ActivityMainBinding binding;
      categaryAdapter categaryAdapter;
      ArrayList<categarymodel> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        categories=new ArrayList<>();
        categories.add(new categarymodel("","","","",1));
        GridLayoutManager layoutManager=new GridLayoutManager(this,4);
        binding.catagorieslist.setLayoutManager(layoutManager);
        binding.catagorieslist.setAdapter(categaryAdapter);
    }
}