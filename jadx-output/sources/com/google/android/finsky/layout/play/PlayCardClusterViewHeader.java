package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.protos.ds;
import com.google.android.play.layout.ForegroundRelativeLayout;

/* loaded from: classes.dex */
public class PlayCardClusterViewHeader extends ForegroundRelativeLayout implements ag {

    /* renamed from: a, reason: collision with root package name */
    public CircularBackgroundView f3312a;

    /* renamed from: b, reason: collision with root package name */
    public View f3313b;
    public TextView c;
    public CardTextView d;
    public final int e;
    private TextView f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private String k;
    private int l;
    private String q;

    public PlayCardClusterViewHeader(Context context) {
        this(context, null);
    }

    public PlayCardClusterViewHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = -1;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.PlayCardClusterViewHeader);
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.i = resources.getDimensionPixelSize(R.dimen.play_cluster_header_icon_size);
        this.j = resources.getDimensionPixelSize(R.dimen.play_cluster_header_icon_background_size);
        this.e = resources.getDimensionPixelSize(R.dimen.play_cluster_vpadding);
        obtainStyledAttributes.recycle();
        android.support.v4.view.by.a(this, this.h, 0, this.h, 0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3312a = (CircularBackgroundView) findViewById(R.id.cluster_image);
        this.f3313b = findViewById(R.id.cluster_title);
        this.c = (TextView) this.f3313b.findViewById(R.id.header_title_main);
        this.f = (TextView) this.f3313b.findViewById(R.id.header_title_secondary);
        this.d = (CardTextView) findViewById(R.id.header_more);
        Resources resources = getResources();
        com.google.android.play.c.i cardViewGroupDelegate = this.d.getCardViewGroupDelegate();
        cardViewGroupDelegate.a(this.d, resources.getColor(R.color.play_transparent));
        cardViewGroupDelegate.a(this.d);
        this.d.setTextSize(0, resources.getDimension(R.dimen.play_card_action_size));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_cluster_header_more_xpadding_v2);
        android.support.v4.view.by.a(this.d, dimensionPixelSize, this.d.getPaddingTop(), dimensionPixelSize, this.d.getPaddingBottom());
    }

    public final void a(int i, String str, String str2, String str3, View.OnClickListener onClickListener) {
        a(i, str, str2, str3, onClickListener, null, null, 0, null);
    }

    public final void a(int i, String str, String str2, String str3, View.OnClickListener onClickListener, ds dsVar, com.google.android.play.image.e eVar) {
        if (dsVar != null && eVar != null) {
            a(i, str, str2, str3, onClickListener, eVar, dsVar, 0, Integer.valueOf(com.google.android.finsky.utils.ai.a(getContext(), i)));
        } else {
            a(i, str, str2, str3, onClickListener, null, null, 0, null);
        }
    }

    public final void a(int i, String str, String str2, String str3, View.OnClickListener onClickListener, com.google.android.play.image.e eVar, ds dsVar, int i2, Integer num) {
        getContext();
        if (dsVar != null) {
            this.f3312a.a(dsVar.f, dsVar.l, eVar);
            this.f3312a.setVisibility(0);
        } else if (i2 > 0) {
            this.f3312a.setImageResource(i2);
            this.f3312a.setVisibility(0);
        } else {
            this.f3312a.setVisibility(8);
        }
        if (this.f3312a.getVisibility() == 0 && num != null) {
            this.f3312a.setBackgroundPaintColor(num.intValue());
            ViewGroup.LayoutParams layoutParams = this.f3312a.getLayoutParams();
            layoutParams.height = this.j;
            layoutParams.width = this.j;
            if (i2 > 0) {
                this.f3312a.setScaleType(ImageView.ScaleType.CENTER);
            }
        } else {
            this.f3312a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ViewGroup.LayoutParams layoutParams2 = this.f3312a.getLayoutParams();
            layoutParams2.height = this.i;
            layoutParams2.width = this.i;
        }
        this.c.setText(str);
        if (TextUtils.isEmpty(str2)) {
            this.f.setVisibility(8);
        } else {
            this.f.setText(com.google.android.finsky.utils.bc.a(str2));
            this.f.setVisibility(0);
        }
        if (TextUtils.isEmpty(str3)) {
            this.d.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        if (this.q == null || str3.compareToIgnoreCase(this.q) != 0) {
            this.d.setText(str3.toUpperCase());
            this.q = str3;
        }
        if (this.l != i) {
            this.d.setTextColor(getResources().getColor(com.google.android.finsky.utils.ai.b(i)));
            this.l = i;
        }
        setOnClickListener(onClickListener);
        setClickable(onClickListener != null);
    }

    public void setExtraHorizontalPadding(int i) {
        android.support.v4.view.by.a(this, this.h + i, 0, this.h + i, 0);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        this.c.setText(charSequence);
        this.c.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.f.setText(charSequence2);
        this.f.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
    }

    @Override // com.google.android.finsky.layout.play.ag
    public void setIdentifier(String str) {
        this.k = str;
    }

    @Override // com.google.android.finsky.layout.play.ag
    public String getIdentifier() {
        return this.k;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.f3312a.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3312a.getLayoutParams();
            this.f3312a.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.height, 1073741824));
            int measuredHeight = this.f3312a.getMeasuredHeight();
            i4 = paddingLeft - (marginLayoutParams.rightMargin + this.f3312a.getMeasuredWidth());
            i3 = measuredHeight;
        } else {
            i3 = 0;
            i4 = paddingLeft;
        }
        if (this.d.getVisibility() != 8) {
            this.d.measure(0, 0);
            i3 = Math.max(i3, this.d.getMeasuredHeight());
            i4 -= this.d.getMeasuredWidth();
        }
        this.f3313b.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), 0);
        setMeasuredDimension(size, Math.max(Math.max(i3, this.f3313b.getMeasuredHeight()), this.g) + getPaddingTop());
    }

    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int height = getHeight();
        int paddingTop = getPaddingTop();
        int n = android.support.v4.view.by.n(this);
        if (this.f3312a.getVisibility() != 8) {
            int measuredWidth = this.f3312a.getMeasuredWidth();
            int measuredHeight = this.f3312a.getMeasuredHeight();
            int i6 = (((height - measuredHeight) - paddingTop) / 2) + paddingTop;
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, n);
            this.f3312a.layout(a2, i6, a2 + measuredWidth, measuredHeight + i6);
            i5 = android.support.v4.view.ao.b((ViewGroup.MarginLayoutParams) this.f3312a.getLayoutParams()) + measuredWidth + n;
        } else {
            i5 = n;
        }
        int measuredWidth2 = this.f3313b.getMeasuredWidth();
        int a3 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, i5);
        this.f3313b.layout(a3, paddingTop, measuredWidth2 + a3, height);
        if (this.d.getVisibility() != 8) {
            int measuredWidth3 = this.d.getMeasuredWidth();
            int measuredHeight2 = this.d.getMeasuredHeight();
            int i7 = (((height - measuredHeight2) - paddingTop) / 2) + paddingTop;
            int b2 = com.google.android.play.utils.j.b(width, measuredWidth3, z2, android.support.v4.view.by.o(this));
            this.d.layout(b2, i7, measuredWidth3 + b2, measuredHeight2 + i7);
        }
    }
}
