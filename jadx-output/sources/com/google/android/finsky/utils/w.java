package com.google.android.finsky.utils;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* loaded from: classes.dex */
public final class w {
    public static Location a(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
            Location lastKnownLocation2 = locationManager.getLastKnownLocation("network");
            if (lastKnownLocation != null && lastKnownLocation2 != null) {
                return lastKnownLocation.getAccuracy() < lastKnownLocation2.getAccuracy() ? lastKnownLocation : lastKnownLocation2;
            }
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
            if (lastKnownLocation2 == null) {
                return null;
            }
            return lastKnownLocation2;
        } catch (SecurityException e) {
            FinskyLog.d("No permission to get location. %s", e);
            return null;
        }
    }
}
