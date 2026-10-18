package android.support.design.widget;

import android.view.View;

/* loaded from: classes.dex */
final class bh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ be f111a;

    /* renamed from: b, reason: collision with root package name */
    private final View f112b;
    private final boolean c;

    bh(be beVar, View view, boolean z) {
        this.f111a = beVar;
        this.f112b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f111a.f108b != null && this.f111a.f108b.b()) {
            android.support.v4.view.by.a(this.f112b, this);
        } else if (this.c && this.f111a.c != null) {
            this.f111a.c.a();
        }
    }
}
