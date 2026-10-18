package com.google.android.finsky;

import android.net.Uri;
import com.android.volley.apkg.af;

/* loaded from: classes.dex */
public final class s implements com.google.android.play.article.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.article.a f4510a = new com.google.android.play.article.a(new t(this));

    @Override // com.google.android.play.article.h
    public final void a(Uri uri, com.google.android.play.article.g gVar) {
        FinskyApp.a().f1434a.a(new af(0, uri.toString(), new u(this, gVar, uri), new v(this, gVar, uri)));
    }
}
