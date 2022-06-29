package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void openActivity9 (View v){
        Toast.makeText(this, "Cengage", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }
    public void openActivity10 (View v){
        Toast.makeText(this, "RD Sharma Volume 2", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }
    public void openActivity11 (View v){
        Toast.makeText(this, "RD Sharma Volume 1", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity12.class);
        startActivity(intent);
    }
    public void openActivity13 (View v){
        Toast.makeText(this, "Play With Graphs", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity14.class);
        startActivity(intent);
    }

}