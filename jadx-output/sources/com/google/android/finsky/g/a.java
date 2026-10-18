package com.google.android.finsky.g;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2782a = "3";

    /* renamed from: b, reason: collision with root package name */
    public static final String f2783b = "1";
    public static final String c = "4";
    public static final String d = "2";
    public static final String e = "6";
    public static final String f = "10";
    public static final String[] g = {f2782a, f2783b, c, d, e, f, "u-wl", "u-pl"};
    private static final String[] n = new String[0];
    public final Account i;
    private final Handler l;
    public final Map<String, g> h = new HashMap();
    private final Map<String, byte[]> j = new HashMap();
    private final List<c> k = new ArrayList();
    private boolean m = true;
    private String[] o = n;

    public static String a(int i) {
        switch (i) {
            case 1:
                return f2783b;
            case 2:
                return d;
            case 3:
                return f2782a;
            case 4:
                return c;
            case 5:
            case 7:
            case 8:
            case 9:
            default:
                return null;
            case 6:
                return e;
            case 10:
                return f;
        }
    }

    public static int a(String str) {
        if (f2782a.equals(str)) {
            return 3;
        }
        if (f2783b.equals(str)) {
            return 1;
        }
        if (c.equals(str)) {
            return 4;
        }
        if (d.equals(str)) {
            return 2;
        }
        if (e.equals(str)) {
            return 6;
        }
        if (f.equals(str)) {
            return 10;
        }
        if (b(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Invalid libraryId: " + str);
    }

    public static boolean b(String str) {
        return "u-wl".equals(str) || "u-pl".equals(str);
    }

    public a(Account account, Handler handler) {
        this.i = account;
        this.l = handler;
        this.h.put(f2782a, new e(new ay()));
        this.h.put(d, new at(new ay()));
        this.h.put(f2783b, new f(1, new ay()));
        this.h.put(c, new f(4, new ay()));
        this.h.put(e, new as(new ay()));
        this.h.put(f, new f(10, new ay()));
        this.h.put("u-wl", new f(0, new ay()));
        this.h.put("u-pl", new f(0, new ay()));
    }

    public final synchronized void a() {
        this.m = false;
    }

    public final synchronized void b() {
        this.m = true;
        h();
    }

    public final boolean c(String str) {
        return this.h.containsKey(str);
    }

    private void h() {
        if (this.m) {
            this.l.post(new b(this, new ArrayList(this.k)));
        }
    }

    public final synchronized void a(c cVar) {
        this.k.add(cVar);
    }

    public final synchronized q d(String str) {
        return (q) ((e) this.h.get(f2782a)).a(new r(null, f2782a, 3, str, 1, 1));
    }

    public final synchronized t e(String str) {
        return ((e) this.h.get(f2782a)).b(str);
    }

    public final synchronized List<u> c() {
        ArrayList arrayList;
        e eVar = (e) this.h.get(f2782a);
        arrayList = new ArrayList();
        Iterator<String> it = eVar.f2818a.iterator();
        while (it.hasNext()) {
            arrayList.add(eVar.a(it.next()));
        }
        return arrayList;
    }

    public final synchronized List<t> f(String str) {
        ArrayList arrayList;
        e eVar = (e) this.h.get(f2782a);
        arrayList = new ArrayList();
        for (String str2 : eVar.f2819b) {
            if (TextUtils.equals(com.google.android.finsky.utils.as.c(str2), str)) {
                arrayList.add(eVar.b(str2));
            }
        }
        return arrayList;
    }

    public final synchronized List<u> g(String str) {
        ArrayList arrayList;
        e eVar = (e) this.h.get(f2782a);
        arrayList = new ArrayList();
        for (String str2 : eVar.f2818a) {
            if (TextUtils.equals(com.google.android.finsky.utils.as.b(str2), str)) {
                arrayList.add(eVar.a(str2));
            }
        }
        return arrayList;
    }

    public final synchronized List<aq> d() {
        return ((at) this.h.get(d)).b();
    }

    public final synchronized List<aq> e() {
        return ((as) this.h.get(e)).b();
    }

    public final synchronized aq h(String str) {
        return (aq) ((as) this.h.get(e)).a(new r(null, e, 6, str, 15, 1));
    }

    @Override // com.google.android.finsky.g.p
    public final synchronized r a(r rVar) {
        g gVar;
        gVar = this.h.get(rVar.h);
        return gVar != null ? gVar.a(rVar) : null;
    }

    @Override // com.google.android.finsky.g.p
    public final synchronized boolean b(r rVar) {
        g gVar;
        gVar = this.h.get(rVar.h);
        return gVar != null ? gVar.b(rVar) : false;
    }

    public final synchronized void c(r rVar) {
        if (!this.i.name.equals(rVar.g)) {
            throw new IllegalArgumentException("Invalid account.");
        }
        g gVar = this.h.get(rVar.h);
        if (gVar != null) {
            gVar.c(rVar);
            h();
        }
    }

    public final synchronized void a(Collection<? extends r> collection) {
        Iterator<? extends r> it = collection.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    @Override // com.google.android.finsky.g.p
    public final synchronized void d(r rVar) {
        if (!this.i.name.equals(rVar.g)) {
            throw new IllegalArgumentException();
        }
        g gVar = this.h.get(rVar.h);
        if (gVar != null) {
            gVar.d(rVar);
            h();
        }
    }

    public final synchronized void a(String str, byte[] bArr) {
        this.j.put(str, bArr);
    }

    public final synchronized byte[] i(String str) {
        return this.j.get(str);
    }

    public final synchronized void a(String[] strArr) {
        this.o = strArr;
    }

    public final synchronized String[] f() {
        return this.o;
    }

    @Override // com.google.android.finsky.g.p
    public final synchronized int g() {
        int i;
        int i2 = 0;
        Iterator<g> it = this.h.values().iterator();
        while (true) {
            i = i2;
            if (it.hasNext()) {
                i2 = it.next().g() + i;
            }
        }
        return i;
    }

    public final g j(String str) {
        return this.h.get(str);
    }

    public final synchronized void k(String str) {
        g gVar = this.h.get(str);
        if (gVar == null) {
            FinskyLog.c("Cannot reset: %s", str);
        } else {
            gVar.a();
        }
        h();
    }

    @Override // java.lang.Iterable
    public final Iterator<r> iterator() {
        throw new UnsupportedOperationException();
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        return String.format("{account=%s numapps=%d}", FinskyLog.a(this.i.name), Integer.valueOf(this.h.get(f2782a).g()));
    }
}
