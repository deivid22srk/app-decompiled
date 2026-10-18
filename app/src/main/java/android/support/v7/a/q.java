package android.support.v7.a;

import android.os.Message;
import android.view.View;

/* loaded from: classes.dex */
final class q implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f534a;

    q(p pVar) {
        this.f534a = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        if (view == this.f534a.n && this.f534a.p != null) {
            message = Message.obtain(this.f534a.p);
        } else if (view == this.f534a.q && this.f534a.s != null) {
            message = Message.obtain(this.f534a.s);
        } else if (view == this.f534a.t && this.f534a.v != null) {
            message = Message.obtain(this.f534a.v);
        } else {
            message = null;
        }
        if (message != null) {
            message.sendToTarget();
        }
        this.f534a.M.obtainMessage(1, this.f534a.f533b).sendToTarget();
    }
}
