package com.example.broadcasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private IntentFilter intentFilter;
    private NetworkChangeReceiver networkChangeReceiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("leo","button is click");
                Intent intent = new Intent("com.example.broadcasttest.MY_BROADCAST");
//                intent.setComponent(new ComponentName(MainActivity.this,MyBroadcast.class));
                intent.setPackage("com.example.broadcasttest");
                sendOrderedBroadcast(intent,null);
            }
        });



      /*  intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        networkChangeReceiver = new NetworkChangeReceiver();
        this.registerReceiver(networkChangeReceiver, intentFilter);    */
    }

    protected void onDestory(){
        super.onDestroy();
        unregisterReceiver(networkChangeReceiver);
    }
}