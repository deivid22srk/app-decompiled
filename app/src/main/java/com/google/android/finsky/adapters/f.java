package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class f implements com.google.android.finsky.layout.play.az {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f1916a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CardRecyclerViewAdapter f1917b;

    f(CardRecyclerViewAdapter cardRecyclerViewAdapter, View view) {
        this.f1917b = cardRecyclerViewAdapter;
        this.f1916a = view;
    }

    @Override // com.google.android.finsky.layout.play.az
    public final void a(Document document, com.google.android.play.layout.a aVar) {
        CardRecyclerViewAdapter.a(this.f1917b, document, this.f1916a);
    }
}
