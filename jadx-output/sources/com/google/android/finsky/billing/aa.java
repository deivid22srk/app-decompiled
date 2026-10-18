package com.google.android.finsky.billing;

import android.content.DialogInterface;
import android.widget.RadioButton;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
final class aa implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RadioButton f2154a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f2155b;

    aa(y yVar, RadioButton radioButton) {
        this.f2155b = yVar;
        this.f2154a = radioButton;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        aq u;
        boolean z = !this.f2154a.isChecked();
        bg.v.a((com.google.android.finsky.c.o<Integer>) Integer.valueOf(z ? 3 : 2));
        u = this.f2155b.u();
        u.a(z, true);
    }
}
