package com.google.android.finsky.billing.promptforfop;

import android.view.View;
import com.google.android.finsky.a.i;

/* loaded from: classes.dex */
final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f2415a;

    c(b bVar) {
        this.f2415a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar;
        iVar = this.f2415a.d;
        iVar.a(1008, (byte[]) null, this.f2415a);
        b.b(this.f2415a);
    }
}
