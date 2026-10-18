package com.google.android.libraries.bind.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    protected com.google.android.libraries.bind.cpkg.b f6695a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f6696b;
    protected ab c;
    int d;
    ac e;
    protected boolean f;
    private final ac g;
    private final x h;
    private boolean i;
    private CopyOnWriteArraySet<Object> j;
    private boolean k;
    private boolean l;

    public k(int i) {
        this(i, (byte) 0);
    }

    private k(int i, byte b2) {
        this.h = new x();
        this.j = new CopyOnWriteArraySet<>();
        this.f6696b = i;
        this.g = new ac(i);
        this.e = this.g;
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = getClass().getSimpleName();
        objArr[1] = Data.d(this.f6696b);
        objArr[2] = Integer.valueOf(b());
        objArr[3] = this.e.b() ? this.e.e.getMessage() : "no";
        return String.format(locale, "%s - primaryKey: %s, size: %d, exception: %s", objArr);
    }

    protected void finalize() {
        if (this.i || this.h.a() > 0) {
            l().c("Leaked datalist", new Object[0]);
            l().c("  Observables: %s", this.h);
        }
        super.finalize();
    }

    private com.google.android.libraries.bind.cpkg.b l() {
        if (this.f6695a == null) {
            this.f6695a = com.google.android.libraries.bind.cpkg.b.a(getClass());
        }
        return this.f6695a;
    }

    public final int b() {
        com.google.android.libraries.bind.apkg.a.a();
        return this.e.a();
    }

    public final Data a(int i) {
        com.google.android.libraries.bind.apkg.a.a();
        ac acVar = this.e;
        if (acVar.a(i)) {
            return null;
        }
        return acVar.f6684b.get(i);
    }

    public final Object b(int i) {
        com.google.android.libraries.bind.apkg.a.a();
        ac acVar = this.e;
        if (acVar.a(i)) {
            return null;
        }
        return acVar.f6684b.get(i).b(acVar.c);
    }

    public final boolean c() {
        com.google.android.libraries.bind.apkg.a.a();
        return this.e.f6684b.isEmpty();
    }

    public final void b(m mVar) {
        boolean isEmpty;
        com.google.android.libraries.bind.apkg.a.a();
        x xVar = this.h;
        if (mVar == null) {
            throw new IllegalArgumentException("Observer is null");
        }
        if (xVar.f6707a.isEmpty()) {
            isEmpty = false;
        } else {
            int i = 0;
            while (true) {
                if (i >= xVar.f6707a.size()) {
                    break;
                }
                if (xVar.f6707a.get(i).f6708a != mVar) {
                    i++;
                } else {
                    xVar.f6707a.remove(i);
                    break;
                }
            }
            isEmpty = xVar.f6707a.isEmpty();
        }
        if (isEmpty) {
            o();
            p();
        }
        l().a("unregisterDataSetObserver - count: %d, registeredForInvalidation: %b", Integer.valueOf(this.h.a()), Boolean.valueOf(this.i));
    }

    private boolean m() {
        return this.h.a() > 0;
    }

    public boolean d() {
        return this.l;
    }

    private void n() {
        l().a("registerForInvalidation", new Object[0]);
        com.google.android.libraries.bind.dpkg.a.a(this.i ? false : true);
        this.i = true;
        e();
        if (d() && (this.k || !h())) {
            j();
        }
        Iterator<Object> it = this.j.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void o() {
        l().a("unregisterForInvalidation", new Object[0]);
        com.google.android.libraries.bind.dpkg.a.a(this.i);
        this.i = false;
        f();
        Iterator<Object> it = this.j.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    protected void e() {
    }

    protected void f() {
    }

    protected int[] g() {
        return null;
    }

    public final void a(j jVar) {
        a(null, jVar, null);
    }

    protected final void a(ac acVar, j jVar, Integer num) {
        boolean z = true;
        com.google.android.libraries.bind.apkg.a.a();
        if (acVar == null) {
            acVar = this.g;
        }
        this.l = !acVar.b();
        boolean z2 = acVar == this.g;
        if (!this.e.b() && !acVar.b()) {
            z = false;
        }
        if (!z2 || this.e != this.g || z) {
            this.e = acVar;
            this.d = num == null ? this.d + 1 : num.intValue();
            l().a("notifyDataChanged", new Object[0]);
            Iterator it = new ArrayList(this.h.f6707a).iterator();
            while (it.hasNext()) {
                ((y) it.next()).f6708a.a(jVar);
            }
            if (z2 || !this.f) {
                return;
            }
            com.google.android.libraries.bind.apkg.a.a();
            l().a("stopAutoRefresh", new Object[0]);
            this.k = false;
        }
    }

    public final void a(ab abVar, ac acVar, j jVar, Integer num) {
        l lVar = new l(this, abVar, acVar, jVar, num);
        if (com.google.android.libraries.bind.apkg.a.b()) {
            lVar.run();
        } else {
            com.google.android.libraries.bind.apkg.a.c().post(lVar);
        }
    }

    public final boolean h() {
        com.google.android.libraries.bind.apkg.a.a();
        return this.e != this.g;
    }

    public final k i() {
        l().a("startAutoRefresh", new Object[0]);
        this.f = false;
        if (!this.k) {
            this.k = true;
            if (d() && m()) {
                j();
            }
        }
        return this;
    }

    public void j() {
        com.google.android.libraries.bind.apkg.a.a();
        l().a("refresh", new Object[0]);
        l().a("startRefreshTask", new Object[0]);
        p();
        this.c = k();
        if (this.c == null) {
            l().a("no refresh task", new Object[0]);
            this.l = h() ? false : true;
        } else {
            ab abVar = this.c;
            com.google.android.libraries.bind.dpkg.a.a(abVar.k ? false : true);
            abVar.h.execute(abVar);
            abVar.k = true;
        }
    }

    private void p() {
        l().a("stopRefreshTask", new Object[0]);
        if (this.c == null) {
            return;
        }
        this.c.j.set(true);
        this.c = null;
    }

    protected ab k() {
        return null;
    }

    public final void a() {
        com.google.android.libraries.bind.apkg.a.a();
        l().d("invalidateData(clearList=%b)", false);
        this.l = true;
        if (!this.k || !m()) {
            return;
        }
        j();
    }

    public final void a(m mVar) {
        com.google.android.libraries.bind.apkg.a.a();
        x xVar = this.h;
        if (mVar == null) {
            throw new IllegalArgumentException("Observer is null");
        }
        boolean isEmpty = xVar.f6707a.isEmpty();
        xVar.f6707a.add(new y(mVar));
        Collections.sort(xVar.f6707a);
        if (isEmpty) {
            n();
        }
        l().a("registerDataSetObserver - count: %d, registeredForInvalidation: %b", Integer.valueOf(this.h.a()), Boolean.valueOf(this.i));
    }
}
