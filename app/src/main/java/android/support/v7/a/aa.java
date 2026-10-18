package android.support.v7.a;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class aa extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<DialogInterface> f471a;

    public aa(DialogInterface dialogInterface) {
        this.f471a = new WeakReference<>(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case -3:
            case -2:
            case -1:
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f471a.get(), message.what);
                break;
            case 1:
                ((DialogInterface) message.obj).dismiss();
                break;
        }
    }
}
