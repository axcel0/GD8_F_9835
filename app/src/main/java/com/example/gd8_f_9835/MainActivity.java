package com.example.gd8_f_9835;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    private CardView cvCreateUser, cvShowUser;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvCreateUser = findViewById(R.id.cvCreateUser);
        cvShowUser = findViewById(R.id.cvShowListUser);

        cvCreateUser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this, CreateUserActivity.class);
                startActivity(i);
            }
        });

        cvShowUser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this, ShowListUserActivity.class);
                startActivity(i);
            }
        });
    }
}