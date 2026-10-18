package android.support.design.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class bt {

    /* renamed from: a, reason: collision with root package name */
    private static final bu f123a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f123a = new bw((byte) 0);
        } else {
            f123a = new bv((byte) 0);
        }
    }

    static void a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        f123a.a(viewGroup, view, rect);
    }
}
