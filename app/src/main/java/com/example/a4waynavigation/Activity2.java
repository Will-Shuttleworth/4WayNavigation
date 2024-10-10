package com.example.a4waynavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        int id = v.getId();

        switch(v.getId()){
            case R.id.button1:
                Intent intent1 = new Intent(this, MainActivity.class);
                this.startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(this, Activity3.class);
                this.startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(this, Activity4.class);
                this.startActivity(intent3);
                break;
        }
    }
}