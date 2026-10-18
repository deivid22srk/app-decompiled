package com.google.android.finsky.widget.consumption;

import android.net.Uri;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5183a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5184b;
    public final int c;

    public k(Uri uri, int i, int i2) {
        this.f5183a = uri;
        this.f5184b = i;
        this.c = i2;
    }

    public final boolean a(Uri uri, int i, int i2) {
        return this.f5183a.equals(uri) && this.f5184b >= i && this.c >= i2;
    }

    public final String toString() {
        return String.format("uri=[%s], [%s x %s]", this.f5183a, Integer.valueOf(this.f5184b), Integer.valueOf(this.c));
    }
}
