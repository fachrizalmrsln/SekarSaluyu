package com.example.fahri.sekarsaluyu;

import android.graphics.PorterDuff;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class ActivityContacts extends AppCompatActivity {

    Toolbar mToolbar;
    CollapsingToolbarLayout collapsingToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mToolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.colorAccent), PorterDuff.Mode.SRC_ATOP);
        collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Sekar Saluyu");

        CardView cardView1 = findViewById(R.id.card1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityContacts.this,"Card 1 ",Toast.LENGTH_SHORT).show();
            }
        });

        CardView cardView2 = findViewById(R.id.card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityContacts.this,"Card 2 ",Toast.LENGTH_SHORT).show();
            }
        });

        CardView cardView3 = findViewById(R.id.card3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityContacts.this,"Card 3 ",Toast.LENGTH_SHORT).show();
            }
        });

        CardView cardView4 = findViewById(R.id.card4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityContacts.this,"Card 4 ",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
