package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class FadingEdgeImageView extends FifeImageView {
    private boolean e;
    private boolean f;
    private int g;

    public FadingEdgeImageView(Context context) {
        super(context);
    }

    public FadingEdgeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(boolean z, boolean z2, int i, int i2) {
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength(i);
        this.e = z;
        this.f = z2;
        this.g = i2;
        invalidate();
    }

    public final void b() {
        setHorizontalFadingEdgeEnabled(false);
        setFadingEdgeLength(0);
        this.e = false;
        this.f = false;
        invalidate();
    }

    @Override // android.view.View
    protected float getLeftFadingEdgeStrength() {
        return this.e ? 1.0f : 0.0f;
    }

    @Override // android.view.View
    protected float getRightFadingEdgeStrength() {
        return this.f ? 1.0f : 0.0f;
    }

    @Override // android.view.View
    @ViewDebug.ExportedProperty(category = "drawing")
    public int getSolidColor() {
        return (this.e || this.f) ? this.g : super.getSolidColor();
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return true;
    }

    @Override // android.view.View
    protected boolean onSetAlpha(int i) {
        return false;
    }
}
