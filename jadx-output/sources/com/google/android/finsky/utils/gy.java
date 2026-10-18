package com.google.android.finsky.utils;

import android.content.Context;
import android.widget.Toast;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.PublicReviewsActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.lj;

/* loaded from: classes.dex */
final class gy implements com.android.volley.t<lj> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.support.v4.app.t f4926a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hg f4927b;
    final /* synthetic */ boolean c;

    gy(android.support.v4.app.t tVar, hg hgVar, boolean z) {
        this.f4926a = tVar;
        this.f4927b = hgVar;
        this.c = z;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(lj ljVar) {
        boolean z = false;
        lj ljVar2 = ljVar;
        if (!this.f4926a.isFinishing()) {
            com.google.android.finsky.protos.gx gxVar = ljVar2.f4082a;
            if (gxVar == null) {
                android.support.v4.app.aa d = this.f4926a.d();
                Context baseContext = this.f4926a.getBaseContext();
                if (!FinskyApp.a().g.f1961a.D) {
                    Toast.makeText(FinskyApp.a(), baseContext.getText(R.string.google_plus_disabled_error), 0).show();
                } else {
                    bn.z().a(d, (String) null);
                }
                this.f4927b.a();
                return;
            }
            if (this.c) {
                android.support.v4.app.t tVar = this.f4926a;
                if (!bm.a()) {
                    tVar.startActivity(PublicReviewsActivity.a(new Document(gxVar)));
                    z = true;
                }
                if (z) {
                    this.f4927b.a();
                    return;
                }
            }
            this.f4927b.a(new Document(gxVar));
        }
    }
}
