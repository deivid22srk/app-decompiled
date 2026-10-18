package android.support.v7.a;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* loaded from: classes.dex */
final class ba extends ContentFrameLayout {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f492a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(ap apVar, Context context) {
        super(context);
        this.f492a = apVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f492a.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                r1.a(this.f492a.e(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(android.support.v7.widget.ao.a().a(getContext(), i, false));
    }
}
