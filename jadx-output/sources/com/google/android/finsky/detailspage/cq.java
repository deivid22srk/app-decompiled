package com.google.android.finsky.detailspage;

import android.widget.ImageView;
import android.widget.PopupWindow;
import com.android.vending.R;

/* loaded from: classes.dex */
final class cq implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cp f2591a;

    cq(cp cpVar) {
        this.f2591a = cpVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ImageView imageView;
        imageView = this.f2591a.f2590b.l;
        imageView.setImageResource(R.drawable.play_overflow_menu);
    }
}
