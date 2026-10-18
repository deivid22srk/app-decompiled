package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.protos.ol;

/* loaded from: classes.dex */
final class dz implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1702a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.cy f1703b;
    final /* synthetic */ dx c;

    dz(dx dxVar, String str, com.google.android.finsky.layout.play.cy cyVar) {
        this.c = dxVar;
        this.f1702a = str;
        this.f1703b = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.navigationmanager.b bVar;
        ol olVar;
        com.google.android.finsky.api.model.i iVar;
        bVar = this.c.as;
        olVar = this.c.i;
        String str = olVar.g;
        String str2 = this.f1702a;
        iVar = this.c.ai;
        bVar.a(str, str2, iVar.c(), this.c.ax, this.f1703b);
    }
}
