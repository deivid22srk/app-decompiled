package com.google.android.finsky.billing;

import android.content.DialogInterface;
import android.widget.RadioButton;

/* loaded from: classes.dex */
final class z implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RadioButton f2444a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f2445b;

    z(y yVar, RadioButton radioButton) {
        this.f2445b = yVar;
        this.f2444a = radioButton;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        aq u;
        boolean z = !this.f2444a.isChecked();
        u = this.f2445b.u();
        u.a(z, false);
    }
}
