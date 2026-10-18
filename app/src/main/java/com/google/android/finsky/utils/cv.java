package com.google.android.finsky.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class cv extends cx {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f4811a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f4812b;
    private final Uri c;
    private final Uri d;
    private final Uri e;

    cv() {
        super((byte) 0);
        this.f4811a = new Uri.Builder().scheme("http").authority("play.google.com").appendPath("magazines").appendPath("reader").build();
        this.f4812b = this.f4811a.buildUpon().appendPath("home").appendPath("carousel").build();
        this.c = this.f4811a.buildUpon().appendPath("issue").build();
        this.d = this.f4811a.buildUpon().appendPath("news").build();
        this.e = this.f4811a.buildUpon().appendPath("verify_subscription").build();
    }

    private static Intent b() {
        return new Intent("android.intent.action.VIEW").setPackage("com.google.android.apps.magazines");
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent a(Context context, String str) {
        Intent b2 = b();
        b2.setData(this.f4812b);
        b2.setFlags(268435456);
        b2.addFlags(67108864);
        a(b2, "authAccount", str);
        return b2;
    }

    @Override // com.google.android.finsky.utils.cx
    public final Intent a(Context context, Document document, String str) {
        Intent b2 = b();
        if (document.f1963a.e == 15) {
            String queryParameter = Uri.parse(document.f1963a.D).getQueryParameter("doc");
            b2.setData(this.e.buildUpon().appendPath(queryParameter.substring(queryParameter.indexOf("-") + 1)).build());
        } else if (document.f1963a.e == 24 || document.f1963a.e == 25) {
            b2.setData(this.d.buildUpon().appendPath(document.f1963a.c).build());
        } else {
            b2.setData(this.c.buildUpon().appendPath(document.f1963a.c).build());
        }
        b2.setFlags(268435456);
        b2.addFlags(67108864);
        a(b2, "authAccount", str);
        return b2;
    }

    @Override // com.google.android.finsky.utils.cx
    public final String a() {
        return "com.google.android.apps.magazines";
    }
}
