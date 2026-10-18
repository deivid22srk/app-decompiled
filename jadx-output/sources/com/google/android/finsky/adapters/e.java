package com.google.android.finsky.adapters;

import com.google.android.finsky.utils.ip;

/* loaded from: classes.dex */
final class e implements ip {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CardRecyclerViewAdapter f1915a;

    e(CardRecyclerViewAdapter cardRecyclerViewAdapter) {
        this.f1915a = cardRecyclerViewAdapter;
    }

    @Override // com.google.android.finsky.utils.ip
    public final void a() {
        this.f1915a.m.clear();
        this.f1915a.m_();
    }
}
