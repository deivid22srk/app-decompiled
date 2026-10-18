package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class fe implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f815a;

    fe(SearchView searchView) {
        this.f815a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener;
        View.OnFocusChangeListener onFocusChangeListener2;
        onFocusChangeListener = this.f815a.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener2 = this.f815a.mOnQueryTextFocusChangeListener;
            onFocusChangeListener2.onFocusChange(this.f815a, z);
        }
    }
}
