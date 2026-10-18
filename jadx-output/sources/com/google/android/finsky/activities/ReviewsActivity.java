package com.google.android.finsky.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.protos.pj;

/* loaded from: classes.dex */
public class ReviewsActivity extends d implements com.google.android.finsky.e.t {
    private Document o;
    private String p;
    private boolean q;
    private com.google.android.finsky.navigationmanager.b r;

    public static boolean o() {
        return FinskyApp.a().e().a(12602624L);
    }

    public static Intent a(Context context, Document document, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) ReviewsActivity.class);
        intent.putExtra("finsky.ReviewsActivity.document", document);
        intent.putExtra("finsky.ReviewsActivity.reviewsUrl", str);
        intent.putExtra("finsky.ReviewsActivity.isRottenTomatoesReviews", z);
        intent.setFlags(536870912);
        return intent;
    }

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
        Intent intent = getIntent();
        this.o = (Document) intent.getParcelableExtra("finsky.ReviewsActivity.document");
        this.p = intent.getStringExtra("finsky.ReviewsActivity.reviewsUrl");
        this.q = intent.getBooleanExtra("finsky.ReviewsActivity.isRottenTomatoesReviews", false);
        this.r = new cj(this);
        this.n = new com.google.android.finsky.layout.actionbar.e(this.r, this);
        this.n.a(this.o.f1963a.i);
        this.n.a(this.o.f1963a.g, false);
        this.n.a(false, -1);
        android.support.v4.app.aa d = d();
        if (d.a(R.id.content_frame) == null) {
            fk a2 = fk.a(this.o, this.p, this.q);
            android.support.v4.app.ap a3 = d.a();
            a3.b(R.id.content_frame, a2);
            a3.b();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                if (!this.r.a()) {
                    super.onBackPressed();
                }
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.navigationmanager.b g() {
        return this.r;
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.layout.actionbar.c h() {
        return null;
    }

    @Override // com.google.android.finsky.e.t
    public final void b_(String str) {
        this.n.a(str);
    }

    @Override // com.google.android.finsky.e.t
    public final void a(int i, boolean z) {
        this.n.a(i, z);
    }

    @Override // com.google.android.finsky.e.t
    public final void s_() {
        this.n.a(false, -1);
    }

    @Override // com.google.android.finsky.e.t
    public final void b(int i) {
        this.n.a(true, i);
    }

    @Override // com.google.android.finsky.e.t
    public final void c(int i) {
        this.n.a(i);
    }

    @Override // com.google.android.finsky.e.t
    public final void j() {
        finish();
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
        throw new UnsupportedOperationException();
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
