package android.support.a.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;

@TargetApi(21)
/* loaded from: classes.dex */
abstract class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    Drawable f44a;

    f() {
    }

    static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.f44a != null) {
            this.f44a.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f44a != null ? this.f44a.getColorFilter() : super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f44a != null ? this.f44a.setLevel(i) : super.onLevelChange(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f44a != null) {
            this.f44a.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        if (this.f44a != null) {
            this.f44a.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f44a != null) {
            this.f44a.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(23)
    public void getHotspotBounds(Rect rect) {
        if (this.f44a != null && Build.VERSION.SDK_INT >= 23) {
            this.f44a.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f44a != null ? this.f44a.getBounds() : super.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        if (this.f44a != null) {
            this.f44a.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(23)
    public boolean isFilterBitmap() {
        if (this.f44a == null || Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return this.f44a.isFilterBitmap();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f44a != null) {
            this.f44a.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        if (this.f44a != null) {
            this.f44a.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f44a != null) {
            this.f44a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.f44a != null) {
            return this.f44a.isAutoMirrored();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.f44a != null) {
            this.f44a.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(23)
    public int getLayoutDirection() {
        if (this.f44a == null || Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        return this.f44a.getLayoutDirection();
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(23)
    public boolean onLayoutDirectionChanged(int i) {
        if (this.f44a == null || Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return this.f44a.onLayoutDirectionChanged(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        if (this.f44a != null) {
            this.f44a.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f44a != null ? this.f44a.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f44a != null ? this.f44a.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f44a != null ? this.f44a.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f44a != null ? this.f44a.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f44a != null ? this.f44a.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f44a != null ? this.f44a.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        if (this.f44a != null) {
            this.f44a.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f44a != null ? this.f44a.setState(iArr) : super.setState(iArr);
    }
}
