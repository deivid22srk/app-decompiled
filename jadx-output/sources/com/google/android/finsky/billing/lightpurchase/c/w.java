package com.google.android.finsky.billing.lightpurchase.c;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
final class w implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScrollView f2376a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f2377b;

    w(v vVar, ScrollView scrollView) {
        this.f2377b = vVar;
        this.f2376a = scrollView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.f2377b.j()) {
            if (this.f2376a.getHeight() < this.f2376a.getChildAt(0).getHeight()) {
                ik.a(this.f2376a, this.f2377b.g().getDrawable(R.drawable.bottom_border));
            } else {
                ik.a(this.f2376a, (Drawable) null);
            }
        }
    }
}
