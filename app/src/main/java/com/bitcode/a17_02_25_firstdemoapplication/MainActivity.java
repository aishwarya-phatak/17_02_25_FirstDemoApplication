package com.bitcode.a17_02_25_firstdemoapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout container;
    TextView textView;
    EditText editText;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);
        container.setPadding(20,20,20,20);
        container.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

        LinearLayout.LayoutParams layoutParamsForContainer = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        container.setLayoutParams(layoutParamsForContainer);

        LinearLayout.LayoutParams layoutParamsForViews = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        textView = new TextView(this);
        textView.setText("Welcome To Android At Bitcode!");
        textView.setPadding(5,5,5,5);
        textView.setTextSize(30.0F);
        textView.setLayoutParams(layoutParamsForViews);
        container.addView(textView);

        editText = new EditText(this);
        editText.setLayoutParams(layoutParamsForViews);
        editText.setHint("Enter your name");
        container.addView(editText);

        btnSubmit = new Button(this);
        btnSubmit.setLayoutParams(layoutParamsForViews);
        btnSubmit.setText("Submit");
        container.addView(btnSubmit);

        //way 4 -- reference of interface to object of class
        View.OnClickListener listener = new MyBtnSubmitClickListener();
        btnSubmit.setOnClickListener(listener);

        //way 3 -- object of anonymous class
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setText("Welcome " + editText.getText().toString());
//            }
//        });

        //way 2 -- attaching listener by implementing inner class
        //btnSubmit.setOnClickListener(new MyBtnSubmitClickListener());

        //way 1 -- of attaching listener by implementing listener at class level
        //btnSubmit.setOnClickListener(this);
        setContentView(container);
    }

    class MyBtnSubmitClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            textView.setText("Welcome " + editText.getText().toString());
        }
    }

//    @Override
//    public void onClick(View v) {
//        if(v == btnSubmit){
//            textView.setText("Welcome " + editText.getText().toString());
//        }
//    }
}