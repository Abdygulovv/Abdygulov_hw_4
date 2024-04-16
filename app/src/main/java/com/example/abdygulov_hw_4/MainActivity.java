package com.example.abdygulov_hw_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.abdygulov_hw_4.continent.ContinentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container_fragment, new ContinentFragment()).commit();

    }
}