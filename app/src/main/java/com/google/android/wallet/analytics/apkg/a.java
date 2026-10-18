package com.google.android.wallet.analytics.apkg;

import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7237b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final CreditCardEntryAction g;
    public final WebViewPageLoadEvent h;
    public final byte[] i;

    public a(int i, int i2, String str, long j, long j2, int i3, byte[] bArr) {
        this.f7236a = i;
        this.f7237b = i2;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = i3;
        this.i = bArr;
        this.g = null;
        this.h = null;
    }

    public a(CreditCardEntryAction creditCardEntryAction, byte[] bArr) {
        this.f7236a = 770;
        this.f7237b = 0;
        this.c = null;
        this.d = -1L;
        this.e = -1L;
        this.i = bArr;
        this.g = creditCardEntryAction;
        this.f = 0;
        this.h = null;
    }

    public a(int i, WebViewPageLoadEvent webViewPageLoadEvent, byte[] bArr) {
        this.f7236a = 772;
        this.f7237b = i;
        this.c = null;
        this.d = -1L;
        this.e = -1L;
        this.i = bArr;
        this.g = null;
        this.f = 0;
        this.h = webViewPageLoadEvent;
    }
}
