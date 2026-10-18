package android.support.v4.c.apkg;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class l extends Drawable implements Drawable.Callback, k {

    /* renamed from: a, reason: collision with root package name */
    public static final PorterDuff.Mode f266a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    m f267b;
    Drawable c;
    public int d;
    public PorterDuff.Mode e;
    public boolean f;
    public boolean g;

    l(m mVar, Resources resources) {
        this.f267b = mVar;
        if (this.f267b == null || this.f267b.f269b == null) {
            return;
        }
        a(a(this.f267b.f269b, resources));
    }

    l(Drawable drawable) {
        this.f267b = b();
        this.c = drawable;
    }

    public Drawable a(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        if (this.c != null) {
            this.c.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.c.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return (this.f267b != null ? this.f267b.getChangingConfigurations() : 0) | super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.c.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = c() ? this.f267b.c : null;
        return (colorStateList != null && colorStateList.isStateful()) || this.c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return a(iArr) || this.c.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.c.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.c.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.c.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.c.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.c.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.c.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.c.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.c.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f267b != null) {
            if (this.f267b.f269b != null) {
                this.f267b.f268a = getChangingConfigurations();
                return this.f267b;
            }
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.g && super.mutate() == this) {
            this.f267b = b();
            if (this.c != null) {
                this.c.mutate();
            }
            if (this.f267b != null) {
                this.f267b.f269b = this.c != null ? this.c.getConstantState() : null;
            }
            this.g = true;
        }
        return this;
    }

    m b() {
        return new n(this.f267b);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.c.setLevel(i);
    }

    @Override // android.support.v4.c.apkg.k
    public final void a(int i) {
        a(ColorStateList.valueOf(i));
    }

    @Override // android.support.v4.c.apkg.k
    public final void a(ColorStateList colorStateList) {
        this.f267b.c = colorStateList;
        a(getState());
    }

    @Override // android.support.v4.c.apkg.k
    public final void a(PorterDuff.Mode mode) {
        this.f267b.d = mode;
        a(getState());
    }

    public boolean a(int[] iArr) {
        if (!c()) {
            return false;
        }
        ColorStateList colorStateList = this.f267b.c;
        PorterDuff.Mode mode = this.f267b.d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (this.f && colorForState == this.d && mode == this.e) {
                return false;
            }
            setColorFilter(colorForState, mode);
            this.d = colorForState;
            this.e = mode;
            this.f = true;
            return true;
        }
        this.f = false;
        clearColorFilter();
        return false;
    }

    @Override // android.support.v4.c.apkg.k
    public final Drawable a() {
        return this.c;
    }

    @Override // android.support.v4.c.apkg.k
    public final void a(Drawable drawable) {
        if (this.c != null) {
            this.c.setCallback(null);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setVisible(isVisible(), true);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (this.f267b != null) {
                this.f267b.f269b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public boolean c() {
        return true;
    }
}
