package com.google.android.gms.car;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class ak extends cq {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<ai> f5469a;

    @Override // com.google.android.gms.car.cp
    public final void a(String str, int i, boolean z) {
        ai aiVar = this.f5469a.get();
        if (aiVar != null) {
            aiVar.f.sendMessage(aiVar.f.obtainMessage(2, i, z ? 1 : 0, str));
        }
    }

    @Override // com.google.android.gms.car.cp
    public final void a(String str, int i) {
        ai aiVar = this.f5469a.get();
        if (aiVar != null) {
            aiVar.f.sendMessage(aiVar.f.obtainMessage(1, i, 0, str));
        }
    }
}
