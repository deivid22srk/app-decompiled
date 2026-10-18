package com.google.android.finsky.widget.recommendation;

import com.deivid22srk.store.R;
import com.google.android.finsky.widget.q;

/* loaded from: classes.dex */
public class RecommendedTrampoline extends q {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.q
    public final Class<? extends com.google.android.finsky.widget.a> g() {
        return RecommendedWidgetProvider.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final String b(int i) {
        return i == 0 ? getString(R.string.my_apps_tab_library) : super.b(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final int i() {
        return R.string.widget_recommended;
    }
}
