package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class eb {
    public void a(Canvas canvas, RecyclerView recyclerView) {
    }

    public void b(Canvas canvas, RecyclerView recyclerView) {
    }

    public void a(Rect rect, View view) {
        ((ed) view.getLayoutParams()).c.c();
        rect.set(0, 0, 0, 0);
    }
}
