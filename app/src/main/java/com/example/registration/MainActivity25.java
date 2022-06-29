package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
    }
    public void openBookM(View v) {
        Toast.makeText(this, "MATHS BOOKS", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void openFormulaM(View v) {
        Toast.makeText(this, "MATHS FORMULAE", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity29.class);
        startActivity(intent);
    }
    public void openPYQM(View v) {
        Toast.makeText(this, "MATHS PYQs", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity30.class);
        startActivity(intent);
    }
    public void openLecM(View v) {
        Toast.makeText(this, "MATHS LECTURES", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity31.class);
        startActivity(intent);
    }
}