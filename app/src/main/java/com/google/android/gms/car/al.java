package com.google.android.gms.car;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class al extends cw {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<ai> f5470a;

    @Override // com.google.android.gms.car.cv
    public final void a(int i) {
        ai aiVar = this.f5470a.get();
        if (aiVar != null) {
            aiVar.f.sendMessage(aiVar.f.obtainMessage(3, i, 0));
        }
    }
}
