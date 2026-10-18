package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MultiInstallActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cy f1920a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f1921b;
    final /* synthetic */ CardRecyclerViewAdapter c;

    h(CardRecyclerViewAdapter cardRecyclerViewAdapter, cy cyVar, Document document) {
        this.c = cardRecyclerViewAdapter;
        this.f1920a = cyVar;
        this.f1921b = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        FinskyApp.a().h().a(1235, (byte[]) null, this.f1920a);
        com.google.android.finsky.b.a aVar = FinskyApp.a().s;
        for (Document document : this.f1921b.b()) {
            if (document.f1963a.g == 3) {
                com.google.android.finsky.b.b a2 = aVar.a(document.f1963a.f3890a);
                if (!((a2 == null || a2.c == null || a2.c.c == -1) ? false : true)) {
                    arrayList.add(document);
                }
            }
        }
        this.c.t.startActivity(MultiInstallActivity.a(this.c.t, arrayList, FinskyApp.a().j()));
    }
}
