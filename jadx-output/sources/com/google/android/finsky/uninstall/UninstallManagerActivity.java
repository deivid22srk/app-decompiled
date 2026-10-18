package com.google.android.finsky.uninstall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ap;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.e.t;
import com.google.android.finsky.protos.ag;
import com.google.android.finsky.protos.pj;

/* loaded from: classes.dex */
public class UninstallManagerActivity extends com.google.android.finsky.activities.d implements t, k {
    private Document o;

    public static Intent a(Document document) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) UninstallManagerActivity.class);
        intent.putExtra("uninstall_manager_activity_installing_doc", document);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d, android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.uninstall_manager_activity);
        this.o = (Document) getIntent().getParcelableExtra("uninstall_manager_activity_installing_doc");
        if (d().a("uninstall_manager_activity_fragment") == null) {
            j a2 = j.a(this.o);
            ap a3 = d().a();
            a3.a(R.anim.play_fade_in, R.anim.fade_out);
            a3.a(R.id.main_layout, a2, "uninstall_manager_activity_fragment");
            a3.b();
        }
    }

    @Override // com.google.android.finsky.uninstall.k
    public final void o() {
        FinskyApp a2 = FinskyApp.a();
        com.google.android.finsky.receivers.f fVar = a2.k;
        ag E = this.o.E();
        String str = E.w;
        fVar.a(str, E.e, com.google.android.finsky.activities.a.a(str, a2.j(), a2.s, a2.p), this.o.f1963a.i, false, "single_install", 2, this.o.t());
        finish();
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.navigationmanager.b g() {
        return null;
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
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.api.b a_(String str) {
        return FinskyApp.a().b(str);
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.play.image.e k() {
        return FinskyApp.a().d;
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
