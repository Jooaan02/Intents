package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String nom = "";
    EditText editText;
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);

        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);

        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.b1) {
            // Obrim l'activitat 2 amb l'intent

            Intent intent = new Intent( this, MainActivity2.class);
            startActivity(intent);
        }
    }
}