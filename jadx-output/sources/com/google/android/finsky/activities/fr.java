package com.google.android.finsky.activities;

import android.database.Cursor;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public final class fr extends com.android.ex.photo.k {
    private List<com.google.android.finsky.protos.ds> B;

    public fr(com.android.ex.photo.t tVar, List<com.google.android.finsky.protos.ds> list) {
        super(tVar);
        this.B = list;
    }

    @Override // com.android.ex.photo.k, android.support.v4.app.ay
    public final android.support.v4.b.n<Cursor> a(int i, Bundle bundle) {
        return new ft(this.c.i(), this.B);
    }

    @Override // com.android.ex.photo.k, com.android.ex.photo.h
    public final android.support.v4.b.n<com.android.ex.photo.c.c> a(int i, String str) {
        return new fs(this.c.i(), str);
    }

    @Override // com.android.ex.photo.k
    public final void j() {
    }

    @Override // com.android.ex.photo.k
    public final void i() {
    }
}
