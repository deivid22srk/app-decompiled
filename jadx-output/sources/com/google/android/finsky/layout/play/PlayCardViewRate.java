package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.et;
import com.google.android.finsky.utils.gx;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class PlayCardViewRate extends com.google.android.play.layout.a implements cu {
    private PlayRatingBar E;
    private PlayCardViewRateOverlay F;
    private TextView G;
    private cg H;
    private ch I;
    private int J;

    /* renamed from: a, reason: collision with root package name */
    private View f3344a;

    public PlayCardViewRate(Context context) {
        this(context, null);
    }

    public PlayCardViewRate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = 0;
    }

    public void setRateListener(cg cgVar) {
        this.H = cgVar;
    }

    public void setState(int i) {
        if (this.J != i) {
            this.J = i;
            this.F.setVisibility(this.J == 1 ? 0 : 8);
            this.E.setEnabled(this.J != 1);
            this.G.setEnabled(this.J != 1);
        }
    }

    public void setSkipListener(ch chVar) {
        this.I = chVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3344a = findViewById(R.id.rate_separator);
        this.E = (PlayRatingBar) findViewById(R.id.rate_bar);
        this.F = (PlayCardViewRateOverlay) findViewById(R.id.content_overlay);
        this.G = (TextView) findViewById(R.id.skip_rating);
        this.G.setText(this.G.getText().toString().toUpperCase());
        this.G.setOnClickListener(new cd(this));
        if (!f6980b) {
            setNextFocusDownId(R.id.star3);
            this.E.findViewById(R.id.star3).setNextFocusUpId(R.id.play_card);
        }
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 13;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z = this.c != null && ((Document) this.c).f1963a.g == 3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i4 = (size - paddingLeft) - paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) this.f3344a.getLayoutParams();
        if (this.E.getVisibility() == 8) {
            i3 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
            this.G.measure(0, 0);
            this.E.measure(View.MeasureSpec.makeMeasureSpec(i4 - (marginLayoutParams8.rightMargin + (this.G.getMeasuredWidth() + marginLayoutParams8.leftMargin)), 1073741824), 0);
            i3 = marginLayoutParams6.bottomMargin + marginLayoutParams6.topMargin + this.E.getMeasuredHeight() + marginLayoutParams7.bottomMargin;
            if (z) {
                i3 += marginLayoutParams7.height + marginLayoutParams7.topMargin;
            }
        }
        int i5 = ((size2 - paddingTop) - paddingBottom) - i3;
        int min = (int) Math.min(i5 / this.z, (((size - paddingLeft) - paddingRight) * 2) / 3);
        this.b_.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        int i6 = (i4 - min) - marginLayoutParams.rightMargin;
        if (this.E.getVisibility() != 8) {
            this.f3344a.measure(View.MeasureSpec.makeMeasureSpec(z ? (i4 - marginLayoutParams7.leftMargin) - marginLayoutParams7.rightMargin : (i6 - marginLayoutParams7.rightMargin) - marginLayoutParams2.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(marginLayoutParams7.height, 1073741824));
        }
        this.t.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
        int measuredWidth = this.t.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
        this.v.measure(0, 0);
        this.h.measure(View.MeasureSpec.makeMeasureSpec((i6 - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin, 1073741824), 0);
        int i7 = ((i6 - marginLayoutParams3.leftMargin) - marginLayoutParams3.rightMargin) - measuredWidth;
        this.k.measure(0, 0);
        if (this.k.getMeasuredWidth() > i7) {
            this.k.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), 0);
        }
        if (this.w.getVisibility() != 8) {
            this.w.measure(View.MeasureSpec.makeMeasureSpec((i6 - marginLayoutParams5.leftMargin) - marginLayoutParams5.rightMargin, 1073741824), 1073741824);
        }
        if (this.F.getVisibility() != 8) {
            this.F.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec((!z || this.E == null) ? i5 : this.f3344a.getMeasuredHeight() + marginLayoutParams7.topMargin + i5, 1073741824));
        }
        this.y.measure(0, 0);
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
        if (this.E.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.f3344a.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
            int measuredWidth = this.G.getMeasuredWidth();
            int b2 = android.support.v4.view.ao.b(marginLayoutParams8);
            int measuredWidth2 = this.E.getMeasuredWidth();
            int measuredHeight = this.E.getMeasuredHeight();
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, (((((((width - n) - o) - measuredWidth2) - measuredWidth) - android.support.v4.view.ao.a(marginLayoutParams8)) - b2) / 2) + n);
            int i5 = ((height - paddingBottom) - marginLayoutParams7.bottomMargin) - measuredHeight;
            this.E.layout(a2, i5, measuredWidth2 + a2, i5 + measuredHeight);
            int measuredWidth3 = this.f3344a.getMeasuredWidth();
            int measuredHeight2 = this.f3344a.getMeasuredHeight();
            int b3 = com.google.android.play.utils.j.b(width, measuredWidth3, z2, android.support.v4.view.ao.b(marginLayoutParams6) + o);
            int i6 = ((i5 - marginLayoutParams7.topMargin) - marginLayoutParams6.bottomMargin) - measuredHeight2;
            this.f3344a.layout(b3, i6, measuredWidth3 + b3, this.f3344a.getMeasuredHeight() + i6);
            int measuredHeight3 = this.G.getMeasuredHeight();
            int i7 = ((measuredHeight - measuredHeight3) / 2) + i5;
            int b4 = com.google.android.play.utils.j.b(width, measuredWidth, z2, o + b2);
            this.G.layout(b4, i7, measuredWidth + b4, measuredHeight3 + i7);
        }
        int measuredHeight4 = this.b_.getMeasuredHeight();
        int measuredWidth4 = this.b_.getMeasuredWidth();
        int a3 = android.support.v4.view.ao.a(marginLayoutParams) + n;
        int a4 = com.google.android.play.utils.j.a(width, measuredWidth4, z2, a3);
        this.b_.layout(a4, marginLayoutParams.topMargin + paddingTop, a4 + measuredWidth4, marginLayoutParams.topMargin + paddingTop + measuredHeight4);
        int i8 = a3 + measuredWidth4;
        int measuredWidth5 = this.h.getMeasuredWidth();
        int i9 = marginLayoutParams2.topMargin + paddingTop;
        int a5 = i8 + android.support.v4.view.ao.a(marginLayoutParams2);
        int a6 = com.google.android.play.utils.j.a(width, measuredWidth5, z2, a5);
        this.h.layout(a6, i9, measuredWidth5 + a6, this.h.getMeasuredHeight() + i9);
        int measuredWidth6 = this.v.getMeasuredWidth();
        int i10 = i9 + marginLayoutParams3.topMargin;
        int b5 = com.google.android.play.utils.j.b(width, measuredWidth6, z2, android.support.v4.view.ao.b(marginLayoutParams3) + o);
        this.v.layout(b5, i10, measuredWidth6 + b5, this.v.getMeasuredHeight() + i10);
        int measuredWidth7 = this.t.getMeasuredWidth();
        int measuredHeight5 = this.t.getMeasuredHeight();
        int bottom = this.h.getBottom() + marginLayoutParams4.topMargin;
        int b6 = com.google.android.play.utils.j.b(width, measuredWidth7, z2, android.support.v4.view.ao.b(marginLayoutParams4) + o);
        this.t.layout(b6, bottom, measuredWidth7 + b6, measuredHeight5 + bottom);
        int baseline = (this.t.getBaseline() + bottom) - this.k.getBaseline();
        int measuredWidth8 = this.k.getMeasuredWidth();
        int a7 = com.google.android.play.utils.j.a(width, measuredWidth8, z2, a5);
        this.k.layout(a7, baseline, measuredWidth8 + a7, this.k.getMeasuredHeight() + baseline);
        if (this.w.getVisibility() != 8) {
            int measuredWidth9 = this.w.getMeasuredWidth();
            int bottom2 = this.b_.getBottom() - marginLayoutParams5.bottomMargin;
            int a8 = com.google.android.play.utils.j.a(width, measuredWidth9, z2, a6 + android.support.v4.view.ao.a(marginLayoutParams5));
            this.w.layout(a8, bottom2 - this.w.getMeasuredHeight(), measuredWidth9 + a8, bottom2);
        }
        if (this.F.getVisibility() != 8) {
            int measuredWidth10 = this.F.getMeasuredWidth();
            int a9 = com.google.android.play.utils.j.a(width, measuredWidth10, z2, n);
            this.F.layout(a9, paddingTop, measuredWidth10 + a9, this.F.getMeasuredHeight() + paddingTop);
        }
        int measuredWidth11 = ((((width - n) - o) - this.y.getMeasuredWidth()) / 2) + n;
        int measuredHeight6 = ((((height - paddingTop) - paddingBottom) - this.y.getMeasuredHeight()) / 2) + paddingTop;
        this.y.layout(measuredWidth11, measuredHeight6, this.y.getMeasuredWidth() + measuredWidth11, this.y.getMeasuredHeight() + measuredHeight6);
    }

    @Override // com.google.android.play.layout.a
    public final void a() {
        super.a();
        if (this.f3344a != null) {
            this.f3344a.setVisibility(8);
        }
        if (this.E != null) {
            this.E.setVisibility(8);
        }
    }

    @Override // com.google.android.play.layout.a
    public final void a(Object obj, int i) {
        super.a(obj, i);
        this.E.setVerticalPadding(R.dimen.rate_card_stars_vpadding);
        this.E.a(0, this.d, this);
        this.E.setContentDescription(com.google.android.finsky.utils.ai.a(getResources(), ((Document) obj).f1963a.e));
    }

    @Override // com.google.android.finsky.layout.play.cu
    public final void a(PlayRatingBar playRatingBar, int i) {
        a(i, false);
        FinskyApp.a().h().a(1208, (byte[]) null, (cy) getLoggingData());
        if (!(playRatingBar.getContext() instanceof android.support.v4.app.t)) {
            FinskyLog.e("View context is not a fragment activity in Rate Card", new Object[0]);
            return;
        }
        android.support.v4.app.t tVar = (android.support.v4.app.t) playRatingBar.getContext();
        Document document = (Document) getData();
        gx.a(FinskyApp.a().j(), document.f1963a.f3890a, document.f1963a.D, Math.round(i), tVar, new ce(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, boolean z) {
        int round = Math.round(f);
        if (round > 0) {
            if (this.H != null) {
                this.H.a(z);
            }
            this.E.setRating(round);
            if (round > 0) {
                ik.a(getContext(), getResources().getQuantityString(R.plurals.content_description_rated, round, Integer.valueOf(round)), this.E);
            }
            if (this.J == 0) {
                setState(1);
                Animation a2 = et.a(getContext(), 100L, (Animation.AnimationListener) null);
                this.F.setVisibility(0);
                Document document = (Document) getData();
                PlayCardViewRateOverlay playCardViewRateOverlay = this.F;
                int i = document.f1963a.g;
                playCardViewRateOverlay.e = Integer.toString(round);
                playCardViewRateOverlay.f = playCardViewRateOverlay.getResources().getQuantityString(R.plurals.stars_without_numbers, round);
                int a3 = com.google.android.finsky.utils.ai.a(playCardViewRateOverlay.getContext(), i);
                playCardViewRateOverlay.f3345a.setColor(a3);
                playCardViewRateOverlay.f3346b.setColor(a3);
                playCardViewRateOverlay.f3345a.getTextBounds(playCardViewRateOverlay.e, 0, playCardViewRateOverlay.e.length(), playCardViewRateOverlay.c);
                playCardViewRateOverlay.f3346b.getTextBounds(playCardViewRateOverlay.f, 0, playCardViewRateOverlay.f.length(), playCardViewRateOverlay.d);
                this.F.startAnimation(a2);
            }
            invalidate();
        }
    }

    public final void b() {
        if (this.H != null) {
            this.H.a();
        }
        this.E.setRating(0);
        if (this.J == 1) {
            this.F.startAnimation(et.b(getContext(), 250L, new cf(this)));
        }
        invalidate();
    }

    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.view.View
    public void setVisibility(int i) {
        if (this.J != 2 || i != 0) {
            super.setVisibility(i);
        }
    }
}
