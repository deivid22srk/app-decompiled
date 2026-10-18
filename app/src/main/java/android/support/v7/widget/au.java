package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
final class au {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f670a;

    /* renamed from: b, reason: collision with root package name */
    private final ao f671b;

    au(ImageView imageView, ao aoVar) {
        this.f670a = imageView;
        this.f671b = aoVar;
    }

    final void a(AttributeSet attributeSet, int i) {
        Drawable a2;
        fx a3 = fx.a(this.f670a.getContext(), attributeSet, android.support.v7.b.l.AppCompatImageView, i);
        try {
            Drawable b2 = a3.b(android.support.v7.b.l.AppCompatImageView_android_src);
            if (b2 != null) {
                this.f670a.setImageDrawable(b2);
            }
            int e = a3.e(android.support.v7.b.l.AppCompatImageView_srcCompat, -1);
            if (e != -1 && (a2 = this.f671b.a(this.f670a.getContext(), e, false)) != null) {
                this.f670a.setImageDrawable(a2);
            }
            Drawable drawable = this.f670a.getDrawable();
            if (drawable != null) {
                cf.b(drawable);
            }
        } finally {
            a3.f836a.recycle();
        }
    }

    final void a(int i) {
        Drawable a2;
        if (i != 0) {
            if (this.f671b == null) {
                a2 = android.support.v4.b.g.a(this.f670a.getContext(), i);
            } else {
                a2 = this.f671b.a(this.f670a.getContext(), i, false);
            }
            if (a2 != null) {
                cf.b(a2);
            }
            this.f670a.setImageDrawable(a2);
            return;
        }
        this.f670a.setImageDrawable(null);
    }
}
