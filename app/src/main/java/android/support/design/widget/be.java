package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class be<V extends View> extends i<V> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f107a;

    /* renamed from: b, reason: collision with root package name */
    android.support.v4.widget.by f108b;
    bg c;
    private boolean i;
    private float h = 0.0f;
    int d = 2;
    float e = 0.5f;
    float f = 0.0f;
    float g = 0.5f;
    private final android.support.v4.widget.cb j = new bf(this);

    @Override // android.support.design.widget.i
    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        switch (android.support.v4.view.bc.a(motionEvent)) {
            case 1:
            case 3:
                if (this.f107a) {
                    this.f107a = false;
                    return false;
                }
                break;
            case 2:
            default:
                this.f107a = !coordinatorLayout.a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        if (this.f107a) {
            return false;
        }
        if (this.f108b == null) {
            this.f108b = this.i ? android.support.v4.widget.by.a(coordinatorLayout, this.h, this.j) : android.support.v4.widget.by.a(coordinatorLayout, this.j);
        }
        return this.f108b.a(motionEvent);
    }

    @Override // android.support.design.widget.i
    public final boolean a(MotionEvent motionEvent) {
        if (this.f108b == null) {
            return false;
        }
        this.f108b.b(motionEvent);
        return true;
    }

    public boolean b(View view) {
        return true;
    }

    static float a(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }
}
