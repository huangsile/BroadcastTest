package com.example.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


public class MyBroadcast extends BroadcastReceiver {

    String TAG =  "fsdfsdfsdfsdfsdf";
    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context,"接收广播",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"接收广播");
        abortBroadcast();
    }
}
