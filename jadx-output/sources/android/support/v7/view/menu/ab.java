package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes.dex */
public final class ab {
    public static Menu a(Context context, android.support.v4.e.a.a aVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            return new ac(context, aVar);
        }
        throw new UnsupportedOperationException();
    }

    public static MenuItem a(Context context, android.support.v4.e.a.b bVar) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new t(context, bVar);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return new o(context, bVar);
        }
        throw new UnsupportedOperationException();
    }
}
