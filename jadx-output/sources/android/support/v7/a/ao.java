package android.support.v7.a;

import android.view.ActionMode;
import android.view.Window;

/* loaded from: classes.dex */
final class ao extends am {
    final /* synthetic */ an c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(an anVar, Window.Callback callback) {
        super(anVar, callback);
        this.c = anVar;
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (((al) this.c).p) {
            switch (i) {
                case 0:
                    return a(callback);
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    @Override // android.support.v7.a.am, android.support.v7.view.n, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
