package com.google.android.finsky.activities;

import android.os.Bundle;
import android.view.MenuItem;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.pj;

/* loaded from: classes.dex */
public class FamilyMemberSettingsActivity extends android.support.v7.a.ae implements com.google.android.finsky.epkg.t {
    private cj k;

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.google.android.finsky.safemode.a.b()) {
            com.google.android.finsky.safemode.a.d();
            finish();
            return;
        }
        setContentView(R.layout.family_member_settings_activity);
        f().a().a(true);
        this.k = new cj(this);
        this.k.f3539b = d();
        if (((cn) d().a(R.id.family_member_setting_content)) == null) {
            d().a().a(R.id.family_member_setting_content, new cn()).b();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // com.google.android.finsky.epkg.t
    public final com.google.android.finsky.navigationmanager.b g() {
        return this.k;
    }

    @Override // com.google.android.finsky.epkg.t
    public final com.google.android.finsky.layout.actionbar.c h() {
        return null;
    }

    @Override // com.google.android.finsky.epkg.t
    public final void b_(String str) {
    }

    @Override // com.google.android.finsky.epkg.t
    public final void a(int i, boolean z) {
    }

    @Override // com.google.android.finsky.epkg.t
    public final void s_() {
    }

    @Override // com.google.android.finsky.epkg.t
    public final void b(int i) {
    }

    @Override // com.google.android.finsky.epkg.t
    public final void j() {
        finish();
    }

    @Override // com.google.android.finsky.epkg.t
    public final com.google.android.finsky.api.b a_(String str) {
        return FinskyApp.a().b(str);
    }

    @Override // com.google.android.finsky.epkg.t
    public final com.google.android.play.image.e k() {
        return null;
    }

    @Override // com.google.android.finsky.epkg.t
    public final void a(String str, String str2, boolean z) {
    }

    @Override // com.google.android.finsky.epkg.t
    public final com.google.android.gms.common.api.m l() {
        return null;
    }

    @Override // com.google.android.finsky.epkg.t
    public final void a(com.google.android.finsky.epkg.q qVar) {
    }

    @Override // com.google.android.finsky.epkg.t
    public final void a(pj pjVar) {
    }

    @Override // com.google.android.finsky.epkg.t
    public final void m() {
    }

    @Override // com.google.android.finsky.epkg.t
    public final void c(int i) {
    }
}
