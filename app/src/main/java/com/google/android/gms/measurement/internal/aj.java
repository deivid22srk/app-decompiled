package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f6303a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6304b;
    private final long c;
    private boolean d;
    private long e;

    public aj(ai aiVar, String str) {
        this.f6303a = aiVar;
        com.google.android.gms.common.internal.av.a(str);
        this.f6304b = str;
        this.c = 0L;
    }

    public final void a(long j) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f6303a.g;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(this.f6304b, j);
        edit.apply();
        this.e = j;
    }

    public final long a() {
        SharedPreferences sharedPreferences;
        if (!this.d) {
            this.d = true;
            sharedPreferences = this.f6303a.g;
            this.e = sharedPreferences.getLong(this.f6304b, this.c);
        }
        return this.e;
    }
}
