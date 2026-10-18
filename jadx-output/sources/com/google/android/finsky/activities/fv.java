package com.google.android.finsky.activities;

import android.content.Context;
import com.android.vending.R;

/* loaded from: classes.dex */
final class fv extends com.google.android.finsky.layout.play.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fu f1753a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fv(fu fuVar, Context context) {
        super(context);
        this.f1753a = fuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x
    public final int a() {
        return R.layout.search_results;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int b() {
        return R.id.search_results_list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int j() {
        return 2;
    }
}
