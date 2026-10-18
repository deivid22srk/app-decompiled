package com.google.android.finsky.download;

import com.google.android.finsky.utils.FinskyLog;
import java.util.Iterator;

/* loaded from: classes.dex */
abstract class ag implements Runnable {
    int d;
    final /* synthetic */ x e;

    abstract void a(aj ajVar);

    public ag(x xVar, int i) {
        this.e = xVar;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator<aj> it = this.e.f.iterator();
        while (it.hasNext()) {
            try {
                a(it.next());
            } catch (Exception e) {
                FinskyLog.b(e, "Download listener threw an exception during " + this.d, new Object[0]);
            }
        }
    }
}
