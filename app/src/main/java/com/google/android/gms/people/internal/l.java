package com.google.android.gms.people.internal;

import com.google.android.gms.common.internal.av;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f6413a = new l();

    /* renamed from: b, reason: collision with root package name */
    private Pattern[] f6414b = new Pattern[0];
    private String[] c = new String[0];

    private l() {
    }

    public final synchronized void a(String[] strArr, String[] strArr2) {
        synchronized (this) {
            av.b(strArr.length == strArr2.length);
            this.f6414b = new Pattern[strArr.length];
            this.c = strArr2;
            for (int i = 0; i < strArr.length; i++) {
                this.f6414b[i] = Pattern.compile(strArr[i]);
            }
        }
    }
}
