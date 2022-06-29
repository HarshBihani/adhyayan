package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);
    }
    public void openBookC(View v) {
        Toast.makeText(this, "CHEMISTRY BOOKS", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void openFormulaC(View v) {
        Toast.makeText(this, "CHEMISTRY FORMULAE", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity26.class);
        startActivity(intent);
    }
    public void openPYQC(View v) {
        Toast.makeText(this, "CHEMISTRY PYQs", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity27.class);
        startActivity(intent);
    }
    public void openLecC(View v) {
        Toast.makeText(this, "CHEMISTRY LECTURES", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity28.class);
        startActivity(intent);
    }
}