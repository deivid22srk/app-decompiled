package com.google.android.finsky.activities.c;

import android.content.Context;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.play.x;

/* loaded from: classes.dex */
final class b extends x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f1641a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar, Context context) {
        super(context);
        this.f1641a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x
    public final int a() {
        return R.layout.wishlist_panel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int b() {
        return R.id.tab_recycler_view;
    }
}
