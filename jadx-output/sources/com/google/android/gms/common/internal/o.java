package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class o<TListener> {

    /* renamed from: a, reason: collision with root package name */
    private TListener f5721a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5722b = false;
    final /* synthetic */ l d;

    public o(l lVar, TListener tlistener) {
        this.d = lVar;
        this.f5721a = tlistener;
    }

    protected abstract void a(TListener tlistener);

    public final void b() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f5721a;
            if (this.f5722b) {
                Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
            }
        }
        if (tlistener != null) {
            try {
                a(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f5722b = true;
        }
        c();
    }

    public final void c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.d.m;
        synchronized (arrayList) {
            arrayList2 = this.d.m;
            arrayList2.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f5721a = null;
        }
    }
}
