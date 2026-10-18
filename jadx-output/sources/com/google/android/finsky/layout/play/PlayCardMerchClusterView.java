package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.layout.FadingEdgeImageView;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class PlayCardMerchClusterView extends PlayCardClusterView {
    private final int e;
    private final int f;

    public PlayCardMerchClusterView(Context context) {
        this(context, null);
    }

    public PlayCardMerchClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.play_merch_content_vmargin);
        this.f = resources.getDimensionPixelSize(R.dimen.play_merch_content_vpadding);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 407;
    }

    public final void a(com.google.android.play.image.e eVar, int i, ds dsVar, String str, View.OnClickListener onClickListener) {
        PlayCardMerchClusterViewContent playCardMerchClusterViewContent = (PlayCardMerchClusterViewContent) this.f3308a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) playCardMerchClusterViewContent.getLayoutParams();
        marginLayoutParams.topMargin = this.e;
        marginLayoutParams.bottomMargin = this.e;
        playCardMerchClusterViewContent.setCardContentVerticalPadding(this.f);
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Merch image position " + i + " is not supported");
        }
        playCardMerchClusterViewContent.f3323b = ik.a(dsVar, playCardMerchClusterViewContent.c);
        playCardMerchClusterViewContent.d = i;
        playCardMerchClusterViewContent.f3322a.setOnLoadedListener(playCardMerchClusterViewContent);
        playCardMerchClusterViewContent.f3322a.a(dsVar.f, dsVar.l, eVar);
        if (playCardMerchClusterViewContent.f3322a.getDrawable() != null) {
            playCardMerchClusterViewContent.c();
        } else {
            playCardMerchClusterViewContent.f3322a.b();
        }
        playCardMerchClusterViewContent.f3322a.setOnClickListener(onClickListener);
        playCardMerchClusterViewContent.f3322a.setClickable(onClickListener != null);
        FadingEdgeImageView fadingEdgeImageView = playCardMerchClusterViewContent.f3322a;
        if (onClickListener == null) {
            str = null;
        }
        fadingEdgeImageView.setContentDescription(str);
        playCardMerchClusterViewContent.setBackgroundColor(playCardMerchClusterViewContent.f3323b);
    }

    public final void d() {
        PlayCardMerchClusterViewContent playCardMerchClusterViewContent = (PlayCardMerchClusterViewContent) this.f3308a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) playCardMerchClusterViewContent.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        playCardMerchClusterViewContent.setCardContentVerticalPadding(0);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, com.google.android.finsky.layout.play.ci, com.google.android.finsky.adapters.ap
    public final void ab_() {
        super.ab_();
        ((PlayCardMerchClusterViewContent) this.f3308a).ab_();
    }
}
