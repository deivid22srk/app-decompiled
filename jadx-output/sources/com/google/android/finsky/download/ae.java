package com.google.android.finsky.download;

import android.net.Uri;
import android.os.Handler;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.el;

/* loaded from: classes.dex */
final class ae implements el<Uri> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f2689a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f2690b;

    ae(x xVar, b bVar) {
        this.f2690b = xVar;
        this.f2689a = bVar;
    }

    @Override // com.google.android.finsky.utils.el
    public final /* synthetic */ void a(Uri uri) {
        Uri uri2 = uri;
        FinskyLog.a("Enqueued %s as %s", this.f2689a, uri2.toString());
        new Handler(FinskyApp.a().getMainLooper()).post(new af(this, uri2));
    }
}
