package android.support.v7.widget;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class bi implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg f698a;

    bi(bg bgVar) {
        this.f698a = bgVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!bg.a(this.f698a, this.f698a.f695b)) {
            this.f698a.d();
        } else {
            this.f698a.a();
            super/*android.support.v7.widget.cu*/.b();
        }
    }
}
