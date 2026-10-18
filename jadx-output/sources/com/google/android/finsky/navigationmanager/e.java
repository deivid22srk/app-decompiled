package com.google.android.finsky.navigationmanager;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;

/* loaded from: classes.dex */
final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f3544a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f3545b;
    final /* synthetic */ cy c;
    final /* synthetic */ b d;

    e(b bVar, Document document, View view, cy cyVar) {
        this.d = bVar;
        this.f3544a = document;
        this.f3545b = view;
        this.c = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.utils.a.a(view.getContext(), this.f3544a, "22", view.getWidth(), view.getHeight());
        String str = this.f3544a.f1963a.D;
        if (!this.f3544a.aO()) {
            this.d.a(str);
        } else {
            if (b.h() && this.f3545b != null) {
                this.d.a(this.f3544a, this.f3545b);
                FinskyApp.a().h().a(this.c);
                return;
            }
            this.d.a(this.f3544a);
        }
        FinskyApp.a().h().a(this.c);
    }
}
