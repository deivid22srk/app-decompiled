package com.google.android.finsky.gpkg;

import android.util.Base64;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jm;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f2842a;

    w(v vVar) {
        this.f2842a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f2842a;
        if (vVar.e == 0) {
            vVar.c.a();
            String str = vVar.c.i.name;
            Iterator<r> it = vVar.f2841b.iterator();
            while (it.hasNext()) {
                r next = it.next();
                if (str.equals(next.g)) {
                    vVar.c.c(next);
                }
            }
            for (String str2 : a.g) {
                String a2 = bg.a(str2).b(str).a();
                vVar.c.a(str2, a2 != null ? Base64.decode(a2, 0) : null);
            }
            vVar.c.a(jm.d(bg.V.b(str).a()));
            vVar.e = 2;
            vVar.c.b();
        }
        synchronized (vVar) {
            Iterator<Runnable> it2 = vVar.d.iterator();
            while (it2.hasNext()) {
                vVar.f2840a.post(it2.next());
            }
            vVar.d.clear();
        }
    }
}
