package android.support.v7.a;

import android.support.v4.view.by;
import android.support.v4.view.er;
import android.view.View;

/* loaded from: classes.dex */
final class ar implements android.support.v4.view.bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f481a;

    ar(ap apVar) {
        this.f481a = apVar;
    }

    @Override // android.support.v4.view.bm
    public final er a(View view, er erVar) {
        int b2 = erVar.b();
        int b3 = ap.b(this.f481a, b2);
        if (b2 != b3) {
            erVar = erVar.a(erVar.a(), b3, erVar.c(), erVar.d());
        }
        return by.a(view, erVar);
    }
}
