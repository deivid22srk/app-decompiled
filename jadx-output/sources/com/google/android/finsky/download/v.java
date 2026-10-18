package com.google.android.finsky.download;

import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final w f2737a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Uri> f2738b;
    private final Set<Uri> c;
    private Map<Uri, r> d;

    public v(w wVar, Set<Uri> set, Set<Uri> set2, Map<Uri, r> map) {
        this.f2737a = wVar;
        this.f2738b = set;
        this.c = set2;
        this.d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<Uri> it = this.f2738b.iterator();
        while (it.hasNext()) {
            b a2 = this.f2737a.a(it.next());
            if (a2 != null && a2.n() == 2) {
                this.f2737a.g(a2);
            }
        }
        for (Uri uri : this.c) {
            b a3 = this.f2737a.a(uri);
            if (a3 != null) {
                r rVar = this.d.get(uri);
                switch (rVar.d) {
                    case 195:
                        if (a3.j()) {
                            rVar = new r(rVar.f2731a, rVar.f2732b, rVar.c, 196);
                            break;
                        }
                        break;
                    case 198:
                        FinskyLog.a("%s: Caught error %d while state=%d", a3, Integer.valueOf(rVar.d), Integer.valueOf(a3.n()));
                        if (a3.n() == 2) {
                            a3.b(rVar.d);
                            this.f2737a.b(a3, 5);
                            break;
                        } else {
                            continue;
                        }
                }
                this.f2737a.b(a3, rVar);
            }
        }
    }
}
