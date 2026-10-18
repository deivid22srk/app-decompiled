package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.gx;

/* loaded from: classes.dex */
public class PlayCardActionBannerClusterView extends PlayCardClusterView {
    private final int e;

    public PlayCardActionBannerClusterView(Context context) {
        this(context, null);
    }

    public PlayCardActionBannerClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.play_merch_content_vmargin);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 414;
    }

    public final void a(com.google.android.finsky.navigationmanager.b bVar, com.google.android.play.image.e eVar, Document document, gx gxVar, gx[] gxVarArr, String str, cy cyVar, View.OnClickListener onClickListener) {
        PlayCardActionBannerClusterViewContent playCardActionBannerClusterViewContent = (PlayCardActionBannerClusterViewContent) this.f3308a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) playCardActionBannerClusterViewContent.getLayoutParams();
        marginLayoutParams.topMargin = this.e;
        marginLayoutParams.bottomMargin = this.e;
        playCardActionBannerClusterViewContent.f = document;
        playCardActionBannerClusterViewContent.f3304a.a(gxVar, gxVarArr, bVar, cyVar);
        ds dsVar = playCardActionBannerClusterViewContent.f.b(14).get(0);
        playCardActionBannerClusterViewContent.f3305b.a(dsVar.f, dsVar.l, eVar);
        playCardActionBannerClusterViewContent.f3305b.setOnClickListener(onClickListener);
        playCardActionBannerClusterViewContent.f3305b.setContentDescription(str);
        android.support.v4.view.by.c((View) playCardActionBannerClusterViewContent.f3305b, 2);
        playCardActionBannerClusterViewContent.c.setText(document.f1963a.i);
        playCardActionBannerClusterViewContent.d.setText(document.f1963a.k);
        if (str != null) {
            playCardActionBannerClusterViewContent.e.setVisibility(0);
            playCardActionBannerClusterViewContent.e.setText(str);
            playCardActionBannerClusterViewContent.e.setOnClickListener(onClickListener);
        } else {
            playCardActionBannerClusterViewContent.e.setVisibility(8);
        }
        e();
    }
}
