package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.FadingEdgeImageView;
import com.google.android.finsky.utils.ik;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.ForegroundRelativeLayout;

/* loaded from: classes.dex */
public class PlayMerchBannerView extends ForegroundRelativeLayout implements com.google.android.finsky.adapters.ap, ag, cy, com.google.android.play.image.t {

    /* renamed from: a, reason: collision with root package name */
    public int f3357a;

    /* renamed from: b, reason: collision with root package name */
    public FadingEdgeImageView f3358b;
    public int c;
    public final int d;
    public int e;
    public TextView f;
    public TextView g;
    public com.google.android.finsky.apkg.ai h;
    public cy i;
    private int j;
    private String k;
    private final boolean l;

    public PlayMerchBannerView(Context context) {
        this(context, null);
    }

    public PlayMerchBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f3357a = -1;
        this.l = resources.getBoolean(R.bool.play_merch_banner_compact);
        this.d = resources.getColor(R.color.play_multi_primary);
    }

    @Override // com.google.android.finsky.layout.play.ag
    public void setIdentifier(String str) {
        this.k = str;
    }

    @Override // com.google.android.finsky.layout.play.ag
    public String getIdentifier() {
        return this.k;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3358b = (FadingEdgeImageView) findViewById(R.id.merch_image);
        this.f = (TextView) findViewById(R.id.banner_title);
        this.g = (TextView) findViewById(R.id.banner_subtitle);
    }

    public final void b() {
        this.f3358b.a(false, true, this.f3358b.getMeasuredWidth() / 4, this.c);
    }

    public int getFallbackMerchTextColor() {
        return getResources().getColor(ik.a(this.c) ? R.color.play_banner_dark_fg : R.color.play_banner_light_fg);
    }

    private int a(int i) {
        if (this.f3357a > 2) {
            return 0;
        }
        return (int) (((i * 1.7777778f) * 2.0f) / 10.0f);
    }

    private void a(int i, int i2) {
        int i3;
        int i4 = (i - (((int) ((this.f3357a <= 4 ? 0.85f : 1.0f) * (i2 * 1.7777778f))) + (-a(i2)))) - this.e;
        this.f.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), 0);
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), 0);
        Layout layout = this.f.getLayout();
        if (layout != null) {
            i3 = 0;
            for (int i5 = 0; i5 < layout.getLineCount(); i5++) {
                i3 = Math.max(i3, (int) layout.getLineWidth(i5));
            }
        } else {
            i3 = 0;
        }
        Layout layout2 = this.g.getLayout();
        if (layout2 != null) {
            for (int i6 = 0; i6 < layout2.getLineCount(); i6++) {
                i3 = Math.max(i3, (int) layout2.getLineWidth(i6));
            }
        }
        int i7 = i3;
        if (i7 == 0) {
            i7 = i4;
        }
        this.j = i4 - i7;
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
        b();
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if ((r6.f.getMeasuredHeight() + r6.g.getMeasuredHeight()) <= r0) goto L10;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.getSize(r7)
            int r0 = r6.f3357a
            if (r0 > 0) goto Lf
            r0 = 0
            r6.setMeasuredDimension(r2, r0)
        Le:
            return
        Lf:
            int r0 = r6.f3357a
            int r1 = r2 / r0
            boolean r0 = r6.l
            if (r0 == 0) goto L59
            int r0 = r1 * 2
            int r0 = r0 / 3
            r6.a(r2, r0)
            android.widget.TextView r3 = r6.f
            int r3 = r3.getMeasuredHeight()
            android.widget.TextView r4 = r6.g
            int r4 = r4.getMeasuredHeight()
            int r3 = r3 + r4
            if (r3 > r0) goto L59
        L2d:
            r1 = 1071877689(0x3fe38e39, float:1.7777778)
            float r3 = (float) r0
            float r1 = r1 * r3
            int r1 = (int) r1
            com.google.android.finsky.layout.FadingEdgeImageView r3 = r6.f3358b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r3.measure(r1, r4)
            com.google.android.finsky.layout.FadingEdgeImageView r1 = r6.f3358b
            boolean r1 = r1.c()
            if (r1 == 0) goto L5e
            r6.b()
        L4b:
            int r1 = r6.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            r6.setMeasuredDimension(r2, r0)
            goto Le
        L59:
            r6.a(r2, r1)
            r0 = r1
            goto L2d
        L5e:
            com.google.android.finsky.layout.FadingEdgeImageView r1 = r6.f3358b
            r1.b()
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.play.PlayMerchBannerView.onMeasure(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int measuredWidth = this.f3358b.getMeasuredWidth();
        if (measuredWidth > 0) {
            int a2 = a(height);
            this.f3358b.layout(-a2, paddingTop, measuredWidth + (-a2), this.f3358b.getMeasuredHeight() + paddingTop);
        } else {
            this.f3358b.layout(0, paddingTop, measuredWidth, this.f3358b.getMeasuredHeight() + paddingTop);
        }
        int measuredHeight = this.f.getMeasuredHeight();
        int measuredHeight2 = this.g.getMeasuredHeight();
        int i5 = (((((height - measuredHeight) - measuredHeight2) - paddingTop) - paddingBottom) / 2) + paddingTop;
        int measuredWidth2 = ((width - this.e) - this.f.getMeasuredWidth()) + (this.j / 2);
        this.f.layout(measuredWidth2, i5, this.f.getMeasuredWidth() + measuredWidth2, i5 + measuredHeight);
        int i6 = i5 + measuredHeight;
        this.g.layout(measuredWidth2, i6, this.g.getMeasuredWidth() + measuredWidth2, i6 + measuredHeight2);
    }

    @Override // com.google.android.finsky.adapters.ap
    public final void ab_() {
        this.f3358b.a();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.h;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.i;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }
}
