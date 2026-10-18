package com.google.android.finsky.b;

import android.accounts.Account;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ez;
import com.google.android.finsky.protos.fa;
import com.google.android.finsky.protos.rh;
import com.google.android.finsky.protos.ri;
import com.google.android.finsky.protos.rj;
import com.google.android.finsky.protos.rk;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.finsky.g.d f2106a;

    /* renamed from: b, reason: collision with root package name */
    final x f2107b;
    final Handler c;
    final String d;
    final String e;
    private final com.google.android.finsky.g.h f;
    private final com.google.android.vending.a.a.d g;
    private final Handler h;
    private final List<k> i = new ArrayList();
    private final com.google.android.gms.ads.b.a j;
    private final com.google.android.finsky.api.k k;

    public c(com.google.android.finsky.g.d dVar, com.google.android.finsky.g.h hVar, x xVar, com.google.android.vending.a.a.d dVar2, Handler handler, Handler handler2, com.google.android.gms.ads.b.a aVar, String str, String str2, com.google.android.finsky.api.k kVar) {
        this.f2106a = dVar;
        this.f = hVar;
        this.f2107b = xVar;
        this.g = dVar2;
        this.c = handler;
        this.h = handler2;
        this.j = aVar;
        this.d = str;
        this.e = str2;
        this.k = kVar;
    }

    public final void a(Runnable runnable) {
        this.f.a(new d(this, runnable));
    }

    public final synchronized void a(k kVar) {
        this.i.add(kVar);
        if (this.i.size() <= 1) {
            this.h.post(new e(this));
        }
    }

    final void a() {
        List<Account> a2 = this.f2106a.a();
        int a3 = a(a2, this.d);
        Collection<y> a4 = this.f2107b.a();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int a5 = a(a4, hashMap, arrayList);
        int a6 = a(arrayList, a3);
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        int[] iArr = {0};
        int[] iArr2 = {0};
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Account account : a2) {
            List<y> list = hashMap.get(account);
            int a7 = a(list, a3);
            String str = TextUtils.isEmpty(this.e) ? account.name : account.name + "/" + this.e;
            com.google.android.finsky.c.o<Integer> b2 = bg.F.b(str);
            com.google.android.finsky.c.o<Integer> b3 = bg.A.b(str);
            rh a8 = a(a6, b3.a().intValue(), arrayList, a7, b2.a().intValue(), list, a5, currentTimeMillis);
            if (a8 != null) {
                arrayList2.add(account);
                arrayList3.add(a8);
                arrayList4.add(new f(this, b3, a6, b2, a7, iArr, iArr2, arrayList2));
            }
        }
        a(arrayList2, iArr, iArr2, arrayList3, arrayList4);
    }

    static int a(List<Account> list, String str) {
        int hashCode = str.hashCode();
        Iterator<Account> it = list.iterator();
        while (true) {
            int i = hashCode;
            if (it.hasNext()) {
                hashCode = it.next().hashCode() ^ i;
            } else {
                return i;
            }
        }
    }

    private void a(List<Account> list, int[] iArr, int[] iArr2, List<rh> list2, List<com.android.volley.t<rk>> list3) {
        String str;
        if (list.size() == 0) {
            a(0, 0, 0);
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < list.size()) {
                Account account = list.get(i2);
                rh rhVar = list2.get(i2);
                com.android.volley.t<rk> tVar = list3.get(i2);
                com.google.android.vending.a.a.a a2 = this.g.a(account);
                com.google.android.gms.ads.b.a aVar = this.j;
                Account[] a3 = com.google.android.finsky.api.a.a(FinskyApp.a());
                int i3 = 0;
                while (true) {
                    if (i3 < a3.length) {
                        if (!a3[i3].equals(account)) {
                            i3++;
                        } else {
                            str = Integer.toString(i3);
                            break;
                        }
                    } else {
                        str = null;
                        break;
                    }
                }
                com.google.android.vending.a.a.e a4 = com.google.android.vending.a.a.e.a("https://android.clients.google.com/vending/api/ApiRequest", rh.class, rhVar, rk.class, tVar, a2.f7100b, new g(this, iArr, list, iArr2));
                if (aVar != null) {
                    if (!TextUtils.isEmpty(aVar.c())) {
                        a4.a("X-Public-Android-Id", aVar.c());
                    }
                    if (com.google.android.vending.a.a.a.c) {
                        a4.m = aVar;
                        a4.l = true;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    a4.a("X-Account-Ordinal", str);
                }
                a4.k = true;
                a2.f7099a.a(a4);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    final synchronized void a(int i, int i2, int i3) {
        if (i2 == i) {
            for (k kVar : this.i) {
                FinskyLog.a("Completed %d account content syncs with %d successful.", Integer.valueOf(i2), Integer.valueOf(i3));
                if (kVar != null) {
                    this.c.post(new h(this, kVar, i3, i));
                }
            }
            this.i.clear();
        }
    }

    private static rh a(int i, int i2, List<y> list, int i3, int i4, List<y> list2, int i5, long j) {
        int size;
        int size2;
        boolean z = i != i2;
        if (!(z || i3 != i4)) {
            return null;
        }
        rh rhVar = new rh();
        if (list2 != null && (size2 = list2.size()) > 0) {
            rhVar.e = new ri[size2];
            for (int i6 = 0; i6 < size2; i6++) {
                y yVar = list2.get(i6);
                ri[] riVarArr = rhVar.e;
                ri riVar = new ri();
                riVar.f4335a = com.google.android.finsky.h.a.a(yVar.f2137a, yVar.c);
                riVar.f4336b = true;
                riVar.c = 2;
                riVar.d = true;
                riVar.e = j;
                riVar.f = true;
                riVar.i = yVar.f2137a;
                riVar.j = true;
                riVar.k = yVar.c;
                riVar.l = true;
                riVarArr[i6] = riVar;
            }
        }
        if (z && (size = list.size()) > 0) {
            rhVar.f = new rj[list.size()];
            for (int i7 = 0; i7 < size; i7++) {
                y yVar2 = list.get(i7);
                rj[] rjVarArr = rhVar.f;
                rj rjVar = new rj();
                rjVar.f4337a = yVar2.f2137a;
                rjVar.f4338b = true;
                rjVar.c = yVar2.c;
                rjVar.d = true;
                ArrayList a2 = cz.a(yVar2.f2138b);
                Collections.sort(a2);
                rjVar.e = (String[]) a2.toArray(new String[a2.size()]);
                rjVarArr[i7] = rjVar;
            }
        }
        rhVar.c = i5;
        rhVar.d = true;
        return rhVar;
    }

    final int a(Collection<y> collection, Map<Account, List<y>> map, List<y> list) {
        int i;
        if (map.size() != 0 || list.size() != 0) {
            throw new IllegalArgumentException("Buckets must be empty");
        }
        int i2 = 0;
        for (y yVar : collection) {
            if (!yVar.d || yVar.e) {
                List<Account> a2 = this.f.a(yVar.f2137a, yVar.f2138b);
                if (a2.size() > 0) {
                    Account account = a2.get(0);
                    List<y> list2 = map.get(account);
                    if (list2 == null) {
                        list2 = new ArrayList<>();
                        map.put(account, list2);
                    }
                    list2.add(yVar);
                    i = i2;
                } else {
                    i = i2 + 1;
                }
            } else {
                i = i2;
            }
            if (yVar.d && !yVar.f) {
                list.add(yVar);
            }
            i2 = i;
        }
        for (Account account2 : this.f2106a.a()) {
            if (!map.containsKey(account2)) {
                map.put(account2, Collections.emptyList());
            }
        }
        return i2;
    }

    static int a(Collection<y> collection, int i) {
        return collection.hashCode() ^ i;
    }

    final void a(List<Account> list, int[] iArr, int[] iArr2, List<ez> list2, List<com.android.volley.t<fa>> list3, List<Integer> list4) {
        int i = 0;
        if (list.size() == 0) {
            a(0, 0, 0);
            return;
        }
        while (true) {
            int i2 = i;
            if (i2 < list.size()) {
                Account account = list.get(i2);
                this.k.a(account == null ? null : account.name).a(list2.get(i2), list4.get(i2).intValue(), list3.get(i2), new j(this, iArr, list, iArr2));
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    static ez a(int i, int i2, List<y> list, int i3, int i4, List<y> list2) {
        int size;
        int size2;
        boolean z = i != i2;
        if (!(i3 != i4) && !z) {
            return null;
        }
        ez ezVar = new ez();
        ezVar.f3806a = true;
        ezVar.f3807b = true;
        if (list2 != null && (size2 = list2.size()) > 0) {
            ezVar.c = new com.google.android.finsky.protos.af[size2];
            for (int i5 = 0; i5 < size2; i5++) {
                y yVar = list2.get(i5);
                com.google.android.finsky.protos.af[] afVarArr = ezVar.c;
                com.google.android.finsky.protos.af afVar = new com.google.android.finsky.protos.af();
                afVar.f3586a = yVar.f2137a;
                afVar.f3587b = true;
                afVar.c = yVar.c;
                afVar.d = true;
                afVarArr[i5] = afVar;
            }
        }
        ezVar.d = z;
        ezVar.e = true;
        if (z && (size = list.size()) > 0) {
            ezVar.f = new com.google.android.finsky.protos.af[list.size()];
            for (int i6 = 0; i6 < size; i6++) {
                y yVar2 = list.get(i6);
                com.google.android.finsky.protos.af[] afVarArr2 = ezVar.f;
                com.google.android.finsky.protos.af afVar2 = new com.google.android.finsky.protos.af();
                afVar2.f3586a = yVar2.f2137a;
                afVar2.f3587b = true;
                afVar2.c = yVar2.c;
                afVar2.d = true;
                afVar2.e = yVar2.f2138b;
                afVarArr2[i6] = afVar2;
            }
        }
        return ezVar;
    }
}
