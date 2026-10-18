package com.google.android.finsky.activities.b;

import android.content.Context;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class v extends com.google.android.finsky.layout.play.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f1599a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(u uVar, Context context) {
        super(context);
        this.f1599a = uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x
    public final int a() {
        boolean z;
        z = this.f1599a.h;
        return z ? R.layout.my_account_header_list_recycler_view : R.layout.header_list_recycler_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int b() {
        return R.id.recycler_view;
    }
}
