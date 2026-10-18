package android.support.design.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends i<FloatingActionButton> {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f142a;

    /* renamed from: b, reason: collision with root package name */
    private bj f143b;
    private float c;
    private Rect d;

    @Override // android.support.design.widget.i
    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
        Rect rect;
        int i2;
        int i3 = 0;
        FloatingActionButton floatingActionButton2 = floatingActionButton;
        List<View> a2 = coordinatorLayout.a(floatingActionButton2);
        int size = a2.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = a2.get(i4);
            if ((view instanceof c) && a(coordinatorLayout, (c) view, floatingActionButton2)) {
                break;
            }
        }
        coordinatorLayout.a(floatingActionButton2, i);
        rect = floatingActionButton2.h;
        if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
            return true;
        }
        l lVar = (l) floatingActionButton2.getLayoutParams();
        if (floatingActionButton2.getRight() >= coordinatorLayout.getWidth() - lVar.rightMargin) {
            i2 = rect.right;
        } else {
            i2 = floatingActionButton2.getLeft() <= lVar.leftMargin ? -rect.left : 0;
        }
        if (floatingActionButton2.getBottom() >= coordinatorLayout.getBottom() - lVar.bottomMargin) {
            i3 = rect.bottom;
        } else if (floatingActionButton2.getTop() <= lVar.topMargin) {
            i3 = -rect.top;
        }
        floatingActionButton2.offsetTopAndBottom(i3);
        floatingActionButton2.offsetLeftAndRight(i2);
        return true;
    }

    @Override // android.support.design.widget.i
    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        float f;
        boolean z;
        FloatingActionButton floatingActionButton2 = floatingActionButton;
        if (!(view instanceof Snackbar.SnackbarLayout)) {
            if (view instanceof c) {
                a(coordinatorLayout, (c) view, floatingActionButton2);
            }
        } else {
            float f2 = 0.0f;
            List<View> a2 = coordinatorLayout.a(floatingActionButton2);
            int size = a2.size();
            int i = 0;
            while (i < size) {
                View view2 = a2.get(i);
                if (view2 instanceof Snackbar.SnackbarLayout) {
                    if (floatingActionButton2.getVisibility() == 0 && view2.getVisibility() == 0) {
                        Rect rect = coordinatorLayout.h;
                        coordinatorLayout.a(floatingActionButton2, floatingActionButton2.getParent() != coordinatorLayout, rect);
                        Rect rect2 = coordinatorLayout.i;
                        coordinatorLayout.a(view2, view2.getParent() != coordinatorLayout, rect2);
                        z = rect.left <= rect2.right && rect.top <= rect2.bottom && rect.right >= rect2.left && rect.bottom >= rect2.top;
                    } else {
                        z = false;
                    }
                    if (z) {
                        f = Math.min(f2, android.support.v4.view.by.q(view2) - view2.getHeight());
                        i++;
                        f2 = f;
                    }
                }
                f = f2;
                i++;
                f2 = f;
            }
            if (this.c != f2) {
                float q = android.support.v4.view.by.q(floatingActionButton2);
                if (this.f143b != null && this.f143b.f114a.b()) {
                    this.f143b.f114a.d();
                }
                if (floatingActionButton2.isShown() && Math.abs(q - f2) > floatingActionButton2.getHeight() * 0.667f) {
                    if (this.f143b == null) {
                        this.f143b = by.a();
                        this.f143b.f114a.a(a.f73b);
                        bj bjVar = this.f143b;
                        bjVar.f114a.a(new bk(bjVar, new t(this, floatingActionButton2)));
                    }
                    this.f143b.f114a.a(q, f2);
                    this.f143b.f114a.a();
                } else {
                    android.support.v4.view.by.b(floatingActionButton2, f2);
                }
                this.c = f2;
            }
        }
        return false;
    }

    static {
        f142a = Build.VERSION.SDK_INT >= 11;
    }

    private boolean a(CoordinatorLayout coordinatorLayout, c cVar, FloatingActionButton floatingActionButton) {
        if (((l) floatingActionButton.getLayoutParams()).f == cVar.getId() && floatingActionButton.getUserSetVisibility() == 0) {
            if (this.d == null) {
                this.d = new Rect();
            }
            Rect rect = this.d;
            bt.a(coordinatorLayout, cVar, rect);
            if (rect.bottom <= cVar.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.b(false);
            } else {
                floatingActionButton.a(false);
            }
            return true;
        }
        return false;
    }

    @Override // android.support.design.widget.i
    public final /* bridge */ /* synthetic */ boolean a(View view) {
        return f142a && (view instanceof Snackbar.SnackbarLayout);
    }
}
