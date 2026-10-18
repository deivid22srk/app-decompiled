package com.google.android.finsky.detailspage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class es extends bd<et> implements ai, er, com.google.android.finsky.gpkg.o {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.activities.cc f2650a;

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.title_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0) {
            e();
            this.m.a(this);
        }
    }

    private void e() {
        if (this.f2650a != null) {
            this.f2650a.a();
        }
        this.f2650a = com.google.android.finsky.activities.au.a(this.e, ((et) this.f2559b).f2651a.f1963a.g, this.f.b());
        this.f2650a.a(this.c, this.i, this.h, this.j, true, this.l, this.o, this.p, this.s);
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        this.f2650a.a(((et) this.f2559b).f2651a, true, view);
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        if (this.f2650a != null) {
            this.f2650a.a();
        }
        this.m.b(this);
    }

    @Override // com.google.android.finsky.detailspage.bd, com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
                this.f2650a.a(i, bundle);
                break;
            case 5:
                Intent intent = new Intent("android.settings.WIFI_SETTINGS");
                intent.setFlags(537526272);
                this.j.a(intent);
                break;
        }
    }

    @Override // com.google.android.finsky.detailspage.bd, com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void L_() {
        this.d.a((bd) this, false);
    }

    @Override // com.google.android.finsky.detailspage.er
    public final void a(Bitmap bitmap) {
        this.f2650a.a(bitmap);
    }

    @Override // com.google.android.finsky.detailspage.er
    public final void a() {
        this.f2650a.f();
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        boolean z2;
        switch (document.f1963a.e) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 16:
            case 17:
            case 18:
            case 24:
            case 25:
            case 44:
                z2 = true;
                break;
            default:
                z2 = false;
                break;
        }
        if (z2) {
            if (this.f2559b == 0) {
                this.f2559b = new et();
                ((et) this.f2559b).f2651a = document;
                e();
                this.m.a(this);
                return;
            }
            if (z) {
                ((et) this.f2559b).f2651a = document;
                this.d.a((bd) this, false);
            }
        }
    }
}
