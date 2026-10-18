package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class PlayCardBannerWithContentClusterView extends PlayCardClusterView {
    public PlayCardBannerWithContentClusterView(Context context) {
        this(context, null);
    }

    public PlayCardBannerWithContentClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 422;
    }

    public final void a(com.google.android.play.image.e eVar, ds dsVar, String str, View.OnClickListener onClickListener) {
        PlayCardBannerWithContentClusterViewContent playCardBannerWithContentClusterViewContent = (PlayCardBannerWithContentClusterViewContent) this.f3308a;
        playCardBannerWithContentClusterViewContent.f3306a.setBackgroundColor(ik.a(dsVar, playCardBannerWithContentClusterViewContent.d));
        playCardBannerWithContentClusterViewContent.f3306a.a(dsVar.f, dsVar.l, eVar);
        playCardBannerWithContentClusterViewContent.f3306a.setOnClickListener(onClickListener);
        playCardBannerWithContentClusterViewContent.f3306a.setClickable(onClickListener != null);
        playCardBannerWithContentClusterViewContent.f3306a.setContentDescription(onClickListener != null ? str : null);
        playCardBannerWithContentClusterViewContent.f3307b.setText(str);
        playCardBannerWithContentClusterViewContent.c.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, com.google.android.finsky.layout.play.ci, com.google.android.finsky.adapters.ap
    public final void ab_() {
        super.ab_();
        ((PlayCardBannerWithContentClusterViewContent) this.f3308a).ab_();
    }
}
