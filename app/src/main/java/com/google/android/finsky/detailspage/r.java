package com.google.android.finsky.detailspage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.DiscoveryBar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class r extends bd<s> implements ai, be, er {

    /* renamed from: a, reason: collision with root package name */
    private es f2668a;
    private ag u;
    private eu v;
    private List<bd> w;
    private boolean x;
    private boolean y;

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.combined_title_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(Context context, be beVar, DfeToc dfeToc, com.google.android.finsky.api.b bVar, com.google.android.finsky.api.b bVar2, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar3, com.google.android.finsky.epkg.q qVar, String str, String str2, com.google.android.finsky.gpkg.h hVar, boolean z, String str3, boolean z2, android.support.v7.widget.eg egVar, com.google.android.finsky.layout.u uVar, com.google.android.finsky.layout.play.cy cyVar) {
        super.a(context, beVar, dfeToc, bVar, bVar2, eVar, bVar3, qVar, str, str2, hVar, z, str3, z2, egVar, uVar, cyVar);
        this.f2668a = new es();
        this.u = new ag();
        this.v = new eu();
        this.w = new ArrayList();
        this.w.add(this.f2668a);
        this.w.add(this.u);
        this.w.add(this.v);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.w.size()) {
                this.w.get(i2).a(context, this, dfeToc, bVar, bVar2, eVar, bVar3, qVar, str, str2, hVar, z, str3, z2, egVar, uVar, cyVar);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2668a.W_();
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0) {
            this.f2668a.a(((s) this.f2559b).f2669a);
            this.u.a(((s) this.f2559b).f2670b);
            this.v.a(((s) this.f2559b).c);
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.w.size()) {
                this.w.get(i2).a(z, document, hVar, document2, hVar2);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        CombinedTitleModuleLayout combinedTitleModuleLayout = (CombinedTitleModuleLayout) view;
        this.f2668a.a(combinedTitleModuleLayout.getTitleModuleLayout());
        DiscoveryBar discoveryBarModuleLayout = combinedTitleModuleLayout.getDiscoveryBarModuleLayout();
        if (this.u.W_()) {
            this.u.a(discoveryBarModuleLayout);
            this.x = true;
            discoveryBarModuleLayout.setVisibility(0);
        } else {
            discoveryBarModuleLayout.setVisibility(8);
        }
        WarningMessageModuleLayout warningMessageModuleLayout = combinedTitleModuleLayout.getWarningMessageModuleLayout();
        if (this.v.W_()) {
            this.v.a(warningMessageModuleLayout);
            this.y = true;
            warningMessageModuleLayout.setVisibility(0);
            return;
        }
        warningMessageModuleLayout.setVisibility(8);
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void b(View view) {
        CombinedTitleModuleLayout combinedTitleModuleLayout = (CombinedTitleModuleLayout) view;
        this.f2668a.b(combinedTitleModuleLayout.getTitleModuleLayout());
        if (this.x) {
            this.u.b(combinedTitleModuleLayout.getDiscoveryBarModuleLayout());
        }
        if (this.y) {
            this.v.b(combinedTitleModuleLayout.getWarningMessageModuleLayout());
        }
        super.b(view);
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.w.size()) {
                this.w.get(i2).f();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bd, com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        this.f2668a.a(i, bundle);
    }

    @Override // com.google.android.finsky.detailspage.bd, com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        this.f2668a.b(i, bundle);
    }

    @Override // com.google.android.finsky.detailspage.be
    public final void a(String str, Object obj) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.w.size()) {
                this.w.get(i2).a_(str, obj);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.er
    public final void a(Bitmap bitmap) {
        this.f2668a.a(bitmap);
    }

    @Override // com.google.android.finsky.detailspage.er
    public final void a() {
        this.f2668a.a();
    }

    @Override // com.google.android.finsky.detailspage.be
    public final void a(bd bdVar, boolean z) {
        if (this.f2668a.W_()) {
            this.d.a((bd) this, false);
        }
    }

    @Override // com.google.android.finsky.detailspage.be
    public final void a(bd bdVar) {
        if (this.f2668a.W_()) {
            this.d.a((bd) this, false);
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final /* synthetic */ s Y_() {
        if (this.f2559b == 0) {
            this.f2559b = new s();
        }
        ((s) this.f2559b).f2669a = this.f2668a.Y_();
        ((s) this.f2559b).f2670b = this.u.Y_();
        ((s) this.f2559b).c = this.v.Y_();
        return (s) super.Y_();
    }
}
