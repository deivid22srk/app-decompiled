package com.google.android.finsky.utils;

import android.widget.PopupWindow;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class fq implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fk f4883a;

    fq(fk fkVar) {
        this.f4883a = fkVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4883a.f4874b.setImageResource(R.drawable.play_overflow_menu);
    }
}
