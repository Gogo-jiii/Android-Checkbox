package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox checkBoxA, checkBoxB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxA = findViewById(R.id.checkBoxA);
        checkBoxB = findViewById(R.id.checkBoxB);

        checkBoxA.setOnClickListener(this);
        checkBoxB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        boolean isChecked = ((CheckBox) view).isChecked();

        if (view == checkBoxA) {
            if (isChecked) {
                Toast.makeText(MainActivity.this, "A is checked.",
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, "A is un-checked.",
                        Toast.LENGTH_LONG).show();
            }
        } else if (view == checkBoxB) {
            if (isChecked) {
                Toast.makeText(MainActivity.this, "B is checked.",
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, "B is un-checked.",
                        Toast.LENGTH_LONG).show();
            }
        }
    }
}