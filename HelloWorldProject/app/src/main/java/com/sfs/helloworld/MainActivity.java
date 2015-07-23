package com.sfs.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * this class is for login
 */
public class MainActivity extends Activity {
    //Declaring user interface
    private EditText edtuname;
    private EditText edtpassword;
    private Button btnsubmit, btncancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtuname = (EditText) findViewById(R.id.edtusername);
        edtpassword = (EditText) findViewById(R.id.edtpassword);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);
        btncancel = (Button) findViewById(R.id.btncancel);
//        btnsubmit.setOnClickListener(this);
//        btncancel.setOnClickListener(this);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edtuname.getText().toString())) {
                    edtuname.setError("Enter User Name");
                    edtuname.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(edtpassword.getText().toString())) {
                    edtpassword.setError("Enter User Name");
                    edtpassword.requestFocus();
                    return;
                }
                String uname = edtuname.getText().toString();
                String upass = edtpassword.getText().toString();
                if (uname.equalsIgnoreCase("Android") && upass.equalsIgnoreCase("class")) {
                    Toast.makeText(getApplicationContext(), "Valid user", Toast.LENGTH_LONG).show();
                    Intent it = new Intent(MainActivity.this,Activity_Home.class);
                    it.putExtra("uname",uname);
                    startActivity(it);
                } else {
                    Toast.makeText(getApplicationContext(), "InValid user", Toast.LENGTH_LONG).show();
                }
            }
        });
//        btncancel.setOnClickListener(click);
//
//
//        findViewById(R.id.btnsubmit).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }


    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClick(View v) {
//        String btntext = ((TextView) v).getText().toString();
//        if (btntext.equalsIgnoreCase("Submit")) {
//            Toast.makeText(MainActivity.this, "Button Submit Clicked", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(MainActivity.this, "Button cancel Clicked", Toast.LENGTH_LONG).show();
//        }

        switch (v.getId()) {
            case R.id.btnsubmit:
                Toast.makeText(MainActivity.this, "Button Submit Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.btncancel:
                Toast.makeText(MainActivity.this, "Button cancel Clicked", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
