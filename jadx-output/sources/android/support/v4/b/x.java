package android.support.v4.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class x extends Handler {
    public x() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        w wVar = (w) message.obj;
        switch (message.what) {
            case 1:
                r.c(wVar.f257a, wVar.f258b[0]);
                break;
            case 2:
                r.b();
                break;
        }
    }
}
