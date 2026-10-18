package com.google.android.finsky.layout;

import android.widget.ImageView;
import android.widget.PopupWindow;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class dk implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dj f3226a;

    dk(dj djVar) {
        this.f3226a = djVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ImageView imageView;
        imageView = this.f3226a.f3225b.p;
        imageView.setImageResource(R.drawable.play_overflow_menu);
    }
}
