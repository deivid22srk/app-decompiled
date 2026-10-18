package android.support.v7.widget;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class eq {
    private static final List<Object> m = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f795a;
    RecyclerView k;
    private int l;

    /* renamed from: b, reason: collision with root package name */
    int f796b = -1;
    int c = -1;
    long d = -1;
    public int e = -1;
    int f = -1;
    eq g = null;
    eq h = null;
    List<Object> i = null;
    List<Object> j = null;
    private int n = 0;
    private eh o = null;
    private boolean p = false;
    private int q = 0;

    static /* synthetic */ eh d(eq eqVar) {
        eqVar.o = null;
        return null;
    }

    static /* synthetic */ boolean e(eq eqVar) {
        eqVar.p = false;
        return false;
    }

    public eq(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f795a = view;
    }

    final void a(int i, boolean z) {
        if (this.c == -1) {
            this.c = this.f796b;
        }
        if (this.f == -1) {
            this.f = this.f796b;
        }
        if (z) {
            this.f += i;
        }
        this.f796b += i;
        if (this.f795a.getLayoutParams() != null) {
            ((ed) this.f795a.getLayoutParams()).e = true;
        }
    }

    final void a() {
        this.c = -1;
        this.f = -1;
    }

    final boolean b() {
        return (this.l & 128) != 0;
    }

    public final int c() {
        return this.f == -1 ? this.f796b : this.f;
    }

    public final int d() {
        if (this.k == null) {
            return -1;
        }
        return RecyclerView.b(this.k, this);
    }

    final boolean e() {
        return this.o != null;
    }

    final void f() {
        this.o.b(this);
    }

    final boolean g() {
        return (this.l & 32) != 0;
    }

    final void h() {
        this.l &= -33;
    }

    final void i() {
        this.l &= -257;
    }

    final void a(eh ehVar, boolean z) {
        this.o = ehVar;
        this.p = z;
    }

    final boolean j() {
        return (this.l & 4) != 0;
    }

    final boolean k() {
        return (this.l & 2) != 0;
    }

    final boolean l() {
        return (this.l & 1) != 0;
    }

    final boolean m() {
        return (this.l & 8) != 0;
    }

    final boolean a(int i) {
        return (this.l & i) != 0;
    }

    final boolean n() {
        return (this.l & 256) != 0;
    }

    final void a(int i, int i2) {
        this.l = (this.l & (i2 ^ (-1))) | (i & i2);
    }

    final void b(int i) {
        this.l |= i;
    }

    final void a(Object obj) {
        if (obj == null) {
            b(1024);
        } else {
            if ((this.l & 1024) != 0) {
                return;
            }
            if (this.i == null) {
                this.i = new ArrayList();
                this.j = Collections.unmodifiableList(this.i);
            }
            this.i.add(obj);
        }
    }

    final void o() {
        if (this.i != null) {
            this.i.clear();
        }
        this.l &= -1025;
    }

    final List<Object> p() {
        if ((this.l & 1024) == 0) {
            if (this.i == null || this.i.size() == 0) {
                return m;
            }
            return this.j;
        }
        return m;
    }

    final void q() {
        this.l = 0;
        this.f796b = -1;
        this.c = -1;
        this.d = -1L;
        this.f = -1;
        this.n = 0;
        this.g = null;
        this.h = null;
        o();
        this.q = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f796b + " id=" + this.d + ", oldPos=" + this.c + ", pLpos:" + this.f);
        if (e()) {
            sb.append(" scrap ").append(this.p ? "[changeScrap]" : "[attachedScrap]");
        }
        if (j()) {
            sb.append(" invalid");
        }
        if (!l()) {
            sb.append(" unbound");
        }
        if (k()) {
            sb.append(" update");
        }
        if (m()) {
            sb.append(" removed");
        }
        if (b()) {
            sb.append(" ignored");
        }
        if (n()) {
            sb.append(" tmpDetached");
        }
        if (!r()) {
            sb.append(" not recyclable(" + this.n + ")");
        }
        if ((this.l & 512) != 0 || j()) {
            sb.append(" undefined adapter position");
        }
        if (this.f795a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void a(boolean z) {
        this.n = z ? this.n - 1 : this.n + 1;
        if (this.n < 0) {
            this.n = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && this.n == 1) {
            this.l |= 16;
        } else if (z && this.n == 0) {
            this.l &= -17;
        }
    }

    public final boolean r() {
        return (this.l & 16) == 0 && !android.support.v4.view.by.c(this.f795a);
    }

    final boolean s() {
        return (this.l & 2) != 0;
    }

    static /* synthetic */ void a(eq eqVar) {
        eqVar.q = android.support.v4.view.by.e(eqVar.f795a);
        android.support.v4.view.by.c(eqVar.f795a, 4);
    }

    static /* synthetic */ void b(eq eqVar) {
        android.support.v4.view.by.c(eqVar.f795a, eqVar.q);
        eqVar.q = 0;
    }

    static /* synthetic */ boolean c(eq eqVar) {
        return (eqVar.l & 16) == 0 && android.support.v4.view.by.c(eqVar.f795a);
    }

    static /* synthetic */ boolean g(eq eqVar) {
        return (eqVar.l & 16) != 0;
    }
}
