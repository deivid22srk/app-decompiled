package com.google.android.finsky.billing;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/* loaded from: classes.dex */
public abstract class h extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    protected i f2229a;

    public abstract boolean u();

    public abstract void v();

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        if (this.s instanceof i) {
            this.f2229a = (i) this.s;
        } else if (this.E instanceof i) {
            this.f2229a = (i) this.E;
        } else {
            this.f2229a = (i) f();
        }
    }

    public final void c(Bundle bundle) {
        this.f2229a.a_(bundle);
    }

    public final void w() {
        this.f2229a.a();
    }

    public final void b(String str) {
        this.f2229a.b(str);
    }
}
