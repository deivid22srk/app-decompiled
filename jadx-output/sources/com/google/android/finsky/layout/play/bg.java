package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.fe;
import com.google.android.finsky.utils.ik;
import com.google.android.play.layout.CardLinearLayout;

/* loaded from: classes.dex */
public abstract class bg extends ci {

    /* renamed from: a, reason: collision with root package name */
    protected final int f3433a;

    /* renamed from: b, reason: collision with root package name */
    protected CardLinearLayout f3434b;
    protected FrameLayout c;
    protected com.google.android.play.layout.a d;
    private int e;

    public bg(Context context) {
        this(context, null);
    }

    public bg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3433a = ik.c(context.getResources());
    }

    @Override // com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.j = (PlayCardClusterViewHeader) findViewById(R.id.play_promo_cluster_header);
        this.f3434b = (CardLinearLayout) findViewById(R.id.promo_cluster_card);
        this.c = (FrameLayout) findViewById(R.id.play_promo_cluster_content);
        this.d = (com.google.android.play.layout.a) findViewById(R.id.play_card);
    }

    public void setContentHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return this.e;
    }

    public final void a(Document document, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, cy cyVar, az azVar, int i, int i2, Integer num, boolean z) {
        this.e = i;
        a(document.f1963a.R, cyVar);
        fe.a(this.d, document.a(0), document.f1963a.f3890a, eVar, bVar, false, azVar, getParentOfChildren(), true, -1, false);
        this.j.a(document.f1963a.g, document.f1963a.i, document.f1963a.k, null, null, eVar, null, i2, num);
        this.f3434b.findViewById(R.id.separator).setVisibility(z ? 0 : 8);
    }
}
