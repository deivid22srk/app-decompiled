package android.support.v7.widget;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
final class l extends android.support.v7.view.menu.v {
    final /* synthetic */ k g;
    private android.support.v7.view.menu.ad h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, Context context, android.support.v7.view.menu.ad adVar) {
        super(context, adVar, null, false, android.support.v7.b.b.actionOverflowMenuStyle);
        View view;
        boolean z = false;
        this.g = kVar;
        this.h = adVar;
        if (!((android.support.v7.view.menu.m) adVar.getItem()).f()) {
            if (kVar.i == null) {
                view = (View) kVar.g;
            } else {
                view = kVar.i;
            }
            this.f603b = view;
        }
        this.d = kVar.r;
        int size = adVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = adVar.getItem(i);
            if (!item.isVisible() || item.getIcon() == null) {
                i++;
            } else {
                z = true;
                break;
            }
        }
        this.e = z;
    }

    @Override // android.support.v7.view.menu.v, android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        super.onDismiss();
        this.g.p = null;
        this.g.s = 0;
    }
}
