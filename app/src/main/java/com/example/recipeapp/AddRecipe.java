package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddRecipe extends AppCompatActivity {
    EditText e1,e2,e3;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_recipe);
        e1 = (EditText) findViewById(R.id.rtitle);
        e2 = (EditText) findViewById(R.id.desc);
        e3 = (EditText) findViewById(R.id.prep);
        b1 = (AppCompatButton) findViewById(R.id.submit);
        b2 = (AppCompatButton) findViewById(R.id.backbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String gettitle=e1.getText().toString();
                    String getdesc=e2.getText().toString();
                    String getprep=e3.getText().toString();
                    Toast.makeText(getApplicationContext(),gettitle+" "+getdesc+" "+getprep,Toast.LENGTH_LONG).show();
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"No Recipe Entered", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}