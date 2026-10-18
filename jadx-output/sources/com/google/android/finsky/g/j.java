package com.google.android.finsky.g;

import android.accounts.Account;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f2826a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f2827b;
    final /* synthetic */ List c;
    final /* synthetic */ int d;
    final /* synthetic */ h e;

    j(h hVar, Account account, int[] iArr, List list, int i) {
        this.e = hVar;
        this.f2826a = account;
        this.f2827b = iArr;
        this.c = list;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FinskyLog.a("Loaded library for account: %s", FinskyLog.a(this.f2826a.name));
        int[] iArr = this.f2827b;
        iArr[0] = iArr[0] + 1;
        if (this.f2827b[0] == this.c.size()) {
            FinskyLog.a("Finished loading %d libraries.", Integer.valueOf(this.c.size()));
            this.e.h();
            this.e.i();
            this.e.j = this.d;
        }
    }
}
