package com.google.android.finsky.billing.lightpurchase;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.protos.mk;

/* loaded from: classes.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    public dp f2311a;

    /* renamed from: b, reason: collision with root package name */
    public String f2312b;
    Document c;
    public int d;
    String e;
    int f;
    String g;
    String h;
    public String i;
    public mk j;
    String k;
    int l;

    public final ah a(Document document) {
        this.f2311a = document.c();
        this.f2312b = document.f1963a.f3890a;
        this.c = document;
        return this;
    }

    public final ah a(int i, String str, String str2) {
        this.f = i;
        this.g = str;
        this.h = str2;
        return this;
    }

    public final PurchaseParams a() {
        return new PurchaseParams(this, (byte) 0);
    }
}
