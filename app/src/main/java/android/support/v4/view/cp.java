package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
final class cp implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bm f367a;

    cp(bm bmVar) {
        this.f367a = bmVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return ((es) this.f367a.a(view, new es(windowInsets))).f392a;
    }
}
