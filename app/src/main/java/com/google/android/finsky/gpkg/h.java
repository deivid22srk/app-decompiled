package com.google.android.finsky.gpkg;

import android.accounts.Account;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class h implements p {

    /* renamed from: b, reason: collision with root package name */
    public final d f2823b;
    public final av c;
    public final Handler d;
    public final Handler e;
    public int j;

    /* renamed from: a, reason: collision with root package name */
    public final Map<Account, a> f2822a = new HashMap();
    public List<Account> f = null;
    public List<a> g = Collections.unmodifiableList(new ArrayList());
    public final List<Runnable> h = new ArrayList();
    public final List<o> i = new ArrayList();
    public boolean k = false;

    public h(d dVar, av avVar, Handler handler, Handler handler2) {
        this.f2823b = dVar;
        this.c = avVar;
        this.e = handler2;
        this.d = handler;
    }

    public final synchronized void a(o oVar) {
        this.i.add(oVar);
    }

    public final synchronized void b(o oVar) {
        this.i.remove(oVar);
    }

    public final synchronized boolean a() {
        return this.k;
    }

    public final synchronized int b() {
        return this.j;
    }

    public final void c() {
        if (Looper.myLooper() == this.d.getLooper() || Looper.myLooper() == this.e.getLooper()) {
            throw new IllegalStateException();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a(new i(this, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public final synchronized void a(Runnable runnable) {
        if (this.k && this.j == a(this.f2823b.a())) {
            if (runnable != null) {
                this.d.post(runnable);
            }
        } else {
            this.h.add(runnable);
            if (this.h.size() <= 1) {
                this.f = this.f2823b.a();
                int a2 = a(this.f);
                ArrayList<Account> arrayList = null;
                for (Account account : this.f2822a.keySet()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (!this.f.contains(account)) {
                        arrayList.add(account);
                    }
                }
                if (arrayList != null) {
                    for (Account account2 : arrayList) {
                        FinskyLog.a("Unloading AccountLibrary for account: %s", FinskyLog.a(account2.name));
                        this.f2822a.remove(account2);
                    }
                }
                ArrayList<Account> arrayList2 = new ArrayList();
                for (Account account3 : this.f) {
                    if (!this.f2822a.containsKey(account3)) {
                        arrayList2.add(account3);
                        a aVar = new a(account3, this.d);
                        aVar.a(new l(this, aVar));
                        this.f2822a.put(account3, aVar);
                    }
                }
                this.g = Collections.unmodifiableList(cz.a(this.f2822a.values()));
                if (arrayList2.size() == 0) {
                    h();
                    i();
                    this.j = a2;
                    this.k = true;
                } else {
                    int[] iArr = {0};
                    for (Account account4 : arrayList2) {
                        new v(this.c, this.f2822a.get(account4), this.d, this.e).a(new j(this, account4, iArr, arrayList2, a2));
                    }
                    this.k = true;
                }
            }
        }
    }

    public final synchronized void d() {
        this.e.post(new k(this));
    }

    public static int a(List<Account> list) {
        int i = 0;
        Iterator<Account> it = list.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                i = it.next().hashCode() + i2;
            } else {
                return i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.d.post(new n(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        for (Runnable runnable : this.h) {
            if (runnable != null) {
                this.d.post(runnable);
            }
        }
        this.h.clear();
    }

    public final synchronized List<a> e() {
        return this.g;
    }

    public final synchronized a a(Account account) {
        return this.f2822a.get(account);
    }

    @Override // com.google.android.finsky.gpkg.p
    public final synchronized boolean b(r rVar) {
        boolean z;
        int size = this.g.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            if (!this.g.get(i).b(rVar)) {
                i++;
            } else {
                z = true;
                break;
            }
        }
        return z;
    }

    @Override // com.google.android.finsky.gpkg.p
    public final synchronized r a(r rVar) {
        r rVar2;
        int size = this.g.size();
        int i = 0;
        while (true) {
            if (i < size) {
                rVar2 = this.g.get(i).a(rVar);
                if (rVar2 != null) {
                    break;
                }
                i++;
            } else {
                rVar2 = null;
                break;
            }
        }
        return rVar2;
    }

    public final synchronized List<Account> a(String str, String[] strArr) {
        List<Account> list;
        List<Account> list2;
        list = null;
        int size = this.f.size();
        int i = 0;
        while (i < size) {
            Account account = this.f.get(i);
            q d = this.f2822a.get(account).d(str);
            if (d == null || !d.a(strArr)) {
                list2 = list;
            } else {
                List<Account> arrayList = list == null ? new ArrayList<>() : list;
                arrayList.add(account);
                list2 = arrayList;
            }
            i++;
            list = list2;
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        return list;
    }

    public final synchronized List<Account> a(String str) {
        return a(str, q.f2834a);
    }

    public final synchronized boolean f() {
        boolean z;
        int size = this.g.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            if (this.g.get(i).c().isEmpty()) {
                i++;
            } else {
                z = true;
                break;
            }
        }
        return z;
    }

    @Override // com.google.android.finsky.gpkg.p
    public final void d(r rVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.finsky.gpkg.p
    public final synchronized int g() {
        int i;
        int size = this.g.size();
        i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.g.get(i2).g();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<r> iterator() {
        throw new UnsupportedOperationException();
    }

    public final synchronized List<q> b(String str, String[] strArr) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            q d = this.g.get(i).d(str);
            if (d != null && d.a(strArr)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }
}
