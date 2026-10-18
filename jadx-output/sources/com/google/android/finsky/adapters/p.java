package com.google.android.finsky.adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.eg;
import android.support.v7.widget.eq;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gq;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.layout.play.PlayCardClusterViewV2;
import com.google.android.finsky.layout.play.PlayCardMerchClusterViewV2;
import com.google.android.finsky.layout.play.PlayQuickLinksBannerViewV2;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.layout.play.PlayYoutubeCardContentView;
import com.google.android.finsky.layout.play.TopChartsClusterContentView;
import com.google.android.finsky.layout.play.bg;
import com.google.android.finsky.layout.play.ci;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.utils.ik;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class p<T extends com.google.android.finsky.api.model.d<?>> extends CardRecyclerViewAdapter<T> {
    private com.google.android.finsky.layout.u A;
    private final int x;
    private eg y;
    private Map<String, Bundle> z;

    public p(Context context, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, DfeToc dfeToc, com.google.android.finsky.utils.ac acVar, com.google.android.finsky.api.model.s<T> sVar, com.google.android.finsky.protos.ba[] baVarArr, String str, boolean z, boolean z2, int i, cy cyVar, gq gqVar, boolean z3) {
        super(context, bVar, bVar2, eVar, dfeToc, acVar, sVar, baVarArr, str, z, z2, i, cyVar, gqVar, z3);
        FinskyApp.a().e();
        this.x = R.layout.play_quicklinks_banner_pill_item;
        this.z = new HashMap();
        this.A = new com.google.android.finsky.layout.u(context);
        if (this.p) {
            this.A = new com.google.android.finsky.layout.u(context);
        }
        if (!z) {
            this.m.clear();
            n();
        }
    }

    private static String a(String str) {
        return "CardRecyclerViewAdapterV2.rowClusterScrollStatePrefix." + str;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final View c(ViewGroup viewGroup) {
        return !this.p ? super.c(viewGroup) : a(R.layout.play_card_cluster_v2, viewGroup, false);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final View d(ViewGroup viewGroup) {
        return !this.p ? super.d(viewGroup) : a(R.layout.play_card_merch_cluster_v2, viewGroup, false);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final View e(ViewGroup viewGroup) {
        return !this.p ? super.e(viewGroup) : a(R.layout.play_card_cluster_v2, viewGroup, false);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected void b(int i, eq eqVar) {
        if (!this.p) {
            super.b(i, eqVar);
            return;
        }
        Document a2 = this.r.a(i);
        int b2 = b(a2);
        int i2 = this.i && FinskyApp.a().e().a(12604267L) ? R.layout.play_card_mini : R.layout.play_card_small;
        if (b2 >= 2) {
            i2 = R.layout.play_card_medium;
        }
        a(a2, eqVar, i2);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void d(int i, eq eqVar) {
        if (!this.p) {
            super.d(i, eqVar);
            return;
        }
        Document a2 = this.r.a(i);
        a(a2, eqVar, R.layout.play_card_small);
        PlayCardMerchClusterViewV2 playCardMerchClusterViewV2 = (PlayCardMerchClusterViewV2) eqVar.f795a;
        com.google.android.play.image.e eVar = this.c;
        ds dsVar = a2.b(14).get(0);
        String str = a2.f1963a.i;
        View.OnClickListener a3 = a(a2, playCardMerchClusterViewV2.getPlayStoreUiElementNode());
        playCardMerchClusterViewV2.d = ik.a(dsVar, playCardMerchClusterViewV2.e);
        playCardMerchClusterViewV2.c.setVisibility(0);
        playCardMerchClusterViewV2.c.setOnLoadedListener(playCardMerchClusterViewV2);
        playCardMerchClusterViewV2.c.a(dsVar.f, dsVar.l, eVar);
        if (playCardMerchClusterViewV2.c.getDrawable() != null) {
            playCardMerchClusterViewV2.c();
        } else {
            playCardMerchClusterViewV2.c.b();
        }
        playCardMerchClusterViewV2.c.setOnClickListener(a3);
        playCardMerchClusterViewV2.c.setClickable(a3 != null);
        playCardMerchClusterViewV2.c.setContentDescription(a3 != null ? str : null);
        playCardMerchClusterViewV2.f3324b.setVisibility(0);
        playCardMerchClusterViewV2.f3324b.setBackgroundColor(playCardMerchClusterViewV2.d);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void c(int i, eq eqVar) {
        if (!this.p) {
            super.c(i, eqVar);
        } else {
            a(this.r.a(i), eqVar, R.layout.play_card_avatar);
        }
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void c(View view) {
        ((PlayQuickLinksBannerViewV2) view).a(this.c, this.g, this.u, this.k, this.e, this.z.get("CardRecyclerViewAdapterV2.quickLinksScrollState"));
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final void a(eq eqVar) {
        View view = eqVar.f795a;
        g(view);
        if (view instanceof PlayCardClusterViewV2) {
            PlayCardClusterViewV2 playCardClusterViewV2 = (PlayCardClusterViewV2) view;
            com.google.android.finsky.api.model.i a2 = this.r.a(playCardClusterViewV2.getContentId());
            if (a2 != null) {
                a2.b((com.google.android.finsky.api.model.x) playCardClusterViewV2);
            }
        }
        super.a(eqVar);
    }

    private void g(View view) {
        String str;
        if (view instanceof PlayCardClusterViewV2) {
            str = a(((PlayCardClusterViewV2) view).getContentId());
        } else if (view instanceof PlayQuickLinksBannerViewV2) {
            str = "CardRecyclerViewAdapterV2.quickLinksScrollState";
        } else {
            return;
        }
        Bundle bundle = this.z.get(str);
        if (bundle != null) {
            bundle.clear();
        } else {
            bundle = new Bundle();
        }
        ((ci) view).a(bundle);
        this.z.put(str, bundle);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, com.google.android.finsky.adapters.ac
    public final void a(PlayRecyclerView playRecyclerView, Bundle bundle) {
        super.a(playRecyclerView, bundle);
        Iterator<eq> it = this.q.iterator();
        while (it.hasNext()) {
            g(it.next().f795a);
        }
        for (Map.Entry<String, Bundle> entry : this.z.entrySet()) {
            bundle.putBundle(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, com.google.android.finsky.adapters.ac
    public final void b(PlayRecyclerView playRecyclerView, Bundle bundle) {
        this.z.clear();
        for (String str : bundle.keySet()) {
            if (str.startsWith("CardRecyclerViewAdapterV2.rowClusterScrollStatePrefix.") || str.equals("CardRecyclerViewAdapterV2.quickLinksScrollState")) {
                this.z.put(str, bundle.getBundle(str));
            }
        }
        super.b(playRecyclerView, bundle);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final View b(ViewGroup viewGroup) {
        return !this.p ? super.b(viewGroup) : c(viewGroup);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected void a(int i, eq eqVar) {
        if (!this.p) {
            super.a(i, eqVar);
        } else {
            b(i, eqVar);
        }
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void a(int i, View view) {
        if (!this.p) {
            super.a(i, view);
            return;
        }
        bg bgVar = (bg) view;
        Document a2 = this.r.a(i);
        bgVar.a(a2, this.c, this.u, this.e, d(view), 426, R.drawable.ic_cluster_trending, Integer.valueOf(com.google.android.finsky.utils.ai.a(this.t, a2.f1963a.g)), false);
        bgVar.setContentHorizontalPadding(this.d);
        ((TopChartsClusterContentView) bgVar.findViewById(R.id.top_charts_cluster_content_id)).a(a2, this.c, this.f, this.k, this.u, bgVar.getParentOfChildren());
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void b(int i, View view) {
        if (!this.p) {
            super.b(i, view);
            return;
        }
        bg bgVar = (bg) view;
        Document a2 = this.r.a(i);
        bgVar.a(a2, this.c, this.u, this.e, d(view), 427, R.drawable.ic_cluster_youtube, Integer.valueOf(this.t.getResources().getColor(R.color.play_youtube_cluster_icon_background)), false);
        bgVar.setContentHorizontalPadding(this.d);
        ((PlayYoutubeCardContentView) bgVar.findViewById(R.id.video_card_container)).a(a2, this.c, bgVar.getParentOfChildren());
    }

    protected final void a(Document document, eq eqVar, int i) {
        if (this.y == null) {
            this.y = new eg();
        }
        this.y.a(i, 50);
        PlayCardClusterViewV2 playCardClusterViewV2 = (PlayCardClusterViewV2) eqVar.f795a;
        playCardClusterViewV2.a(this.d);
        com.google.android.finsky.api.model.i a2 = this.r.a(document.f1963a.f3890a);
        a2.a(playCardClusterViewV2);
        q qVar = new q(this, document, i, a2, playCardClusterViewV2);
        playCardClusterViewV2.a(qVar, this.A.a(i), this.h, this.y, this.z.get(a(qVar.a())), this.e, document == null ? null : document.f1963a.R);
        if (playCardClusterViewV2.f()) {
            ds dsVar = document.m() ? document.f1963a.y.n : null;
            View.OnClickListener a3 = a(document, playCardClusterViewV2.getPlayStoreUiElementNode());
            playCardClusterViewV2.a(document.f1963a.g, document.f1963a.i, document.f1963a.k, a(this.t, document, document.a(), a3), a3, this.d, dsVar, this.c);
        }
        playCardClusterViewV2.setIdentifier(document.f1963a.f3890a);
    }
}
