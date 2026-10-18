package android.support.v4.view;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
final class dn extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewPager f376a;

    private dn(ViewPager viewPager) {
        this.f376a = viewPager;
    }

    /* synthetic */ dn(ViewPager viewPager, byte b2) {
        this(viewPager);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f376a.a();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f376a.a();
    }
}
