package com.google.android.finsky.activities;

import android.content.DialogInterface;
import com.google.android.finsky.utils.hl;

/* loaded from: classes.dex */
final class fo implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fn f1749a;

    fo(fn fnVar) {
        this.f1749a = fnVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1749a.a(false);
        fn.a(this.f1749a).b(hl.a(i));
    }
}
