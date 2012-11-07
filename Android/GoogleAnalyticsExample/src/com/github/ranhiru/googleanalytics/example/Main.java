package com.github.ranhiru.googleanalytics.example;

import org.apache.cordova.DroidGap;

import com.google.analytics.tracking.android.EasyTracker;

import android.os.Bundle;

public class Main extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {    	
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/analytics-test.html");
    }
    
    @Override
    public void onStart() {
      super.onStart();      
      EasyTracker.getInstance().activityStart(this);
    }

    @Override
    public void onStop() {
      super.onStop();      
      EasyTracker.getInstance().activityStop(this);
    }
}
