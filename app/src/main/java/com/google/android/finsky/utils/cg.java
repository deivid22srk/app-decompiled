package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.pw;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class cg {
    public static void a(com.google.android.finsky.api.b bVar, boolean z, cl clVar) {
        am.a().b();
        by.a(FinskyApp.a(), bVar);
        a(true, bVar, z, clVar);
    }

    public static pw a(com.google.android.finsky.api.b bVar) {
        jm.b();
        Semaphore semaphore = new Semaphore(0);
        pw[] pwVarArr = new pw[1];
        a(bVar, false, new ch(pwVarArr, semaphore));
        try {
            if (semaphore.tryAcquire(999L, TimeUnit.SECONDS)) {
                return pwVarArr[0];
            }
            return null;
        } catch (InterruptedException e) {
            return null;
        }
    }

    static void a(boolean z, com.google.android.finsky.api.b bVar, boolean z2, cl clVar) {
        bVar.a(z2, am.a().b(), new cj(bVar, z, clVar, z2), new ck(clVar));
    }
}
