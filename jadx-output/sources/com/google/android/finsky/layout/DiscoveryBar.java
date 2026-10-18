package com.google.android.finsky.layout;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gc;

/* loaded from: classes.dex */
public class DiscoveryBar extends LinearLayout implements al, com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public Document f2973a;

    /* renamed from: b, reason: collision with root package name */
    public gc[] f2974b;
    public com.google.android.play.image.e c;
    public com.google.android.finsky.navigationmanager.b d;
    public DfeToc e;
    public PackageManager f;
    public ViewGroup g;
    public boolean h;
    public boolean i;
    public int j;
    public com.google.android.finsky.layout.play.cy k;
    private HorizontalScrollView l;
    private com.google.android.finsky.a.ai m;

    public DiscoveryBar(Context context) {
        this(context, null);
    }

    public DiscoveryBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = false;
        this.m = com.google.android.finsky.a.i.a(1800);
    }

    public int getScrollPosition() {
        return this.l.getScrollX();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.l = (HorizontalScrollView) findViewById(R.id.content_scroller);
        this.g = (ViewGroup) findViewById(R.id.badge_container);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.i) {
            this.i = false;
            this.l.scrollTo(this.j, 0);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.m;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.k;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
