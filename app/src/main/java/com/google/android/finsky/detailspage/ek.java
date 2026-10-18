package com.google.android.finsky.detailspage;

import android.util.Pair;
import com.google.android.finsky.detailspage.TextModule;
import java.util.List;

/* loaded from: classes.dex */
public final class ek extends bf {

    /* renamed from: a, reason: collision with root package name */
    int f2646a;

    /* renamed from: b, reason: collision with root package name */
    int f2647b;
    CharSequence c;
    int d;
    boolean e;
    String f;
    CharSequence g;
    CharSequence h;
    CharSequence i;
    boolean j;
    com.google.android.finsky.protos.an k;
    List<Pair<com.google.android.finsky.protos.ds, String>> l;
    Integer m;
    TextModule.ExpandedData n;

    protected ek() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ek ekVar = (ek) obj;
        if (this.f2646a == ekVar.f2646a && this.f2647b == ekVar.f2647b && this.d == ekVar.d && this.e == ekVar.e && this.j == ekVar.j) {
            if (this.c == null ? ekVar.c != null : !this.c.equals(ekVar.c)) {
                return false;
            }
            if (this.f == null ? ekVar.f != null : !this.f.equals(ekVar.f)) {
                return false;
            }
            if (this.g == null ? ekVar.g != null : !this.g.equals(ekVar.g)) {
                return false;
            }
            if (this.h == null ? ekVar.h != null : !this.h.equals(ekVar.h)) {
                return false;
            }
            if (this.i == null ? ekVar.i != null : !this.i.equals(ekVar.i)) {
                return false;
            }
            if (this.k == null ? ekVar.k != null : !this.k.equals(ekVar.k)) {
                return false;
            }
            if (this.l == null ? ekVar.l != null : !this.l.equals(ekVar.l)) {
                return false;
            }
            if (this.m == null ? ekVar.m != null : !this.m.equals(ekVar.m)) {
                return false;
            }
            if (this.n != null) {
                if (this.n.equals(ekVar.n)) {
                    return true;
                }
            } else if (ekVar.n == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.m != null ? this.m.hashCode() : 0) + (((this.l != null ? this.l.hashCode() : 0) + (((this.k != null ? this.k.hashCode() : 0) + (((((this.i != null ? this.i.hashCode() : 0) + (((this.h != null ? this.h.hashCode() : 0) + (((this.g != null ? this.g.hashCode() : 0) + (((this.f != null ? this.f.hashCode() : 0) + (((this.e ? 1 : 0) + (((((this.c != null ? this.c.hashCode() : 0) + (((this.f2646a * 31) + this.f2647b) * 31)) * 31) + this.d) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.j ? 1 : 0)) * 31)) * 31)) * 31)) * 31) + (this.n != null ? this.n.hashCode() : 0);
    }
}
