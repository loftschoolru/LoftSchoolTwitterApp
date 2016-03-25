package com.loftschool.loftschooltwitterapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

public class TimelineFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.timeline_fragment, container, false);

        String userName = getArguments().getString(ConstantsManager.USER_NAME);

        final UserTimeline userTimeline = new UserTimeline.Builder()
                .screenName(userName)
                .build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter
                .Builder(getActivity())
                .setTimeline(userTimeline)
                .build();

        setListAdapter(adapter);

        return rootView;
    }
}
