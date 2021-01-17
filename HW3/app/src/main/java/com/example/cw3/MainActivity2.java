package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView name = findViewById(R.id.name1);
        TextView age = findViewById(R.id.age1);
        TextView job = findViewById(R.id.job1);
        TextView phone = findViewById(R.id.phone1);
        TextView email = findViewById(R.id.email1);

        Bundle b = getIntent().getExtras();

        String  n = b.getString("name");
        String  a = b.getString("age");
        String  j = b.getString("job");
        String  p = b.getString("phone");
        String  e = b.getString("email");

        name.setText(n);
        age.setText(a);
        job.setText(j);
        phone.setText(p);
        email.setText(e);


    }
}