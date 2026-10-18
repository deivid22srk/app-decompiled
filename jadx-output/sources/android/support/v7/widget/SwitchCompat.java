package android.support.v7.widget;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final int[] F = {R.attr.state_checked};
    private Layout A;
    private TransformationMethod B;
    private fs C;
    private final Rect D;
    private final ao E;

    /* renamed from: a, reason: collision with root package name */
    private Drawable f632a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f633b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private CharSequence g;
    private CharSequence h;
    private boolean i;
    private int j;
    private int k;
    private float l;
    private float m;
    private VelocityTracker n;
    private int o;
    private float p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private TextPaint x;
    private ColorStateList y;
    private Layout z;

    static /* synthetic */ fs b(SwitchCompat switchCompat) {
        switchCompat.C = null;
        return null;
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        Typeface create;
        this.n = VelocityTracker.obtain();
        this.D = new Rect();
        this.x = new TextPaint(1);
        this.x.density = getResources().getDisplayMetrics().density;
        fx a2 = fx.a(context, attributeSet, android.support.v7.b.l.SwitchCompat, i);
        this.f632a = a2.a(android.support.v7.b.l.SwitchCompat_android_thumb);
        if (this.f632a != null) {
            this.f632a.setCallback(this);
        }
        this.f633b = a2.a(android.support.v7.b.l.SwitchCompat_track);
        if (this.f633b != null) {
            this.f633b.setCallback(this);
        }
        this.g = a2.c(android.support.v7.b.l.SwitchCompat_android_textOn);
        this.h = a2.c(android.support.v7.b.l.SwitchCompat_android_textOff);
        this.i = a2.a(android.support.v7.b.l.SwitchCompat_showText, true);
        this.c = a2.c(android.support.v7.b.l.SwitchCompat_thumbTextPadding, 0);
        this.d = a2.c(android.support.v7.b.l.SwitchCompat_switchMinWidth, 0);
        this.e = a2.c(android.support.v7.b.l.SwitchCompat_switchPadding, 0);
        this.f = a2.a(android.support.v7.b.l.SwitchCompat_splitTrack, false);
        int e = a2.e(android.support.v7.b.l.SwitchCompat_switchTextAppearance, 0);
        if (e != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e, android.support.v7.b.l.TextAppearance);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(android.support.v7.b.l.TextAppearance_android_textColor);
            if (colorStateList != null) {
                this.y = colorStateList;
            } else {
                this.y = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(android.support.v7.b.l.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0 && dimensionPixelSize != this.x.getTextSize()) {
                this.x.setTextSize(dimensionPixelSize);
                requestLayout();
            }
            int i2 = obtainStyledAttributes.getInt(android.support.v7.b.l.TextAppearance_android_typeface, -1);
            int i3 = obtainStyledAttributes.getInt(android.support.v7.b.l.TextAppearance_android_textStyle, -1);
            switch (i2) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    break;
                case 3:
                    typeface = Typeface.MONOSPACE;
                    break;
                default:
                    typeface = null;
                    break;
            }
            if (i3 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i3);
                } else {
                    create = Typeface.create(typeface, i3);
                }
                setSwitchTypeface(create);
                int style = i3 & ((create != null ? create.getStyle() : 0) ^ (-1));
                this.x.setFakeBoldText((style & 1) != 0);
                this.x.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
            } else {
                this.x.setFakeBoldText(false);
                this.x.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(android.support.v7.b.l.TextAppearance_textAllCaps, false)) {
                this.B = new android.support.v7.e.a(getContext());
            } else {
                this.B = null;
            }
            obtainStyledAttributes.recycle();
        }
        this.E = ao.a();
        a2.f836a.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.k = viewConfiguration.getScaledTouchSlop();
        this.o = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if (this.x.getTypeface() != typeface) {
            this.x.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchPadding(int i) {
        this.e = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.e;
    }

    public void setSwitchMinWidth(int i) {
        this.d = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.d;
    }

    public void setThumbTextPadding(int i) {
        this.c = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.c;
    }

    public void setTrackDrawable(Drawable drawable) {
        this.f633b = drawable;
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(this.E.a(getContext(), i, false));
    }

    public Drawable getTrackDrawable() {
        return this.f633b;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f632a = drawable;
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(this.E.a(getContext(), i, false));
    }

    public Drawable getThumbDrawable() {
        return this.f632a;
    }

    public void setSplitTrack(boolean z) {
        this.f = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.f;
    }

    public CharSequence getTextOn() {
        return this.g;
    }

    public void setTextOn(CharSequence charSequence) {
        this.g = charSequence;
        requestLayout();
    }

    public CharSequence getTextOff() {
        return this.h;
    }

    public void setTextOff(CharSequence charSequence) {
        this.h = charSequence;
        requestLayout();
    }

    public void setShowText(boolean z) {
        if (this.i != z) {
            this.i = z;
            requestLayout();
        }
    }

    public boolean getShowText() {
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.i) {
            if (this.z == null) {
                this.z = a(this.g);
            }
            if (this.A == null) {
                this.A = a(this.h);
            }
        }
        Rect rect = this.D;
        if (this.f632a != null) {
            this.f632a.getPadding(rect);
            i4 = (this.f632a.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f632a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.s = Math.max(this.i ? Math.max(this.z.getWidth(), this.A.getWidth()) + (this.c * 2) : 0, i4);
        if (this.f633b != null) {
            this.f633b.getPadding(rect);
            i5 = this.f633b.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        if (this.f632a != null) {
            Rect a2 = cf.a(this.f632a);
            i6 = Math.max(i6, a2.left);
            i7 = Math.max(i7, a2.right);
        }
        int max = Math.max(this.d, i7 + i6 + (this.s * 2));
        int max2 = Math.max(i5, i3);
        this.q = max;
        this.r = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(android.support.v4.view.by.j(this), max2);
        }
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.g : this.h;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    private Layout a(CharSequence charSequence) {
        CharSequence transformation = this.B != null ? this.B.getTransformation(charSequence, this) : charSequence;
        return new StaticLayout(transformation, this.x, transformation != null ? (int) Math.ceil(Layout.getDesiredWidth(transformation, this.x)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        float f2 = 1.0f;
        boolean z2 = false;
        this.n.addMovement(motionEvent);
        switch (android.support.v4.view.bc.a(motionEvent)) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled()) {
                    if (this.f632a != null) {
                        int thumbOffset = getThumbOffset();
                        this.f632a.getPadding(this.D);
                        int i = this.u - this.k;
                        int i2 = (thumbOffset + this.t) - this.k;
                        int i3 = this.s + i2 + this.D.left + this.D.right + this.k;
                        int i4 = this.w + this.k;
                        if (x > i2 && x < i3 && y > i && y < i4) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        this.j = 1;
                        this.l = x;
                        this.m = y;
                        break;
                    }
                }
                break;
            case 1:
            case 3:
                if (this.j != 2) {
                    this.j = 0;
                    this.n.clear();
                    break;
                } else {
                    this.j = 0;
                    boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                    boolean isChecked = isChecked();
                    if (z3) {
                        this.n.computeCurrentVelocity(1000);
                        float xVelocity = this.n.getXVelocity();
                        if (Math.abs(xVelocity) > this.o) {
                            z = gm.a(this) ? xVelocity < 0.0f : xVelocity > 0.0f;
                        } else {
                            z = getTargetCheckedState();
                        }
                    } else {
                        z = isChecked;
                    }
                    if (z != isChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(z);
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.onTouchEvent(obtain);
                    obtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
            case 2:
                switch (this.j) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.l) > this.k || Math.abs(y2 - this.m) > this.k) {
                            this.j = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.l = x2;
                            this.m = y2;
                            return true;
                        }
                        break;
                    case 2:
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x3 - this.l;
                        if (thumbScrollRange != 0) {
                            f = f3 / thumbScrollRange;
                        } else {
                            f = f3 > 0.0f ? 1.0f : -1.0f;
                        }
                        if (gm.a(this)) {
                            f = -f;
                        }
                        float f4 = f + this.p;
                        if (f4 < 0.0f) {
                            f2 = 0.0f;
                        } else if (f4 <= 1.0f) {
                            f2 = f4;
                        }
                        if (f2 == this.p) {
                            return true;
                        }
                        this.l = x3;
                        setThumbPosition(f2);
                        return true;
                }
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a() {
        if (this.C != null) {
            clearAnimation();
            this.C = null;
        }
    }

    private boolean getTargetCheckedState() {
        return this.p > 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbPosition(float f) {
        this.p = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !android.support.v4.view.by.H(this) || !isShown()) {
            a();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        if (this.C != null) {
            a();
        }
        this.C = new fs(this, this.p, isChecked ? 1.0f : 0.0f, (byte) 0);
        this.C.setDuration(250L);
        this.C.setAnimationListener(new fr(this, isChecked));
        startAnimation(this.C);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9 = 0;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f632a != null) {
            Rect rect = this.D;
            if (this.f633b != null) {
                this.f633b.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a2 = cf.a(this.f632a);
            i5 = Math.max(0, a2.left - rect.left);
            i9 = Math.max(0, a2.right - rect.right);
        } else {
            i5 = 0;
        }
        if (gm.a(this)) {
            int paddingLeft = getPaddingLeft() + i5;
            i7 = ((this.q + paddingLeft) - i5) - i9;
            i6 = paddingLeft;
        } else {
            int width = (getWidth() - getPaddingRight()) - i9;
            i6 = i9 + i5 + (width - this.q);
            i7 = width;
        }
        switch (getGravity() & 112) {
            case 16:
                i8 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.r / 2);
                height = this.r + i8;
                break;
            case 80:
                height = getHeight() - getPaddingBottom();
                i8 = height - this.r;
                break;
            default:
                i8 = getPaddingTop();
                height = this.r + i8;
                break;
        }
        this.t = i6;
        this.u = i8;
        this.w = height;
        this.v = i7;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        int i3;
        Rect rect2 = this.D;
        int i4 = this.t;
        int i5 = this.u;
        int i6 = this.v;
        int i7 = this.w;
        int thumbOffset = i4 + getThumbOffset();
        if (this.f632a != null) {
            rect = cf.a(this.f632a);
        } else {
            rect = cf.f733a;
        }
        if (this.f633b != null) {
            this.f633b.getPadding(rect2);
            int i8 = rect2.left + thumbOffset;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i4 += rect.left - rect2.left;
                }
                i3 = rect.top > rect2.top ? (rect.top - rect2.top) + i5 : i5;
                if (rect.right > rect2.right) {
                    i6 -= rect.right - rect2.right;
                }
                i2 = rect.bottom > rect2.bottom ? i7 - (rect.bottom - rect2.bottom) : i7;
            } else {
                i2 = i7;
                i3 = i5;
            }
            this.f633b.setBounds(i4, i3, i6, i2);
            i = i8;
        } else {
            i = thumbOffset;
        }
        if (this.f632a != null) {
            this.f632a.getPadding(rect2);
            int i9 = i - rect2.left;
            int i10 = i + this.s + rect2.right;
            this.f632a.setBounds(i9, i5, i10, i7);
            Drawable background = getBackground();
            if (background != null) {
                android.support.v4.c.a.a.a(background, i9, i5, i10, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.D;
        Drawable drawable = this.f633b;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.u;
        int i2 = this.w;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f632a;
        if (drawable != null) {
            if (this.f && drawable2 != null) {
                Rect a2 = cf.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a2.left;
                rect.right -= a2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.z : this.A;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.y != null) {
                this.x.setColor(this.y.getColorForState(drawableState, 0));
            }
            this.x.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.right + bounds.left;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!gm.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.q;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.e;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (gm.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.q;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.e;
        }
        return compoundPaddingRight;
    }

    private int getThumbOffset() {
        float f;
        if (gm.a(this)) {
            f = 1.0f - this.p;
        } else {
            f = this.p;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        if (this.f633b != null) {
            Rect rect2 = this.D;
            this.f633b.getPadding(rect2);
            if (this.f632a != null) {
                rect = cf.a(this.f632a);
            } else {
                rect = cf.f733a;
            }
            return ((((this.q - this.s) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        if (this.f632a != null) {
            this.f632a.setState(drawableState);
        }
        if (this.f633b != null) {
            this.f633b.setState(drawableState);
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.f632a != null) {
            android.support.v4.c.a.a.a(this.f632a, f, f2);
        }
        if (this.f633b != null) {
            android.support.v4.c.a.a.a(this.f633b, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f632a || drawable == this.f633b;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        if (Build.VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.f632a != null) {
                this.f632a.jumpToCurrentState();
            }
            if (this.f633b != null) {
                this.f633b.jumpToCurrentState();
            }
            a();
            setThumbPosition(isChecked() ? 1.0f : 0.0f);
        }
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            CharSequence charSequence = isChecked() ? this.g : this.h;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text).append(' ').append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }
}
