package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

/* loaded from: classes.dex */
final class bu extends bt {
    bu() {
    }

    @Override // android.support.v4.app.bt, android.support.v4.app.bq
    public final Notification a(bn bnVar) {
        Notification notification = bnVar.B;
        Context context = bnVar.f200a;
        CharSequence charSequence = bnVar.f201b;
        CharSequence charSequence2 = bnVar.c;
        PendingIntent pendingIntent = bnVar.d;
        PendingIntent pendingIntent2 = bnVar.e;
        notification.setLatestEventInfo(context, charSequence, charSequence2, pendingIntent);
        notification.fullScreenIntent = pendingIntent2;
        if (bnVar.j > 0) {
            notification.flags |= 128;
        }
        return notification;
    }
}
