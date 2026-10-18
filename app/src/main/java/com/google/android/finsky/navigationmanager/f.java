package com.google.android.finsky.navigationmanager;

import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.np;

/* loaded from: classes.dex */
final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ np f3546a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f3547b;
    final /* synthetic */ DfeToc c;
    final /* synthetic */ cy d;
    final /* synthetic */ String e;
    final /* synthetic */ int f;
    final /* synthetic */ b g;

    f(b bVar, np npVar, Document document, DfeToc dfeToc, cy cyVar, String str, int i) {
        this.g = bVar;
        this.f3546a = npVar;
        this.f3547b = document;
        this.c = dfeToc;
        this.d = cyVar;
        this.e = str;
        this.f = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!TextUtils.isEmpty(this.f3546a.e)) {
            this.g.a(this.f3546a.e, this.f3547b.f1963a.i, this.f3547b.f1963a.g, this.c, this.d);
            return;
        }
        if (!TextUtils.isEmpty(this.f3546a.g)) {
            this.g.a(this.f3546a.g, this.e, this.f, this.d);
            return;
        }
        if (!TextUtils.isEmpty(this.f3546a.f4179a)) {
            FinskyApp.a().h().a(this.d);
            this.g.a(this.f3546a.f4179a);
        } else if (!TextUtils.isEmpty(this.f3546a.n)) {
            this.g.a(this.c, this.f3546a.n);
        } else if (this.f3546a.p != null) {
            FinskyApp.a().h().a(this.d);
            this.g.a(FinskyApp.a().j(), this.f3546a.p);
        }
    }
}
