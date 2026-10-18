package com.google.android.finsky.activities;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class fi implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fg f1743a;

    fi(fg fgVar) {
        this.f1743a = fgVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean[] zArr;
        boolean[] zArr2;
        fj b2 = fg.b(this.f1743a);
        if (b2 != null) {
            zArr = this.f1743a.ai;
            boolean z = zArr[0];
            zArr2 = this.f1743a.ai;
            b2.a(z, zArr2[1]);
        }
        this.f1743a.a(false);
    }
}
