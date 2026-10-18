package com.google.android.finsky.d;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: a, reason: collision with root package name */
    private static final long[] f2477a = {12603301, 12603329, 12603516, 12604154, 12607073};

    public f(String str, e... eVarArr) {
        super(str, eVarArr);
    }

    @Override // com.google.android.finsky.d.d
    public final synchronized boolean a(long j) {
        boolean z = true;
        int i = 0;
        synchronized (this) {
            long[] jArr = f2477a;
            int length = jArr.length;
            while (true) {
                if (i >= length) {
                    z = super.a(j);
                    break;
                }
                if (j != jArr[i]) {
                    i++;
                } else {
                    FinskyLog.a("Target id: \"%s\" enabled by default on SW", Long.valueOf(j));
                    break;
                }
            }
        }
        return z;
    }
}
