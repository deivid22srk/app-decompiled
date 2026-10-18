package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.js;
import com.google.android.finsky.utils.jx;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class WishlistPlayActionButton extends PlayActionButton implements jx {

    /* renamed from: a, reason: collision with root package name */
    public Document f3102a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3103b;
    public View.OnClickListener c;

    public WishlistPlayActionButton(Context context) {
        super(context);
    }

    public WishlistPlayActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(boolean z, int i) {
        if (z) {
            a(i, getContext().getString(R.string.label_wishlist_remove_action), this.c);
        } else {
            a(i, getContext().getString(R.string.label_wishlist_add_action), this.c);
        }
    }

    @Override // com.google.android.finsky.utils.jx
    public final void a(String str, boolean z, boolean z2) {
        if (this.f3103b && str.equals(this.f3102a.f1963a.f3890a)) {
            a(z, this.f3102a.f1963a.g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        js.a(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        js.b(this);
        super.onDetachedFromWindow();
    }
}
