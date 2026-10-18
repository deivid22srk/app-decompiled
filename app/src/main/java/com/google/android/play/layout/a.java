package com.google.android.play.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.play.o;

/* loaded from: classes.dex */
public abstract class a extends ForegroundRelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f6980b;
    public final boolean A;
    public boolean B;
    protected final int C;
    protected final int D;
    private final Rect E;
    private final Rect F;
    private boolean G;
    private final int H;
    private Drawable I;
    private final int J;

    /* renamed from: a, reason: collision with root package name */
    private final int f6981a;
    public boolean a_;
    public PlayCardThumbnail b_;
    public Object c;
    public int d;
    protected Object e;
    public TextView h;
    public TextView i;
    public TextView j;
    public PlayTextView k;
    public PlayTextView l;
    public StarRatingBar q;
    public PlayTextView r;
    public TextView s;
    public PlayCardLabelView t;
    protected PlayTextView u;
    public ImageView v;
    public PlayCardSnippet w;
    public PlayCardSnippet x;
    public View y;
    public float z;

    public abstract int getCardType();

    static {
        f6980b = Build.VERSION.SDK_INT <= 13;
    }

    public a(Context context) {
        this(context, null, 0);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6981a = context.getResources().getDimensionPixelSize(com.google.android.play.i.play_card_overflow_touch_extend);
        this.E = new Rect();
        this.F = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.PlayCardBaseView);
        this.A = obtainStyledAttributes.getBoolean(o.PlayCardBaseView_card_show_inline_creator_badge, false);
        this.B = obtainStyledAttributes.getBoolean(o.PlayCardBaseView_card_supports_subtitle_and_rating, false);
        this.C = obtainStyledAttributes.getDimensionPixelSize(o.PlayCardBaseView_card_text_only_snippet_margin_left, context.getResources().getDimensionPixelSize(com.google.android.play.i.play_card_snippet_text_extra_margin_left));
        this.D = obtainStyledAttributes.getDimensionPixelSize(o.PlayCardBaseView_card_avatar_snippet_margin_left, 0);
        this.J = obtainStyledAttributes.getInt(o.PlayCardBaseView_card_owned_status_rendering_type, 1);
        obtainStyledAttributes.recycle();
        this.H = context.getResources().getDimensionPixelSize(com.google.android.play.i.play_card_default_inset);
        int i2 = this.H;
        int i3 = this.H;
        int i4 = this.H;
        int i5 = this.H;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        requestLayout();
        invalidate();
        getCardViewGroupDelegate().a(this, context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.a().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b.a().b(this);
    }

    public com.google.android.play.cpkg.i getCardViewGroupDelegate() {
        return com.google.android.play.cpkg.j.f6829a;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        getCardViewGroupDelegate().a(this, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        getCardViewGroupDelegate().b(this, i);
    }

    public void a(Object obj, int i) {
        this.c = obj;
        this.d = i;
    }

    public Object getData() {
        return this.c;
    }

    public void setLoggingData(Object obj) {
        this.e = obj;
    }

    public Object getLoggingData() {
        return this.e;
    }

    public PlayCardThumbnail getThumbnail() {
        return this.b_;
    }

    public TextView getTitle() {
        return this.h;
    }

    public TextView getAdLabel() {
        return this.i;
    }

    public TextView getAdCreative() {
        return this.j;
    }

    public PlayTextView getSubtitle() {
        return this.k;
    }

    public PlayTextView getSubtitle2() {
        return this.l;
    }

    public StarRatingBar getRatingBar() {
        return this.q;
    }

    public PlayTextView getItemBadge() {
        return this.r;
    }

    public TextView getAppSize() {
        return this.s;
    }

    public PlayCardLabelView getLabel() {
        return this.t;
    }

    public PlayTextView getDescription() {
        return this.u;
    }

    public ImageView getOverflow() {
        return this.v;
    }

    public PlayCardSnippet getSnippet1() {
        return this.w;
    }

    public PlayCardSnippet getSnippet2() {
        return this.x;
    }

    public View getLoadingIndicator() {
        return this.y;
    }

    public boolean c() {
        return this.B;
    }

    public int getOwnershipRenderingType() {
        return this.J;
    }

    public int getTextOnlySnippetMarginLeft() {
        return this.C;
    }

    public int getAvatarSnippetMarginLeft() {
        return this.D;
    }

    public void setDisplayAsDisabled(boolean z) {
        if (this.G != z) {
            this.G = z;
            setDescendantFocusability(this.G ? 393216 : 131072);
            invalidate();
        }
    }

    public void setItemOwned(boolean z) {
        this.a_ = z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b_ = (PlayCardThumbnail) findViewById(com.google.android.play.k.li_thumbnail_frame);
        this.h = (TextView) findViewById(com.google.android.play.k.li_title);
        this.k = (PlayTextView) findViewById(com.google.android.play.k.li_subtitle);
        this.l = (PlayTextView) findViewById(com.google.android.play.k.li_subtitle_2);
        this.q = (StarRatingBar) findViewById(com.google.android.play.k.li_rating);
        this.r = (PlayTextView) findViewById(com.google.android.play.k.li_badge);
        this.u = (PlayTextView) findViewById(com.google.android.play.k.li_description);
        this.v = (ImageView) findViewById(com.google.android.play.k.li_overflow);
        this.s = (TextView) findViewById(com.google.android.play.k.li_app_size);
        this.t = (PlayCardLabelView) findViewById(com.google.android.play.k.li_label);
        this.w = (PlayCardSnippet) findViewById(com.google.android.play.k.li_snippet_1);
        this.x = (PlayCardSnippet) findViewById(com.google.android.play.k.li_snippet_2);
        this.y = findViewById(com.google.android.play.k.loading_progress_bar);
        this.i = (TextView) findViewById(com.google.android.play.k.li_ad_label);
        this.j = (TextView) findViewById(com.google.android.play.k.li_ad_creative);
        if (f6980b) {
            setNextFocusRightId(-1);
            if (this.v != null) {
                this.v.setFocusable(false);
                this.v.setNextFocusLeftId(-1);
            }
        }
    }

    public final void a(int i) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        if (this.b_.getVisibility() != 8) {
            marginLayoutParams.height = (int) (((((size - paddingLeft) - paddingRight) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) * this.z);
            return;
        }
        marginLayoutParams.height = 0;
    }

    public final void b(int i) {
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        if (this.b_.getVisibility() != 8) {
            marginLayoutParams.width = (int) (((((size - paddingTop) - paddingBottom) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) / this.z);
        } else {
            marginLayoutParams.width = 0;
        }
    }

    public void setThumbnailAspectRatio(float f) {
        if (this.z != f) {
            this.z = f;
            requestLayout();
        }
    }

    public void a() {
        setOnClickListener(null);
        setClickable(false);
        setContentDescription(null);
        this.y.setVisibility(0);
        this.h.setVisibility(8);
        if (this.k != null) {
            this.k.setVisibility(8);
        }
        if (this.l != null) {
            this.l.setVisibility(8);
        }
        this.b_.setVisibility(8);
        if (this.s != null) {
            this.s.setVisibility(8);
        }
        if (this.t != null) {
            this.t.setVisibility(8);
        }
        if (this.q != null) {
            this.q.setVisibility(8);
        }
        if (this.r != null) {
            this.r.setVisibility(8);
        }
        if (this.u != null) {
            this.u.setVisibility(8);
        }
        if (this.v != null) {
            this.v.setVisibility(8);
        }
        if (this.i != null) {
            this.i.setVisibility(8);
        }
        if (this.j != null) {
            this.j.setVisibility(8);
        }
        setVisibility(0);
    }

    public final void d() {
        this.b_.setVisibility(8);
        setVisibility(4);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.u != null && this.u.getVisibility() == 0 && !TextUtils.isEmpty(this.u.getText())) {
            int measuredHeight = this.u.getMeasuredHeight();
            Layout layout = this.u.getLayout();
            if (layout != null) {
                int i3 = 0;
                while (i3 < layout.getLineCount()) {
                    if (layout.getLineBottom(i3) <= measuredHeight) {
                        i3++;
                    } else {
                        this.u.setVisibility(i3 < 2 ? 4 : 0);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e();
    }

    public final void e() {
        if (this.v != null && this.v.getVisibility() != 8) {
            this.v.getHitRect(this.E);
            this.E.top -= this.f6981a;
            this.E.bottom += this.f6981a;
            this.E.left -= this.f6981a;
            this.E.right += this.f6981a;
            if (this.E.top != this.F.top || this.E.bottom != this.F.bottom || this.E.left != this.F.left || this.E.right != this.F.right) {
                setTouchDelegate(new com.google.android.play.utils.i(this.E, this.v));
                this.F.set(this.E);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.G) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.G) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.G) {
            if (this.I == null) {
                this.I = new PaintDrawable(getResources().getColor(com.google.android.play.h.play_dismissed_overlay));
            }
            this.I.setBounds(0, 0, width, height);
            this.I.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        if (!(this.G && accessibilityEvent.getEventType() == 8)) {
            return dispatchPopulateAccessibilityEvent;
        }
        accessibilityEvent.setEnabled(false);
        return true;
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(!this.G);
    }
}
