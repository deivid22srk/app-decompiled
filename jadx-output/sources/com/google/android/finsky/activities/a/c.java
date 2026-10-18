package com.google.android.finsky.activities.a;

import android.content.Context;
import com.android.vending.R;
import com.google.android.finsky.layout.PlayCreditGiftingHeader;
import com.google.android.finsky.layout.play.x;
import com.google.android.finsky.utils.ai;

/* loaded from: classes.dex */
final class c extends x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f1531a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, Context context) {
        super(context);
        this.f1531a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x
    public final int a() {
        return R.layout.header_list_recycler_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final boolean g() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int f() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int i() {
        return ai.a(this.c, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int b() {
        return R.id.recycler_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int c() {
        return PlayCreditGiftingHeader.a(this.c.getResources());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int j() {
        return 2;
    }
}
