package com.example.registrationpage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView image1,image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);

        image1.setBackgroundColor(Color.BLUE);
        image2.setBackgroundColor(Color.YELLOW);
    }
}