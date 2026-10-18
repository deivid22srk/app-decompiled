package android.support.v4.app;

import android.app.Notification;
import android.app.RemoteInput;

/* loaded from: classes.dex */
final class ca {
    public static void a(Notification.Builder builder, cf cfVar) {
        Notification.Action.Builder builder2 = new Notification.Action.Builder(cfVar.a(), cfVar.b(), cfVar.c());
        if (cfVar.e() != null) {
            for (RemoteInput remoteInput : ct.a(cfVar.e())) {
                builder2.addRemoteInput(remoteInput);
            }
        }
        if (cfVar.d() != null) {
            builder2.addExtras(cfVar.d());
        }
        builder.addAction(builder2.build());
    }
}
