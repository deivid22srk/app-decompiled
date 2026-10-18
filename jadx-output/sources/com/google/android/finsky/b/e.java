package com.google.android.finsky.b;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ez;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f2110a;

    e(c cVar) {
        this.f2110a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f2110a;
        if (FinskyApp.a().e().a(12607314L) || com.google.android.finsky.utils.ar.a(cVar.f2106a.a())) {
            FinskyLog.a("Replicating app states via DFE.", new Object[0]);
            List<Account> a2 = cVar.f2106a.a();
            int a3 = c.a(a2, cVar.d);
            Collection<y> a4 = cVar.f2107b.a();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            cVar.a(a4, hashMap, arrayList);
            int a5 = c.a(arrayList, a3);
            ArrayList arrayList2 = new ArrayList();
            int[] iArr = {0};
            int[] iArr2 = {0};
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < a2.size()) {
                    Account account = a2.get(i2);
                    List<y> list = hashMap.get(account);
                    int a6 = c.a(list, a3);
                    String str = TextUtils.isEmpty(cVar.e) ? account.name : account.name + "/" + cVar.e;
                    com.google.android.finsky.c.o<Integer> b2 = bg.F.b(str);
                    com.google.android.finsky.c.o<Integer> b3 = bg.A.b(str);
                    ez a7 = c.a(a5, b3.a().intValue(), arrayList, a6, b2.a().intValue(), list);
                    if (a7 != null) {
                        arrayList2.add(account);
                        arrayList4.add(a7);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList5.add(new i(cVar, b3, a5, b2, a6, iArr, iArr2, arrayList2));
                    }
                    i = i2 + 1;
                } else {
                    cVar.a(arrayList2, iArr, iArr2, arrayList4, arrayList5, arrayList3);
                    return;
                }
            }
        } else {
            FinskyLog.a("Replicating app states via AMAS.", new Object[0]);
            cVar.a();
        }
    }
}
