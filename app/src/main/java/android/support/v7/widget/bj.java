package android.support.v7.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
final class bj implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f699a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bg f700b;

    bj(bg bgVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f700b = bgVar;
        this.f699a = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f700b.f695b.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f699a);
        }
    }
}
