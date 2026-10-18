package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

@j(a = s.class)
/* loaded from: classes.dex */
public class FloatingActionButton extends cd {

    /* renamed from: a, reason: collision with root package name */
    private ColorStateList f66a;

    /* renamed from: b, reason: collision with root package name */
    private PorterDuff.Mode f67b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private final Rect h;
    private final ad i;

    @Override // android.support.design.widget.cd, android.widget.ImageView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PorterDuff.Mode mode;
        bi.a(context);
        this.h = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.design.i.FloatingActionButton, i, android.support.design.h.Widget_Design_FloatingActionButton);
        this.f66a = obtainStyledAttributes.getColorStateList(android.support.design.i.FloatingActionButton_backgroundTint);
        switch (obtainStyledAttributes.getInt(android.support.design.i.FloatingActionButton_backgroundTintMode, -1)) {
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 9:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 14:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 15:
                mode = PorterDuff.Mode.SCREEN;
                break;
            default:
                mode = null;
                break;
        }
        this.f67b = mode;
        this.d = obtainStyledAttributes.getColor(android.support.design.i.FloatingActionButton_rippleColor, 0);
        this.e = obtainStyledAttributes.getInt(android.support.design.i.FloatingActionButton_fabSize, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(android.support.design.i.FloatingActionButton_borderWidth, 0);
        float dimension = obtainStyledAttributes.getDimension(android.support.design.i.FloatingActionButton_elevation, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(android.support.design.i.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.g = obtainStyledAttributes.getBoolean(android.support.design.i.FloatingActionButton_useCompatPadding, false);
        obtainStyledAttributes.recycle();
        r rVar = new r(this);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            this.i = new ag(this, rVar);
        } else if (i2 >= 14) {
            this.i = new aa(this, rVar);
        } else {
            this.i = new u(this, rVar);
        }
        this.f = (getSizeDimension() - ((int) getResources().getDimension(android.support.design.e.design_fab_image_size))) / 2;
        this.i.a(this.f66a, this.f67b, this.d, this.c);
        this.i.c(dimension);
        ad adVar = this.i;
        if (adVar.g != dimension2) {
            adVar.g = dimension2;
            adVar.b(dimension2);
        }
        this.i.f();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        int min = Math.min(a(sizeDimension, i), a(sizeDimension, i2));
        setMeasuredDimension(this.h.left + min + this.h.right, min + this.h.top + this.h.bottom);
    }

    public void setRippleColor(int i) {
        if (this.d != i) {
            this.d = i;
            this.i.a(i);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f66a;
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f66a != colorStateList) {
            this.f66a = colorStateList;
            this.i.a(colorStateList);
        }
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f67b;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f67b != mode) {
            this.f67b = mode;
            this.i.a(mode);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void a(boolean z) {
        this.i.b(z);
    }

    public final void b(boolean z) {
        this.i.a(z);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.g != z) {
            this.g = z;
            this.i.c();
        }
    }

    public boolean getUseCompatPadding() {
        return this.g;
    }

    final int getSizeDimension() {
        switch (this.e) {
            case 1:
                return getResources().getDimensionPixelSize(android.support.design.e.design_fab_size_mini);
            default:
                return getResources().getDimensionPixelSize(android.support.design.e.design_fab_size_normal);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ad adVar = this.i;
        if (!adVar.d()) {
            return;
        }
        if (adVar.m == null) {
            adVar.m = new ae(adVar);
        }
        adVar.k.getViewTreeObserver().addOnPreDrawListener(adVar.m);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad adVar = this.i;
        if (adVar.m == null) {
            return;
        }
        adVar.k.getViewTreeObserver().removeOnPreDrawListener(adVar.m);
        adVar.m = null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.i.a(getDrawableState());
    }

    @Override // android.widget.ImageView, android.view.View
    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.i.b();
    }

    public Drawable getContentBackground() {
        return this.i.e;
    }

    private static int a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(i, size);
            case 0:
            default:
                return i;
            case 1073741824:
                return size;
        }
    }

    public float getCompatElevation() {
        return this.i.a();
    }

    public void setCompatElevation(float f) {
        this.i.c(f);
    }
}
