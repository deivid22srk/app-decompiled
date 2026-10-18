package com.google.android.finsky.gpkg;

import com.google.android.finsky.protos.jb;

/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jb[] f2846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2847b;
    public final /* synthetic */ x c;

    z(x xVar, jb[] jbVarArr, String str) {
        this.c = xVar;
        this.f2846a = jbVarArr;
        this.f2847b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (jb jbVar : this.f2846a) {
            if (jbVar != null) {
                this.c.a(jbVar, this.f2847b);
            }
        }
    }
}
