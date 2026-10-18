package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class mk extends Fragment implements DialogInterface.OnCancelListener {
    private static final com.google.android.gms.common.b d = com.google.android.gms.common.b.a();

    /* renamed from: a, reason: collision with root package name */
    public boolean f6163a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6164b;
    private ConnectionResult f;
    private me h;
    private int e = -1;
    private final Handler g = new Handler(Looper.getMainLooper());
    public final SparseArray<ml> c = new SparseArray<>();

    public static mk b(android.support.v4.app.t tVar) {
        mk a2 = a(tVar);
        android.support.v4.app.aa d2 = tVar.d();
        if (a2 != null) {
            return a2;
        }
        mk mkVar = new mk();
        d2.a().a(mkVar, "GmsSupportLifecycleFrag").c();
        d2.b();
        return mkVar;
    }

    static /* synthetic */ boolean c(mk mkVar) {
        mkVar.f6164b = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        int i = 0;
        this.f6164b = false;
        this.e = -1;
        this.f = null;
        if (this.h != null) {
            this.h.b();
            this.h = null;
        }
        while (true) {
            int i2 = i;
            if (i2 >= this.c.size()) {
                return;
            }
            this.c.valueAt(i2).f6166b.b();
            i = i2 + 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (com.google.android.gms.common.b.a(f()) == 0) goto L5;
     */
    @Override // android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            switch(r5) {
                case 1: goto L17;
                case 2: goto Lc;
                default: goto L5;
            }
        L5:
            r0 = r1
        L6:
            if (r0 == 0) goto L27
            r4.v()
        Lb:
            return
        Lc:
            android.support.v4.app.t r2 = r4.f()
            int r2 = com.google.android.gms.common.b.a(r2)
            if (r2 != 0) goto L5
            goto L6
        L17:
            r2 = -1
            if (r6 == r2) goto L6
            if (r6 != 0) goto L5
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r2 = 13
            r3 = 0
            r0.<init>(r2, r3)
            r4.f = r0
            goto L5
        L27:
            int r0 = r4.e
            com.google.android.gms.common.ConnectionResult r1 = r4.f
            r4.a(r0, r1)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mk.a(int, int, android.content.Intent):void");
    }

    @Override // android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.f6164b = bundle.getBoolean("resolving_error", false);
            this.e = bundle.getInt("failed_client_id", -1);
            if (this.e >= 0) {
                this.f = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        this.f6163a = true;
        if (this.f6164b) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.c.size()) {
                return;
            }
            this.c.valueAt(i2).f6166b.b();
            i = i2 + 1;
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void h_() {
        int i = 0;
        super.h_();
        this.f6163a = false;
        while (true) {
            int i2 = i;
            if (i2 >= this.c.size()) {
                return;
            }
            this.c.valueAt(i2).f6166b.d();
            i = i2 + 1;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(this.e, new ConnectionResult(13, null));
    }

    public static mk a(android.support.v4.app.t tVar) {
        com.google.android.gms.common.internal.av.b("Must be called from main thread of process");
        try {
            mk mkVar = (mk) tVar.d().a("GmsSupportLifecycleFrag");
            if (mkVar == null || mkVar.w) {
                return null;
            }
            return mkVar;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFrag is not a SupportLifecycleFragment", e);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("resolving_error", this.f6164b);
        if (this.e >= 0) {
            bundle.putInt("failed_client_id", this.e);
            bundle.putInt("failed_status", this.f.c);
            bundle.putParcelable("failed_resolution", this.f.d);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.c.size()) {
                return;
            }
            ml valueAt = this.c.valueAt(i2);
            printWriter.append((CharSequence) str).append("GoogleApiClient #").print(valueAt.f6165a);
            printWriter.println(":");
            valueAt.f6166b.a(str + "  ", fileDescriptor, printWriter, strArr);
            i = i2 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFrag", "Unresolved error while connecting client. Stopping auto-manage.");
        ml mlVar = this.c.get(i);
        if (mlVar != null) {
            ml mlVar2 = this.c.get(i);
            this.c.remove(i);
            if (mlVar2 != null) {
                mlVar2.f6166b.b(mlVar2);
                mlVar2.f6166b.d();
            }
            com.google.android.gms.common.api.q qVar = mlVar.c;
            if (qVar != null) {
                qVar.a(connectionResult);
            }
        }
        v();
    }
}
