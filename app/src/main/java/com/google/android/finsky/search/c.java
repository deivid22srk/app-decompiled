package com.google.android.finsky.search;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.apkg.w;
import com.google.android.finsky.FinskyApp;
import java.util.Locale;

/* loaded from: classes.dex */
final class c extends l {

    /* renamed from: a, reason: collision with root package name */
    static final Uri f4519a = Uri.parse("http://www.google.com/complete/search");

    /* renamed from: b, reason: collision with root package name */
    protected final o f4520b;
    private final g f;
    private String g;

    public c(String str, Context context, o oVar, g gVar) {
        super(str, context);
        this.g = f4519a.buildUpon().appendQueryParameter("q", this.c).appendQueryParameter("json", "1").appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("gl", Locale.getDefault().getCountry()).appendQueryParameter("ds", "cse").appendQueryParameter("client", "partner").appendQueryParameter("partnerid", "skyjam-store").build().toString();
        this.f4520b = oVar;
        this.f = gVar;
    }

    @Override // com.google.android.finsky.search.l
    public final void a() {
    }

    @Override // com.google.android.finsky.search.l
    protected final void a(n nVar) {
        if (TextUtils.isEmpty(this.c)) {
            nVar.a();
            return;
        }
        FinskyApp.a().f1434a.a(new w(this.g, new d(this, nVar), new e(this, nVar)));
        b();
    }
}
