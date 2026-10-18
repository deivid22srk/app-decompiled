package com.google.android.finsky.utils;

import android.content.Context;
import android.view.View;
import com.android.vending.R;

/* loaded from: classes.dex */
final class jw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f5047a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f5048b;
    final /* synthetic */ View c;

    jw(Context context, boolean z, View view) {
        this.f5047a = context;
        this.f5048b = z;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ik.a(this.f5047a, this.f5047a.getString(this.f5048b ? R.string.wishlist_removing : R.string.wishlist_adding), this.c);
    }
}
