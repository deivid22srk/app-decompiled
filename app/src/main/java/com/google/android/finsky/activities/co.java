package com.google.android.finsky.activities;

import android.widget.CompoundButton;
import com.google.android.finsky.protos.ho;

/* loaded from: classes.dex */
final class co implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ho f1659a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cn f1660b;

    co(cn cnVar, ho hoVar) {
        this.f1660b = cnVar;
        this.f1659a = hoVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            new gn().c(this.f1659a.e.f3922a).a(this.f1659a.e.c.trim()).d(R.string.ok).b().a(this.f1660b.B, "warning_dialog");
        }
    }
}
