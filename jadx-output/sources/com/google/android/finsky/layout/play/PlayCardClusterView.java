package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import java.util.List;

/* loaded from: classes.dex */
public class PlayCardClusterView extends ci {

    /* renamed from: a, reason: collision with root package name */
    protected PlayCardClusterViewContent f3308a;

    /* renamed from: b, reason: collision with root package name */
    protected com.google.android.finsky.utils.ac f3309b;
    protected com.google.android.finsky.api.b c;
    protected az d;

    public PlayCardClusterView(Context context) {
        this(context, null);
    }

    public PlayCardClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3308a = (PlayCardClusterViewContent) findViewById(R.id.cluster_content);
    }

    public as getMetadata() {
        return this.f3308a.getMetadata();
    }

    public final com.google.android.play.layout.a a(int i) {
        return this.f3308a.b(i);
    }

    public final void b() {
        this.f3308a.b();
    }

    public int getCardChildCount() {
        return this.f3308a.getCardChildCount();
    }

    public final boolean c() {
        return getCardChildCount() > 0;
    }

    public PlayCardClusterView a(Document document) {
        this.f3308a.setClusterDocumentData(document);
        return this;
    }

    public PlayCardClusterView a(List<Document> list, String str) {
        this.f3308a.a(list, str);
        return this;
    }

    @Override // com.google.android.finsky.layout.play.ci, com.google.android.finsky.adapters.ap
    public void ab_() {
        super.ab_();
        this.f3308a.ab_();
    }

    public void setCardContentHorizontalPadding(int i) {
        this.f3308a.setCardContentHorizontalPadding(i);
    }

    public void a(as asVar, com.google.android.finsky.utils.ac acVar, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, az azVar, bc bcVar, cy cyVar) {
        this.f3309b = acVar;
        this.c = bVar;
        this.d = azVar;
        this.f3308a.a(asVar, acVar);
        Document clusterLoggingDocument = this.f3308a.getClusterLoggingDocument();
        a(clusterLoggingDocument == null ? null : clusterLoggingDocument.f1963a.R, cyVar);
        bcVar.a(this);
        this.f3308a.a(bVar, bVar2, eVar, azVar, bcVar, getParentOfChildren());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == null || this.j.getVisibility() == 8) {
            i3 = paddingTop;
        } else {
            this.j.measure(i, 0);
            i3 = paddingTop + this.j.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3308a.getLayoutParams();
        this.f3308a.measure(i, 0);
        setMeasuredDimension(size, marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + this.f3308a.getMeasuredHeight() + i3);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.j == null || this.j.getVisibility() == 8) {
            i5 = paddingTop;
        } else {
            this.j.layout(0, paddingTop, width, this.j.getMeasuredHeight() + paddingTop);
            i5 = paddingTop + this.j.getMeasuredHeight();
        }
        int i6 = ((ViewGroup.MarginLayoutParams) this.f3308a.getLayoutParams()).topMargin + i5;
        this.f3308a.layout(0, i6, width, this.f3308a.getMeasuredHeight() + i6);
    }
}
