package com.google.android.finsky.activities;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class fd implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1738a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f1739b;
    final /* synthetic */ fb c;

    fd(fb fbVar, String str, String str2) {
        this.c = fbVar;
        this.f1738a = str;
        this.f1739b = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fe b2 = fb.b(this.c);
        if (b2 != null && this.c.ai != null && this.f1738a != null && this.f1739b != null) {
            b2.a(this.f1738a, this.f1739b, this.c.ai);
        }
    }
}
