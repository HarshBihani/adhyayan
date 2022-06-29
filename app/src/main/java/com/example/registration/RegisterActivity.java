package com.example.registration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class RegisterActivity extends AppCompatActivity {
    TextView btn;
    private EditText inputUsername, inputPassword, inputEmail, inputConformPassword;
    Button btnRegister;
    //Button btnLogout;
    private FirebaseAuth mAuth;
    private ProgressDialog mLoadingBar;
    //private FirebaseAuth mAuth;
//private ProgressDialog mLoadingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn=findViewById(R.id.alreadyHaveAccount);
        inputUsername = findViewById(R.id.inputUsername);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputConformPassword = findViewById(R.id.inputConformPassword);
        mAuth=FirebaseAuth.getInstance();
        mLoadingBar=new ProgressDialog(RegisterActivity.this);
      /*  btnLogout=findViewById(R.id.btnLogout);
        mAuth= FirebaseAuth.getInstance();
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });*/
        // mAuth = FirebaseAuth.getInstance();
        //mLoadingBar = new ProgressDialog(RegisterActivity.this);
        btnRegister=findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCredentials();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                
            }
        });
    }

    private void checkCredentials() {
        String username = inputUsername.getText().toString();
        String email = inputEmail.getText().toString();
        String password = inputPassword.getText().toString();
        String conformpassword = inputConformPassword.getText().toString();
        if(username.isEmpty() || username.length()<7){
            showError(inputUsername,"Your username is not valid!");
        }
        else if (email.isEmpty() || !email.contains("@")){
            showError(inputEmail,"Email is not valid");
        }
        else if (password.isEmpty() || password.length()<7){
            showError(inputPassword,"Password must be greater than 6 character");
        }
        else if (conformpassword.isEmpty() || !conformpassword.equals(password)){
            showError(inputConformPassword,"Password didn't match");
        }
        else{
        mLoadingBar.setTitle("Registration");
        mLoadingBar.setMessage("Please wait for a while");
        mLoadingBar.setCanceledOnTouchOutside(false);
        mLoadingBar.show();


        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(RegisterActivity.this, "Successfully registered", Toast.LENGTH_SHORT).show();
                    mLoadingBar.dismiss();
                    Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(RegisterActivity.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                }

            }
        });
        }
    }



    private void showError(EditText input, String s) {
        input.setError(s);
        input.requestFocus();
    }
}
