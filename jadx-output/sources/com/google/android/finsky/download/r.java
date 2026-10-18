package com.google.android.finsky.download;

import android.net.Uri;
import com.google.android.finsky.utils.dy;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2731a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2732b;
    public final long c;
    public final int d;

    public r(Uri uri, long j, long j2, int i) {
        this.f2731a = uri;
        this.f2732b = j;
        this.c = j2;
        this.d = i;
    }

    public final String toString() {
        return this.f2732b + "/" + this.c + " Status: " + this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f2732b == rVar.f2732b && this.c == rVar.c && this.d == rVar.d && dy.a(this.f2731a, rVar.f2731a);
    }

    public final int hashCode() {
        return this.f2731a.hashCode();
    }
}
