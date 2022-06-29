package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void openActivity2(View v) {
        Toast.makeText(this, "PHYSICS", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity20.class);
        startActivity(intent);
    }

    public void openActivity3(View v) {
        Toast.makeText(this, "CHEMISTRY", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity24.class);
        startActivity(intent);
    }

    public void openActivity4(View v) {
        Toast.makeText(this, "MATHS", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity25.class);
        startActivity(intent);
    }
    public void joinForum(View v) {
        Toast.makeText(this, "Discuss With Others", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity19.class);
        startActivity(intent);
    }
}