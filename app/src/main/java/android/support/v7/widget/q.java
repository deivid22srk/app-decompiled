package android.support.v7.widget;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
final class q extends android.support.v7.view.menu.v {
    final /* synthetic */ k g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k kVar, Context context, android.support.v7.view.menu.i iVar, View view) {
        super(context, iVar, view, true, android.support.v7.b.b.actionOverflowMenuStyle);
        this.g = kVar;
        this.f = 8388613;
        this.d = kVar.r;
    }

    @Override // android.support.v7.view.menu.v, android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        super.onDismiss();
        if (this.g.c != null) {
            this.g.c.close();
        }
        this.g.o = null;
    }
}
