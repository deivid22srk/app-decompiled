package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
final class s implements r {
    private static final int e = ViewConfiguration.getLongPressTimeout();
    private static final int f = ViewConfiguration.getTapTimeout();
    private static final int g = ViewConfiguration.getDoubleTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    private int f400a;

    /* renamed from: b, reason: collision with root package name */
    private int f401b;
    private int c;
    private int d;
    private final Handler h = new t(this);
    private final GestureDetector.OnGestureListener i;
    private GestureDetector.OnDoubleTapListener j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private MotionEvent p;
    private MotionEvent q;
    private boolean r;
    private float s;
    private float t;
    private float u;
    private float v;
    private boolean w;
    private VelocityTracker x;

    static /* synthetic */ boolean f(s sVar) {
        sVar.l = true;
        return true;
    }

    public s(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.i = onGestureListener;
        if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
            this.j = (GestureDetector.OnDoubleTapListener) onGestureListener;
        }
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        if (this.i == null) {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        }
        this.w = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        this.c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f400a = scaledTouchSlop * scaledTouchSlop;
        this.f401b = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    @Override // android.support.v4.view.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.s.a(android.view.MotionEvent):boolean");
    }

    static /* synthetic */ void c(s sVar) {
        sVar.h.removeMessages(3);
        sVar.l = false;
        sVar.m = true;
        sVar.i.onLongPress(sVar.p);
    }
}
