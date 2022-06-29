
package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openCourse (View v){
        Toast.makeText(this, "Choose Your Course", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, selectActivity1.class);
        startActivity(intent);
    }
    public void openSearch (View v){
        Toast.makeText(this, "Search Any Book", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity18.class);
        startActivity(intent);
    }
    public void openNotes (View v){
        Toast.makeText(this, "Add Notes", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity33.class);
        startActivity(intent);
    }
    public void openForum (View v){
        Toast.makeText(this, "Discuss With Others", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity19.class);
        startActivity(intent);
    }
}