package com.google.android.finsky.activities.bpkg;

import android.content.Context;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public final class ae extends com.google.android.finsky.layout.play.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ad f1569a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(ad adVar, Context context) {
        super(context);
        this.f1569a = adVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x
    public final int a() {
        return R.layout.my_account_payment_methods_recycler_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int b() {
        return R.id.recycler_view;
    }
}
