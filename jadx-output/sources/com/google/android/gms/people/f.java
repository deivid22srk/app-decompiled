package com.google.android.gms.people;

import java.util.Collection;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f6396a = new f();

    /* renamed from: b, reason: collision with root package name */
    public String f6397b;
    public Collection<String> c;
    public boolean e;
    public long f;
    public String g;
    public int j;
    public int d = 2097151;
    public int h = 7;
    public int i = 0;

    public final String toString() {
        return com.google.android.gms.people.internal.k.a("mCircleId", this.f6397b, "mQualifiedIds", this.c, "mProjection", Integer.valueOf(this.d), "mPeopleOnly", Boolean.valueOf(this.e), "mChangedSince", Long.valueOf(this.f), "mQuery", this.g, "mSearchFields", Integer.valueOf(this.h), "mSortOrder", Integer.valueOf(this.i), "mExtraColumns", Integer.valueOf(this.j));
    }
}
