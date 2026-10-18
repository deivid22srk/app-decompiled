package android.support.v7.widget;

import android.database.Cursor;

/* loaded from: classes.dex */
final class fd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f814a;

    fd(SearchView searchView) {
        this.f814a = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.support.v4.widget.l lVar;
        android.support.v4.widget.l lVar2;
        android.support.v4.widget.l lVar3;
        lVar = this.f814a.mSuggestionsAdapter;
        if (lVar != null) {
            lVar2 = this.f814a.mSuggestionsAdapter;
            if (lVar2 instanceof fp) {
                lVar3 = this.f814a.mSuggestionsAdapter;
                lVar3.a((Cursor) null);
            }
        }
    }
}
