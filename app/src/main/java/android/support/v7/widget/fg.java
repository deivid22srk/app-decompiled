package android.support.v7.widget;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class fg implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f817a;

    fg(SearchView searchView) {
        this.f817a = searchView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f817a.adjustDropDownSizeAndPosition();
    }
}
