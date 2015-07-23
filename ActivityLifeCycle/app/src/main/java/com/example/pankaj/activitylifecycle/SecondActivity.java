package com.example.pankaj.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Pankaj on 7/22/2015.
 */
public class SecondActivity extends Activity {
    String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secod_activity);
        Log.e(TAG, "OnCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "OnStart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "OnResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "OnPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "OnDestroy()");
    }
}
