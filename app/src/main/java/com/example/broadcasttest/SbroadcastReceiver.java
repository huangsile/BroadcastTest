package com.example.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SbroadcastReceiver extends BroadcastReceiver {

    String TAG = "11111";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context,"接受sss广播",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"接受sss广播");

    }
}