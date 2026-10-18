package com.google.android.finsky.layout.scroll;

import android.content.Context;
import android.support.v4.view.q;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* loaded from: classes.dex */
public class GestureScrollView extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    private q f3520a;

    /* renamed from: b, reason: collision with root package name */
    private GestureDetector.SimpleOnGestureListener f3521b;
    private b c;

    public GestureScrollView(Context context) {
        this(context, null);
    }

    public GestureScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3521b = new a(this);
        this.f3520a = new q(context, this.f3521b);
    }

    public void setFlingToDismissListener(b bVar) {
        this.c = bVar;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f3520a.a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
