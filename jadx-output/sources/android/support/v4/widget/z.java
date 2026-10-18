package android.support.v4.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f470a;

    z(y yVar) {
        this.f470a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i;
        y yVar = this.f470a;
        int i2 = yVar.f469b.i;
        boolean z = yVar.f468a == 3;
        if (z) {
            View a2 = yVar.c.a(3);
            int i3 = (a2 != null ? -a2.getWidth() : 0) + i2;
            view = a2;
            i = i3;
        } else {
            View a3 = yVar.c.a(5);
            int width = yVar.c.getWidth() - i2;
            view = a3;
            i = width;
        }
        if (view != null) {
            if (((!z || view.getLeft() >= i) && (z || view.getLeft() <= i)) || yVar.c.a(view) != 0) {
                return;
            }
            w wVar = (w) view.getLayoutParams();
            yVar.f469b.a(view, i, view.getTop());
            wVar.c = true;
            yVar.c.invalidate();
            yVar.b();
            DrawerLayout drawerLayout = yVar.c;
            if (drawerLayout.e) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = drawerLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                drawerLayout.getChildAt(i4).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            drawerLayout.e = true;
        }
    }
}
