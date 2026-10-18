package com.google.android.play.utils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class i extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    private final View f7082a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f7083b;
    private final Rect c;
    private boolean d;
    private final int e;
    private final AccessibilityManager f;

    public i(Rect rect, View view) {
        super(rect, view);
        this.f7083b = rect;
        this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.c = new Rect(rect);
        this.c.inset(-this.e, -this.e);
        this.f7082a = view;
        this.f = (AccessibilityManager) view.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = true;
        if (this.f != null && android.support.v4.view.apkg.f.a(this.f)) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f7083b.contains(x, y)) {
                    this.d = true;
                    z = true;
                    break;
                }
                z = false;
                break;
            case 1:
            case 2:
                boolean z3 = this.d;
                boolean z4 = !z3 || this.c.contains(x, y);
                if (motionEvent.getAction() != 1) {
                    z2 = z4;
                    z = z3;
                    break;
                } else {
                    this.d = false;
                    z2 = z4;
                    z = z3;
                    break;
                }
                break;
            case 3:
                z = this.d;
                this.d = false;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            return false;
        }
        View view = this.f7082a;
        if (z2) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            int i = this.e;
            motionEvent.setLocation(-(i * 2), -(i * 2));
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
