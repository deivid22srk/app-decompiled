package com.google.android.libraries.bind.card;

import android.database.DataSetObserver;
import com.google.android.libraries.bind.card.CardListView;

/* loaded from: classes.dex */
final class c extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CardListView f6672a;

    c(CardListView cardListView) {
        this.f6672a = cardListView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        CardListView cardListView = this.f6672a;
        if (cardListView.c == null) {
            return;
        }
        CardListView.SavedState savedState = cardListView.c;
        cardListView.c = null;
        CardListView.f6666a.d("Trying to restore stashed state", new Object[0]);
        cardListView.a(savedState);
    }
}
