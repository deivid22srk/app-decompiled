package com.google.android.finsky.download;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
final class ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f2694a;

    private ai(x xVar) {
        this.f2694a = xVar;
    }

    /* synthetic */ ai(x xVar, byte b2) {
        this(xVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        jm.a();
        if (this.f2694a.f2740b.size() < this.f2694a.c) {
            LinkedList linkedList = new LinkedList();
            Iterator<String> it = this.f2694a.f2739a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                String next = it.next();
                bVar = this.f2694a.f2739a.get(next);
                linkedList.add(next);
                if (bVar.n() == 1) {
                    long e = bVar.e();
                    long c = am.c();
                    long b2 = am.b();
                    if (bVar.f() == null) {
                        if (c >= e) {
                            break;
                        }
                        bVar.b(198);
                        this.f2694a.b(bVar, 5);
                    } else {
                        if (b2 >= e) {
                            break;
                        }
                        bVar.b(198);
                        this.f2694a.b(bVar, 5);
                    }
                }
            }
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                this.f2694a.f2739a.remove((String) it2.next());
            }
            x xVar = this.f2694a;
            if (bVar != null) {
                FinskyLog.a("Download %s starting", bVar);
                xVar.f2740b.put(bVar.c(), bVar);
                xVar.d.a(bVar, new ae(xVar, bVar));
            }
            if (this.f2694a.f2740b.size() != 0 || this.f2694a.e == null) {
                return;
            }
            s sVar = this.f2694a.e;
            sVar.f2734b.post(new u(sVar));
            this.f2694a.e = null;
        }
    }
}
