package com.google.android.gms.wearable.internal;

import com.google.android.gms.internal.ks;

/* loaded from: classes.dex */
abstract class bu<T> extends a {

    /* renamed from: a, reason: collision with root package name */
    private ks<T> f6597a;

    public bu(ks<T> ksVar) {
        this.f6597a = ksVar;
    }

    public final void a(T t) {
        ks<T> ksVar = this.f6597a;
        if (ksVar != null) {
            ksVar.a(t);
            this.f6597a = null;
        }
    }
}
