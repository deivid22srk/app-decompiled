package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.FlagItemDialog;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public final class ai implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3131a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f3132b;
    final /* synthetic */ com.google.android.finsky.layout.play.cy c;
    final /* synthetic */ DetailsFlagItemSection d;

    public ai(DetailsFlagItemSection detailsFlagItemSection, com.google.android.finsky.navigationmanager.b bVar, Document document, com.google.android.finsky.layout.play.cy cyVar) {
        this.d = detailsFlagItemSection;
        this.f3131a = bVar;
        this.f3132b = document;
        this.c = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.navigationmanager.b bVar = this.f3131a;
        String str = this.f3132b.f1963a.D;
        if (bVar.k()) {
            FlagItemDialog.a(bVar.f3538a, str);
        }
        FinskyApp.a().h().a(207, (byte[]) null, this.c);
    }
}
