package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.activities.fe;
import com.google.android.finsky.activities.ff;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.detailspage.bf;

/* loaded from: classes.dex */
public abstract class bd<T extends bf> extends bw implements fe, gp {

    /* renamed from: b, reason: collision with root package name */
    protected T f2559b;
    protected Context c;
    protected be d;
    protected DfeToc e;
    protected com.google.android.finsky.api.b f;
    protected com.google.android.finsky.api.b g;
    protected com.google.android.play.image.e h;
    protected com.google.android.finsky.navigationmanager.b i;
    protected com.google.android.finsky.epkg.q j;
    protected String k;
    protected String l;
    protected com.google.android.finsky.gpkg.h m;
    protected boolean n;
    protected String o;
    protected boolean p;
    protected android.support.v7.widget.eg q;
    protected com.google.android.finsky.layout.u r;
    protected com.google.android.finsky.layout.play.cy s;

    public abstract boolean W_();

    public abstract void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2);

    public void a(Context context, be beVar, DfeToc dfeToc, com.google.android.finsky.api.b bVar, com.google.android.finsky.api.b bVar2, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar3, com.google.android.finsky.epkg.q qVar, String str, String str2, com.google.android.finsky.gpkg.h hVar, boolean z, String str3, boolean z2, android.support.v7.widget.eg egVar, com.google.android.finsky.layout.u uVar, com.google.android.finsky.layout.play.cy cyVar) {
        this.c = context;
        this.d = beVar;
        this.e = dfeToc;
        this.f = bVar;
        this.g = bVar2;
        this.h = eVar;
        this.i = bVar3;
        this.j = qVar;
        this.k = str;
        this.l = str2;
        this.m = hVar;
        this.n = z;
        this.o = str3;
        this.p = z2;
        this.q = egVar;
        this.r = uVar;
        this.s = cyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(bf bfVar) {
        this.f2559b = bfVar;
    }

    public T Y_() {
        return this.f2559b;
    }

    public void f() {
    }

    @Override // com.google.android.finsky.activities.gp
    public void a(int i, Bundle bundle) {
    }

    @Override // com.google.android.finsky.activities.gp
    public void b(int i, Bundle bundle) {
    }

    public void a(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.finsky.activities.fe
    public void a(String str, String str2, ff ffVar) {
    }

    protected void a_(String str, Object obj) {
    }
}
