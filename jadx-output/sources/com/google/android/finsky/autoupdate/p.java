package com.google.android.finsky.autoupdate;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.b.ab;
import com.google.android.finsky.b.x;
import com.google.android.finsky.b.y;
import com.google.android.finsky.protos.ag;
import com.google.android.finsky.protos.fw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.cy;
import com.google.android.finsky.utils.dw;
import com.google.android.finsky.utils.gs;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.jm;
import com.google.android.finsky.utils.jn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f2049a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.finsky.g.h f2050b;
    protected final com.google.android.finsky.b.a c;
    protected final com.google.android.finsky.api.k d;
    protected final com.google.android.finsky.b.s e;
    protected final com.google.android.finsky.installer.n f;
    protected final com.google.android.finsky.receivers.f g;
    protected final dw h;
    protected final com.google.android.finsky.f.a i;
    com.google.android.finsky.api.model.t j;

    protected abstract void a(List<Document> list, String str, boolean z, Map<String, List<Document>> map);

    protected p(Context context, com.google.android.finsky.g.h hVar, com.google.android.finsky.b.a aVar, com.google.android.finsky.api.k kVar, com.google.android.finsky.b.s sVar, com.google.android.finsky.installer.n nVar, com.google.android.finsky.receivers.f fVar, dw dwVar, com.google.android.finsky.f.a aVar2) {
        this.f2049a = context;
        this.f2050b = hVar;
        this.c = aVar;
        this.d = kVar;
        this.e = sVar;
        this.f = nVar;
        this.g = fVar;
        this.h = dwVar;
        this.i = aVar2;
    }

    public final void a(u uVar, String str, boolean z) {
        boolean z2 = true;
        if (!ic.a(this.f2049a)) {
            FinskyLog.a("Skipping update checks because the store is invalid.", new Object[0]);
            a(uVar, false);
            return;
        }
        Account i = FinskyApp.a().i();
        if (i == null) {
            a(uVar, true);
            return;
        }
        if (!this.c.f2060a.b()) {
            FinskyLog.e("Require loaded app states to perform update check.", new Object[0]);
            a(uVar, false);
            return;
        }
        if (!this.f2050b.a()) {
            FinskyLog.e("Require loaded libraries to perform update check.", new Object[0]);
            a(uVar, false);
            return;
        }
        com.google.android.finsky.f.a aVar = this.i;
        if (com.google.android.finsky.f.a.f2775a && aVar.f2776b.getCount() > 0) {
            z2 = false;
        }
        if (!z2) {
            FinskyLog.e("Require initialized Gearhead monitor to perform update check.", new Object[0]);
            a(uVar, false);
        } else {
            a(this.c);
            new q(this, i, this.f2050b.b(), uVar, str, z).execute(new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Document> list, Map<String, Document> map, Map<String, List<Document>> map2, List<Document> list2, String str, boolean z) {
        while (!list.isEmpty()) {
            Document remove = list.remove(list.size() - 1);
            String str2 = remove.E().w;
            fw[] U = remove.U();
            if (U.length != 0) {
                String str3 = this.e.a(str2).p;
                com.google.android.finsky.installer.b.a(this.f2049a, str2, U, map, TextUtils.isEmpty(str3) ? FinskyApp.a().j() : str3, new t(this, map2, str2, list, map, list2, str, z, remove));
                return;
            }
        }
        a(list2, str, z, map2);
    }

    public static p a() {
        h reschedulerUsingAlarmManager;
        FinskyApp a2 = FinskyApp.a();
        com.google.android.finsky.g.h hVar = a2.p;
        com.google.android.finsky.b.a aVar = a2.s;
        com.google.android.finsky.api.k b2 = a2.b();
        com.google.android.finsky.b.s sVar = a2.r;
        com.google.android.finsky.installer.n nVar = a2.l;
        com.google.android.finsky.receivers.f fVar = a2.k;
        dw dwVar = a2.n;
        x xVar = a2.v;
        if (Build.VERSION.SDK_INT >= 21 && com.google.android.finsky.c.d.dv.b().longValue() > 0) {
            FinskyApp a3 = FinskyApp.a();
            reschedulerUsingAlarmManager = new ReschedulerUsingJobScheduler(a3, com.google.android.finsky.f.a.a(), a3.e());
        } else if (Build.VERSION.SDK_INT < 21 && FinskyApp.a().e().a(12602735L)) {
            reschedulerUsingAlarmManager = new ReschedulerUsingBroadcast();
        } else {
            reschedulerUsingAlarmManager = new ReschedulerUsingAlarmManager();
        }
        return new v(a2, hVar, aVar, b2, sVar, nVar, fVar, dwVar, xVar, reschedulerUsingAlarmManager, a2.e(), a2.h(), com.google.android.finsky.f.a.a());
    }

    static void a(u uVar, boolean z) {
        if (uVar != null) {
            uVar.a(z);
        }
    }

    public static void a(com.google.android.finsky.b.a aVar) {
        jm.a();
        if (!aVar.f2060a.b()) {
            FinskyLog.e("Require loaded app states to migrate auto-update state.", new Object[0]);
        }
        boolean b2 = jn.k.b();
        boolean b3 = bg.t.b();
        if (b2 || !b3) {
            if (!b2 && !b3 && FinskyApp.a().B == -1) {
                bg.t.a((com.google.android.finsky.c.o<Boolean>) true);
                bg.u.a((com.google.android.finsky.c.o<Boolean>) true);
                return;
            }
            boolean booleanValue = jn.k.a().booleanValue();
            bg.t.a((com.google.android.finsky.c.o<Boolean>) Boolean.valueOf(booleanValue));
            if (!bg.u.b()) {
                bg.u.a((com.google.android.finsky.c.o<Boolean>) Boolean.valueOf(jn.j.b() ? jn.j.a().booleanValue() : true));
            }
            a(aVar, !booleanValue, "version");
            jn.k.c();
            jn.j.c();
            bg.h.a((com.google.android.finsky.c.o<Boolean>) true);
        }
    }

    public static void a(com.google.android.finsky.b.a aVar, boolean z, String str) {
        FinskyApp.a().h().a(404, (String) null, str, 0, (String) null, (com.google.android.finsky.a.n) null);
        ab abVar = aVar.f2060a;
        for (com.google.android.finsky.b.t tVar : abVar.a()) {
            if (!com.google.android.finsky.b.l.a(tVar.f2130a)) {
                int i = tVar.f2131b;
                if (z || i == 0) {
                    String str2 = tVar.f2130a;
                    abVar.a(str2, 1);
                    FinskyLog.a("Migrate %s autoupdate from default to %d", str2, 1);
                }
            }
        }
    }

    protected final com.google.android.finsky.a.n a(ag agVar) {
        com.google.android.finsky.b.b a2 = this.c.a(agVar.w);
        com.google.android.finsky.a.n nVar = new com.google.android.finsky.a.n();
        nVar.f1490a = agVar.e;
        nVar.f1491b = true;
        nVar.c = a2.c.c;
        nVar.d = true;
        nVar.e = a2.c.d;
        nVar.f = true;
        return nVar;
    }

    static /* synthetic */ void a(p pVar, Document document) {
        String str = document.E().w;
        String a2 = com.google.android.finsky.activities.a.a(str, FinskyApp.a().j(), pVar.c, pVar.f2050b);
        Account a3 = com.google.android.finsky.api.a.a(a2, pVar.f2049a);
        if (a3 == null) {
            FinskyLog.a("Cannot acquire %s because cannot determine account %s", str, FinskyLog.a(a2));
            return;
        }
        com.google.android.finsky.g.a a4 = pVar.f2050b.a(a3);
        if (a4 == null) {
            FinskyLog.a("Cannot acquire %s cannot find library for %s.", str, FinskyLog.a(a2));
        } else {
            if (cy.a(document, a4)) {
                return;
            }
            gs.a(a3, document, 1, null, null, false, false);
        }
    }

    static /* synthetic */ void a(p pVar, List list, String str, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pVar.f.a((Document) list.get(i));
        }
        com.google.android.finsky.installer.n nVar = pVar.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Document document = (Document) it.next();
            y a2 = nVar.f2865b.f2061b.a(document.E().w);
            boolean z2 = a2 == null && com.google.android.finsky.b.l.a(document);
            boolean a3 = nVar.a(a2, document);
            if (z2 || a3) {
                arrayList.add(document);
            }
        }
        if (!FinskyApp.a().e().a(12605211L)) {
            pVar.a(arrayList, str, z, Collections.emptyMap());
        } else {
            pVar.a(new ArrayList(arrayList), com.google.android.finsky.installer.b.a(list), new HashMap(), arrayList, str, z);
        }
    }
}
