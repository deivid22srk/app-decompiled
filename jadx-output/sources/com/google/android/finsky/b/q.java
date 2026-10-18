package com.google.android.finsky.b;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ek;

/* loaded from: classes.dex */
final class q implements ek {
    q() {
    }

    @Override // com.google.android.finsky.utils.ek
    public final void a(String str, int i) {
        if (str == null) {
            str = l.f2122b;
        }
        FinskyLog.a("Result %d re-installing %s", Integer.valueOf(i), str);
    }
}
