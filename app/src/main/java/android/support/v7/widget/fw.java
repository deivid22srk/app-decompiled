package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class fw extends Resources {

    /* renamed from: a, reason: collision with root package name */
    private final Context f835a;

    fw(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f835a = context;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) {
        ao a2 = ao.a();
        Context context = this.f835a;
        Drawable a3 = a2.a(context, i);
        if (a3 == null) {
            a3 = super.getDrawable(i);
        }
        if (a3 != null) {
            return a2.a(context, i, false, a3);
        }
        return null;
    }
}
