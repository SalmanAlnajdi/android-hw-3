package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText job = findViewById(R.id.job);
        EditText phone = findViewById(R.id.phone);
        EditText email = findViewById(R.id.email);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);

                String n = name.getText().toString();
                String a = age.getText().toString();
                String j = job.getText().toString();
                String p = phone.getText().toString();
                String e = email.getText().toString();


                i.putExtra("name", n);
                i.putExtra("age", a);
                i.putExtra("job", j);
                i.putExtra("phone", p);
                i.putExtra("email", e);

                startActivity(i);

            }
        });


    }
}