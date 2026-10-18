package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class l<T extends IInterface> implements com.google.android.gms.common.api.g, w {
    public static final String[] e = {"service_esmobile", "service_googleme"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f5716a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f5717b;
    final Handler c;
    protected AtomicInteger d;
    private final h f;
    private final x g;
    private final com.google.android.gms.common.b h;
    private final Object i;
    private am j;
    private com.google.android.gms.common.api.t k;
    private T l;
    private final ArrayList<l<T>.o<?>> m;
    private l<T>.q n;
    private int o;
    private final Set<Scope> p;
    private final Account q;
    private final com.google.android.gms.common.api.p r;
    private final com.google.android.gms.common.api.q s;
    private final int t;

    public l(Context context, Looper looper, int i, h hVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        this(context, looper, x.a(context), com.google.android.gms.common.b.a(), i, hVar, (com.google.android.gms.common.api.p) av.a(pVar), (com.google.android.gms.common.api.q) av.a(qVar));
    }

    private static Set<Scope> a(Set<Scope> set) {
        if (set != null) {
            Iterator<Scope> it = set.iterator();
            while (it.hasNext()) {
                if (!set.contains(it.next())) {
                    throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
                }
            }
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int i2, T t) {
        boolean z;
        synchronized (this.i) {
            if (this.o != i) {
                z = false;
            } else {
                a(i2, (int) t);
                z = true;
            }
        }
        return z;
    }

    private void c() {
        this.c.sendMessage(this.c.obtainMessage(4, this.d.get(), 1));
    }

    protected static void k() {
    }

    public abstract T a(IBinder iBinder);

    public void a(int i) {
    }

    public void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.c.sendMessage(this.c.obtainMessage(1, i2, -1, new s(this, i, iBinder, bundle)));
    }

    @Override // com.google.android.gms.common.api.g
    public void a(com.google.android.gms.common.api.t tVar) {
        this.k = (com.google.android.gms.common.api.t) av.a(tVar, "Connection progress callbacks cannot be null.");
        a(2, (int) null);
    }

    @Override // com.google.android.gms.common.api.g
    public final void a(ad adVar) {
        try {
            this.j.a(new p(this, this.d.get()), new ValidateAccountRequest(adVar, (Scope[]) this.p.toArray(new Scope[this.p.size()]), this.f5716a.getPackageName()));
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "service died");
            c();
        } catch (RemoteException e3) {
            Log.w("GmsClient", "Remote exception occurred", e3);
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final void a(String str, PrintWriter printWriter) {
        int i;
        T t;
        synchronized (this.i) {
            i = this.o;
            t = this.l;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.println("null");
        } else {
            printWriter.append((CharSequence) e()).append("@").println(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
    }

    public void ae_() {
    }

    @Override // com.google.android.gms.common.api.g
    public void b() {
        this.d.incrementAndGet();
        synchronized (this.m) {
            int size = this.m.size();
            for (int i = 0; i < size; i++) {
                this.m.get(i).d();
            }
            this.m.clear();
        }
        a(1, (int) null);
    }

    public abstract String d();

    public abstract String e();

    public Bundle f() {
        return new Bundle();
    }

    @Override // com.google.android.gms.common.api.g, com.google.android.gms.common.internal.w
    public final boolean g() {
        boolean z;
        synchronized (this.i) {
            z = this.o == 3;
        }
        return z;
    }

    @Override // com.google.android.gms.common.api.g
    public boolean h() {
        return false;
    }

    @Override // com.google.android.gms.common.api.g
    public final Intent i() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Override // com.google.android.gms.common.api.g
    public final IBinder j() {
        if (this.j == null) {
            return null;
        }
        return this.j.asBinder();
    }

    public final void l() {
        int a2 = com.google.android.gms.common.b.a(this.f5716a);
        if (a2 == 0) {
            a(new r(this));
            return;
        }
        a(1, (int) null);
        this.k = new r(this);
        this.c.sendMessage(this.c.obtainMessage(3, this.d.get(), a2));
    }

    public final boolean m() {
        boolean z;
        synchronized (this.i) {
            z = this.o == 2;
        }
        return z;
    }

    public final void n() {
        if (!g()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T o() {
        T t;
        synchronized (this.i) {
            if (this.o == 4) {
                throw new DeadObjectException();
            }
            n();
            av.a(this.l != null, "Client is connected but service is null");
            t = this.l;
        }
        return t;
    }

    public final class q implements ServiceConnection {

        /* renamed from: b, reason: collision with root package name */
        private final int f5726b;

        public q(int i) {
            this.f5726b = i;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            l.this.c.sendMessage(l.this.c.obtainMessage(4, this.f5726b, 1));
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            av.a(iBinder, "Expecting a valid IBinder");
            l.this.j = an.a(iBinder);
            l lVar = l.this;
            lVar.c.sendMessage(lVar.c.obtainMessage(6, this.f5726b, -1, new t(lVar)));
        }
    }

    private l(Context context, Looper looper, x xVar, com.google.android.gms.common.b bVar, int i, h hVar, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        this.i = new Object();
        this.m = new ArrayList<>();
        this.o = 1;
        this.d = new AtomicInteger(0);
        this.f5716a = (Context) av.a(context, "Context must not be null");
        this.f5717b = (Looper) av.a(looper, "Looper must not be null");
        this.g = (x) av.a(xVar, "Supervisor must not be null");
        this.h = (com.google.android.gms.common.b) av.a(bVar, "API availability must not be null");
        this.c = new n(this, looper);
        this.t = i;
        this.f = (h) av.a(hVar);
        this.q = hVar.f5710a;
        this.p = a(hVar.c);
        this.r = pVar;
        this.s = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, T t) {
        av.b((i == 3) == (t != null));
        synchronized (this.i) {
            this.o = i;
            this.l = t;
            switch (i) {
                case 1:
                    if (this.n != null) {
                        this.g.a(d(), (ServiceConnection) this.n);
                        this.n = null;
                        break;
                    }
                    break;
                case 2:
                    if (this.n != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + d());
                        this.g.a(d(), (ServiceConnection) this.n);
                        this.d.incrementAndGet();
                    }
                    this.n = new q(this.d.get());
                    if (!this.g.a(d(), (ServiceConnection) this.n, this.f.f)) {
                        Log.e("GmsClient", "unable to connect to service: " + d());
                        this.c.sendMessage(this.c.obtainMessage(3, this.d.get(), 9));
                        break;
                    }
                    break;
                case 3:
                    ae_();
                    break;
            }
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final void a(ad adVar, Set<Scope> set) {
        try {
            Bundle f = f();
            GetServiceRequest getServiceRequest = new GetServiceRequest(this.t);
            getServiceRequest.d = this.f5716a.getPackageName();
            getServiceRequest.g = f;
            if (set != null) {
                getServiceRequest.f = (Scope[]) set.toArray(new Scope[set.size()]);
            }
            if (h()) {
                getServiceRequest.h = this.q != null ? this.q : new Account("<<default account>>", "com.google");
                if (adVar != null) {
                    getServiceRequest.e = adVar.asBinder();
                }
            }
            this.j.a(new p(this, this.d.get()), getServiceRequest);
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "service died");
            c();
        } catch (RemoteException e3) {
            Log.w("GmsClient", "Remote exception occurred", e3);
        }
    }
}
