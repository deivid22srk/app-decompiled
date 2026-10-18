package com.google.android.finsky.detailspage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.HeroGraphicView;
import com.google.android.finsky.protos.ol;
import com.google.android.finsky.protos.po;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.fe;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class aj extends bd<ak> implements View.OnClickListener, com.google.android.finsky.api.model.x, com.google.android.finsky.layout.play.cy, com.google.android.finsky.layout.s<com.google.android.play.layout.a> {

    /* renamed from: a, reason: collision with root package name */
    int f2537a = -1;
    private com.google.android.finsky.a.ai u = com.google.android.finsky.a.i.a(400);
    private boolean v;

    @Override // com.google.android.finsky.layout.s
    public final /* synthetic */ void a(com.google.android.play.layout.a aVar, int i) {
        String str;
        com.google.android.play.layout.a aVar2 = aVar;
        com.google.android.finsky.api.model.i iVar = ((ak) this.f2559b).f2539b;
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

    public aj() {
        this.v = !FinskyApp.a().e().a(12604101L);
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return ((ak) this.f2559b).c;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        if (this.f2559b == 0 || ((ak) this.f2559b).f2539b == null || !((ak) this.f2559b).f2539b.a() || ((com.google.android.finsky.api.model.d) ((ak) this.f2559b).f2539b).f1970a == null) {
            return false;
        }
        return ((ak) this.f2559b).f2539b.p() != 0 || ((com.google.android.finsky.api.model.d) ((ak) this.f2559b).f2539b).f1970a.an();
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void b(View view) {
        CardClusterModuleLayoutV2 cardClusterModuleLayoutV2;
        if ((view instanceof CardClusterModuleLayoutV2) && (cardClusterModuleLayoutV2 = (CardClusterModuleLayoutV2) view) != null) {
            if (((ak) this.f2559b).f == null) {
                ((ak) this.f2559b).f = new Bundle();
            } else {
                ((ak) this.f2559b).f.clear();
            }
            cardClusterModuleLayoutV2.a(((ak) this.f2559b).f);
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0 && ((ak) this.f2559b).f2539b != null && !((ak) this.f2559b).f2539b.a()) {
            ((ak) this.f2559b).f2539b.a(this);
            ((ak) this.f2559b).f2539b.q();
        } else if (W_()) {
            e();
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        ol[] o;
        if (z && this.f2559b == 0 && (o = document.o()) != null) {
            this.f2559b = new ak();
            ((ak) this.f2559b).f2538a = o[this.f2537a];
            ((ak) this.f2559b).f2539b = new com.google.android.finsky.api.model.i(this.f, ((ak) this.f2559b).f2538a.e, false);
            ((ak) this.f2559b).f2539b.a(this);
            ((ak) this.f2559b).f2539b.q();
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        com.google.android.finsky.protos.ds dsVar;
        switch (((ak) this.f2559b).c) {
            case R.layout.artist_card_cluster_module /* 2130968620 */:
            case R.layout.avatar_card_cluster_module /* 2130968622 */:
            case R.layout.book_series_cluster_module /* 2130968644 */:
            case R.layout.card_cluster_module /* 2130968651 */:
            case R.layout.featured_card_cluster_module /* 2130968749 */:
            case R.layout.featured_wide_card_cluster_module /* 2130968751 */:
            case R.layout.vertically_stacked_module /* 2130969176 */:
                CardClusterModuleLayout cardClusterModuleLayout = (CardClusterModuleLayout) view;
                int c = ((ak) this.f2559b).f2539b.c();
                Document document = ((com.google.android.finsky.api.model.d) ((ak) this.f2559b).f2539b).f1970a;
                cardClusterModuleLayout.a(this, c, !TextUtils.isEmpty(((ak) this.f2559b).f2538a.f4213a) ? ((ak) this.f2559b).f2538a.f4213a : document.f1963a.i, null, ik.a(this.c, document, cardClusterModuleLayout.a(((ak) this.f2559b).e), this, ((ak) this.f2559b).f2538a.g, true), ((ak) this.f2559b).e, this);
                break;
            case R.layout.card_cluster_module_v2 /* 2130968653 */:
                CardClusterModuleLayoutV2 cardClusterModuleLayoutV2 = (CardClusterModuleLayoutV2) view;
                int c2 = ((ak) this.f2559b).f2539b.c();
                Document document2 = ((com.google.android.finsky.api.model.d) ((ak) this.f2559b).f2539b).f1970a;
                cardClusterModuleLayoutV2.a(c2, !TextUtils.isEmpty(((ak) this.f2559b).f2538a.f4213a) ? ((ak) this.f2559b).f2538a.f4213a : document2.f1963a.i, ik.a(this.c, document2, cardClusterModuleLayoutV2.getMaxItemsPerPage(), this, ((ak) this.f2559b).f2538a.g, true), this, ((ak) this.f2559b).d, this, this.r, this.q, ((ak) this.f2559b).f, getParentNode(), document2.f1963a.R);
                break;
            case R.layout.creator_avatar_card_cluster_module /* 2130968672 */:
                CreatorAvatarCardClusterModuleLayout creatorAvatarCardClusterModuleLayout = (CreatorAvatarCardClusterModuleLayout) view;
                int c3 = ((ak) this.f2559b).f2539b.c();
                String str = !TextUtils.isEmpty(((ak) this.f2559b).f2538a.f4213a) ? ((ak) this.f2559b).f2538a.f4213a : ((com.google.android.finsky.api.model.d) ((ak) this.f2559b).f2539b).f1970a.f1963a.i;
                String string = this.c.getString(R.string.explore);
                Document document3 = new Document(((com.google.android.finsky.api.model.d) ((ak) this.f2559b).f2539b).f1970a.ao().f4014a);
                com.google.android.finsky.protos.ds dsVar2 = document3.c(14) ? document3.b(14).get(0) : null;
                if (dsVar2 == null) {
                    dsVar2 = document3.c(2) ? document3.b(2).get(0) : null;
                }
                creatorAvatarCardClusterModuleLayout.a(this, this.h, c3, str, string, ((ak) this.f2559b).e, document3.c(4) ? document3.b(4).get(0) : null, dsVar2, document3.Y() ? document3.Z() : null, this, this.i.a(document3, this));
                break;
            case R.layout.creator_avatar_card_cluster_module_v2 /* 2130968673 */:
                CreatorAvatarCardClusterModuleLayoutV2 creatorAvatarCardClusterModuleLayoutV2 = (CreatorAvatarCardClusterModuleLayoutV2) view;
                String str2 = !TextUtils.isEmpty(((ak) this.f2559b).f2538a.f4213a) ? ((ak) this.f2559b).f2538a.f4213a : ((com.google.android.finsky.api.model.d) ((ak) this.f2559b).f2539b).f1970a.f1963a.i;
                String string2 = this.c.getString(R.string.more);
                Document document4 = new Document(((com.google.android.finsky.api.model.d) ((ak) this.f2559b).f2539b).f1970a.ao().f4014a);
                com.google.android.finsky.protos.ds dsVar3 = document4.c(14) ? document4.b(14).get(0) : null;
                if (dsVar3 == null) {
                    dsVar = document4.c(2) ? document4.b(2).get(0) : null;
                } else {
                    dsVar = dsVar3;
                }
                com.google.android.finsky.protos.ds dsVar4 = document4.c(4) ? document4.b(4).get(0) : null;
                com.google.android.play.image.e eVar = this.h;
                int p = ((ak) this.f2559b).f2539b.p();
                int i = document4.f1963a.e;
                String str3 = document4.f1963a.f3890a;
                View.OnClickListener a2 = this.i.a(document4, this, (String) null, -1, creatorAvatarCardClusterModuleLayoutV2);
                creatorAvatarCardClusterModuleLayoutV2.g = Math.min(creatorAvatarCardClusterModuleLayoutV2.f - 2, p);
                if (dsVar != null) {
                    if (dsVar.e != null && dsVar.e.f3751b && dsVar.e.d) {
                        creatorAvatarCardClusterModuleLayoutV2.h = dsVar.e.f3750a / dsVar.e.c;
                    } else {
                        creatorAvatarCardClusterModuleLayoutV2.h = HeroGraphicView.a(i);
                    }
                    creatorAvatarCardClusterModuleLayoutV2.c.a(dsVar.f, dsVar.l, eVar);
                    creatorAvatarCardClusterModuleLayoutV2.c.setVisibility(0);
                } else {
                    creatorAvatarCardClusterModuleLayoutV2.c.setVisibility(8);
                }
                creatorAvatarCardClusterModuleLayoutV2.c.setColorFilter(android.support.v4.c.a.b(creatorAvatarCardClusterModuleLayoutV2.i, 115));
                creatorAvatarCardClusterModuleLayoutV2.f2494b.setBackgroundColor(creatorAvatarCardClusterModuleLayoutV2.i);
                creatorAvatarCardClusterModuleLayoutV2.e.setText(str2);
                if (TextUtils.isEmpty(string2)) {
                    creatorAvatarCardClusterModuleLayoutV2.d.setVisibility(8);
                } else {
                    creatorAvatarCardClusterModuleLayoutV2.d.setText(string2.toUpperCase());
                    creatorAvatarCardClusterModuleLayoutV2.d.setVisibility(0);
                }
                if (dsVar4 != null) {
                    creatorAvatarCardClusterModuleLayoutV2.f2493a.a(dsVar4.f, dsVar4.l, eVar);
                    creatorAvatarCardClusterModuleLayoutV2.f2493a.setVisibility(0);
                } else {
                    creatorAvatarCardClusterModuleLayoutV2.f2493a.setVisibility(8);
                }
                if (com.google.android.finsky.navigationmanager.b.h()) {
                    creatorAvatarCardClusterModuleLayoutV2.setTransitionName("transition_generic_circle::" + str3);
                }
                creatorAvatarCardClusterModuleLayoutV2.a();
                creatorAvatarCardClusterModuleLayoutV2.b(this);
                creatorAvatarCardClusterModuleLayoutV2.a(this);
                creatorAvatarCardClusterModuleLayoutV2.setOnClickListener(a2);
                creatorAvatarCardClusterModuleLayoutV2.setClickable(a2 != null);
                break;
            default:
                FinskyLog.e("Unrecognized layoutResId", new Object[0]);
                break;
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        if (this.f2559b != 0 && ((ak) this.f2559b).f2539b != null) {
            ((ak) this.f2559b).f2539b.b((com.google.android.finsky.api.model.x) this);
        }
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (!W_()) {
            return;
        }
        Document document = ((com.google.android.finsky.api.model.d) ((ak) this.f2559b).f2539b).f1970a;
        if (document.f1963a.R != null) {
            com.google.android.finsky.a.i.a(this.u, document.f1963a.R);
        }
        e();
        this.d.a((bd) this, false);
    }

    private void e() {
        Document document = ((com.google.android.finsky.api.model.d) ((ak) this.f2559b).f2539b).f1970a;
        if (document.an()) {
            if (document.f1963a.g == 1 && !FinskyApp.a().e().a(12603140L)) {
                ((ak) this.f2559b).c = R.layout.creator_avatar_card_cluster_module;
                return;
            } else {
                ((ak) this.f2559b).c = R.layout.creator_avatar_card_cluster_module_v2;
                return;
            }
        }
        if ((document.aJ() == null || document.aJ().F == null) ? false : true) {
            if (this.v) {
                ((ak) this.f2559b).c = R.layout.card_cluster_module_v2;
                ((ak) this.f2559b).d = R.layout.play_card_artist;
                return;
            } else {
                ((ak) this.f2559b).c = R.layout.artist_card_cluster_module;
                ((ak) this.f2559b).e = 2;
                return;
            }
        }
        if ((document.aJ() == null || document.aJ().D == null) ? false : true) {
            ((ak) this.f2559b).c = R.layout.card_cluster_module;
            ((ak) this.f2559b).e = 2;
            return;
        }
        if ((document.aJ() == null || document.aJ().E == null) ? false : true) {
            if (HeroGraphicView.c(((ak) this.f2559b).f2539b.c(0)) != null) {
                if (ik.e(this.c.getResources()) >= 4) {
                    ((ak) this.f2559b).c = R.layout.featured_wide_card_cluster_module;
                    return;
                } else {
                    ((ak) this.f2559b).c = R.layout.featured_card_cluster_module;
                    return;
                }
            }
            ((ak) this.f2559b).c = R.layout.card_cluster_module;
            return;
        }
        if (document.am()) {
            if (this.v) {
                ((ak) this.f2559b).c = R.layout.card_cluster_module_v2;
                ((ak) this.f2559b).d = R.layout.play_card_avatar;
                return;
            } else {
                ((ak) this.f2559b).c = R.layout.avatar_card_cluster_module;
                return;
            }
        }
        po aJ = document.aJ();
        if ((aJ == null || aJ.R == null) ? false : true) {
            if (this.v) {
                ((ak) this.f2559b).c = R.layout.card_cluster_module_v2;
                ((ak) this.f2559b).d = R.layout.play_card_medium;
                return;
            } else {
                ((ak) this.f2559b).c = R.layout.card_cluster_module;
                return;
            }
        }
        com.google.android.finsky.api.model.i iVar = ((ak) this.f2559b).f2539b;
        if (iVar.p() > 0 && iVar.c(0).f1963a.e == 44) {
            if (this.v) {
                ((ak) this.f2559b).c = R.layout.card_cluster_module_v2;
                ((ak) this.f2559b).d = R.layout.play_card_small;
                return;
            } else {
                ((ak) this.f2559b).c = R.layout.book_series_cluster_module;
                return;
            }
        }
        po aJ2 = document.aJ();
        if ((aJ2 == null || aJ2.Q == null) ? false : true) {
            ((ak) this.f2559b).e = this.c.getResources().getInteger(R.integer.vertical_cluster_max_rows);
            ((ak) this.f2559b).c = R.layout.vertically_stacked_module;
            ((ak) this.f2559b).d = R.layout.play_card_wide;
        } else {
            if (this.v) {
                ((ak) this.f2559b).c = R.layout.card_cluster_module_v2;
                boolean z = this.c.getResources().getBoolean(R.bool.play_can_use_mini_cards) && FinskyApp.a().e().a(12604267L);
                ((ak) this.f2559b).d = z ? R.layout.play_card_mini : R.layout.play_card_small;
                return;
            }
            ((ak) this.f2559b).c = R.layout.card_cluster_module;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.i.a(((ak) this.f2559b).f2538a.g, (String) null, ((ak) this.f2559b).f2539b.c(), this.e, this);
    }

    @Override // com.google.android.finsky.layout.s
    public final String a() {
        return ((ak) this.f2559b).f2539b.d;
    }

    @Override // com.google.android.finsky.layout.s
    public final int b() {
        return ((ak) this.f2559b).d;
    }

    @Override // com.google.android.finsky.layout.s
    public final boolean X_() {
        return false;
    }

    @Override // com.google.android.finsky.layout.s
    public final int d() {
        return ((ak) this.f2559b).f2539b.p();
    }

    @Override // com.google.android.finsky.layout.s
    public final float a(int i) {
        com.google.android.finsky.api.model.i iVar = ((ak) this.f2559b).f2539b;
        Document c = i < iVar.p() ? iVar.c(i) : null;
        if (c != null) {
            return com.google.android.finsky.layout.play.as.b(c.f1963a.e);
        }
        return 0.0f;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.u;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.layout.play.cy getParentNode() {
        return this.s;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
