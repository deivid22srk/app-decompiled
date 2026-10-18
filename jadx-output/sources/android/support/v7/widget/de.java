package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
final class de implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cu f761a;

    private de(cu cuVar) {
        this.f761a = cuVar;
    }

    /* synthetic */ de(cu cuVar, byte b2) {
        this(cuVar);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Handler handler;
        df dfVar;
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        PopupWindow popupWindow3;
        PopupWindow popupWindow4;
        Handler handler2;
        df dfVar2;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            popupWindow = this.f761a.c;
            if (popupWindow != null) {
                popupWindow2 = this.f761a.c;
                if (popupWindow2.isShowing() && x >= 0) {
                    popupWindow3 = this.f761a.c;
                    if (x < popupWindow3.getWidth() && y >= 0) {
                        popupWindow4 = this.f761a.c;
                        if (y < popupWindow4.getHeight()) {
                            handler2 = this.f761a.C;
                            dfVar2 = this.f761a.x;
                            handler2.postDelayed(dfVar2, 250L);
                            return false;
                        }
                    }
                }
            }
        }
        if (action == 1) {
            handler = this.f761a.C;
            dfVar = this.f761a.x;
            handler.removeCallbacks(dfVar);
            return false;
        }
        return false;
    }
}
