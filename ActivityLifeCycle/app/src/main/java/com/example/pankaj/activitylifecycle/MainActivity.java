package com.example.pankaj.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
String TAG = "MainActivity";
    Button btnnextactivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "Oncreate()");
        btnnextactivity=(Button)findViewById(R.id.btnnext);
        btnnextactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(it);
            }
        });
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
        MainActivity.this.finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "OnDestroy()");
    }
}
