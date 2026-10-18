package com.google.android.finsky.utils;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class fo implements com.google.android.play.layout.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fk f4880a;

    fo(fk fkVar) {
        this.f4880a = fkVar;
    }

    @Override // com.google.android.play.layout.f
    public final void a(int i) {
        Intent b2 = cr.b(Uri.fromParts("mailto", com.google.android.finsky.c.d.eV.b(), null));
        b2.putExtra("android.intent.extra.SUBJECT", this.f4880a.d.f1963a.i);
        b2.putExtra("android.intent.extra.TEXT", this.f4880a.d.aG());
        try {
            this.f4880a.f4873a.startActivity(b2);
        } catch (ActivityNotFoundException e) {
            com.google.android.finsky.activities.gn gnVar = new com.google.android.finsky.activities.gn();
            gnVar.a(R.string.no_email_app).d(R.string.ok).a(true);
            gnVar.b().a(((android.support.v4.app.t) this.f4880a.f4873a).d(), "no_email_app_dialog");
        }
    }
}
