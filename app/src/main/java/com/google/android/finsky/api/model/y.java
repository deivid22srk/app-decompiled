package com.google.android.finsky.api.model;

import android.text.TextUtils;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y<T, D> extends j implements com.android.volley.t<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f1997a;

    /* renamed from: b, reason: collision with root package name */
    private int f1998b;
    private int c;
    private boolean d;
    public com.android.volley.l<?> g;
    public int h;
    protected T i;
    protected final List<D> j;
    protected List<z> k;
    protected final boolean l;
    public boolean m;

    protected abstract com.android.volley.l<?> b(String str);

    protected abstract D[] b(T t);

    protected abstract String c(T t);

    protected abstract void d();

    protected y(String str) {
        this(str, true);
    }

    protected y(String str, boolean z) {
        this.h = 12;
        this.j = new ArrayList();
        this.c = 4;
        this.k = new ArrayList();
        this.k.add(new z(0, str));
        this.m = true;
        this.l = z;
    }

    protected y(List<D> list, String str, boolean z) {
        this.h = 12;
        this.j = new ArrayList();
        this.c = 4;
        this.k = new ArrayList();
        this.j.addAll(list);
        this.k.add(new z(this.j.size(), str));
        this.m = !TextUtils.isEmpty(str);
        this.l = z;
    }

    public void a(String str) {
        this.k.clear();
        this.k.add(new z(0, str));
        e();
    }

    public final List<String> o() {
        ArrayList arrayList = new ArrayList(this.k.size());
        Iterator<z> it = this.k.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f2000b);
        }
        return arrayList;
    }

    public final int p() {
        return this.j.size();
    }

    public final boolean a(int i) {
        return i < p();
    }

    public final boolean b(int i) {
        return a(i) && this.j.get(i) != null;
    }

    @Override // com.google.android.finsky.api.model.j
    public final boolean a() {
        return this.i != null || this.j.size() > 0;
    }

    public final void q() {
        if (this.m && p() == 0) {
            j();
            a(this.k.get(0));
        }
    }

    public final D a(int i, boolean z) {
        if (z) {
            this.f1998b = i;
        }
        if (i < 0) {
            throw new IllegalArgumentException("Can't return an item with a negative index: " + i);
        }
        if (i >= p()) {
            return null;
        }
        D d = this.j.get(i);
        if (this.l && this.m && i >= p() - this.c) {
            if (this.d) {
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= this.k.size()) {
                        break;
                    }
                    if (this.k.get(i3).f1999a > this.j.size()) {
                        int max = Math.max(1, i3);
                        while (this.k.size() > max) {
                            this.k.remove(this.k.size() - 1);
                        }
                        z zVar = this.k.get(this.k.size() - 1);
                        if (z) {
                            a(zVar);
                        }
                    }
                    i2 = i3 + 1;
                }
            } else {
                z zVar2 = this.k.get(this.k.size() - 1);
                if (z) {
                    a(zVar2);
                }
            }
        }
        if (d == null) {
            z zVar3 = null;
            for (z zVar4 : this.k) {
                if (zVar4.f1999a > i) {
                    break;
                }
                zVar3 = zVar4;
            }
            a(zVar3);
        }
        return d;
    }

    public final D c(int i) {
        return a(i, true);
    }

    public final void d(int i) {
        this.j.remove(i);
        this.d = true;
        if (this.g != null && !this.g.e()) {
            this.g.d();
        }
        d();
    }

    public final void r() {
        z zVar;
        if (!i()) {
            return;
        }
        this.g = null;
        j();
        if (this.f1997a != -1) {
            Iterator<z> it = this.k.iterator();
            while (it.hasNext()) {
                zVar = it.next();
                if (this.f1997a == zVar.f1999a) {
                    break;
                }
            }
        }
        zVar = null;
        if (zVar == null) {
            zVar = this.k.get(this.k.size() - 1);
        }
        a(zVar);
    }

    public final void s() {
        if (this.f1998b >= 0) {
            for (int i = 0; i < this.j.size(); i++) {
                if (i < (this.f1998b - this.h) - 1 || i >= this.f1998b + this.h) {
                    this.j.set(i, null);
                }
            }
        }
    }

    public final void t() {
        for (int i = 0; i < this.j.size(); i++) {
            this.j.set(i, null);
        }
    }

    public void e() {
        this.m = true;
        this.j.clear();
        l();
    }

    public final boolean u() {
        return (this.g == null || this.g.e()) ? false : true;
    }

    @Override // com.android.volley.t
    public final void a_(T t) {
        boolean z = false;
        j();
        this.i = t;
        int size = this.j.size();
        D[] b2 = b(t);
        int length = b2.length;
        if (this.c <= 0) {
            this.c = 4;
        } else {
            this.c = Math.max(1, length / 4);
        }
        for (int i = 0; i < b2.length; i++) {
            if (this.f1997a + i < this.j.size()) {
                this.j.set(this.f1997a + i, b2[i]);
            } else {
                this.j.add(b2[i]);
            }
        }
        String c = c(t);
        if (!TextUtils.isEmpty(c) && (this.f1997a == size || this.d)) {
            this.k.add(new z(this.j.size(), c));
        }
        if (this.d) {
            this.d = false;
        }
        if ((this.j.size() == this.k.get(this.k.size() + (-1)).f1999a && b2.length > 0) && this.l) {
            z = true;
        }
        this.m = z;
        this.g = null;
        l();
    }

    private void a(z zVar) {
        if (!i()) {
            if (this.g != null && !this.g.e()) {
                if (!this.g.b().endsWith(zVar.f2000b)) {
                    this.g.d();
                } else {
                    return;
                }
            }
            this.f1997a = zVar.f1999a;
            this.g = b(zVar.f2000b);
        }
    }

    @Override // com.google.android.finsky.api.model.j, com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.g = null;
        super.a(volleyError);
    }
}
