package com.google.android.play.drawer;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
final class p implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayDrawerDownloadSwitchRow f6872a;

    p(PlayDrawerDownloadSwitchRow playDrawerDownloadSwitchRow) {
        this.f6872a = playDrawerDownloadSwitchRow;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        return false;
    }
}
