package com.google.android.finsky.epkg;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MultiInstallActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cy f2748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f2749b;

    c(a aVar, cy cyVar) {
        this.f2749b = aVar;
        this.f2748a = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        com.google.android.finsky.bpkg.a aVar = FinskyApp.a().s;
        for (Document document : this.f2749b.x.b()) {
            if (document.f1963a.g == 3) {
                com.google.android.finsky.bpkg.b a2 = aVar.a(document.f1963a.f3890a);
                if (!((a2 == null || a2.c == null || a2.c.c == -1) ? false : true)) {
                    arrayList.add(document);
                }
            }
        }
        FinskyApp.a().h().a(1236, (byte[]) null, this.f2748a);
        this.f2749b.t.startActivity(MultiInstallActivity.a(this.f2749b.t, arrayList, FinskyApp.a().j()));
    }
}
