package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
final class dd implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cu f760a;

    private dd(cu cuVar) {
        this.f760a = cuVar;
    }

    /* synthetic */ dd(cu cuVar, byte b2) {
        this(cuVar);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        PopupWindow popupWindow;
        Handler handler;
        df dfVar;
        df dfVar2;
        if (i == 1 && !this.f760a.g()) {
            popupWindow = this.f760a.c;
            if (popupWindow.getContentView() != null) {
                handler = this.f760a.C;
                dfVar = this.f760a.x;
                handler.removeCallbacks(dfVar);
                dfVar2 = this.f760a.x;
                dfVar2.run();
            }
        }
    }
}
