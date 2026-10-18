package com.google.android.finsky.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.play.PlayHighlightsBannerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dl extends android.support.v4.view.bn implements bf, com.google.android.libraries.bind.bpkg.a {

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<Cdo> f1686b = new ArrayList<>();
    private int c;
    private boolean d;

    public dl(com.google.android.finsky.api.b bVar, com.google.android.finsky.api.model.i[] iVarArr, Context context, LayoutInflater layoutInflater, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar2, gr grVar, com.google.android.finsky.utils.dx dxVar) {
        List list;
        dm dmVar = new dm(this, context.getResources());
        android.support.v7.widget.eg egVar = new android.support.v7.widget.eg();
        if (dxVar == null || !dxVar.a("HighlightsPagerAdapter.TabsState")) {
            list = null;
        } else {
            list = dxVar.d("HighlightsPagerAdapter.TabsState");
        }
        int i = 0;
        while (i < grVar.a()) {
            Cdo cdo = new Cdo(i, bVar, context, layoutInflater, eVar, bVar2, grVar.g(i), dmVar, egVar, iVarArr[i], (list == null || i >= list.size()) ? null : (com.google.android.finsky.utils.dx) list.get(i));
            cdo.a(i == this.c);
            this.f1686b.add(cdo);
            i++;
        }
        this.d = !com.google.android.play.utils.j.b(context);
    }

    public final void a(com.google.android.finsky.utils.dx dxVar) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f1686b.size()) {
                Cdo cdo = this.f1686b.get(i2);
                com.google.android.finsky.utils.dx dxVar2 = new com.google.android.finsky.utils.dx();
                if (cdo.c != null) {
                    cdo.c.a(cdo.g);
                }
                dxVar2.a("HighlightsTab.ScrollState", cdo.g);
                cdo.f1689a.b((com.google.android.finsky.api.model.x) cdo);
                arrayList.add(dxVar2);
                i = i2 + 1;
            } else {
                dxVar.a("HighlightsPagerAdapter.TabsState", arrayList);
                return;
            }
        }
    }

    @Override // android.support.v4.view.bn
    public final int a() {
        return this.f1686b.size();
    }

    @Override // android.support.v4.view.bn
    public final boolean a(View view, Object obj) {
        return ((Cdo) obj).c == view;
    }

    @Override // android.support.v4.view.bn
    public final Object a(ViewGroup viewGroup, int i) {
        Cdo cdo = this.f1686b.get(com.google.android.libraries.bind.bpkg.c.a(this, i));
        cdo.c = (PlayHighlightsBannerView) cdo.h.inflate(R.layout.play_highlights_banner_fullbleed, viewGroup, false);
        viewGroup.addView(cdo.c);
        cdo.c.setHighlightBannerListener(cdo);
        if (cdo.f1689a.a()) {
            cdo.m_();
        }
        return cdo;
    }

    @Override // android.support.v4.view.bn
    public final void a(ViewGroup viewGroup, int i, Object obj) {
        Cdo cdo = this.f1686b.get(com.google.android.libraries.bind.bpkg.c.a(this, i));
        cdo.c.a(cdo.g);
        viewGroup.removeView(cdo.c);
        cdo.c = null;
        cdo.f.f1885a = null;
    }

    public final void a(dn dnVar) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f1686b.size()) {
                return;
            }
            this.f1686b.get(i2).d = dnVar;
            i = i2 + 1;
        }
    }

    public final int e(int i) {
        if (i < 0 || i > this.f1686b.size()) {
            return 0;
        }
        Cdo cdo = this.f1686b.get(i);
        if (cdo.f1690b == null) {
            return 0;
        }
        return cdo.f1690b.a();
    }

    public final void f(int i) {
        this.c = i;
        int i2 = 0;
        while (i2 < this.f1686b.size()) {
            this.f1686b.get(i2).a(i2 == i);
            i2++;
        }
        Cdo cdo = this.f1686b.get(i);
        cdo.a();
        cdo.a(cdo.e);
    }

    @Override // com.google.android.finsky.activities.bf
    public final View c(int i) {
        PlayHighlightsBannerView playHighlightsBannerView;
        playHighlightsBannerView = this.f1686b.get(com.google.android.libraries.bind.bpkg.c.a(this, i)).c;
        return playHighlightsBannerView;
    }

    @Override // com.google.android.finsky.activities.bf
    public final boolean d(int i) {
        return this.c == com.google.android.libraries.bind.bpkg.c.a(this, i);
    }

    @Override // com.google.android.libraries.bind.bpkg.a
    public final boolean e() {
        return this.d;
    }

    @Override // com.google.android.libraries.bind.bpkg.a
    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            d();
        }
    }
}
