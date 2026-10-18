package com.google.android.finsky.activities;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import java.util.List;

/* loaded from: classes.dex */
public final class ft extends android.support.v4.b.h {
    private List<com.google.android.finsky.protos.ds> w;

    public ft(Context context, List<com.google.android.finsky.protos.ds> list) {
        super(context);
        this.w = list;
    }

    @Override // android.support.v4.b.h, android.support.v4.b.a
    /* renamed from: f */
    public final Cursor d() {
        MatrixCursor matrixCursor = new MatrixCursor(com.android.ex.photo.dpkg.b.f1149a);
        for (com.google.android.finsky.protos.ds dsVar : this.w) {
            matrixCursor.newRow().add(dsVar.f).add("").add(dsVar.f).add(dsVar.f).add("image/WebP");
        }
        return matrixCursor;
    }
}
