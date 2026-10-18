package android.support.v4.view;

import android.view.WindowInsets;

/* loaded from: classes.dex */
final class es extends er {

    /* renamed from: a, reason: collision with root package name */
    final WindowInsets f392a;

    es(WindowInsets windowInsets) {
        this.f392a = windowInsets;
    }

    @Override // android.support.v4.view.er
    public final int a() {
        return this.f392a.getSystemWindowInsetLeft();
    }

    @Override // android.support.v4.view.er
    public final int b() {
        return this.f392a.getSystemWindowInsetTop();
    }

    @Override // android.support.v4.view.er
    public final int c() {
        return this.f392a.getSystemWindowInsetRight();
    }

    @Override // android.support.v4.view.er
    public final int d() {
        return this.f392a.getSystemWindowInsetBottom();
    }

    @Override // android.support.v4.view.er
    public final boolean e() {
        return this.f392a.isConsumed();
    }

    @Override // android.support.v4.view.er
    public final er f() {
        return new es(this.f392a.consumeSystemWindowInsets());
    }

    @Override // android.support.v4.view.er
    public final er a(int i, int i2, int i3, int i4) {
        return new es(this.f392a.replaceSystemWindowInsets(i, i2, i3, i4));
    }
}
