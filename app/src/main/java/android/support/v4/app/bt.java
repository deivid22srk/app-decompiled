package android.support.v4.app;

import android.app.Notification;

/* loaded from: classes.dex */
class bt implements bq {
    bt() {
    }

    @Override // android.support.v4.app.bq
    public Notification a(bn bnVar) {
        Notification notification = bnVar.B;
        notification.setLatestEventInfo(bnVar.f200a, bnVar.f201b, bnVar.c, bnVar.d);
        if (bnVar.j > 0) {
            notification.flags |= 128;
        }
        return notification;
    }
}
