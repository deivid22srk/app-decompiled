package android.support.v4.widget;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
final class ab implements View.OnApplyWindowInsetsListener {
    ab() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((ac) view).a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}
