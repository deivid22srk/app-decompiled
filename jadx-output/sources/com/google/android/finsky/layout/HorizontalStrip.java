package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;

/* loaded from: classes.dex */
public class HorizontalStrip extends a {
    protected final float g;
    private com.google.android.finsky.adapters.ag h;
    private bo i;
    private final com.google.android.finsky.protos.du j;
    private int k;
    private int[] l;

    public HorizontalStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new com.google.android.finsky.protos.du();
        Resources resources = context.getResources();
        this.g = resources.getDisplayMetrics().density;
        this.k = resources.getColor(R.color.screenshot_edge_fade);
    }

    public void setAdapter(com.google.android.finsky.adapters.ag agVar) {
        this.h = agVar;
        if (this.h != null) {
            com.google.android.finsky.adapters.ag agVar2 = this.h;
            agVar2.d.registerObserver(new bm(this));
        }
        a();
    }

    public void setLoadAllScreenshotsListener(bo boVar) {
        this.i = boVar;
    }

    public void setAppScreenshotStates(int[] iArr) {
        this.l = iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        removeAllViews();
        if (this.h != null) {
            for (int i = 0; i < this.h.f1889a; i++) {
                com.google.android.finsky.adapters.ag agVar = this.h;
                View inflate = LayoutInflater.from(this.f).inflate(R.layout.app_screenshot, (ViewGroup) this, false);
                inflate.setOnClickListener(new com.google.android.finsky.adapters.ah(agVar, i));
                inflate.setOnFocusChangeListener(new bn(this, i));
                addView(inflate);
            }
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r8 = this;
            r7 = 2
            r4 = 1
            r2 = 0
            r1 = r2
            r3 = r4
        L5:
            com.google.android.finsky.adapters.ag r0 = r8.h
            int r0 = r0.f1889a
            if (r1 >= r0) goto L52
            android.view.View r0 = r8.getChildAt(r1)
            com.google.android.finsky.adapters.ag r5 = r8.h
            android.graphics.drawable.Drawable[] r5 = r5.f1890b
            r6 = r5[r1]
            boolean r5 = r0 instanceof com.google.android.finsky.layout.AppScreenshot
            if (r5 == 0) goto L3a
            com.google.android.finsky.layout.AppScreenshot r0 = (com.google.android.finsky.layout.AppScreenshot) r0
            if (r6 == 0) goto L40
            android.widget.ImageView r5 = r0.f2922b
            android.graphics.drawable.Drawable r5 = r5.getDrawable()
            if (r5 == 0) goto L3e
            r5 = r4
        L26:
            if (r5 != 0) goto L40
            r0.setScreenshotDrawable(r6)
        L2b:
            int r5 = r0.f2921a
            int[] r6 = r8.l
            r6 = r6[r1]
            if (r5 == r6) goto L3a
            int[] r5 = r8.l
            r5 = r5[r1]
            r0.setState(r5)
        L3a:
            int r0 = r1 + 1
            r1 = r0
            goto L5
        L3e:
            r5 = r2
            goto L26
        L40:
            if (r6 == 0) goto L50
            int r5 = r0.f2921a
            if (r5 == r7) goto L50
            int[] r5 = r8.l
            r5 = r5[r1]
            if (r5 != r7) goto L50
            r0.setScreenshotDrawable(r6)
            goto L2b
        L50:
            r3 = r2
            goto L2b
        L52:
            if (r3 == 0) goto L57
            r8.requestLayout()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.HorizontalStrip.b():void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            this.h.a(i3, this.j, this.g);
            int i4 = this.j.f3750a;
            this.h.a(i3, this.j, this.g);
            int i5 = this.j.c;
            if (i5 != 0) {
                float f = size / i5;
                if (f < 1.0d) {
                    i4 = (int) (i4 * f);
                }
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.h != null) {
            int height = getHeight();
            this.f3104a = 0.0f;
            int paddingLeft = getPaddingLeft() + this.c;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                int measuredWidth = childAt.getMeasuredWidth();
                childAt.layout(paddingLeft, 0, paddingLeft + measuredWidth, height);
                paddingLeft += this.d + measuredWidth;
                this.f3104a += measuredWidth;
            }
            this.f3104a += this.d * (getChildCount() - 1);
            this.f3104a += this.c;
        }
    }

    @Override // com.google.android.finsky.layout.a
    protected final float a(float f) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < getChildCount()) {
            i2 += c(i);
            if (i2 > f) {
                break;
            }
            i++;
            i3 = i2;
        }
        return i3;
    }

    private int c(int i) {
        return (i == 0 ? this.c : this.d) + getChildAt(i).getWidth();
    }

    @Override // com.google.android.finsky.layout.a
    protected final float b(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            i4 += c(i3);
            i3++;
            i2 = i4;
        }
        if (i3 != 0) {
            i2 += this.d;
        }
        return i2;
    }

    @Override // com.google.android.finsky.layout.a
    protected final float b(float f) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i >= getChildCount()) {
                i2 = i3;
                break;
            }
            i2 += c(i);
            if (i2 > f) {
                break;
            }
            i++;
            i3 = i2;
        }
        return this.d + i2;
    }

    @Override // android.view.View
    protected float getLeftFadingEdgeStrength() {
        float scrollPosition = getScrollPosition();
        if (scrollPosition >= 0.0f) {
            return 0.0f;
        }
        float f = -scrollPosition;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (f > horizontalFadingEdgeLength) {
            return 1.0f;
        }
        return f / horizontalFadingEdgeLength;
    }

    @Override // android.view.View
    protected float getRightFadingEdgeStrength() {
        float scrollPosition = (getScrollPosition() + this.f3104a) - getWidth();
        if (scrollPosition <= 0.0f) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (scrollPosition > horizontalFadingEdgeLength) {
            return 1.0f;
        }
        return scrollPosition / horizontalFadingEdgeLength;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return this.k;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.i != null && i > i3) {
            this.i.c();
        }
    }
}
