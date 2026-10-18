package android.support.v4.view;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class ca extends bz {
    ca() {
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(ViewGroup viewGroup) {
        if (cn.f366a == null) {
            try {
                cn.f366a = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e);
            }
            cn.f366a.setAccessible(true);
        }
        try {
            cn.f366a.invoke(viewGroup, true);
        } catch (IllegalAccessException e2) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (IllegalArgumentException e3) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (InvocationTargetException e4) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e4);
        }
    }
}
