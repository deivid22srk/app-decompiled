package com.google.android.finsky.search;

import android.graphics.drawable.Drawable;
import com.google.android.finsky.protos.jd;
import com.google.android.play.search.v;

/* loaded from: classes.dex */
public final class b extends v {

    /* renamed from: a, reason: collision with root package name */
    public final jd f4517a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4518b;
    public final boolean c;
    public final int d;

    public b(String str, String str2, String str3, Drawable drawable, String str4, boolean z, Drawable drawable2, jd jdVar, byte[] bArr, boolean z2, int i) {
        super(str, str2, str3, drawable, str4, z, drawable2);
        this.f4517a = jdVar;
        this.f4518b = bArr;
        this.c = z2;
        this.d = i;
    }
}
