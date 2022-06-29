package com.example.registration;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


public class View_Notes extends AppCompatActivity {

    ListView myPDFListView;
    DatabaseReference databaseReference;
    List<uploadpdf> uploadpdfs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_notes);

        myPDFListView = (ListView)findViewById(R.id.myListView);
        uploadpdfs = new ArrayList<>();

        viewAllFiles();

        myPDFListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                uploadpdf uploadpdf = uploadpdfs.get(position);
                Intent intent = new Intent();
                intent.setData(Uri.parse(uploadpdf.getUrl()));
                startActivity(intent);
            }
        });




    }
    private void viewAllFiles(){
        databaseReference = FirebaseDatabase.getInstance().getReference("uploads");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot postSnapshot: dataSnapshot.getChildren()){
                    uploadpdf uploadpdf = postSnapshot.getValue(com.example.registration.uploadpdf.class);
                    uploadpdfs.add(uploadpdf);


                }
                String[] uploads = new String[uploadpdfs.size()];
                for(int i=0;i<uploads.length;i++){
                    uploads[i] = uploadpdfs.get(i).getName();
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,uploads);
                myPDFListView.setAdapter(adapter);

            }


            @Override
            public void onCancelled(@NotNull DatabaseError databaseError) {

            }
        });
    }
}