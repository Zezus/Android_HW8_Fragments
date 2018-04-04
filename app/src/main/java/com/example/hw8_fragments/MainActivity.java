package com.example.hw8_fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements ListFragment.Callback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void changeFragmentClicked(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (isFirstFragmentShowing) {
            isFirstFragmentShowing = false;
            transaction.replace(R.id.am_content_container, new BlankFragment());
        } else {
            isFirstFragmentShowing = true;
            transaction.replace(R.id.am_content_container, new SecondFragment());
        }

        transaction.commit();
    }
}
