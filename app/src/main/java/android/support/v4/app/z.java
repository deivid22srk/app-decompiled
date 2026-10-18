package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class z<E> extends x {

    /* renamed from: b, reason: collision with root package name */
    final Activity f241b;
    final Context c;
    final Handler d;
    final int e;
    final ad f;
    android.support.v4.h.r<String, ax> g;
    boolean h;
    az i;
    boolean j;
    boolean k;

    z(t tVar) {
        this(tVar, tVar, tVar.f234a);
    }

    private z(Activity activity, Context context, Handler handler) {
        this.f = new ad();
        this.f241b = activity;
        this.c = context;
        this.d = handler;
        this.e = 0;
    }

    public void a(String str, PrintWriter printWriter, String[] strArr) {
    }

    public boolean b() {
        return true;
    }

    public LayoutInflater c() {
        return (LayoutInflater) this.c.getSystemService("layout_inflater");
    }

    public void d() {
    }

    public void a(Fragment fragment, Intent intent, int i) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.c.startActivity(intent);
    }

    public void a(Fragment fragment, String[] strArr) {
    }

    public boolean e() {
        return true;
    }

    public int f() {
        return this.e;
    }

    @Override // android.support.v4.app.x
    public View a(int i) {
        return null;
    }

    @Override // android.support.v4.app.x
    public boolean a() {
        return true;
    }

    final void a(String str) {
        az azVar;
        if (this.g != null && (azVar = (az) this.g.get(str)) != null && !azVar.f) {
            azVar.h();
            this.g.remove(str);
        }
    }

    final az a(String str, boolean z, boolean z2) {
        if (this.g == null) {
            this.g = new android.support.v4.h.r<>();
        }
        az azVar = (az) this.g.get(str);
        if (azVar == null) {
            if (z2) {
                az azVar2 = new az(str, this, z);
                this.g.put(str, azVar2);
                return azVar2;
            }
            return azVar;
        }
        azVar.h = this;
        return azVar;
    }

    final android.support.v4.h.r<String, ax> g() {
        boolean z;
        if (this.g != null) {
            int size = this.g.size();
            az[] azVarArr = new az[size];
            for (int i = size - 1; i >= 0; i--) {
                azVarArr[i] = (az) this.g.c(i);
            }
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                az azVar = azVarArr[i2];
                if (azVar.f) {
                    z = true;
                } else {
                    azVar.h();
                    this.g.remove(azVar.d);
                }
            }
        } else {
            z = false;
        }
        if (z) {
            return this.g;
        }
        return null;
    }
}
