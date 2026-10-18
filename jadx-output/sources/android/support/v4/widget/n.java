package android.support.v4.widget;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
final class n extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f462a;

    private n(l lVar) {
        this.f462a = lVar;
    }

    /* synthetic */ n(l lVar, byte b2) {
        this(lVar);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f462a.f459a = true;
        this.f462a.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f462a.f459a = false;
        this.f462a.notifyDataSetInvalidated();
    }
}
