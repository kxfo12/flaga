package com.example.flaga;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private int counter = 0;
    private int wrongcounter = 0;
    private TextView textViewtt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewtt = findViewById(R.id.textViewtt);
    }

    public void wrong(View view){
        Toast.makeText(this, R.string.wrong, Toast.LENGTH_SHORT).show();
        wrongcounter++;
    }

    public void correct(View view){
        Toast.makeText(this, R.string.correct, Toast.LENGTH_SHORT).show();
        view.setVisibility(View.INVISIBLE);
        counter++;
        if(counter == 4){
            textViewtt.setText(R.string.win + wrongcounter);
        }
    }
}
