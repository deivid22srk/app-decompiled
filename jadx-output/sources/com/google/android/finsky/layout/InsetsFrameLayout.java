package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.android.vending.R;

/* loaded from: classes.dex */
public class InsetsFrameLayout extends FrameLayout implements bt {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3009a;

    static {
        f3009a = Build.VERSION.SDK_INT >= 21;
    }

    public InsetsFrameLayout(Context context) {
        this(context, null);
    }

    public InsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean z;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            KeyEvent.Callback childAt = getChildAt(i);
            if ((childAt instanceof bt) && ((bt) childAt).a()) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = getChildAt(i2);
                if (childAt2.getId() == R.id.action_bar_container_container) {
                    childAt2.setPadding(0, 0, 0, 0);
                }
            }
            return windowInsets.consumeSystemWindowInsets();
        }
        setPadding(0, 0, 0, 0);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt3 = getChildAt(i3);
            boolean z2 = childAt3.getId() == R.id.action_bar_container_container;
            boolean z3 = (childAt3 instanceof bt) && ((bt) childAt3).a();
            if (z2 || z3) {
                childAt3.dispatchApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // com.google.android.finsky.layout.bt
    public final boolean a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if ((childAt instanceof bt) && ((bt) childAt).a()) {
                return true;
            }
        }
        return false;
    }
}
