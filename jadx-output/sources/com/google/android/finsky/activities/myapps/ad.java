package com.google.android.finsky.activities.myapps;

import android.content.Context;
import com.android.vending.R;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;

/* loaded from: classes.dex */
final class ad extends com.google.android.finsky.layout.play.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f1809a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ac acVar, Context context) {
        super(context);
        this.f1809a = acVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x
    public final int a() {
        return R.layout.header_list_pager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int c() {
        return FinskyHeaderListLayout.a(this.c, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final boolean l() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int m() {
        return R.id.viewpager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int t() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int n() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.x, com.google.android.play.headerlist.g
    public final int o() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final int b() {
        return R.id.my_apps_content_list;
    }
}
