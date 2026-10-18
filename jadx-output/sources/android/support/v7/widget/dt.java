package android.support.v7.widget;

import android.support.v7.widget.eq;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class dt<VH extends eq> {

    /* renamed from: a, reason: collision with root package name */
    public final du f774a = new du();

    /* renamed from: b, reason: collision with root package name */
    boolean f775b = false;

    public abstract int a();

    public abstract VH a(ViewGroup viewGroup, int i);

    public abstract void a(VH vh, int i);

    public int a(int i) {
        return 0;
    }

    public long b(int i) {
        return -1L;
    }

    public void a(VH vh) {
    }

    public boolean b() {
        return false;
    }

    public final void a(dv dvVar) {
        this.f774a.registerObserver(dvVar);
    }

    public final void b(dv dvVar) {
        this.f774a.unregisterObserver(dvVar);
    }

    public final void c(int i) {
        this.f774a.a(i);
    }

    public final void d(int i) {
        this.f774a.a(i, 1);
    }

    public final void e(int i) {
        this.f774a.b(i);
    }
}
