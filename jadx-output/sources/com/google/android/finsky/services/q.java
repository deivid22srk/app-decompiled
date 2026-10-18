package com.google.android.finsky.services;

import android.content.Context;
import android.graphics.Bitmap;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.utils.dw;
import com.google.android.finsky.utils.ex;
import com.google.android.finsky.utils.gc;
import com.google.android.finsky.utils.gg;
import com.google.android.finsky.utils.gj;

/* loaded from: classes.dex */
final class q implements gj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gc f4630a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FinskyApp f4631b;
    final /* synthetic */ boolean c;
    final /* synthetic */ DailyHygiene d;

    q(DailyHygiene dailyHygiene, gc gcVar, FinskyApp finskyApp, boolean z) {
        this.d = dailyHygiene;
        this.f4630a = gcVar;
        this.f4631b = finskyApp;
        this.c = z;
    }

    @Override // com.google.android.finsky.utils.gj
    public final void a(Document document, String str) {
        gc gcVar = this.f4630a;
        Context baseContext = this.d.getBaseContext();
        dw dwVar = this.f4631b.n;
        com.google.android.play.image.e eVar = this.f4631b.d;
        int dimensionPixelSize = baseContext.getResources().getDimensionPixelSize(R.dimen.notification_icon_size);
        ds a2 = com.google.android.finsky.utils.a.a.a(document, dimensionPixelSize, dimensionPixelSize, ex.f);
        if (a2 == null) {
            dwVar.a(document, str, (Bitmap) null);
            return;
        }
        gg ggVar = new gg(gcVar, dwVar, document, str);
        com.google.android.play.image.j b2 = eVar.b(a2.f, dimensionPixelSize, dimensionPixelSize, ggVar);
        if (b2.f6944a == null) {
            return;
        }
        ggVar.a_(b2);
        b2.a();
    }

    @Override // com.google.android.finsky.utils.gj
    public final void a(boolean z) {
        DailyHygiene.b(this.d, this.c && z);
    }
}
