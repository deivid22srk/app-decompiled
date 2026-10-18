package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: classes.dex */
class bu extends bt {
    bu() {
    }

    @Override // android.support.v4.widget.bt, android.support.v4.widget.bs, android.support.v4.widget.bw
    public final void a(TextView textView, Drawable drawable) {
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    @Override // android.support.v4.widget.bt, android.support.v4.widget.bs, android.support.v4.widget.bw
    public final void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, (Drawable) null);
    }

    @Override // android.support.v4.widget.bt, android.support.v4.widget.bs, android.support.v4.widget.bw
    public final void a(TextView textView, int i) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
    }
}
