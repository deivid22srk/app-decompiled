package com.google.android.vending.a.a;

import com.android.volley.t;
import com.google.android.finsky.protos.ry;
import com.google.android.finsky.protos.sa;

/* loaded from: classes.dex */
public final class b implements t<ry> {

    /* renamed from: a, reason: collision with root package name */
    private final t<sa[]> f7101a;

    @Override // com.android.volley.t
    public final /* bridge */ /* synthetic */ void a_(ry ryVar) {
        ry ryVar2 = ryVar;
        if (ryVar2 != null && ryVar2.f4363a != null) {
            this.f7101a.a_(ryVar2.f4363a.f4364a);
        } else {
            this.f7101a.a_(new sa[0]);
        }
    }

    public b(t<sa[]> tVar) {
        this.f7101a = tVar;
    }
}
