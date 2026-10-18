package com.google.android.gms.car;

import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class at extends du {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<as> f5479a;

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(0, i, i2, null));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void b(int i, int i2) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(1, i, i2, null));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2, boolean z) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(3, i, i2, Boolean.valueOf(z)));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void c(int i, int i2) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(2, i, i2, null));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, RadioStationInfo radioStationInfo) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(5, i, -1, radioStationInfo));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void b(int i, int i2, boolean z) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(9, i, i2, Boolean.valueOf(z)));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, boolean z) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(10, i, z ? 1 : 0, null));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2, RadioStationInfo radioStationInfo) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(4, i, i2, radioStationInfo));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(List<StationPresetList> list) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(12, list));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2, boolean z, List<RadioStationInfo> list) {
        as asVar = this.f5479a.get();
        if (asVar == null) {
            if (ah.a("CAR.RADIO", 3)) {
                Log.d("CAR.RADIO", "manager is null on callback");
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("status", i);
            bundle.putInt("radioId", i2);
            bundle.putBoolean("completed", z);
            bundle.putParcelableArrayList("programs", new ArrayList<>(list));
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(8, bundle));
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2, List<TrafficIncident> list) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(7, i, i2, list));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2, int i3) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(11, i, i2, Integer.valueOf(i3)));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void d(int i, int i2) {
        as asVar = this.f5479a.get();
        if (asVar != null) {
            asVar.f5477a.sendMessage(asVar.f5477a.obtainMessage(6, i, i2, null));
        } else if (ah.a("CAR.RADIO", 3)) {
            Log.d("CAR.RADIO", "manager is null on callback");
        }
    }
}
