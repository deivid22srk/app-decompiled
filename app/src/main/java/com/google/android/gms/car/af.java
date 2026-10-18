package com.google.android.gms.car;

import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class af extends ce {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<s> f5464a;

    @Override // com.google.android.gms.car.cd
    public final void a(KeyEvent keyEvent) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "dispatchPhoneKeyEvent");
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new t(sVar, it.next(), keyEvent));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(boolean z, int i, int i2) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", String.format("onAudioStateChanged isMuted=%b\troute=%d\tsupportedRoutes=%d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new aa(sVar, it.next(), z, i, i2));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "onCallAdded " + carCall);
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new ab(sVar, it.next(), carCall));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void b(CarCall carCall) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "onCallRemoved " + carCall);
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new ac(sVar, it.next(), carCall));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall, int i) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "onStateChanged " + carCall);
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new ad(sVar, it.next(), carCall, i));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall, CarCall carCall2) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "onParentChanged");
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new ae(sVar, it.next(), carCall, carCall2));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall, List<CarCall> list) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "onChildrenChanged");
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new u(sVar, it.next(), carCall, list));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall, CarCall.Details details) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "onDetailsChanged");
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new v(sVar, it.next(), carCall, details));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void b(CarCall carCall, List<String> list) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "onCannedTextResponsesLoaded");
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new w(sVar, it.next(), carCall, list));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall, String str) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "onPostDialWait");
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new x(sVar, it.next(), carCall, str));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void c(CarCall carCall) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "onCallDestroyed");
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new y(sVar, it.next(), carCall));
                }
            }
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void c(CarCall carCall, List<CarCall> list) {
        s sVar = this.f5464a.get();
        if (sVar != null) {
            if (ah.a("CAR.TEL.Manager", 2)) {
                Log.v("CAR.TEL.Manager", "onConferenceableCallsChanged");
            }
            synchronized (sVar.e) {
                Iterator<r> it = sVar.e.iterator();
                while (it.hasNext()) {
                    ei.a(Looper.getMainLooper(), new z(sVar, it.next(), carCall, list));
                }
            }
        }
    }
}
