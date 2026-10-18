package com.google.android.finsky.navigationmanager;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;

/* loaded from: classes.dex */
final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f3542a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy f3543b;
    final /* synthetic */ b c;

    d(b bVar, Document document, cy cyVar) {
        this.c = bVar;
        this.f3542a = document;
        this.f3543b = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.a(this.f3542a.f1963a.y.f3798a, (String) null, this.f3542a.f1963a.g, FinskyApp.a().g, this.f3543b);
    }
}
