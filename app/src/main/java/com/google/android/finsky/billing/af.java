package com.google.android.finsky.billing;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* loaded from: classes.dex */
final class af implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f2158a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CheckBox f2159b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ae d;

    af(ae aeVar, boolean z, CheckBox checkBox, boolean z2) {
        this.d = aeVar;
        this.f2158a = z;
        this.f2159b = checkBox;
        this.c = z2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        aq u;
        boolean isChecked = this.f2158a ? this.f2159b.isChecked() : this.c;
        u = this.d.u();
        u.a(isChecked, false);
    }
}
