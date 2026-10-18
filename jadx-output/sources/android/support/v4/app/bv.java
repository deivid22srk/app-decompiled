package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.widget.RemoteViews;

/* loaded from: classes.dex */
final class bv extends bt {
    bv() {
    }

    @Override // android.support.v4.app.bt, android.support.v4.app.bq
    public final Notification a(bn bnVar) {
        Context context = bnVar.f200a;
        Notification notification = bnVar.B;
        CharSequence charSequence = bnVar.f201b;
        CharSequence charSequence2 = bnVar.c;
        CharSequence charSequence3 = bnVar.h;
        RemoteViews remoteViews = bnVar.f;
        int i = bnVar.i;
        PendingIntent pendingIntent = bnVar.d;
        return new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(bnVar.e, (notification.flags & 128) != 0).setLargeIcon(bnVar.g).setNumber(i).getNotification();
    }
}
