package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
final class ez implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f809a;

    ez(SearchView searchView) {
        this.f809a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f809a.onItemClicked(i, 0, null);
    }
}
