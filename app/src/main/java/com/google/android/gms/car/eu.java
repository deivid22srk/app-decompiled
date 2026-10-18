package com.google.android.gms.car;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class eu extends com.google.android.gms.common.internal.l<fq> {
    private final Object f;
    private l g;
    private aw h;
    private au i;
    private ap j;
    private ai k;
    private s l;
    private final HashMap<String, Object> m;
    private am n;
    private p o;
    private as p;
    private final AtomicBoolean q;
    public final List<f> r;
    private final ex s;
    private ew t;
    public volatile c u;
    private ev v;
    private fq w;

    private void a(RemoteException remoteException) {
        if (ah.a("CAR.CLIENT", 4)) {
            Log.i("CAR.CLIENT", "Remote exception from car service:" + remoteException.getMessage());
        }
        if (this.q.getAndSet(true)) {
            if (ah.a("CAR.CLIENT", 3)) {
                Log.d("CAR.CLIENT", "Already handling a remote exception, ignoring");
            }
        } else {
            this.s.a();
            if (g()) {
                b();
            }
        }
    }

    public synchronized void r() {
        if (this.v == null) {
            this.v = new ev(this);
            try {
                this.w = o();
                this.w.asBinder().linkToDeath(this.v, 0);
            } catch (RemoteException e) {
                Log.e("CAR.CLIENT", "Unable to link death recipient to ICar.");
                this.v = null;
                this.w = null;
            }
        }
    }

    private synchronized void s() {
        if (this.v != null && this.w != null) {
            try {
                this.w.asBinder().unlinkToDeath(this.v, 0);
            } catch (NoSuchElementException e) {
            }
            this.v = null;
            this.w = null;
        }
    }

    @Override // com.google.android.gms.common.internal.l
    public final void a(int i) {
        super.a(i);
        if (ah.a("CAR.CLIENT", 3)) {
            Log.d("CAR.CLIENT", "onConnectionSuspended");
        }
    }

    @Override // com.google.android.gms.common.internal.l, com.google.android.gms.common.api.g
    public final void a(com.google.android.gms.common.api.t tVar) {
        if (ah.a("CAR.CLIENT", 3)) {
            Log.d("CAR.CLIENT", "connect");
        }
        super.a(tVar);
    }

    @Override // com.google.android.gms.common.internal.l
    public final void ae_() {
        super.ae_();
        if (ah.a("CAR.CLIENT", 2)) {
            Log.v("CAR.CLIENT", "onConnectedLocked");
        }
        try {
            o().a(this.s);
            r();
        } catch (RemoteException e) {
            a(e);
        } catch (IllegalStateException e2) {
            if (ah.a("CAR.CLIENT", 5)) {
                Log.w("CAR.CLIENT", "service disconnected while onConnectedLocked is called");
            }
        }
    }

    @Override // com.google.android.gms.common.internal.l, com.google.android.gms.common.api.g
    public final void b() {
        fq fqVar;
        if (ah.a("CAR.CLIENT", 3)) {
            Log.d("CAR.CLIENT", "disconnect");
        }
        s();
        q();
        try {
            fqVar = o();
        } catch (DeadObjectException | IllegalStateException e) {
            fqVar = null;
        }
        if (fqVar != null) {
            try {
                fqVar.b(this.s);
            } catch (RemoteException e2) {
            }
            if (this.t != null) {
                try {
                    fqVar.b(this.t);
                    this.u = null;
                    this.t = null;
                } catch (RemoteException e3) {
                }
            }
        }
        super.b();
    }

    public final boolean c() {
        if (!g()) {
            return false;
        }
        try {
            return o().c();
        } catch (RemoteException e) {
            a(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return "com.google.android.gms.car.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return "com.google.android.gms.car.ICar";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", "car-1-0");
        return bundle;
    }

    public eu(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, f fVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        super(context, looper, 13, hVar, pVar, qVar);
        this.f = new Object();
        this.m = new HashMap<>();
        this.q = new AtomicBoolean(false);
        this.r = new ArrayList();
        this.s = new ex(this);
        if (fVar != null) {
            synchronized (this.s) {
                if (!this.r.contains(fVar)) {
                    this.r.add(fVar);
                    ex exVar = this.s;
                    eu euVar = exVar.f5518b.get();
                    if (euVar == null) {
                        Log.i("CAR.CLIENT", "Null carClient in ICarConnectionListenerImpl.onCCLAL");
                    } else {
                        List<f> list = null;
                        if (euVar.c()) {
                            list = exVar.f5517a ? Collections.singletonList(fVar) : new ArrayList<>(euVar.r);
                            exVar.f5517a = true;
                        }
                        if (list != null) {
                            try {
                                exVar.a(euVar, list, euVar.p());
                            } catch (CarNotConnectedException e) {
                                exVar.f5517a = false;
                            }
                        }
                    }
                } else if (ah.a("CAR.CLIENT", 3)) {
                    Log.d("CAR.CLIENT", "registerCarConnectionListener(): " + fVar + " already registered.");
                }
            }
        }
    }

    private int p() {
        n();
        try {
            return o().d();
        } catch (RemoteException e) {
            a(e);
            throw new CarNotConnectedException();
        } catch (IllegalStateException e2) {
            if (e2.getMessage().equals("CarNotConnected")) {
                throw new CarNotConnectedException();
            }
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        synchronized (this.f) {
            if (this.g != null) {
                l lVar = this.g;
                if (ah.a("CAR.AUDIO", 3)) {
                    Log.d("CAR.AUDIO", "handleCarDisconnection");
                }
                lVar.d = false;
                synchronized (lVar.f5528a) {
                    for (int i = 0; i < lVar.f5528a.length; i++) {
                        if (lVar.f5528a[i] != null) {
                            lVar.f5528a[i] = null;
                        }
                    }
                }
                synchronized (lVar.f5529b) {
                    Iterator<m> it = lVar.c.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                    lVar.c.clear();
                }
                this.g = null;
            }
            if (this.h != null) {
                aw awVar = this.h;
                if (ah.a("CAR.SENSOR", 3)) {
                    Log.d("CAR.SENSOR", "handleCarDisconnection");
                }
                synchronized (awVar.f5484b) {
                    awVar.f5484b.clear();
                    awVar.f5483a = null;
                }
                this.h = null;
            }
            if (this.n != null) {
                am amVar = this.n;
                if (ah.a("CAR.MSG", 3)) {
                    Log.d("CAR.MSG", "handleCarDisconnection");
                }
                try {
                    amVar.f5471a.b(amVar.f5472b);
                } catch (RemoteException e) {
                } catch (IllegalStateException e2) {
                }
                amVar.c = null;
                this.n = null;
            }
            if (this.o != null) {
                p pVar = this.o;
                if (ah.a("CAR.BT", 3)) {
                    Log.d("CAR.BT", "handleCarDisconnection");
                }
                q qVar = pVar.f5532a;
                if (ah.a("CarBluetoothClient", 3)) {
                    Log.d("CarBluetoothClient", "onCarDisconnected");
                }
                qVar.f5533a.sendMessageAtFrontOfQueue(qVar.f5533a.obtainMessage(7));
                this.o = null;
            }
            if (this.j != null) {
                ap apVar = this.j;
                if (ah.a("CAR.SENSOR", 3)) {
                    Log.d("CAR.SENSOR", "handleCarDisconnection");
                }
                try {
                    apVar.f5474a.b(apVar.f5475b);
                } catch (RemoteException e3) {
                    if (ah.a("CAR.SENSOR", 4)) {
                        Log.i("CAR.SENSOR", "RemoteException from car service:" + e3.getMessage());
                    }
                } catch (IllegalStateException e4) {
                }
                apVar.c = null;
                this.j = null;
            }
            if (this.k != null) {
                ai aiVar = this.k;
                if (ah.a("CAR.MEDIA", 3)) {
                    Log.d("CAR.MEDIA", "handleCarDisconnection");
                }
                aiVar.c = null;
                try {
                    aiVar.f5467a.b(aiVar.f5468b);
                } catch (Exception e5) {
                }
                try {
                    aiVar.d.b(aiVar.e);
                } catch (Exception e6) {
                }
                this.k = null;
            }
            if (this.l != null) {
                s sVar = this.l;
                Log.d("CAR.TEL.Manager", "handleCarDisconnection.");
                try {
                    if (sVar.f5535b != null) {
                        sVar.f5535b.b(sVar.d);
                    }
                } catch (RemoteException e7) {
                    Log.i("CAR.TEL.Manager", "Exception unregistering event listener", e7);
                }
                try {
                    sVar.f5534a.b(sVar.c);
                } catch (RemoteException e8) {
                    Log.i("CAR.TEL.Manager", "Exception removing call listener");
                }
                this.l = null;
            }
            if (this.p != null) {
                this.p.a();
                this.p = null;
            }
            if (this.i != null) {
                au auVar = this.i;
                if (ah.a("CAR.RETAIL", 3)) {
                    Log.d("CAR.RETAIL", "CarRetailModeManager#handleCarDisconnection");
                }
                try {
                    if (auVar.f5481b != null) {
                        auVar.f5480a.b(auVar.f5481b);
                        auVar.f5481b = null;
                    }
                } catch (RemoteException e9) {
                }
                this.i = null;
            }
            this.m.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final /* synthetic */ fq a(IBinder iBinder) {
        return fr.a(iBinder);
    }

    static /* synthetic */ void a(eu euVar) {
        Log.e("CAR.CLIENT", "ICar died!");
        euVar.s.a();
        euVar.s();
    }
}
