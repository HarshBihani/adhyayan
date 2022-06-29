package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity7 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
        public void openActivity5(View v){
            Toast.makeText(this, "HC Verma Volume 1", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity6.class);
            startActivity(intent);
        }
    public void openActivity6(View v){
        Toast.makeText(this, "Irodov", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openActivity7(View v) {
        Toast.makeText(this, "HC Verma Volume 2", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
        public void openActivity8 (View v){
            Toast.makeText(this, "Cengage", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity9.class);
            startActivity(intent);
        }

    }

