package com.google.android.finsky.layout;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
final class aq implements com.google.android.play.utils.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f3137a;

    aq(ap apVar) {
        this.f3137a = apVar;
    }

    @Override // com.google.android.play.utils.k
    public final void a(View view, String str) {
        com.google.android.finsky.navigationmanager.b bVar;
        this.f3137a.d = true;
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(str);
        intent.setData(parse);
        intent.setPackage(context.getPackageName());
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            bVar = this.f3137a.e;
            bVar.a(parse, (String) null);
        } else {
            intent.setPackage(null);
            context.startActivity(intent);
        }
    }
}
