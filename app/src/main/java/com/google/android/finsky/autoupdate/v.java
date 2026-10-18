package com.google.android.finsky.autoupdate;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.bpkg.x;
import com.google.android.finsky.bpkg.y;
import com.google.android.finsky.protos.ag;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.dw;
import com.google.android.finsky.utils.jn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class v extends p {
    private final h k;
    private final x l;
    private final com.google.android.finsky.dpkg.d m;
    private final com.google.android.finsky.apkg.i n;
    private String o;
    private long p;
    private Set<String> q;
    private boolean r;
    private int s;
    private int t;

    public v(Context context, com.google.android.finsky.gpkg.h hVar, com.google.android.finsky.bpkg.a aVar, com.google.android.finsky.api.k kVar, com.google.android.finsky.bpkg.s sVar, com.google.android.finsky.installer.n nVar, com.google.android.finsky.receivers.f fVar, dw dwVar, x xVar, h hVar2, com.google.android.finsky.dpkg.d dVar, com.google.android.finsky.apkg.i iVar, com.google.android.finsky.fpkg.a aVar2) {
        super(context, hVar, aVar, kVar, sVar, nVar, fVar, dwVar, aVar2);
        this.k = hVar2;
        this.l = xVar;
        this.m = dVar;
        this.n = iVar;
    }

    @Override // com.google.android.finsky.autoupdate.p
    protected final void a(List<Document> list, String str, boolean z, Map<String, List<Document>> map) {
        long j = (z || this.k.a()) ? 16L : 0L;
        this.o = str;
        this.p = j;
        this.q = com.google.android.finsky.installer.n.a(FinskyApp.a());
        this.r = bg.ar.a().booleanValue() && com.google.android.finsky.cpkg.d.aQ.b().longValue() > 0;
        bg.ar.a((com.google.android.finsky.cpkg.o<Boolean>) false);
        this.s = 0;
        this.t = 0;
        bg.al.a((com.google.android.finsky.cpkg.o<Long>) 0L);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Document document = list.get(i);
            arrayList.add(new a(document, this.l.a(document.E().w)));
        }
        a(arrayList);
        a(arrayList, map);
        Collections.sort(arrayList, a.f2033b);
        b(arrayList);
        c(arrayList);
        d(arrayList);
        e(arrayList);
        f(arrayList);
        if (this.s > 0 && this.r) {
            FinskyLog.a("Auto-update of %d packages will defer for %d ms", Integer.valueOf(this.s), com.google.android.finsky.cpkg.d.aQ.b());
            new Handler(Looper.getMainLooper()).postDelayed(new w(this), com.google.android.finsky.cpkg.d.aQ.b().longValue());
        }
        com.google.android.finsky.apkg.p pVar = new com.google.android.finsky.apkg.p();
        pVar.r = true;
        pVar.q = this.s;
        pVar.t = true;
        pVar.s = this.t;
        this.n.a((String) null, pVar, this.o, (com.google.android.finsky.apkg.n) null);
    }

    private void a(List<a> list, Map<String, List<Document>> map) {
        if (this.m.a(12605211L) && !map.isEmpty()) {
            HashMap hashMap = new HashMap(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a aVar = list.get(i);
                hashMap.put(aVar.c.E().w, aVar);
            }
            for (Map.Entry<String, List<Document>> entry : map.entrySet()) {
                String key = entry.getKey();
                a aVar2 = (a) hashMap.get(key);
                if (aVar2 == null) {
                    FinskyLog.c("%s depends on %s but not found in map", key, entry.getValue());
                } else {
                    FinskyLog.a("%s depends on %s", key, entry.getValue());
                    aVar2.g |= 16;
                }
            }
        }
    }

    private void b(List<a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = list.get(i);
            y yVar = aVar.d;
            com.google.android.finsky.installer.o a2 = this.f.a(aVar.c, true);
            if ((aVar.e & 1) != 0 && a2.f2866a) {
                aVar.f |= 1;
            }
            if ((aVar.e & 2) != 0 && a2.f2867b) {
                aVar.f |= 2;
            }
            if ((aVar.e & 4) != 0 && a2.c) {
                aVar.f |= 4;
            }
            if ((aVar.e & 32) != 0 && this.q.contains(aVar.c.E().w)) {
                aVar.f |= 32;
            }
            if ((aVar.e & 16) != 0 && (this.p & 16) == 0) {
                aVar.f |= 16;
            }
            if ((aVar.e & 64) != 0 && this.i.b()) {
                aVar.f |= 64;
            }
            if ((aVar.e & 128) != 0 && yVar.g) {
                aVar.f |= 128;
            }
            if ((aVar.e & 8) != 0 && !bg.t.a().booleanValue()) {
                aVar.f |= 8;
            }
        }
    }

    private void c(List<a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = list.get(i);
            if (aVar.f != 0) {
                this.t++;
            } else {
                String str = aVar.c.E().w;
                if ((aVar.g & 8) != 0) {
                    this.g.e(str);
                }
                this.g.a(str, (aVar.g & 1) != 0, (aVar.g & 2) != 0, (aVar.g & 4) != 0);
                if ((aVar.g & 16) != 0) {
                    com.google.android.finsky.bpkg.t a2 = this.e.a(str);
                    this.e.d(str, (a2 == null ? 0 : a2.m) | 262144);
                }
                this.g.a(str, aVar.c.d(), aVar.c.f1963a.i, aVar.h, this.r, aVar.i, aVar.c.t());
                this.s++;
            }
        }
    }

    private void d(List<a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = list.get(i);
            if ((aVar.l & 1) != 0 && aVar.f != 0) {
                com.google.android.finsky.apkg.p pVar = new com.google.android.finsky.apkg.p();
                if ((aVar.f & 8) != 0) {
                    pVar.p = true;
                    pVar.o = true;
                }
                if ((aVar.f & 16) != 0) {
                    pVar.f = true;
                    pVar.e = true;
                }
                if ((aVar.f & 1) != 0) {
                    pVar.l = true;
                    pVar.k = true;
                }
                if ((aVar.f & 2) != 0) {
                    pVar.j = true;
                    pVar.i = true;
                }
                if ((aVar.f & 64) != 0) {
                    pVar.f1495b = true;
                    pVar.f1494a = true;
                }
                if ((aVar.f & 4) != 0) {
                    pVar.n = true;
                    pVar.m = true;
                }
                if ((aVar.f & 32) != 0) {
                    pVar.v = true;
                    pVar.u = true;
                }
                ag E = aVar.c.E();
                this.n.a(E.w, pVar, this.o, a(E));
            }
        }
    }

    private void e(List<a> list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a aVar = list.get(i);
                if (aVar.f != 0 && (aVar.k & 1) == 0) {
                    arrayList.add(aVar.c);
                    boolean z = (aVar.f & a.f2032a) != 0;
                    if (z) {
                        arrayList3.add(aVar.c);
                    }
                    ag E = aVar.c.E();
                    String str = E.w;
                    com.google.android.finsky.bpkg.t a2 = this.c.f2060a.a(E.w);
                    int i2 = E.e;
                    if (a2 == null || i2 > a2.d) {
                        this.c.f2060a.c(str, i2);
                        arrayList2.add(aVar.c);
                        if (z) {
                            arrayList4.add(aVar.c);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty() && jn.h.a().booleanValue()) {
                this.h.a();
                boolean booleanValue = bg.t.a().booleanValue();
                int size2 = arrayList.size();
                int size3 = arrayList3.size();
                int size4 = arrayList2.size();
                boolean z2 = arrayList4.size() > 0;
                long currentTimeMillis = System.currentTimeMillis() - bg.ak.a().longValue();
                if (!booleanValue && size4 > 0) {
                    FinskyLog.a("Notifying user that [%d/%d] applications have new updates.", Integer.valueOf(size4), Integer.valueOf(size2));
                    this.h.a(arrayList2, size2);
                    bg.ak.a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(System.currentTimeMillis()));
                } else if (booleanValue && z2) {
                    FinskyLog.a("Notifying user [%d/%d] applications have updates that require approval.", Integer.valueOf(size3), Integer.valueOf(size2));
                    this.h.b(arrayList3, size2);
                    bg.ak.a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(System.currentTimeMillis()));
                } else if (currentTimeMillis > com.google.android.finsky.cpkg.d.dj.b().longValue()) {
                    FinskyLog.a("Notifying user that %d applications have outstanding updates.", Integer.valueOf(size2));
                    this.h.a(arrayList);
                    bg.ak.a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    private void f(List<a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = list.get(i);
            if (aVar.f != 0 && (aVar.f & (-81)) == 0) {
                if (bg.al.a().longValue() <= 0) {
                    bg.al.a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(System.currentTimeMillis()));
                }
                this.k.b();
                return;
            }
        }
    }

    private void a(List<a> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d());
        arrayList.add(new f(this.m));
        arrayList.add(new e());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = list.get(i);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((c) arrayList.get(i2)).a(aVar);
            }
        }
    }
}
