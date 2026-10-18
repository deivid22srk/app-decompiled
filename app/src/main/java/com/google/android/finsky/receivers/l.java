package com.google.android.finsky.receivers;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cz;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4485a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f4486b;
    final /* synthetic */ int c;
    final /* synthetic */ h d;

    l(h hVar, String str, int i, int i2) {
        this.d = hVar;
        this.f4485a = str;
        this.f4486b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        list = this.d.n;
        Iterator it = cz.a(list).iterator();
        while (it.hasNext()) {
            try {
                ((com.google.android.finsky.installer.p) it.next()).a(this.f4485a, this.f4486b, this.c);
            } catch (Exception e) {
                FinskyLog.b(e, "Exception caught in InstallerListener", new Object[0]);
            }
        }
    }
}
