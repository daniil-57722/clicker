package com.example.happiness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer rain_counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtnAddDrops(View view) {
        rain_counter++;
        TextView counterView = (TextView)findViewById(R.id.rain_counter);
        counterView.setText(rain_counter.toString());
    }
    public void onClickBtnSubDrops(View view) {
        if (rain_counter > 100){
        rain_counter-=100;}
        else{
            rain_counter = 0;
        }
        TextView counterView = (TextView)findViewById(R.id.rain_counter);
        counterView.setText(rain_counter.toString());
    }
}
