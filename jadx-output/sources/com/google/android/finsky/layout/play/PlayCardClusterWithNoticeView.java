package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class PlayCardClusterWithNoticeView extends PlayCardClusterView implements ViewTreeObserver.OnScrollChangedListener {
    public View e;
    public TextView f;
    public TextView g;
    public final Rect h;
    public ay i;
    private final int k;
    private TextView l;
    private final int m;
    private final int[] n;
    private cy o;

    public PlayCardClusterWithNoticeView(Context context) {
        this(context, null);
    }

    public PlayCardClusterWithNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new int[2];
        Resources resources = context.getResources();
        this.m = resources.getDimensionPixelSize(R.dimen.play_merch_content_vmargin);
        this.k = (ik.b(resources) / ik.c(resources)) * resources.getInteger(R.integer.cluster_notice_columns);
        this.h = new Rect();
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(R.id.cluster_notice);
        this.l = (TextView) findViewById(R.id.notice_text);
        this.f = (TextView) findViewById(R.id.settings_label);
        this.f.setText(getContext().getString(R.string.settings).toUpperCase());
        this.g = (TextView) findViewById(R.id.ok_label);
        this.g.setText(getContext().getString(R.string.ok).toUpperCase());
    }

    public final void a(com.google.android.play.image.e eVar, Document document, int i, String str, CharSequence charSequence, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, ay ayVar) {
        a(eVar, document, str, onClickListener);
        this.e.setVisibility(0);
        this.l.setText(charSequence);
        if (onClickListener2 == null || onClickListener3 == null || ayVar == null) {
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            this.f.setOnClickListener(null);
            this.g.setOnClickListener(null);
            this.i = null;
        } else {
            this.f.setVisibility(0);
            ColorStateList a2 = com.google.android.play.utils.h.a(getContext(), i);
            this.f.setTextColor(a2);
            this.f.setOnClickListener(onClickListener2);
            this.g.setVisibility(0);
            this.g.setTextColor(a2);
            this.g.setOnClickListener(onClickListener3);
            this.i = ayVar;
        }
        this.h.setEmpty();
    }

    public final void a(com.google.android.play.image.e eVar, Document document, String str, View.OnClickListener onClickListener) {
        PlayCardClusterWithNoticeViewContent playCardClusterWithNoticeViewContent = (PlayCardClusterWithNoticeViewContent) this.f3308a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) playCardClusterWithNoticeViewContent.getLayoutParams();
        marginLayoutParams.topMargin = this.m;
        marginLayoutParams.bottomMargin = this.m;
        ds dsVar = document.b(14).get(0);
        playCardClusterWithNoticeViewContent.f3315a.a(dsVar.f, dsVar.l, eVar);
        playCardClusterWithNoticeViewContent.f3315a.setOnClickListener(onClickListener);
        playCardClusterWithNoticeViewContent.f3315a.setContentDescription(str);
        android.support.v4.view.by.c((View) playCardClusterWithNoticeViewContent.f3315a, 2);
        playCardClusterWithNoticeViewContent.f3316b.setText(document.f1963a.i);
        playCardClusterWithNoticeViewContent.c.setText(document.f1963a.k);
        if (str != null) {
            playCardClusterWithNoticeViewContent.d.setVisibility(0);
            playCardClusterWithNoticeViewContent.d.setText(str);
            playCardClusterWithNoticeViewContent.d.setOnClickListener(onClickListener);
            return;
        }
        playCardClusterWithNoticeViewContent.d.setVisibility(8);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected final void a(byte[] bArr, cy cyVar) {
        super.a(bArr, cyVar);
        this.o = new ad(2900, bArr, getParentOfChildren());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null && this.i != null) {
            viewGroup.getHitRect(this.h);
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.getViewTreeObserver().removeOnScrollChangedListener(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        if (this.e.getVisibility() != 8) {
            this.e.measure(View.MeasureSpec.makeMeasureSpec(this.k, 1073741824), 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            i3 = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + this.e.getMeasuredHeight() + measuredHeight;
        } else {
            i3 = measuredHeight;
        }
        setMeasuredDimension(size, i3);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
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
        if (this.e.getVisibility() == 0) {
            int measuredHeight = ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).topMargin + this.f3308a.getMeasuredHeight() + i6;
            int i7 = (width - this.k) / 2;
            this.e.layout(i7, measuredHeight, this.e.getMeasuredWidth() + i7, this.e.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        if (this.e.getVisibility() == 0) {
            this.e.getLocationOnScreen(this.n);
            int i = this.n[0];
            int i2 = this.n[1];
            if (this.h.contains(i, i2, this.e.getMeasuredWidth() + i, this.e.getMeasuredHeight() + i2)) {
                if (getParentOfChildren() != null) {
                    getParentOfChildren().a(getNoticeUiElementNode());
                }
                this.i.a();
            }
        }
    }

    public cy getNoticeUiElementNode() {
        return this.o;
    }
}
