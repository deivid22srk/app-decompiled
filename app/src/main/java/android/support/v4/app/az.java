package android.support.v4.app;

import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
final class az extends ax {

    /* renamed from: a, reason: collision with root package name */
    static boolean f187a = false;

    /* renamed from: b, reason: collision with root package name */
    final android.support.v4.h.s<ba> f188b = new android.support.v4.h.s<>();
    final android.support.v4.h.s<ba> c = new android.support.v4.h.s<>();
    final String d;
    boolean e;
    boolean f;
    boolean g;
    z h;

    az(String str, z zVar, boolean z) {
        this.d = str;
        this.h = zVar;
        this.e = z;
    }

    private ba b(int i, Bundle bundle, ay ayVar) {
        ba baVar = new ba(this, i, bundle, ayVar);
        baVar.d = ayVar.a(i, bundle);
        return baVar;
    }

    private ba c(int i, Bundle bundle, ay ayVar) {
        try {
            this.g = true;
            ba b2 = b(i, bundle, ayVar);
            a(b2);
            return b2;
        } finally {
            this.g = false;
        }
    }

    final void a(ba baVar) {
        this.f188b.a(baVar.f191a, baVar);
        if (this.e) {
            baVar.a();
        }
    }

    @Override // android.support.v4.app.ax
    public final <D> android.support.v4.b.n<D> a(int i, Bundle bundle, ay<D> ayVar) {
        if (this.g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        ba a2 = this.f188b.a(i);
        if (f187a) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (a2 == null) {
            a2 = c(i, bundle, ayVar);
            if (f187a) {
                Log.v("LoaderManager", "  Created new loader " + a2);
            }
        } else {
            if (f187a) {
                Log.v("LoaderManager", "  Re-using existing loader " + a2);
            }
            a2.c = (ay<Object>) ayVar;
        }
        if (a2.e && this.e) {
            a2.b(a2.d, a2.g);
        }
        return (android.support.v4.b.n<D>) a2.d;
    }

    @Override // android.support.v4.app.ax
    public final <D> android.support.v4.b.n<D> a(int i, ay<D> ayVar) {
        if (this.g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        ba a2 = this.f188b.a(i);
        if (f187a) {
            Log.v("LoaderManager", "restartLoader in " + this + ": args=" + ((Object) null));
        }
        if (a2 != null) {
            ba a3 = this.c.a(i);
            if (a3 != null) {
                if (a2.e) {
                    if (f187a) {
                        Log.v("LoaderManager", "  Removing last inactive loader: " + a2);
                    }
                    a3.f = false;
                    a3.c();
                } else if (!a2.h) {
                    if (f187a) {
                        Log.v("LoaderManager", "  Current loader is stopped; replacing");
                    }
                    this.f188b.a(i, null);
                    a2.c();
                } else {
                    if (f187a) {
                        Log.v("LoaderManager", "  Current loader is running; attempting to cancel");
                    }
                    if (f187a) {
                        Log.v("LoaderManager", "  Canceling: " + a2);
                    }
                    if (a2.h && a2.d != null && a2.m && !a2.d.j()) {
                        a2.d();
                    }
                    if (a2.n != null) {
                        if (f187a) {
                            Log.v("LoaderManager", "  Removing pending loader: " + a2.n);
                        }
                        a2.n.c();
                        a2.n = null;
                    }
                    if (f187a) {
                        Log.v("LoaderManager", "  Enqueuing as new pending loader");
                    }
                    a2.n = b(i, null, ayVar);
                    return (android.support.v4.b.n<D>) a2.n.d;
                }
            } else if (f187a) {
                Log.v("LoaderManager", "  Making last loader inactive: " + a2);
            }
            a2.d.s = true;
            this.c.a(i, a2);
        }
        return (android.support.v4.b.n<D>) c(i, null, ayVar).d;
    }

    @Override // android.support.v4.app.ax
    public final void a() {
        if (this.g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (f187a) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of 2");
        }
        int b2 = this.f188b.b();
        if (b2 >= 0) {
            ba d = this.f188b.d(b2);
            this.f188b.b(b2);
            d.c();
        }
        int b3 = this.c.b();
        if (b3 >= 0) {
            ba d2 = this.c.d(b3);
            this.c.b(b3);
            d2.c();
        }
        if (this.h != null && !b()) {
            this.h.f.i();
        }
    }

    @Override // android.support.v4.app.ax
    public final <D> android.support.v4.b.n<D> a(int i) {
        if (this.g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        ba a2 = this.f188b.a(i);
        if (a2 != null) {
            if (a2.n != null) {
                return (android.support.v4.b.n<D>) a2.n.d;
            }
            return (android.support.v4.b.n<D>) a2.d;
        }
        return null;
    }

    final void c() {
        if (f187a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
        } else {
            this.e = true;
            for (int a2 = this.f188b.a() - 1; a2 >= 0; a2--) {
                this.f188b.d(a2).a();
            }
        }
    }

    final void d() {
        if (f187a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
        } else {
            for (int a2 = this.f188b.a() - 1; a2 >= 0; a2--) {
                this.f188b.d(a2).b();
            }
            this.e = false;
        }
    }

    final void e() {
        if (f187a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
            return;
        }
        this.f = true;
        this.e = false;
        for (int a2 = this.f188b.a() - 1; a2 >= 0; a2--) {
            ba d = this.f188b.d(a2);
            if (f187a) {
                Log.v("LoaderManager", "  Retaining: " + d);
            }
            d.i = true;
            d.j = d.h;
            d.h = false;
            d.c = null;
        }
    }

    final void f() {
        for (int a2 = this.f188b.a() - 1; a2 >= 0; a2--) {
            this.f188b.d(a2).k = true;
        }
    }

    final void g() {
        for (int a2 = this.f188b.a() - 1; a2 >= 0; a2--) {
            ba d = this.f188b.d(a2);
            if (d.h && d.k) {
                d.k = false;
                if (d.e) {
                    d.b(d.d, d.g);
                }
            }
        }
    }

    final void h() {
        if (!this.f) {
            if (f187a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int a2 = this.f188b.a() - 1; a2 >= 0; a2--) {
                this.f188b.d(a2).c();
            }
            this.f188b.c();
        }
        if (f187a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int a3 = this.c.a() - 1; a3 >= 0; a3--) {
            this.c.d(a3).c();
        }
        this.c.c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.h.d.a(this.h, sb);
        sb.append("}}");
        return sb.toString();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.f188b.a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.f188b.a(); i++) {
                ba d = this.f188b.d(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f188b.c(i));
                printWriter.print(": ");
                printWriter.println(d.toString());
                d.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.c.a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.c.a(); i2++) {
                ba d2 = this.c.d(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.c.c(i2));
                printWriter.print(": ");
                printWriter.println(d2.toString());
                d2.a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // android.support.v4.app.ax
    public final boolean b() {
        int a2 = this.f188b.a();
        boolean z = false;
        for (int i = 0; i < a2; i++) {
            ba d = this.f188b.d(i);
            z |= d.h && !d.f;
        }
        return z;
    }
}
