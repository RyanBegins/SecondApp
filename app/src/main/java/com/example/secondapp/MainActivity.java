package com.example.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.secondapp.R.id.myTextView;

public class MainActivity extends AppCompatActivity {

    private static final int MYCONST  =995;
    private static final int value = 252;
    private static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doThis();
    }

    private void doThis() {
        MyTextUtil textUtil = new MyTextUtil();
        textUtil.doSomethingElse();

        Intent intent = new Intent();

        Toast.makeText(this, "My message", Toast.LENGTH_SHORT).show();
        Log.i(LOG_TAG, "doThis: my message");

        TextView tv = findViewById(myTextView);



        )
    }

//    TODO: Finish this

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
