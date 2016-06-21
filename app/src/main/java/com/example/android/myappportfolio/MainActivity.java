package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });
    }

/** Called when the user touches the button */
public void openProjectOne(View view){
    Toast.makeText(this, "This button will open my Popular Movies app!", Toast.LENGTH_LONG).show();
}
    public void openProjectTwo(View view){
        Toast.makeText(this, "This button will open my Stock Hawk app!", Toast.LENGTH_LONG).show();
    }

    public void openProjectThree(View view){
        Toast.makeText(this, "This button will open my Build It Bigger app!", Toast.LENGTH_LONG).show();

    }

    public void openProjectFour(View view){
        Toast.makeText(this, "This button will open my Make Your App Material app!", Toast.LENGTH_LONG).show();
    }

    public void openProjectFive(View view){
        Toast.makeText(this, "This button will open my Go Ubiquitous app!", Toast.LENGTH_LONG).show();
    }

    public void openProjectSix(View view){
        Toast.makeText(this, "This button will open my Capstone app!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
