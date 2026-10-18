package com.google.android.gms.car;

import android.os.Handler;
import android.util.Log;

/* loaded from: classes.dex */
final class q extends by {

    /* renamed from: a, reason: collision with root package name */
    final Handler f5533a;

    @Override // com.google.android.gms.car.bx
    public final void a() {
        if (ah.a("CarBluetoothClient", 3)) {
            Log.d("CarBluetoothClient", "onEnabled");
        }
        this.f5533a.sendMessage(this.f5533a.obtainMessage(0));
    }

    @Override // com.google.android.gms.car.bx
    public final void b() {
        if (ah.a("CarBluetoothClient", 3)) {
            Log.d("CarBluetoothClient", "onDisabled");
        }
        this.f5533a.sendMessage(this.f5533a.obtainMessage(1));
    }

    @Override // com.google.android.gms.car.bx
    public final void c() {
        if (ah.a("CarBluetoothClient", 3)) {
            Log.d("CarBluetoothClient", "onCarDelayedPairing");
        }
        this.f5533a.sendMessage(this.f5533a.obtainMessage(2));
    }

    @Override // com.google.android.gms.car.bx
    public final void d() {
        if (ah.a("CarBluetoothClient", 3)) {
            Log.d("CarBluetoothClient", "onPaired");
        }
        this.f5533a.sendMessage(this.f5533a.obtainMessage(3));
    }

    @Override // com.google.android.gms.car.bx
    public final void e() {
        if (ah.a("CarBluetoothClient", 3)) {
            Log.d("CarBluetoothClient", "onUnpaired");
        }
        this.f5533a.sendMessage(this.f5533a.obtainMessage(4));
    }

    @Override // com.google.android.gms.car.bx
    public final void f() {
        if (ah.a("CarBluetoothClient", 3)) {
            Log.d("CarBluetoothClient", "onHfpConnected");
        }
        this.f5533a.sendMessage(this.f5533a.obtainMessage(5));
    }

    @Override // com.google.android.gms.car.bx
    public final void g() {
        if (ah.a("CarBluetoothClient", 3)) {
            Log.d("CarBluetoothClient", "onHfpDisconnected");
        }
        this.f5533a.sendMessage(this.f5533a.obtainMessage(6));
    }
}
