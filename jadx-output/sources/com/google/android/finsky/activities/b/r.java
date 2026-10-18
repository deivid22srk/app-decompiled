package com.google.android.finsky.activities.b;

import android.content.Context;
import com.android.vending.R;

/* loaded from: classes.dex */
final class r extends com.google.android.finsky.layout.play.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f1594a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(q qVar, Context context) {
        super(context);
        this.f1594a = qVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x
    public final int a() {
        return R.layout.my_account_header_list_recycler_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int b() {
        return R.id.recycler_view;
    }
}
