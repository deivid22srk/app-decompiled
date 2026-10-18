package com.google.android.finsky.gpkg;

import android.accounts.Account;
import com.google.android.finsky.protos.jb;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Account f2805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2806b;
    public final /* synthetic */ jb[] c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ aj e;

    ao(aj ajVar, Account account, String str, jb[] jbVarArr, Runnable runnable) {
        this.e = ajVar;
        this.f2805a = account;
        this.f2806b = str;
        this.c = jbVarArr;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e) {
            if (this.e.c.containsKey(this.f2805a)) {
                FinskyLog.a("Applying library update: account=%s", FinskyLog.a(this.f2805a.name));
                x xVar = this.e.c.get(this.f2805a);
                String str = this.f2806b;
                jb[] jbVarArr = this.c;
                if (jbVarArr != null && jbVarArr.length != 0) {
                    xVar.f2843a.post(new z(xVar, jbVarArr, str));
                }
            } else {
                FinskyLog.d("LibraryUpdate for unknown account %s could not be applied", FinskyLog.a(this.f2805a.name));
            }
            if (this.d != null) {
                this.e.f2796b.post(new ap(this));
            }
        }
    }
}
