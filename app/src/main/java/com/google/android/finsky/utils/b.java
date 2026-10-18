package com.google.android.finsky.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4758a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f4759b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;

    b(Context context, Document document, String str, String str2, String str3) {
        this.f4758a = context;
        this.f4759b = document;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f4758a;
        Document document = this.f4759b;
        String a2 = a.a(this.f4758a, this.c, this.d, this.e);
        if (TextUtils.isEmpty(a2)) {
            FinskyLog.d("Empty URL for docid: %s", document.f1963a.f3890a);
        } else {
            FinskyApp.a().f1434a.a(new i(context, a2, new e(a2), new f(document, a2)));
        }
    }
}
