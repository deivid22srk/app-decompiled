package com.google.android.finsky.navigationmanager;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.cr;

/* loaded from: classes.dex */
final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f3540a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy f3541b;
    final /* synthetic */ b c;

    c(b bVar, Document document, cy cyVar) {
        this.c = bVar;
        this.f3540a = document;
        this.f3541b = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f3540a.j().f3988a));
        if (cr.a(this.f3540a.f1963a.g, intent)) {
            intent.setPackage(cr.a(this.f3540a.f1963a.g));
        }
        view.getContext().startActivity(intent);
        FinskyApp.a().h().a(this.f3541b);
    }
}
