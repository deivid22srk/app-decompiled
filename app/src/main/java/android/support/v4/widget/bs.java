package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: classes.dex */
class bs implements bw {
    bs() {
    }

    @Override // android.support.v4.widget.bw
    public void a(TextView textView, Drawable drawable) {
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    @Override // android.support.v4.widget.bw
    public void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, (Drawable) null);
    }

    @Override // android.support.v4.widget.bw
    public void a(TextView textView, int i) {
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }
}
