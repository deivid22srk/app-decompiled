package android.support.v4.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public class g {
    public static final Drawable a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 21 ? context.getDrawable(i) : context.getResources().getDrawable(i);
    }

    public static final int b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }
}
