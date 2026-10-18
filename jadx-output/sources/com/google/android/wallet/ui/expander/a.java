package com.google.android.wallet.ui.expander;

import android.R;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.ui.common.ak;
import com.google.android.wallet.ui.common.o;
import com.google.android.wallet.ui.common.p;
import com.google.android.wallet.ui.common.q;
import com.google.android.wallet.ui.common.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a implements q<a>, Runnable {
    private static final Interpolator o = new AccelerateDecelerateInterpolator();
    boolean c;
    boolean d;
    boolean e;
    Activity g;
    a h;
    int[] i;
    p k;
    ak m;
    private a p;
    private TransitionManager q;
    private TransitionSet s;
    private Scene t;
    private com.google.android.wallet.common.a u;

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<a> f7544a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public boolean f7545b = false;
    public boolean f = true;
    private int r = 0;
    boolean j = false;
    HashSet<o> l = new HashSet<>();
    private int v = 0;
    a n = this;

    @Override // com.google.android.wallet.ui.common.q
    public final Parcelable a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("keyIsExpanded", this.f7545b);
        bundle.putBoolean("keyIsAlwaysExpanded", this.e);
        return bundle;
    }

    @Override // com.google.android.wallet.ui.common.q
    public final void a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            d(bundle.getBoolean("keyIsExpanded", false));
            a(bundle.getBoolean("keyIsAlwaysExpanded", false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    @Override // com.google.android.wallet.ui.common.q
    public final void a(Activity activity, com.google.android.wallet.common.a aVar) {
        byte b2 = 0;
        this.g = activity;
        this.u = aVar;
        if (this.g != null && Build.VERSION.SDK_INT >= 19) {
            this.q = new TransitionManager();
            View findViewById = this.g.findViewById(R.id.content);
            if (findViewById instanceof ViewGroup) {
                this.t = new Scene((ViewGroup) findViewById);
                this.t.setEnterAction(this);
            }
            this.s = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setInterpolator(o);
            this.s.addTransition(changeBounds);
            d dVar = new d();
            dVar.setInterpolator(o);
            this.s.addTransition(dVar);
            this.s.setDuration(400L);
            this.s.setOrdering(0);
            this.s.setInterpolator((TimeInterpolator) o);
            this.s.addListener((Transition.TransitionListener) new b(this, b2));
            if (this.t != null) {
                this.q.setTransition(this.t, this.s);
            }
        }
        int size = this.f7544a.size();
        while (b2 < size) {
            this.f7544a.get(b2).a(activity, aVar);
            b2++;
        }
    }

    @Override // com.google.android.wallet.ui.common.q
    public final void a(r rVar) {
        a aVar = (a) rVar.getExpandable();
        this.f7544a.add(aVar);
        aVar.p = this;
        aVar.f();
        aVar.a(this.g, this.u);
        if (aVar.d()) {
            e();
        }
        if (!aVar.d) {
            return;
        }
        g();
    }

    public final void a(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (z) {
                e();
            }
        }
    }

    public final void b() {
        if (this.k != null) {
            this.k.d();
        }
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            this.f7544a.get(i).b();
        }
        this.c = false;
        this.d = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.h();
        if (this.f) {
            i();
        }
    }

    private boolean a(int[] iArr) {
        return g(iArr) != null;
    }

    private boolean d() {
        boolean z = this.e;
        int size = this.f7544a.size();
        boolean z2 = z;
        for (int i = 0; i < size && !z2; i++) {
            z2 |= this.f7544a.get(i).d();
        }
        return z2;
    }

    private void e() {
        for (a aVar = this; aVar != null; aVar = aVar.p) {
            aVar.d(true);
        }
        this.n.h();
    }

    @Override // com.google.android.wallet.ui.common.ak
    public final boolean d(int[] iArr) {
        if (this.m != null && this.m.d(iArr)) {
            return true;
        }
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            if (this.f7544a.get(i).d(iArr)) {
                return true;
            }
        }
        return false;
    }

    private void f() {
        if (this.p == null) {
            this.n = this;
        } else {
            this.n = this.p.n;
        }
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            this.f7544a.get(i).f();
        }
    }

    private void c(boolean z) {
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            this.f7544a.get(i).c(z);
        }
        this.j = z;
    }

    private void d(boolean z) {
        if (this.f7545b != z) {
            this.f7545b = z;
            if (this.k == null || this.c) {
                return;
            }
            this.c = true;
            g();
        }
    }

    private void g() {
        this.d = true;
        for (a aVar = this.p; aVar != null && !aVar.d; aVar = aVar.p) {
            aVar.d = true;
        }
    }

    private void h() {
        if (this.c && this.k != null) {
            this.k.d();
        }
        this.c = false;
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f7544a.get(i);
            if (aVar.d) {
                aVar.h();
            }
        }
        this.d = false;
    }

    final void a(a aVar, boolean z, int i) {
        boolean z2;
        while (true) {
            a aVar2 = this;
            aVar2.h = aVar;
            aVar2.i = null;
            if (aVar2.p == null) {
                z2 = true;
            } else {
                switch (i) {
                    case 0:
                        z2 = true;
                        break;
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        z2 = false;
                        break;
                    case 2:
                    case 8:
                        z2 = aVar2.a((int[]) null);
                        break;
                    case 3:
                        if (aVar2.o() == null) {
                            z2 = false;
                            break;
                        } else {
                            z2 = true;
                            break;
                        }
                    default:
                        throw new IllegalArgumentException(new StringBuilder(36).append("Unknown animation state: ").append(i).toString());
                }
            }
            if (z2) {
                aVar2.n.c(true);
                aVar2.r = i;
                aVar2.p();
                aVar2.e(z);
                return;
            }
            this = aVar2.p;
            aVar = aVar2;
        }
    }

    private boolean i() {
        if (this.h != null && this.h.i()) {
            return true;
        }
        if (this.k != null) {
            this.k.g();
            return true;
        }
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            if (this.f7544a.get(i).i()) {
                return true;
            }
        }
        return false;
    }

    private void j() {
        if (this.h != null) {
            this.h.j();
            int size = this.f7544a.size();
            for (int i = 0; i < size; i++) {
                a aVar = this.f7544a.get(i);
                if (aVar != this.h) {
                    aVar.k();
                }
            }
        }
    }

    private boolean k() {
        int size = this.f7544a.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            z &= this.f7544a.get(i).k();
        }
        if (this.f7545b) {
            if (!b((int[]) null)) {
                l();
            } else if (z && !this.e) {
                d(false);
            }
        }
        return !this.f7545b;
    }

    private void l() {
        this.h = a(0, (int[]) null);
        if (this.h != null) {
            this.h.m();
        }
    }

    private void m() {
        if (this.h != null) {
            this.h.m();
        } else {
            l();
        }
        d(true);
    }

    private boolean e(int[] iArr) {
        int size = this.f7544a.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2 = this.f7544a.get(i).e(iArr) || z;
            i++;
            z = z2;
        }
        if ((this.m == null || !this.m.d(iArr)) && !z) {
            return false;
        }
        d(true);
        l();
        return true;
    }

    private boolean f(int[] iArr) {
        a g = g(iArr);
        if (g != null) {
            d(true);
            if (g != this) {
                this.h = g;
                g.f(iArr);
            } else {
                l();
            }
        }
        return g != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z) {
        q();
        if (this.r != 0) {
            e(z);
        } else {
            this.n.c(false);
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        int i = 0;
        switch (this.r) {
            case 0:
            case 2:
            case 5:
                break;
            case 1:
                s();
                break;
            case 3:
                if (i.c(this.g)) {
                    this.h = o();
                    if (this.h != null) {
                        i = 8;
                    }
                } else {
                    t();
                }
                this.r = i;
                return;
            case 4:
                if (i.c(this.g) || !this.f7545b) {
                    i = 1;
                } else {
                    s();
                }
                this.r = i;
                return;
            case 6:
                if (i.c(this.g)) {
                    i = 7;
                } else {
                    e(this.i);
                    this.n.h();
                    t();
                }
                this.r = i;
                return;
            case 7:
                e(this.i);
                this.n.h();
                t();
                this.r = 0;
                return;
            case 8:
                t();
                this.r = 0;
                return;
            default:
                throw new IllegalStateException(new StringBuilder(37).append("Unknown transition state: ").append(this.r).toString());
        }
        this.r = 0;
    }

    private a a(int i, int[] iArr) {
        for (int i2 = i; i2 < this.f7544a.size(); i2++) {
            if (this.f7544a.get(i2).a(iArr)) {
                return this.f7544a.get(i2);
            }
        }
        if (this.p == null) {
            for (int i3 = 0; i3 < i; i3++) {
                if (this.f7544a.get(i3).a(iArr)) {
                    return this.f7544a.get(i3);
                }
            }
        }
        return null;
    }

    private a g(int[] iArr) {
        return (this.m == null || (this.m.c(iArr) && !this.m.d(iArr))) ? a(0, iArr) : this;
    }

    private a o() {
        return a(this.f7544a.indexOf(this.h) + 1, (int[]) null);
    }

    private void p() {
        Iterator<o> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            this.f7544a.get(i).p();
        }
    }

    private void q() {
        Iterator<o> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            this.f7544a.get(i).q();
        }
    }

    private void r() {
        this.h = null;
        this.i = null;
        Iterator<o> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            this.f7544a.get(i).r();
        }
    }

    private boolean s() {
        if (this.h != null && this.h.s()) {
            return true;
        }
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f7544a.get(i);
            if (aVar.f7545b && aVar.s()) {
                return true;
            }
        }
        if (this.k == null) {
            return false;
        }
        if (!this.k.f()) {
            this.k.e();
        }
        return true;
    }

    private void t() {
        while (this.h != null) {
            this = this.h;
        }
        if (this.k != null) {
            this.k.f();
        }
    }

    public final boolean b(boolean z) {
        if (this.j) {
            return false;
        }
        a(null, z, 4);
        return true;
    }

    public final boolean c() {
        if (this.j) {
            return false;
        }
        if (!this.f7545b) {
            return true;
        }
        if (this.p == null) {
            a(null, true, 2);
            return true;
        }
        this.p.a(this, true, 3);
        return true;
    }

    @Override // com.google.android.wallet.ui.common.ak
    public final boolean b(int[] iArr) {
        if (!this.f7545b) {
            return true;
        }
        boolean b2 = this.m != null ? this.m.b(iArr) : true;
        int size = this.f7544a.size();
        int i = 0;
        boolean z = b2;
        while (i < size) {
            boolean z2 = this.f7544a.get(i).b(iArr) && z;
            i++;
            z = z2;
        }
        return z;
    }

    @Override // com.google.android.wallet.ui.common.ak
    public final boolean c(int[] iArr) {
        if (!this.f7545b) {
            return true;
        }
        if (this.m != null && !this.m.c(iArr)) {
            return false;
        }
        int size = this.f7544a.size();
        for (int i = 0; i < size; i++) {
            if (!this.f7544a.get(i).c(iArr)) {
                return false;
            }
        }
        return true;
    }

    private void e(boolean z) {
        switch (this.r) {
            case 0:
                break;
            case 1:
            case 7:
                m();
                break;
            case 2:
                k();
                break;
            case 3:
                if (this.h != null) {
                    this.h.k();
                }
                if (!i.c(this.g)) {
                    a o2 = o();
                    if (o2 != null) {
                        d(true);
                        this.h = o2;
                        o2.f((int[]) null);
                    }
                    if (!(o2 != null)) {
                    }
                }
                break;
            case 4:
            case 5:
            case 6:
                j();
                if (!i.c(this.g)) {
                    m();
                    break;
                }
                break;
            case 8:
                f((int[]) null);
                break;
            default:
                throw new IllegalArgumentException(new StringBuilder(36).append("Unknown animation state: ").append(this.r).toString());
        }
        if (Build.VERSION.SDK_INT < 19 || !z || (this.u != null && this.u.f7246a[0].contains(1))) {
            run();
            n();
            f(false);
        } else if (!this.n.d) {
            n();
            f(true);
        } else {
            this.q.transitionTo(this.t);
        }
    }
}
