package com.google.android.finsky.utils;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class jj {

    /* renamed from: a, reason: collision with root package name */
    public final jk f5029a;

    public jj(Context context, ar arVar) {
        jk jkVar;
        if (Build.VERSION.SDK_INT < 17) {
            this.f5029a = new jk((byte) 0);
            return;
        }
        try {
            jkVar = new jl(context, arVar);
        } catch (NoSuchMethodException e) {
            FinskyLog.e("Unable to reflect into UserManager: %s", e);
            jkVar = new jk((byte) 0);
        }
        this.f5029a = jkVar;
    }
}
