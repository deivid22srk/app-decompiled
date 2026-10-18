package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
final class ag implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataHolder f6468a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f6469b;

    ag(af afVar, DataHolder dataHolder) {
        this.f6469b = afVar;
        this.f6468a = dataHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = new k(this.f6468a);
        try {
            this.f6469b.f6466a.a(kVar);
        } finally {
            kVar.a();
        }
    }
}
