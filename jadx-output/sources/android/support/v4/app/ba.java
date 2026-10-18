package android.support.v4.app;

import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
final class ba implements android.support.v4.b.p<Object>, android.support.v4.b.q<Object> {

    /* renamed from: a, reason: collision with root package name */
    final int f191a;

    /* renamed from: b, reason: collision with root package name */
    final Bundle f192b;
    ay<Object> c;
    android.support.v4.b.n<Object> d;
    boolean e;
    boolean f;
    Object g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    ba n;
    final /* synthetic */ az o;

    public ba(az azVar, int i, Bundle bundle, ay<Object> ayVar) {
        this.o = azVar;
        this.f191a = i;
        this.f192b = bundle;
        this.c = ayVar;
    }

    final void a() {
        if (this.i && this.j) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
            if (az.f187a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            if (this.d == null && this.c != null) {
                this.d = this.c.a(this.f191a, this.f192b);
            }
            if (this.d != null) {
                if (this.d.getClass().isMemberClass() && !Modifier.isStatic(this.d.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
                }
                if (!this.m) {
                    android.support.v4.b.n<Object> nVar = this.d;
                    int i = this.f191a;
                    if (nVar.o != null) {
                        throw new IllegalStateException("There is already a listener registered");
                    }
                    nVar.o = this;
                    nVar.n = i;
                    android.support.v4.b.n<Object> nVar2 = this.d;
                    if (nVar2.p != null) {
                        throw new IllegalStateException("There is already a listener registered");
                    }
                    nVar2.p = this;
                    this.m = true;
                }
                android.support.v4.b.n<Object> nVar3 = this.d;
                nVar3.r = true;
                nVar3.t = false;
                nVar3.s = false;
                nVar3.g();
            }
        }
    }

    final void b() {
        if (az.f187a) {
            Log.v("LoaderManager", "  Stopping: " + this);
        }
        this.h = false;
        if (!this.i && this.d != null && this.m) {
            this.m = false;
            this.d.a((android.support.v4.b.q<Object>) this);
            this.d.a((android.support.v4.b.p<Object>) this);
            android.support.v4.b.n<Object> nVar = this.d;
            nVar.r = false;
            nVar.h();
        }
    }

    final void c() {
        z zVar;
        String str;
        z zVar2;
        z zVar3;
        z zVar4;
        z zVar5;
        while (true) {
            if (az.f187a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l = true;
            boolean z = this.f;
            this.f = false;
            if (this.c != null && this.d != null && this.e && z) {
                if (az.f187a) {
                    Log.v("LoaderManager", "  Reseting: " + this);
                }
                zVar = this.o.h;
                if (zVar != null) {
                    zVar4 = this.o.h;
                    String str2 = zVar4.f.v;
                    zVar5 = this.o.h;
                    zVar5.f.v = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    this.c.b();
                } finally {
                    zVar2 = this.o.h;
                    if (zVar2 != null) {
                        zVar3 = this.o.h;
                        zVar3.f.v = str;
                    }
                }
            }
            this.c = null;
            this.g = null;
            this.e = false;
            if (this.d != null) {
                if (this.m) {
                    this.m = false;
                    this.d.a((android.support.v4.b.q<Object>) this);
                    this.d.a((android.support.v4.b.p<Object>) this);
                }
                android.support.v4.b.n<Object> nVar = this.d;
                nVar.i();
                nVar.t = true;
                nVar.r = false;
                nVar.s = false;
                nVar.u = false;
                nVar.v = false;
            }
            if (this.n != null) {
                this = this.n;
            } else {
                return;
            }
        }
    }

    @Override // android.support.v4.b.p
    public final void d() {
        if (az.f187a) {
            Log.v("LoaderManager", "onLoadCanceled: " + this);
        }
        if (this.l) {
            if (az.f187a) {
                Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
            }
        } else {
            if (this.o.f188b.a(this.f191a) != this) {
                if (az.f187a) {
                    Log.v("LoaderManager", "  Ignoring load canceled -- not active");
                    return;
                }
                return;
            }
            ba baVar = this.n;
            if (baVar != null) {
                if (az.f187a) {
                    Log.v("LoaderManager", "  Switching to pending loader: " + baVar);
                }
                this.n = null;
                this.o.f188b.a(this.f191a, null);
                c();
                this.o.a(baVar);
            }
        }
    }

    @Override // android.support.v4.b.q
    public final void a(android.support.v4.b.n<Object> nVar, Object obj) {
        z zVar;
        z zVar2;
        if (az.f187a) {
            Log.v("LoaderManager", "onLoadComplete: " + this);
        }
        if (this.l) {
            if (az.f187a) {
                Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
                return;
            }
            return;
        }
        if (this.o.f188b.a(this.f191a) != this) {
            if (az.f187a) {
                Log.v("LoaderManager", "  Ignoring load complete -- not active");
                return;
            }
            return;
        }
        ba baVar = this.n;
        if (baVar != null) {
            if (az.f187a) {
                Log.v("LoaderManager", "  Switching to pending loader: " + baVar);
            }
            this.n = null;
            this.o.f188b.a(this.f191a, null);
            c();
            this.o.a(baVar);
            return;
        }
        if (this.g != obj || !this.e) {
            this.g = obj;
            this.e = true;
            if (this.h) {
                b(nVar, obj);
            }
        }
        ba a2 = this.o.c.a(this.f191a);
        if (a2 != null && a2 != this) {
            a2.f = false;
            a2.c();
            android.support.v4.h.s<ba> sVar = this.o.c;
            int a3 = android.support.v4.h.c.a(sVar.c, sVar.e, this.f191a);
            if (a3 >= 0 && sVar.d[a3] != android.support.v4.h.s.f302a) {
                sVar.d[a3] = android.support.v4.h.s.f302a;
                sVar.f303b = true;
            }
        }
        zVar = this.o.h;
        if (zVar != null && !this.o.b()) {
            zVar2 = this.o.h;
            zVar2.f.i();
        }
    }

    final void b(android.support.v4.b.n<Object> nVar, Object obj) {
        z zVar;
        String str;
        z zVar2;
        z zVar3;
        z zVar4;
        z zVar5;
        if (this.c != null) {
            zVar = this.o.h;
            if (zVar != null) {
                zVar4 = this.o.h;
                String str2 = zVar4.f.v;
                zVar5 = this.o.h;
                zVar5.f.v = "onLoadFinished";
                str = str2;
            } else {
                str = null;
            }
            try {
                if (az.f187a) {
                    StringBuilder append = new StringBuilder("  onLoadFinished in ").append(nVar).append(": ");
                    StringBuilder sb = new StringBuilder(64);
                    android.support.v4.h.d.a(obj, sb);
                    sb.append("}");
                    Log.v("LoaderManager", append.append(sb.toString()).toString());
                }
                this.c.a((android.support.v4.b.n<android.support.v4.b.n<Object>>) nVar, (android.support.v4.b.n<Object>) obj);
                this.f = true;
            } finally {
                zVar2 = this.o.h;
                if (zVar2 != null) {
                    zVar3 = this.o.h;
                    zVar3.f.v = str;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.f191a);
        sb.append(" : ");
        android.support.v4.h.d.a(this.d, sb);
        sb.append("}}");
        return sb.toString();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        while (true) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f191a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f192b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.d);
            if (this.d != null) {
                this.d.a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.e || this.f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.m);
            if (this.n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.n);
                printWriter.println(":");
                this = this.n;
                str = str + "  ";
            } else {
                return;
            }
        }
    }
}
