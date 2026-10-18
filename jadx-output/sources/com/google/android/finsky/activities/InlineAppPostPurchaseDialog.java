package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.pj;

/* loaded from: classes.dex */
public class InlineAppPostPurchaseDialog extends d implements com.google.android.finsky.e.t {
    private FinskyApp o;
    private dx p;
    private cj q = new cj(this);

    static Intent a(Document document) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) InlineAppPostPurchaseDialog.class);
        intent.putExtra("document", document);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d, android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.inline_app_dialog);
        this.o = FinskyApp.a();
        android.support.v4.app.aa d = d();
        this.q.f3539b = d;
        this.p = (dx) d.a(R.id.content_frame);
        if (this.p == null) {
            Document document = (Document) getIntent().getParcelableExtra("document");
            this.p = dx.a(this.o, document, a.a(document.f1963a.f3890a, this.o.j(), this.o.s, this.o.p));
            android.support.v4.app.ap a2 = d.a();
            a2.a(R.id.content_frame, this.p);
            a2.b();
        }
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.navigationmanager.b g() {
        return this.q;
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.layout.actionbar.c h() {
        return null;
    }

    @Override // com.google.android.finsky.e.t
    public final void b_(String str) {
    }

    @Override // com.google.android.finsky.e.t
    public final void a(int i, boolean z) {
    }

    @Override // com.google.android.finsky.e.t
    public final void s_() {
    }

    @Override // com.google.android.finsky.e.t
    public final void b(int i) {
    }

    @Override // com.google.android.finsky.e.t
    public final void c(int i) {
    }

    @Override // com.google.android.finsky.e.t
    public final void j() {
        finish();
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.api.b a_(String str) {
        return this.o.b(str);
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.play.image.e k() {
        return this.o.d;
    }

    @Override // com.google.android.finsky.e.t
    public final void a(String str, String str2, boolean z) {
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.gms.common.api.m l() {
        return null;
    }

    @Override // com.google.android.finsky.e.t
    public final void a(com.google.android.finsky.e.q qVar) {
    }

    @Override // com.google.android.finsky.e.t
    public final void a(pj pjVar) {
    }

    @Override // com.google.android.finsky.e.t
    public final void m() {
    }
}
