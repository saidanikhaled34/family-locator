package com.example.mytraker;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class Tracklocation implements LocationListener {
    public static Location location;
    public static boolean isRunning= false;

    public  Tracklocation(){
        isRunning = true;
        location=new Location("not defined");
        location.setLatitude(0);
        location.setLongitude(0);
    }
    @Override
    public void onLocationChanged(Location location) {
        this.location=location;
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
