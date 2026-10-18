package com.google.android.finsky.utils;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.kn;

/* loaded from: classes.dex */
final class fk implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4873a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageView f4874b;
    final /* synthetic */ com.google.android.finsky.layout.play.cy c;
    final /* synthetic */ Document d;
    final /* synthetic */ com.google.android.finsky.navigationmanager.b e;
    final /* synthetic */ com.google.android.play.layout.a f;
    final /* synthetic */ com.google.android.finsky.layout.play.az g;

    fk(Context context, ImageView imageView, com.google.android.finsky.layout.play.cy cyVar, Document document, com.google.android.finsky.navigationmanager.b bVar, com.google.android.play.layout.a aVar, com.google.android.finsky.layout.play.az azVar) {
        this.f4873a = context;
        this.f4874b = imageView;
        this.c = cyVar;
        this.d = document;
        this.e = bVar;
        this.f = aVar;
        this.g = azVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kn[] knVarArr;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        com.google.android.play.layout.d dVar = new com.google.android.play.layout.d(this.f4873a, this.f4874b);
        Resources resources = this.f4873a.getResources();
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        h.a(238, (byte[]) null, this.c);
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        boolean P = this.d.P();
        boolean z2 = !js.a(this.d, b2);
        boolean z3 = (P || z2) ? false : true;
        Account b3 = b2.b();
        fe.a(dVar, this.f4873a, this.d, this.e, this.c, z3, this.f);
        if (P) {
            gc gcVar = FinskyApp.a().z;
            boolean a2 = gcVar.a(this.d.f1963a.f3890a, b3);
            if (a2) {
                i3 = 296;
                i4 = R.string.preregistration_remove;
            } else {
                i3 = 295;
                i4 = R.string.preregistration_add;
            }
            dVar.a(0, resources.getString(i4), true, new fl(this, h, i3, gcVar, b2, a2, this.e.f().B));
            dVar.a(0, resources.getString(R.string.share), true, new fm(this));
        }
        if (z2) {
            boolean a3 = js.a(this.d, b3);
            if (a3) {
                i = 205;
                i2 = R.string.wishlist_remove;
            } else {
                i = 204;
                i2 = R.string.wishlist_add;
            }
            dVar.a(0, resources.getString(i2), true, new fn(this, h, i, a3, b2));
        }
        if (this.d.aF()) {
            z = fe.g;
            if (z) {
                dVar.a(0, resources.getString(R.string.report_ad_problem), true, new fo(this));
            }
        }
        if (this.g != null && this.d.aR()) {
            String str = this.d.aI().c;
            if (!TextUtils.isEmpty(str)) {
                dVar.a(0, str, true, new ga(this.f, this.d, b2, this.g, this.c));
            } else {
                FinskyLog.e("Empty dismissal text received from the server for doc %s", this.d.f1963a.f3890a);
            }
        }
        com.google.android.finsky.protos.ae aeVar = this.d.f1963a.C;
        if (aeVar != null) {
            knVarArr = aeVar.y;
        } else {
            knVarArr = null;
        }
        if (knVarArr != null && knVarArr.length > 0) {
            for (kn knVar : knVarArr) {
                dVar.a(0, knVar.f4046a, true, new fp(this, knVar));
            }
        }
        this.f4874b.setImageResource(R.drawable.play_overflow_menu_open);
        dVar.e = new fq(this);
        dVar.a();
    }
}
