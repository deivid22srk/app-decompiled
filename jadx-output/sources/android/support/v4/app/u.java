package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
final class u extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f236a;

    u(t tVar) {
        this.f236a = tVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.f236a.e) {
                    this.f236a.a(false);
                    break;
                }
                break;
            case 2:
                this.f236a.i_();
                this.f236a.f235b.c();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
