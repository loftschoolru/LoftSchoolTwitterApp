package com.loftschool.loftschooltwitterapp;

import android.app.Application;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

public class LSTwitterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TwitterAuthConfig authConfig = new TwitterAuthConfig(getString(R.string.tweeter_key),
                getString(R.string.tweeter_secret));
        Fabric.with(this, new Twitter(authConfig));
    }
}
