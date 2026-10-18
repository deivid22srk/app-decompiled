package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ax extends PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f676a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f677b;

    static {
        f676a = Build.VERSION.SDK_INT < 21;
    }

    public ax(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fx a2 = fx.a(context, attributeSet, android.support.v7.b.l.PopupWindow, i);
        if (a2.e(android.support.v7.b.l.PopupWindow_overlapAnchor)) {
            boolean a3 = a2.a(android.support.v7.b.l.PopupWindow_overlapAnchor, false);
            if (f676a) {
                this.f677b = a3;
            } else {
                android.support.v4.widget.as.a(this, a3);
            }
        }
        setBackgroundDrawable(a2.a(android.support.v7.b.l.PopupWindow_android_popupBackground));
        a2.f836a.recycle();
        if (Build.VERSION.SDK_INT < 14) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
                declaredField.setAccessible(true);
                Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                declaredField2.setAccessible(true);
                declaredField2.set(this, new ay(declaredField, this, (ViewTreeObserver.OnScrollChangedListener) declaredField2.get(this)));
            } catch (Exception e) {
                Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", e);
            }
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        if (f676a && this.f677b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    @TargetApi(19)
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (f676a && this.f677b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, (f676a && this.f677b) ? i2 - view.getHeight() : i2, i3, i4);
    }
}
