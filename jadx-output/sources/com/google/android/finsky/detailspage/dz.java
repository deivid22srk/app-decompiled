package com.google.android.finsky.detailspage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ol;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.fe;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public abstract class dz extends eb<ea> implements View.OnClickListener, com.google.android.finsky.layout.play.cy, com.google.android.finsky.layout.s<com.google.android.play.layout.a> {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f2632a;
    private com.google.android.finsky.a.ai u = com.google.android.finsky.a.i.a(400);

    protected abstract ol b(Document document);

    @Override // com.google.android.finsky.layout.s
    public final /* synthetic */ void a(com.google.android.play.layout.a aVar, int i) {
        String str;
        com.google.android.play.layout.a aVar2 = aVar;
        com.google.android.finsky.api.model.i iVar = ((ea) this.f2559b).f;
        Document c = i < iVar.p() ? iVar.c(i) : null;
        if (c != null) {
            if (((com.google.android.finsky.api.model.d) iVar).f1970a != null) {
                str = ((com.google.android.finsky.api.model.d) iVar).f1970a.f1963a.f3890a;
            } else {
                str = iVar.d;
            }
            fe.a(aVar2, c, str, this.h, this.i, this);
            return;
        }
        aVar2.d();
    }

    @Override // com.google.android.finsky.layout.s
    public final /* synthetic */ float a_(com.google.android.play.layout.a aVar) {
        return com.google.android.finsky.layout.play.as.b(((Document) aVar.getData()).f1963a.e);
    }

    public dz() {
        this.f2632a = !FinskyApp.a().e().a(12604101L);
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return this.f2632a ? R.layout.card_cluster_module_v2 : R.layout.card_cluster_module;
    }

    @Override // com.google.android.finsky.detailspage.eb, com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return super.W_() && ((ea) this.f2559b).f.p() != 0;
    }

    protected boolean h() {
        return false;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        Document document = ((com.google.android.finsky.api.model.d) ((ea) this.f2559b).f).f1970a;
        String str = !TextUtils.isEmpty(((ea) this.f2559b).f2633a.f4213a) ? ((ea) this.f2559b).f2633a.f4213a : document.f1963a.i;
        if (view instanceof CardClusterModuleLayout) {
            CardClusterModuleLayout cardClusterModuleLayout = (CardClusterModuleLayout) view;
            cardClusterModuleLayout.a(this, ((ea) this.f2559b).f.c(), str, null, ik.a(this.c, document, cardClusterModuleLayout.a(1), this, ((ea) this.f2559b).f2633a.g, true), ((ea) this.f2559b).f2634b, this);
        } else {
            CardClusterModuleLayoutV2 cardClusterModuleLayoutV2 = (CardClusterModuleLayoutV2) view;
            cardClusterModuleLayoutV2.a(((ea) this.f2559b).f.c(), str, ik.a(this.c, document, cardClusterModuleLayoutV2.getMaxItemsPerPage(), this, ((ea) this.f2559b).f2633a.g, true), this, ((ea) this.f2559b).c, this, this.r, this.q, ((ea) this.f2559b).d, getParentNode(), document.f1963a.R);
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void b(View view) {
        CardClusterModuleLayoutV2 cardClusterModuleLayoutV2;
        if ((view instanceof CardClusterModuleLayoutV2) && (cardClusterModuleLayoutV2 = (CardClusterModuleLayoutV2) view) != null) {
            if (((ea) this.f2559b).d == null) {
                ((ea) this.f2559b).d = new Bundle();
            } else {
                ((ea) this.f2559b).d.clear();
            }
            cardClusterModuleLayoutV2.a(((ea) this.f2559b).d);
        }
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (((ea) this.f2559b).f.p() != 0) {
            this.d.a((bd) this, false);
        }
        Document document = ((com.google.android.finsky.api.model.d) ((ea) this.f2559b).f).f1970a;
        if (document != null && document.f1963a.R != null) {
            com.google.android.finsky.a.i.a(this.u, document.f1963a.R);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!W_()) {
            FinskyLog.e("Module is not ready to handle click", new Object[0]);
        } else {
            this.i.a(((ea) this.f2559b).f2633a.g, (String) null, ((ea) this.f2559b).f.c(), this.e, this);
        }
    }

    @Override // com.google.android.finsky.layout.s
    public final String a() {
        return ((ea) this.f2559b).f.d;
    }

    @Override // com.google.android.finsky.layout.s
    public final int b() {
        return ((ea) this.f2559b).c;
    }

    @Override // com.google.android.finsky.layout.s
    public final boolean X_() {
        return false;
    }

    @Override // com.google.android.finsky.layout.s
    public final int d() {
        return ((ea) this.f2559b).f.p();
    }

    @Override // com.google.android.finsky.layout.s
    public final float a(int i) {
        com.google.android.finsky.api.model.i iVar = ((ea) this.f2559b).f;
        Document c = i < iVar.p() ? iVar.c(i) : null;
        if (c != null) {
            return com.google.android.finsky.layout.play.as.b(c.f1963a.e);
        }
        return 0.0f;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.u;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.s;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }

    @Override // com.google.android.finsky.detailspage.eb
    protected final /* synthetic */ ea a(Document document) {
        ol b2 = b(document);
        if (b2 != null && !TextUtils.isEmpty(b2.e)) {
            ea eaVar = new ea();
            eaVar.e = b2.e;
            eaVar.f2633a = b2;
            eaVar.c = this.c.getResources().getBoolean(R.bool.play_can_use_mini_cards) && FinskyApp.a().e().a(12604267L) ? R.layout.play_card_mini : R.layout.play_card_small;
            eaVar.f2634b = h() ? 2 : 1;
            return eaVar;
        }
        return null;
    }
}
