package com.google.android.finsky.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.protos.pj;

/* loaded from: classes.dex */
public class FlagItemDialog extends d implements com.google.android.finsky.epkg.t {
    private com.google.android.finsky.navigationmanager.b o = new cj(this);

    public static void a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) FlagItemDialog.class);
        intent.putExtra("url", str);
        intent.setFlags(536936448);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d, android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_when_large);
        Toolbar toolbar = (Toolbar) findViewById(R.id.action_bar);
        if (toolbar != null) {
            if (toolbar instanceof FinskySearchToolbar) {
                ((FinskySearchToolbar) toolbar).a(new com.google.android.finsky.layout.actionbar.l(this));
            }
            a(toolbar);
        }
        String stringExtra = getIntent().getStringExtra("url");
        this.n = new com.google.android.finsky.layout.actionbar.e(this.o, this);
        if (d().a(R.id.content_frame) == null) {
            cr a2 = cr.a(stringExtra);
            android.support.v4.app.ap a3 = d().a();
            a3.a(R.id.content_frame, a2);
            a3.b();
        }
    }

    @Override // com.google.android.finsky.epkg.t
    public final com.google.android.play.image.e k() {
        return FinskyApp.a().d;
    }

    @Override // com.google.android.finsky.epkg.t
    public final com.google.android.finsky.api.b a_(String str) {
        return FinskyApp.a().b(str);
    }

    @Override // com.google.android.finsky.epkg.t
    public final com.google.android.finsky.navigationmanager.b g() {
        return null;
    }

    @Override // com.google.android.finsky.epkg.t
    public final com.google.android.finsky.layout.actionbar.c h() {
        return null;
    }

    @Override // com.google.android.finsky.epkg.t
    public final void j() {
        finish();
    }

    @Override // com.google.android.finsky.epkg.t
    public final void a(String str, String str2, boolean z) {
        ch.a(d(), str, str2, z);
    }

    @Override // com.google.android.finsky.epkg.t
    public final void b_(String str) {
        this.n.a(str);
    }

    @Override // com.google.android.finsky.epkg.t
    public final void a(int i, boolean z) {
        this.n.a(i, z);
    }

    @Override // com.google.android.finsky.epkg.t
    public final void s_() {
        this.n.a(false, -1);
    }

    @Override // com.google.android.finsky.epkg.t
    public final void b(int i) {
        this.n.a(true, i);
    }

    @Override // com.google.android.finsky.epkg.t
    public final void c(int i) {
        this.n.a(i);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // com.google.android.finsky.epkg.t
    public final com.google.android.gms.common.api.m l() {
        throw new UnsupportedOperationException();
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
}
