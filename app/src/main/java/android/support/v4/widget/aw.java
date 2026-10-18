package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class aw extends av {
    aw() {
    }

    @Override // android.support.v4.widget.av, android.support.v4.widget.ay
    public void a(PopupWindow popupWindow, int i) {
        if (!ba.f435b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                ba.f434a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
            }
            ba.f435b = true;
        }
        if (ba.f434a != null) {
            try {
                ba.f434a.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception e2) {
            }
        }
    }
}
