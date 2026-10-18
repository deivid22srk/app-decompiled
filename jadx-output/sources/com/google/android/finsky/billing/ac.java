package com.google.android.finsky.billing;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.finsky.activities.SettingsActivity;

/* loaded from: classes.dex */
final class ac implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f2156a;

    ac(ab abVar) {
        this.f2156a = abVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        aq v;
        v = this.f2156a.v();
        v.V_();
        Intent intent = new Intent(this.f2156a.e(), (Class<?>) SettingsActivity.class);
        intent.putExtra("setting-key-to-scroll", "download-mode");
        this.f2156a.a(intent);
    }
}
