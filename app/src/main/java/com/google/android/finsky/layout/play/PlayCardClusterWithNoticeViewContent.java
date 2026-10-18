package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PlayCardClusterWithNoticeViewContent extends PlayCardClusterViewContent {

    /* renamed from: a, reason: collision with root package name */
    FifeImageView f3315a;

    /* renamed from: b, reason: collision with root package name */
    TextView f3316b;
    TextView c;
    TextView d;
    private float e;
    private boolean f;
    private View l;
    private FrameLayout m;

    public PlayCardClusterWithNoticeViewContent(Context context) {
        this(context, null);
    }

    public PlayCardClusterWithNoticeViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = context.getResources().getBoolean(R.bool.cluster_with_notice_vertical_stack);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.m = (FrameLayout) findViewById(R.id.cover_frame);
        this.f3315a = (FifeImageView) findViewById(R.id.cover);
        this.l = findViewById(R.id.info_block);
        this.f3316b = (TextView) this.l.findViewById(R.id.title);
        this.c = (TextView) this.l.findViewById(R.id.subtitle);
        this.d = (TextView) this.l.findViewById(R.id.action_button);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent
    public final void a(as asVar, com.google.android.finsky.utils.ac acVar) {
        super.a(asVar, acVar);
        this.f = this.f && Math.min(this.g.a(), getDocCount()) == 3;
        this.e = this.f ? 0.85f : 1.0f;
        if (this.e < 1.0f) {
            this.j = 0;
        }
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent
    protected int getIndexOfFirstCard() {
        return 2;
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        int i4 = measuredHeight == 0 ? 0 : (measuredHeight - this.i) - this.j;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        if (this.f) {
            this.l.measure(makeMeasureSpec, 0);
            int measuredHeight2 = this.l.getMeasuredHeight();
            this.m.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((int) (i4 * this.e)) + measuredHeight2, 1073741824));
            int i5 = measuredHeight2 + i4;
            i3 = i4 > 0 ? this.i + this.j + i5 : i5;
        } else {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(e(size) + ((int) (getExtraColumnOffset() * g(size))), 1073741824);
            this.l.measure(makeMeasureSpec2, 0);
            if (i4 > 0) {
                i4 += this.i + this.j;
            }
            int i6 = (int) (i4 * this.e);
            this.m.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            this.l.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            i3 = ((int) (i4 * (1.0f - this.e))) + i6;
        }
        setMeasuredDimension(size, i3);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.m.layout(0, 0, getWidth(), this.m.getMeasuredHeight());
        int measuredWidth = this.l.getMeasuredWidth();
        int measuredHeight = this.l.getMeasuredHeight();
        int i5 = this.f ? 0 : this.h;
        this.l.layout(i5, this.i, measuredWidth + i5, measuredHeight + this.i);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, com.google.android.finsky.adapters.ap
    public final void ab_() {
        super.ab_();
        this.f3315a.a();
    }
}
