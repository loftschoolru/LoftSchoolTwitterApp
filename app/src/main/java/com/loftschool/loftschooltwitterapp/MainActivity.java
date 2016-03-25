package com.loftschool.loftschooltwitterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String userName = getIntent().getStringExtra(ConstantsManager.USER_NAME);

        Bundle bundle = new Bundle();
        bundle.putString(ConstantsManager.USER_NAME, userName);
        TimelineFragment timelineFragment = new TimelineFragment();
        timelineFragment.setArguments(bundle);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.root_container, timelineFragment)
                .commit();
    }
}
