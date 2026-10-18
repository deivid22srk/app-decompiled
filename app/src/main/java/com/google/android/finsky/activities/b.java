package com.google.android.finsky.activities;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1563a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppsPermissionsActivity f1564b;

    b(AppsPermissionsActivity appsPermissionsActivity, String str) {
        this.f1564b = appsPermissionsActivity;
        this.f1563a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1564b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f1563a)));
    }
}
