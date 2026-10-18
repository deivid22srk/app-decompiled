package android.support.v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class cy implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f754a;
    private final View d;
    private Runnable e;
    private Runnable f;
    private boolean g;
    private boolean h;
    private int i;
    private final int[] j = new int[2];

    /* renamed from: b, reason: collision with root package name */
    private final int f755b = ViewConfiguration.getTapTimeout();
    private final int c = (this.f755b + ViewConfiguration.getLongPressTimeout()) / 2;

    public abstract cu a();

    public cy(View view) {
        this.d = view;
        this.f754a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0042  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.cy.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean b() {
        cu a2 = a();
        if (a2 != null && !a2.c.isShowing()) {
            a2.b();
            return true;
        }
        return true;
    }

    protected boolean c() {
        cu a2 = a();
        if (a2 != null && a2.c.isShowing()) {
            a2.d();
            return true;
        }
        return true;
    }

    private void d() {
        if (this.f != null) {
            this.d.removeCallbacks(this.f);
        }
        if (this.e != null) {
            this.d.removeCallbacks(this.e);
        }
    }

    private boolean a(MotionEvent motionEvent) {
        cx cxVar;
        View view = this.d;
        cu a2 = a();
        if (a2 == null || !a2.c.isShowing()) {
            return false;
        }
        cxVar = a2.d;
        if (cxVar == null || !cxVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        view.getLocationOnScreen(this.j);
        obtainNoHistory.offsetLocation(r5[0], r5[1]);
        cxVar.getLocationOnScreen(this.j);
        obtainNoHistory.offsetLocation(-r2[0], -r2[1]);
        boolean a3 = cxVar.a(obtainNoHistory, this.i);
        obtainNoHistory.recycle();
        int a4 = android.support.v4.view.bc.a(motionEvent);
        return a3 && (a4 != 1 && a4 != 3);
    }

    static /* synthetic */ void b(cy cyVar) {
        cyVar.d();
        View view = cyVar.d;
        if (!view.isEnabled() || view.isLongClickable() || !cyVar.b()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        cyVar.g = true;
        cyVar.h = true;
    }
}
