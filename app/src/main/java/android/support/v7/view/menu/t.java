package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.ActionProvider;

@TargetApi(16)
/* loaded from: classes.dex */
final class t extends o {
    t(Context context, android.support.v4.e.a.b bVar) {
        super(context, bVar);
    }

    @Override // android.support.v7.view.menu.o
    final p a(ActionProvider actionProvider) {
        return new u(this, this.f586a, actionProvider);
    }
}
