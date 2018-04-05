package com.example.hw8_fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements ListFragment.Callback {

    private LinearLayout itemLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        // добавляем фрагмент
        ListFragment myFragment = new ListFragment();
        fragmentTransaction.add(R.id.container, myFragment);
        fragmentTransaction.commit();

    }

    @Override
    public void changeFragmentClicked(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        itemLayout = findViewById(R.id.i_item_all_ll);
        itemLayout.setOnClickListener(view1 -> {
            transaction.replace(R.id.container, new ItemFragment());
        });

        transaction.commit();
    }
}
