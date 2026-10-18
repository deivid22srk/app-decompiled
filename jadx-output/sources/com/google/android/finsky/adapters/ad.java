package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.bs;
import com.google.android.finsky.layout.play.PlayCardClusterViewV2;
import com.google.android.finsky.layout.play.PlayHighlightsBannerItemView;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class ad implements bs, com.google.android.finsky.layout.s<PlayHighlightsBannerItemView> {

    /* renamed from: a, reason: collision with root package name */
    public af f1885a;

    /* renamed from: b, reason: collision with root package name */
    private final Document f1886b;
    private final com.google.android.finsky.api.model.i c;
    private final PlayCardClusterViewV2 d;
    private final int e;
    private final int f;
    private final Context g;
    private final com.google.android.play.image.e h;
    private final com.google.android.finsky.navigationmanager.b i;
    private final float j;

    @Override // com.google.android.finsky.layout.s
    public final /* synthetic */ void a(PlayHighlightsBannerItemView playHighlightsBannerItemView, int i) {
        PlayHighlightsBannerItemView playHighlightsBannerItemView2 = playHighlightsBannerItemView;
        Document c = this.c.c(b(i));
        com.google.android.play.image.e eVar = this.h;
        float f = this.j;
        com.google.android.finsky.navigationmanager.b bVar = this.i;
        cy parentOfChildren = this.d.getParentOfChildren();
        String str = this.f1886b.f1963a.f3890a;
        ae aeVar = new ae(this, i);
        if (playHighlightsBannerItemView2.f3351b != null) {
            playHighlightsBannerItemView2.f3351b.setText(c.f1963a.i);
        }
        if (playHighlightsBannerItemView2.c != null) {
            playHighlightsBannerItemView2.c.setText(c.f1963a.k);
        }
        if (playHighlightsBannerItemView2.f != null) {
            playHighlightsBannerItemView2.f.setVisibility((TextUtils.isEmpty(c.f1963a.i) && TextUtils.isEmpty(c.f1963a.k)) ? 8 : 0);
        }
        playHighlightsBannerItemView2.g.setOnLoadedListener(playHighlightsBannerItemView2);
        playHighlightsBannerItemView2.h = aeVar;
        playHighlightsBannerItemView2.g.a(c, eVar, PlayHighlightsBannerItemView.f3350a);
        if (playHighlightsBannerItemView2.d != null && !playHighlightsBannerItemView2.g.c()) {
            ik.a(playHighlightsBannerItemView2.d, (Drawable) null);
            ik.a(playHighlightsBannerItemView2.e, (Drawable) null);
        }
        if (com.google.android.finsky.navigationmanager.b.h()) {
            PlayHighlightsBannerItemView.l.setLength(26);
            PlayHighlightsBannerItemView.l.append(c.f1963a.f3890a);
            PlayHighlightsBannerItemView.l.append(':');
            PlayHighlightsBannerItemView.l.append(str);
            playHighlightsBannerItemView2.g.setTransitionName(PlayHighlightsBannerItemView.l.toString());
            playHighlightsBannerItemView2.setTransitionGroup(true);
        }
        playHighlightsBannerItemView2.i = f;
        if (bVar != null) {
            playHighlightsBannerItemView2.setOnClickListener(bVar.a(c, playHighlightsBannerItemView2, (String) null, -1, playHighlightsBannerItemView2.g));
        }
        com.google.android.finsky.a.i.a(playHighlightsBannerItemView2.j, c.f1963a.R);
        playHighlightsBannerItemView2.k = parentOfChildren;
        playHighlightsBannerItemView2.getParentNode().a(playHighlightsBannerItemView2);
        playHighlightsBannerItemView2.setContentDescription(playHighlightsBannerItemView2.getContext().getString(R.string.content_description_featured_prefix) + "\n" + c.f1963a.i + "\n" + c.f1963a.k);
    }

    public ad(Context context, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, Document document, com.google.android.finsky.api.model.i iVar, PlayCardClusterViewV2 playCardClusterViewV2, float f) {
        this.f1886b = document;
        this.c = iVar;
        this.d = playCardClusterViewV2;
        this.g = context;
        this.h = eVar;
        this.i = bVar;
        this.j = f;
        Resources resources = context.getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.highlight_banner_item_width);
        this.f = resources.getDimensionPixelSize(R.dimen.highlight_banner_item_height);
    }

    @Override // com.google.android.finsky.layout.s
    public final String a() {
        return this.f1886b.f1963a.f3890a;
    }

    @Override // com.google.android.finsky.layout.s
    public final int b() {
        return R.layout.play_highlights_banner_fullbleed_item;
    }

    @Override // com.google.android.finsky.layout.s
    public final boolean X_() {
        return this.c.m;
    }

    @Override // com.google.android.finsky.layout.s
    public final int d() {
        return this.c.p() == 0 ? 0 : 200000000;
    }

    @Override // com.google.android.finsky.layout.s
    public final float a(int i) {
        return com.google.android.finsky.layout.play.as.b(this.c.a(b(i), false).f1963a.e);
    }

    @Override // com.google.android.finsky.layout.bs
    public final void a(AccessibilityEvent accessibilityEvent, int i, int i2) {
        android.support.v4.view.a.aj a2 = android.support.v4.view.a.a.a(accessibilityEvent);
        int p = this.c.p();
        a2.a(p);
        if (p > 0) {
            a2.b(b(i));
            a2.c(b(i2));
        }
    }

    @Override // com.google.android.finsky.layout.bs
    public final int e() {
        int p = this.c.p();
        if (p > 0) {
            return p * (100000000 / p);
        }
        return 0;
    }

    public final int b(int i) {
        int p = this.c.p();
        if (p > 0) {
            return i % p;
        }
        return 0;
    }

    @Override // com.google.android.finsky.layout.s
    public final /* bridge */ /* synthetic */ float a_(PlayHighlightsBannerItemView playHighlightsBannerItemView) {
        return this.f / this.e;
    }
}
