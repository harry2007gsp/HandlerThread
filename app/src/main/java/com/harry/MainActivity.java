package com.harry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

// HandlerThread is used to update data from UI or other thread to another thread without Looper
public class MainActivity extends AppCompatActivity {
    static TextView text;
    static NetworkConnection networkConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);

    }
    public void fetchDataOnButton(View view) {
        networkConnection = new NetworkConnection();

//        networkConnection.fetchData(myHandler, runnable);
        networkConnection.handlerThreadMethod();
        networkConnection.testHandler2.sendMessage(networkConnection.testHandler2.obtainMessage());

    }
}
