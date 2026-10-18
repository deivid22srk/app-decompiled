package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class aj implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditText f1542a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f1543b;

    aj(ab abVar, EditText editText) {
        this.f1543b = abVar;
        this.f1542a = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FinskyApp.a().b((String) null).h(r0, new al(r1, this.f1542a.getText().toString()), new an(this.f1543b));
    }
}
