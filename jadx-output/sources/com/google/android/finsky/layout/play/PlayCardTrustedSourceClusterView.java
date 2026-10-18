package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;

/* loaded from: classes.dex */
public class PlayCardTrustedSourceClusterView extends PlayCardClusterView {
    private final int e;

    public PlayCardTrustedSourceClusterView(Context context) {
        this(context, null);
    }

    public PlayCardTrustedSourceClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.play_merch_content_vmargin);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 411;
    }

    public final void a(com.google.android.finsky.navigationmanager.b bVar, com.google.android.play.image.e eVar, Document document, cy cyVar) {
        PlayCardTrustedSourceClusterViewContent playCardTrustedSourceClusterViewContent = (PlayCardTrustedSourceClusterViewContent) this.f3308a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) playCardTrustedSourceClusterViewContent.getLayoutParams();
        marginLayoutParams.topMargin = this.e;
        marginLayoutParams.bottomMargin = this.e;
        playCardTrustedSourceClusterViewContent.f = document;
        View.OnClickListener a2 = bVar.a(playCardTrustedSourceClusterViewContent.f, cyVar);
        playCardTrustedSourceClusterViewContent.f3337a.a(playCardTrustedSourceClusterViewContent.f.f1963a, a2, eVar);
        ds dsVar = playCardTrustedSourceClusterViewContent.f.b(15).get(0);
        playCardTrustedSourceClusterViewContent.f3338b.a(dsVar.f, dsVar.l, eVar);
        playCardTrustedSourceClusterViewContent.f3338b.setOnClickListener(a2);
        playCardTrustedSourceClusterViewContent.f3338b.setContentDescription(playCardTrustedSourceClusterViewContent.f3337a.getContentDescription());
        playCardTrustedSourceClusterViewContent.c.setText(document.f1963a.i);
        playCardTrustedSourceClusterViewContent.d.setText(document.f1963a.k);
        playCardTrustedSourceClusterViewContent.e.a(document, FinskyApp.a().j(), cyVar);
        e();
    }
}
