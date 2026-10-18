package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class ff implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f816a;

    ff(SearchView searchView) {
        this.f816a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f816a.adjustDropDownSizeAndPosition();
    }
}
