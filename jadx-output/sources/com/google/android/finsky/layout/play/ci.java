package com.google.android.finsky.layout.play;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.protos.ds;

/* loaded from: classes.dex */
public abstract class ci extends com.google.android.finsky.layout.bq implements com.google.android.finsky.adapters.ap {

    /* renamed from: a, reason: collision with root package name */
    private final int f3468a;

    /* renamed from: b, reason: collision with root package name */
    private cy f3469b;
    private ad c;
    private boolean d;
    protected PlayCardClusterViewHeader j;

    public ci(Context context) {
        this(context, null);
    }

    public ci(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3468a = context.getResources().getDimensionPixelSize(R.dimen.play_cluster_vpadding);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.j = (PlayCardClusterViewHeader) findViewById(R.id.cluster_header);
    }

    public void ab_() {
        this.f3469b = null;
        if (this.c != null) {
            this.c.a(0, null, null);
        }
        if (this.d) {
            this.d = false;
            this.c = null;
        }
    }

    public void setCustomClusterUiElementNode(ad adVar) {
        this.c = adVar;
        this.d = true;
    }

    protected int getPlayStoreUiElementType() {
        return 400;
    }

    protected void a(byte[] bArr, cy cyVar) {
        if (this.c == null) {
            this.c = new ad(0);
        }
        if (!this.d) {
            this.c.a(getPlayStoreUiElementType(), bArr, cyVar);
        }
        if (bArr != null) {
            this.f3469b = this.c;
        } else {
            this.f3469b = cyVar;
        }
    }

    protected final void e() {
        if (this.c != null) {
            this.c.getParentNode().a(this.c);
        }
    }

    public final boolean f() {
        return this.j != null;
    }

    public final void h() {
        this.j.setVisibility(8);
        android.support.v4.view.by.a(this, 0, 0, 0, 0);
    }

    public cy getPlayStoreUiElementNode() {
        return this.c;
    }

    public final void a(int i, String str, String str2, String str3, View.OnClickListener onClickListener, int i2) {
        a(i, str, str2, str3, onClickListener, i2, null, null);
    }

    public final void a(int i, String str, String str2, String str3, View.OnClickListener onClickListener, int i2, ds dsVar, com.google.android.play.image.e eVar) {
        this.j.a(i, str, str2, str3, onClickListener, dsVar, eVar);
        this.j.setVisibility(0);
        this.j.setExtraHorizontalPadding(i2);
        android.support.v4.view.by.a(this, 0, this.f3468a, 0, this.f3468a);
    }

    public cy getParentOfChildren() {
        return this.f3469b;
    }

    public void a(Bundle bundle) {
    }
}
