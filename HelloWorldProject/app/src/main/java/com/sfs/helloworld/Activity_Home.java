package com.sfs.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Activity_Home extends Activity {
TextView txtmsg;
    @Override
    protected void onCreate(Bundle bd) {
        super.onCreate(bd);
        setContentView(R.layout.activity_activity__home);
        bd = getIntent().getExtras();
        String msg = bd.getString("uname");
        txtmsg = (TextView)findViewById(R.id.txtuserdisplay);
        txtmsg.setText(msg);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity__home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
