package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.mj;

/* loaded from: classes.dex */
final class ch implements mj<com.google.android.gms.wearable.h> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataHolder f6607a;

    ch(DataHolder dataHolder) {
        this.f6607a = dataHolder;
    }

    @Override // com.google.android.gms.internal.mj
    public final void a() {
        this.f6607a.c();
    }

    @Override // com.google.android.gms.internal.mj
    public final /* synthetic */ void a(com.google.android.gms.wearable.h hVar) {
        try {
            hVar.a(new com.google.android.gms.wearable.k(this.f6607a));
        } finally {
            this.f6607a.c();
        }
    }
}
