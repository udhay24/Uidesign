package com.example.udhayakumar.uidesign;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    TextView cookBook;
    TextView collections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cookBook = findViewById(R.id.cookbook_textview);
        collections = findViewById(R.id.collections_textview);

        cookBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookBook.setTextColor(ContextCompat.getColor(MainActivity.this , android.R.color.white));
                cookBook.setBackgroundColor(ContextCompat.getColor(MainActivity.this , R.color.colorPrimary));
                cookBook.setElevation(8);

                collections.setTextColor(ContextCompat.getColor(MainActivity.this , android.R.color.darker_gray));
                collections.setBackgroundColor(ContextCompat.getColor(MainActivity.this , android.R.color.white));
                collections.setElevation(0);
            }
        });

        collections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                collections.setTextColor(ContextCompat.getColor(MainActivity.this , android.R.color.white));
                collections.setBackgroundColor(ContextCompat.getColor(MainActivity.this , R.color.colorPrimary));
                collections.setElevation(8);

                cookBook.setTextColor(ContextCompat.getColor(MainActivity.this , android.R.color.darker_gray));
                cookBook.setBackgroundColor(ContextCompat.getColor(MainActivity.this , android.R.color.white));
                cookBook.setElevation(0);
            }
        });

        cookBook.callOnClick();

        ImageView profile = findViewById(R.id.profile_image);
        Picasso.get().load(R.drawable.profile).into(profile);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

    }

    @Override
    protected void onStart() {
        super.onStart();
        GridView gridView = findViewById(R.id.recipe);
        gridView.setAdapter(new RecipeAdapter(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.navigation , menu);
        return true;
    }
}
