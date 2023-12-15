package com.example.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class NetworkChangeReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent){

        ConnectivityManager connectionManager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectionManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isAvailable()){
            Toast.makeText(context,"network is available",Toast.LENGTH_SHORT).show();;
        } else {
            Toast.makeText(context,"network is unavailable",Toast.LENGTH_SHORT).show();
        }

    }
}
