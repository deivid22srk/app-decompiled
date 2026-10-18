package android.support.v7.a;

import android.content.Context;
import android.view.Window;

/* loaded from: classes.dex */
final class an extends al {
    an(Context context, Window window, af afVar) {
        super(context, window, afVar);
    }

    @Override // android.support.v7.a.al, android.support.v7.a.ah
    final Window.Callback a(Window.Callback callback) {
        return new ao(this, callback);
    }
}
