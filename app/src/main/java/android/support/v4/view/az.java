package android.support.v4.view;

import android.view.MenuItem;

/* loaded from: classes.dex */
final class az {
    public static MenuItem a(MenuItem menuItem, bb bbVar) {
        return menuItem.setOnActionExpandListener(new ba(bbVar));
    }
}
