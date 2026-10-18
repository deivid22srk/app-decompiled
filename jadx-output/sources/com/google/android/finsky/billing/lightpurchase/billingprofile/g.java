package com.google.android.finsky.billing.lightpurchase.billingprofile;

import android.view.View;
import com.google.android.finsky.protos.at;
import com.google.android.finsky.protos.ds;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2335b;
    public final ds c;
    public final String d;
    public final byte[] e;
    public final View.OnClickListener f;
    public final byte[] g;
    public final int h;

    public g(at atVar, View.OnClickListener onClickListener, int i) {
        this(atVar.c, null, atVar.e, null, null, onClickListener, atVar.f, i);
    }

    public g(String str, String str2, ds dsVar, String str3, byte[] bArr, View.OnClickListener onClickListener, byte[] bArr2, int i) {
        this.f2334a = str;
        this.f2335b = str2;
        this.c = dsVar;
        this.d = str3;
        this.e = bArr;
        this.f = onClickListener;
        this.g = bArr2;
        this.h = i;
    }
}
