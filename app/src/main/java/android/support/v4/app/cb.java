package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cb implements bg, bh {

    /* renamed from: a, reason: collision with root package name */
    private Notification.Builder f203a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f204b;

    public cb(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2) {
        this.f203a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str).setGroupSummary(z5).setSortKey(str2);
        this.f204b = new Bundle();
        if (bundle != null) {
            this.f204b.putAll(bundle);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f204b.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    @Override // android.support.v4.app.bg
    public final void a(cf cfVar) {
        ca.a(this.f203a, cfVar);
    }

    @Override // android.support.v4.app.bh
    public final Notification.Builder a() {
        return this.f203a;
    }

    @Override // android.support.v4.app.bh
    public final Notification b() {
        this.f203a.setExtras(this.f204b);
        return this.f203a.build();
    }
}
