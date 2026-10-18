package android.support.v7.a;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* loaded from: classes.dex */
final class bo {

    /* renamed from: a, reason: collision with root package name */
    static final bp f512a = new bp((byte) 0);

    /* renamed from: b, reason: collision with root package name */
    final Context f513b;
    private final LocationManager c;

    bo(Context context) {
        this.f513b = context;
        this.c = (LocationManager) context.getSystemService("location");
    }

    final Location a(String str) {
        if (this.c != null) {
            try {
                if (this.c.isProviderEnabled(str)) {
                    return this.c.getLastKnownLocation(str);
                }
            } catch (Exception e) {
                Log.d("TwilightManager", "Failed to get last known location", e);
            }
        }
        return null;
    }

    static boolean a(bp bpVar) {
        return bpVar != null && bpVar.f > System.currentTimeMillis();
    }

    static void a(Location location) {
        long j;
        long j2;
        bp bpVar = f512a;
        long currentTimeMillis = System.currentTimeMillis();
        if (bn.f510a == null) {
            bn.f510a = new bn();
        }
        bn bnVar = bn.f510a;
        bnVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = bnVar.f511b;
        bnVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = bnVar.d == 1;
        long j4 = bnVar.c;
        long j5 = bnVar.f511b;
        bnVar.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = bnVar.c;
        if (j4 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j5) {
                j2 = 0 + j6;
            } else if (currentTimeMillis > j4) {
                j2 = 0 + j5;
            } else {
                j2 = 0 + j4;
            }
            j = j2 + 60000;
        }
        bpVar.f514a = z;
        bpVar.f515b = j3;
        bpVar.c = j4;
        bpVar.d = j5;
        bpVar.e = j6;
        bpVar.f = j;
    }
}
