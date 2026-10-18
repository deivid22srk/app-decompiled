package com.google.android.finsky.utils;

import android.view.View;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class fz implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f4886a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.protos.gx f4887b;
    final /* synthetic */ com.google.android.finsky.layout.play.cy c;

    fz(com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.protos.gx gxVar, com.google.android.finsky.layout.play.cy cyVar) {
        this.f4886a = bVar;
        this.f4887b = gxVar;
        this.c = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f4886a != null && this.f4887b.E) {
            Document document = new Document(this.f4887b);
            this.f4886a.a(document, new com.google.android.finsky.layout.play.ad(279, document.f1963a.R, this.c)).onClick(view);
        }
    }
}
