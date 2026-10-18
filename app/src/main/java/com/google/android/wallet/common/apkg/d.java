package com.google.android.wallet.common.apkg;

import android.text.TextUtils;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7250a = {'R'};

    /* renamed from: b, reason: collision with root package name */
    public static final String f7251b = null;
    public static final Comparator<d> c = new e();
    public final String d;
    public final com.google.c.a.b e;
    public final CharSequence f;
    public final String g;
    public final String h;

    public d(String str, String str2) {
        this(str, str, str2, (String) null);
    }

    public d(String str, com.google.c.a.b bVar, CharSequence charSequence, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("source name should not be empty");
        }
        this.d = str;
        this.e = bVar;
        this.f = charSequence;
        this.g = str2;
        this.h = null;
    }

    public d(String str, CharSequence charSequence, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("source name should not be empty");
        }
        this.d = str;
        this.e = null;
        this.f = charSequence;
        this.g = str2;
        this.h = str3;
    }
}
