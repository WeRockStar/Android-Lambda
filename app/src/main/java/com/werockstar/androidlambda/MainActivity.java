package com.werockstar.androidlambda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHello = (Button) findViewById(R.id.btnHello);
        btnHello.setOnClickListener(v -> {
            Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show();
        });
    }
}
