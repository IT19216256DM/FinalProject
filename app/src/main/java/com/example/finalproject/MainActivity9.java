package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

public class MainActivity9 extends AppCompatActivity {


    EditText txtUser, txtPass;
    Button btnlog;
    DatabaseReference dbRef;
    Login log;


    private void clearControls() {
        txtUser.setText("");
        txtPass.setText("");


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }
}