package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
public abstract class dk {

    /* renamed from: a, reason: collision with root package name */
    protected final ec f767a;

    /* renamed from: b, reason: collision with root package name */
    int f768b;

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    /* synthetic */ dk(ec ecVar, byte b2) {
        this(ecVar);
    }

    private dk(ec ecVar) {
        this.f768b = Integer.MIN_VALUE;
        this.f767a = ecVar;
    }

    public final int a() {
        if (Integer.MIN_VALUE == this.f768b) {
            return 0;
        }
        return e() - this.f768b;
    }
}
