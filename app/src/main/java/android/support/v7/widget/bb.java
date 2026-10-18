package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public final class bb extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    private az f686a;

    /* renamed from: b, reason: collision with root package name */
    private ao f687b;

    public bb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.ratingBarStyle);
    }

    private bb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f687b = ao.a();
        this.f686a = new az(this, this.f687b);
        this.f686a.a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f686a.f681b;
        if (bitmap != null) {
            setMeasuredDimension(android.support.v4.view.by.a(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
