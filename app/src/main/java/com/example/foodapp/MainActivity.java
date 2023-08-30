package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void setFoodDescription(View v){
       // Toast.makeText(v.getContext(),"Hey hey!", Toast.LENGTH_SHORT).show();
        Spinner s = findViewById(R.id.spinner);
        TextView tv = findViewById(R.id.textView);
        String food = (String) s.getSelectedItem();
        if (food.equals("Pizza")){
            tv.setText("Pizza is from Italy");
        } else if (food.equals("Ramen")){
            tv.setText("nothing beats a hot bowl of Ramen");
        } else if (food.equals("Taco")){
            tv.setText("Hope you like Tacos!");
        }


    }
}