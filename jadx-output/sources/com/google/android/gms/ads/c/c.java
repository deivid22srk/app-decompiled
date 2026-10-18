package com.google.android.gms.ads.c;

import android.content.Context;
import com.google.android.gms.internal.jj;
import com.google.android.gms.internal.jk;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5276a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static jk f5277b;

    /* JADX INFO: Access modifiers changed from: private */
    public static jk b(Context context) {
        jk jkVar;
        synchronized (f5276a) {
            if (f5277b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                f5277b = jj.b(context);
            }
            jkVar = f5277b;
        }
        return jkVar;
    }
}
