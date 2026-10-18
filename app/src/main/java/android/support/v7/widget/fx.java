package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class fx {

    /* renamed from: a, reason: collision with root package name */
    public final TypedArray f836a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f837b;

    public static fx a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new fx(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static fx a(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new fx(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    private fx(Context context, TypedArray typedArray) {
        this.f837b = context;
        this.f836a = typedArray;
    }

    public final Drawable a(int i) {
        int resourceId;
        return (!this.f836a.hasValue(i) || (resourceId = this.f836a.getResourceId(i, 0)) == 0) ? this.f836a.getDrawable(i) : ao.a().a(this.f837b, resourceId, false);
    }

    public final Drawable b(int i) {
        int resourceId;
        if (!this.f836a.hasValue(i) || (resourceId = this.f836a.getResourceId(i, 0)) == 0) {
            return null;
        }
        return ao.a().a(this.f837b, resourceId, true);
    }

    public final CharSequence c(int i) {
        return this.f836a.getText(i);
    }

    public final boolean a(int i, boolean z) {
        return this.f836a.getBoolean(i, z);
    }

    public final int a(int i, int i2) {
        return this.f836a.getInt(i, i2);
    }

    public final int d(int i) {
        return this.f836a.getColor(i, -1);
    }

    public final int b(int i, int i2) {
        return this.f836a.getDimensionPixelOffset(i, i2);
    }

    public final int c(int i, int i2) {
        return this.f836a.getDimensionPixelSize(i, i2);
    }

    public final int d(int i, int i2) {
        return this.f836a.getLayoutDimension(i, i2);
    }

    public final int e(int i, int i2) {
        return this.f836a.getResourceId(i, i2);
    }

    public final boolean e(int i) {
        return this.f836a.hasValue(i);
    }
}
