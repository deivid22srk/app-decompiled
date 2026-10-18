package com.google.android.libraries.bind.card;

import android.database.DataSetObserver;
import com.google.android.libraries.bind.card.CardListView;

/* loaded from: classes.dex */
final class d extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CardListView f6673a;

    d(CardListView cardListView) {
        this.f6673a = cardListView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        CardListView.SavedState savedState;
        savedState = this.f6673a.c;
        if (savedState == null) {
            CardListView cardListView = this.f6673a;
            cardListView.c = cardListView.b();
        }
        this.f6673a.a();
    }
}
