package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class o extends av implements s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f860a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f861b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar, Context context) {
        super(context, null, android.support.v7.b.b.actionOverflowButtonStyle);
        this.f860a = kVar;
        this.f861b = new float[2];
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setOnTouchListener(new p(this, this, kVar));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.f860a.c();
        }
        return true;
    }

    @Override // android.support.v7.widget.s
    public final boolean c() {
        return false;
    }

    @Override // android.support.v7.widget.s
    public final boolean d() {
        return false;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            android.support.v4.c.a.a.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
