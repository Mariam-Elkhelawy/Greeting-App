package com.example.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button button = findViewById(R.id.mtBtn);
   TextView textView = findViewById(R.id.myText);
   EditText editText = findViewById(R.id.myEditText);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Welcome" + input + "to our greeting app !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}