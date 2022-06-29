package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void openActivity12 (View v){
        Toast.makeText(this, "H Pandey", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity13.class);
        startActivity(intent);
    }
    public void openActivity14 (View v){
        Toast.makeText(this, "N Avasthi", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity15.class);
        startActivity(intent);
    }
    public void openActivity15 (View v) {
        Toast.makeText(this, "JD Lee", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity16.class);
        startActivity(intent);
    }
    public void openActivity16 (View v) {
        Toast.makeText(this, "Cengage", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity17.class);
        startActivity(intent);
}

}