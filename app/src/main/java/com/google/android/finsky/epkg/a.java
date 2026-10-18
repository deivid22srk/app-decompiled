package com.google.android.finsky.epkg;

import android.content.Context;
import android.support.v7.widget.eq;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.layout.HeroGraphicView;
import com.google.android.finsky.layout.InsetsFrameLayout;
import com.google.android.finsky.layout.play.PlayBundleContainerView;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class a<T extends com.google.android.finsky.api.model.d<?>> extends CardRecyclerViewAdapter<T> {
    public final Document x;
    public String y;
    public int z;

    public a(Context context, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, DfeToc dfeToc, ac acVar, Document document, com.google.android.finsky.api.model.s sVar, boolean z, cy cyVar) {
        super(context, bVar, bVar2, eVar, dfeToc, acVar, sVar, null, z, false, cyVar);
        this.x = document;
        FinskyApp.a().k.a(new b(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final boolean i() {
        return true;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, com.google.android.finsky.activities.gy
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final int f() {
        int a2 = HeroGraphicView.a(this.t, this.t.getResources().getDisplayMetrics().widthPixels, HeroGraphicView.c(this.x) != null, HeroGraphicView.a(this.x.f1963a.e));
        if (InsetsFrameLayout.f3009a) {
            return a2 - ik.d(this.t);
        }
        return a2;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, com.google.android.finsky.activities.gy
    public final void a(HeroGraphicView heroGraphicView) {
        heroGraphicView.a(this.x);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final int p() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final int o() {
        return 1;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final int a(int i) {
        if (i == 0) {
            return 21;
        }
        int i2 = i - 1;
        if (j() && i2 == 0) {
            return 22;
        }
        return 40;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 40:
                return new cx(a(R.layout.play_bundle_container_view, viewGroup, false));
            default:
                return super.a(viewGroup, i);
        }
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        int i2 = eqVar.e;
        View view = eqVar.f795a;
        switch (i2) {
            case 40:
                PlayBundleContainerView playBundleContainerView = (PlayBundleContainerView) view;
                playBundleContainerView.a(this.c, this.u, this.x, new c(this, playBundleContainerView.getPlayStoreUiElementNode()), this.e, this.z, this.y);
                break;
            default:
                super.a(eqVar, i);
                break;
        }
    }
}
