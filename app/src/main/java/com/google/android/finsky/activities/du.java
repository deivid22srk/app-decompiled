package com.google.android.finsky.activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public final class du extends com.google.android.finsky.epkg.q implements com.google.android.finsky.layout.play.da {

    /* renamed from: a, reason: collision with root package name */
    Document f1695a;
    private Handler ai;
    private com.google.android.finsky.api.model.h c;
    private com.google.android.finsky.gpkg.h d;
    private DfeToc e;
    private String f;
    private String h;
    private String i;
    private boolean g = false;
    private long aj = com.google.android.finsky.apkg.i.g();
    private com.google.android.finsky.apkg.ai ak = com.google.android.finsky.apkg.i.a(5400);

    /* renamed from: b, reason: collision with root package name */
    protected com.google.android.finsky.layout.play.ad f1696b = null;
    private boolean al = false;

    public static du a(String str, String str2, String str3, String str4) {
        du duVar = new du();
        duVar.f = str;
        duVar.h = str3;
        duVar.i = str4;
        duVar.f(str2);
        return duVar;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void a(Activity activity) {
        this.ai = new Handler(activity.getMainLooper());
        super.a(activity);
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.d = FinskyApp.a().p;
        this.e = FinskyApp.a().g;
        if (bundle != null) {
            this.f = bundle.getString("referrer");
            this.h = bundle.getString("inline_details_url");
            this.i = bundle.getString("continue_url");
        }
        this.au.a();
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle != null) {
            bundle.putString("referrer", this.f);
            bundle.putString("inline_details_url", this.h);
            bundle.putString("continue_url", this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void y() {
        if (this.c != null) {
            this.c.b((com.google.android.finsky.api.model.x) this);
            this.c.b((com.android.volley.s) this);
        }
        this.c = new com.google.android.finsky.api.model.h(FinskyApp.a().b((String) null), this.h);
        this.c.a((com.google.android.finsky.api.model.x) this);
        this.c.a((com.android.volley.s) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final int w() {
        return R.layout.inline_app_details_frame;
    }

    public final void A_() {
        this.g = true;
        y();
    }

    @Override // com.google.android.finsky.epkg.q, com.google.android.finsky.layout.play.da
    public final void p_() {
        this.aj = com.google.android.finsky.apkg.i.g();
    }

    @Override // com.google.android.finsky.epkg.q, com.google.android.finsky.layout.play.da
    public final void i() {
        com.google.android.finsky.apkg.i.a(this.ai, this.aj, this);
    }

    @Override // com.google.android.finsky.epkg.q, com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.apkg.i.a(this.ai, this.aj, this, cyVar);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.ak;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0520  */
    @Override // com.google.android.finsky.epkg.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.du.u():void");
    }
}
