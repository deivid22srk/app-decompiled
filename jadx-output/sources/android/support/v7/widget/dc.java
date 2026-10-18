package android.support.v7.widget;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
final class dc extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cu f759a;

    private dc(cu cuVar) {
        this.f759a = cuVar;
    }

    /* synthetic */ dc(cu cuVar, byte b2) {
        this(cuVar);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.f759a.c.isShowing()) {
            this.f759a.b();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f759a.d();
    }
}
