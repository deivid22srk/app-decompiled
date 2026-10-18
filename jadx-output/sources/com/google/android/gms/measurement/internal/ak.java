package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    final String f6305a;

    /* renamed from: b, reason: collision with root package name */
    final String f6306b;
    final String c;
    final long d;
    final /* synthetic */ ai e;

    private ak(ai aiVar, String str, long j) {
        this.e = aiVar;
        com.google.android.gms.common.internal.av.a(str);
        com.google.android.gms.common.internal.av.b(j > 0);
        this.f6305a = str + ":start";
        this.f6306b = str + ":count";
        this.c = str + ":value";
        this.d = j;
    }

    /* synthetic */ ak(ai aiVar, String str, long j, byte b2) {
        this(aiVar, str, j);
    }

    final void a() {
        SharedPreferences sharedPreferences;
        this.e.e();
        long a2 = this.e.h().a();
        sharedPreferences = this.e.g;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(this.f6306b);
        edit.remove(this.c);
        edit.putLong(this.f6305a, a2);
        edit.apply();
    }

    public final void a(String str, long j) {
        SharedPreferences sharedPreferences;
        SecureRandom secureRandom;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        this.e.e();
        if (b() == 0) {
            a();
        }
        if (str == null) {
            str = "";
        }
        sharedPreferences = this.e.g;
        long j2 = sharedPreferences.getLong(this.f6306b, 0L);
        if (j2 <= 0) {
            sharedPreferences3 = this.e.g;
            SharedPreferences.Editor edit = sharedPreferences3.edit();
            edit.putString(this.c, str);
            edit.putLong(this.f6306b, j);
            edit.apply();
            return;
        }
        secureRandom = this.e.m;
        boolean z = (secureRandom.nextLong() & Long.MAX_VALUE) < (Long.MAX_VALUE / (j2 + j)) * j;
        sharedPreferences2 = this.e.g;
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.f6306b, j2 + j);
        edit2.apply();
    }

    final long b() {
        SharedPreferences s;
        s = this.e.s();
        return s.getLong(this.f6305a, 0L);
    }
}
