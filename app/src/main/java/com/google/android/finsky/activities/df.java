package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.widget.TextView;

/* loaded from: classes.dex */
final class df implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f1680a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f1681b;

    df(de deVar, TextView textView) {
        this.f1681b = deVar;
        this.f1680a = textView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dh a2 = de.a(this.f1681b);
        if (a2 != null) {
            a2.b(this.f1680a.getText().toString());
        }
    }
}
