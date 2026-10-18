package com.android.ex.photo.c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.b.h;

/* loaded from: classes.dex */
public final class d extends h {
    private final Uri w;
    private final String[] x;

    public d(Context context, Uri uri, String[] strArr) {
        super(context);
        this.w = uri;
        this.x = strArr == null ? com.android.ex.photo.d.b.f1149a : strArr;
    }

    @Override // android.support.v4.b.h, android.support.v4.b.a
    /* renamed from: f */
    public final Cursor d() {
        this.g = this.w.buildUpon().appendQueryParameter("contentType", "image/").build();
        this.h = this.x;
        return super.d();
    }
}
