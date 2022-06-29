package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
    }
    public void openBook(View v) {
        Toast.makeText(this, "PHYSICS BOOKS", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void openFormula(View v) {
        Toast.makeText(this, "PHYSICS FORMULAE", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity21.class);
        startActivity(intent);
    }
    public void openPYQ(View v) {
        Toast.makeText(this, "PHYSICS PYQs", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity22.class);
        startActivity(intent);
    }
    public void openLec(View v) {
        Toast.makeText(this, "PHYSICS LECTURES", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity23.class);
        startActivity(intent);
    }
    public void openQuiz(View v) {
        Toast.makeText(this, "PHYSICS QUIZ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity32.class);
        startActivity(intent);
    }
}