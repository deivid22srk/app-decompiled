package android.support.v7.a;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import java.util.Calendar;

/* loaded from: classes.dex */
class al extends ak {
    private static bo w;
    boolean p;
    private int x;
    private boolean y;

    al(Context context, Window window, af afVar) {
        super(context, window, afVar);
        this.x = -100;
        this.p = true;
    }

    @Override // android.support.v7.a.ap, android.support.v7.a.ag
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null && this.x == -100) {
            this.x = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // android.support.v7.a.ah
    Window.Callback a(Window.Callback callback) {
        return new am(this, callback);
    }

    @Override // android.support.v7.a.ah, android.support.v7.a.ag
    public final boolean j() {
        int i;
        boolean z = false;
        this.y = true;
        UiModeManager uiModeManager = (UiModeManager) this.f476b.getSystemService("uimode");
        if ((Build.VERSION.SDK_INT >= 23 || uiModeManager.getCurrentModeType() == 3) && uiModeManager.getNightMode() != 1) {
            return false;
        }
        if (this.x != -100) {
            i = this.x;
        } else {
            i = ag.f475a;
        }
        switch (i) {
            case 0:
                if (w == null) {
                    w = new bo(this.f476b.getApplicationContext());
                }
                bo boVar = w;
                bp bpVar = bo.f512a;
                if (bo.a(bpVar)) {
                    z = bpVar.f514a;
                } else {
                    Location a2 = android.support.v4.b.aa.a(boVar.f513b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? boVar.a("network") : null;
                    Location a3 = android.support.v4.b.aa.a(boVar.f513b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? boVar.a("gps") : null;
                    if (a3 == null || a2 == null) {
                        if (a3 != null) {
                            a2 = a3;
                        }
                    } else if (a3.getTime() > a2.getTime()) {
                        a2 = a3;
                    }
                    if (a2 != null) {
                        bo.a(a2);
                        z = bpVar.f514a;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return e(2);
                }
                return e(1);
            default:
                return e(i);
        }
    }

    @Override // android.support.v7.a.ah, android.support.v7.a.ag
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (this.x != -100) {
            bundle.putInt("appcompat:local_night_mode", this.x);
        }
    }

    private boolean e(int i) {
        int i2;
        Resources resources = this.f476b.getResources();
        Configuration configuration = resources.getConfiguration();
        int i3 = configuration.uiMode & 48;
        switch (i) {
            case 1:
                i2 = 16;
                break;
            case 2:
                i2 = 32;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i3 == i2) {
            return false;
        }
        configuration.uiMode = (configuration.uiMode & (-49)) | i2;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return true;
    }
}
