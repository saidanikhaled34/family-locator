package com.example.mytraker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;

public class RunithOS extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equalsIgnoreCase("android.intent.action.BOOT_COMPLETED"))
        {
            GlobalInfo globalInfo= new GlobalInfo(context);
            globalInfo.LoadData();
            if (!Tracklocation.isRunning){
                Tracklocation tracklocation = new Tracklocation();
                LocationManager lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

                lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0,tracklocation);
            }
            if (!MyServie.IsRunning){
                Intent intent1=new Intent(context,MyServie.class);
                context.startService(intent1);
            }
        }

    }
}
