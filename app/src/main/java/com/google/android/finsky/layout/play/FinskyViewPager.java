package com.google.android.finsky.layout.play;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class FinskyViewPager extends ViewPager {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3294b;
    private z c;

    public FinskyViewPager(Context context) {
        this(context, null);
    }

    public FinskyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3294b = false;
    }

    public final void setAnimationParameters$3059d049(Interpolator interpolator) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            declaredField.set(this, new aa(getContext(), interpolator));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            FinskyLog.e("Error setting animation parameters", e);
        }
    }

    public void setMeasureOverrider(z zVar) {
        this.c = zVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.view.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.c == null) {
            super.onMeasure(i, i2);
        } else {
            Pair<Integer, Integer> a2 = this.c.a(i);
            super.onMeasure(((Integer) a2.first).intValue(), ((Integer) a2.second).intValue());
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f3294b && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f3294b && super.onTouchEvent(motionEvent);
    }
}
