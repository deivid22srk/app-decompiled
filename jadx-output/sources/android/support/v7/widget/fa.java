package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
final class fa implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f811a;

    fa(SearchView searchView) {
        this.f811a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f811a.onItemSelected(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
