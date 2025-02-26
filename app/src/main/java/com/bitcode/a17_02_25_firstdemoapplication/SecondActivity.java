package com.bitcode.a17_02_25_firstdemoapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    ImageView imgView;
    TextView welcomeTxtView;
    EditText edtUserName;
    Button btnSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initViews();
        bindData();
        setListeners();
    }

    private void initViews(){
        imgView = findViewById(R.id.imgView);
        welcomeTxtView = findViewById(R.id.welcomeTxtView);
        edtUserName = findViewById(R.id.edtUserName);
        btnSubmit = findViewById(R.id.btnSubmit);
    }

    private void bindData(){
        imgView.setImageResource(R.drawable.ic_launcher_background);
        welcomeTxtView.setText("Welcome To Bitcode For Android");
    }

    private void setListeners(){
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeTxtView.setText("Welcome " + edtUserName.getText().toString());
            }
        });
    }
}
