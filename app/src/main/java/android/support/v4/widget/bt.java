package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: classes.dex */
class bt extends bv {
    bt() {
    }

    @Override // android.support.v4.widget.bs, android.support.v4.widget.bw
    public void a(TextView textView, Drawable drawable) {
        boolean z = textView.getLayoutDirection() == 1;
        Drawable drawable2 = z ? null : drawable;
        if (!z) {
            drawable = null;
        }
        textView.setCompoundDrawables(drawable2, null, drawable, null);
    }

    @Override // android.support.v4.widget.bs, android.support.v4.widget.bw
    public void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        boolean z = textView.getLayoutDirection() == 1;
        Drawable drawable4 = z ? drawable3 : drawable;
        if (!z) {
            drawable = drawable3;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable4, drawable2, drawable, (Drawable) null);
    }

    @Override // android.support.v4.widget.bs, android.support.v4.widget.bw
    public void a(TextView textView, int i) {
        boolean z = textView.getLayoutDirection() == 1;
        int i2 = z ? i : 0;
        if (z) {
            i = 0;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, i, 0);
    }
}
