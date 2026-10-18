package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ck implements bg, bh {

    /* renamed from: a, reason: collision with root package name */
    private Notification.Builder f209a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f210b;
    private List<Bundle> c = new ArrayList();

    public ck(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2) {
        this.f209a = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
        this.f210b = new Bundle();
        if (bundle != null) {
            this.f210b.putAll(bundle);
        }
        if (z3) {
            this.f210b.putBoolean("android.support.localOnly", true);
        }
        if (str != null) {
            this.f210b.putString("android.support.groupKey", str);
            if (z4) {
                this.f210b.putBoolean("android.support.isGroupSummary", true);
            } else {
                this.f210b.putBoolean("android.support.useSideChannel", true);
            }
        }
        if (str2 != null) {
            this.f210b.putString("android.support.sortKey", str2);
        }
    }

    @Override // android.support.v4.app.bg
    public final void a(cf cfVar) {
        this.c.add(cj.a(this.f209a, cfVar));
    }

    @Override // android.support.v4.app.bh
    public final Notification.Builder a() {
        return this.f209a;
    }

    @Override // android.support.v4.app.bh
    public final Notification b() {
        Notification build = this.f209a.build();
        Bundle a2 = cj.a(build);
        Bundle bundle = new Bundle(this.f210b);
        for (String str : this.f210b.keySet()) {
            if (a2.containsKey(str)) {
                bundle.remove(str);
            }
        }
        a2.putAll(bundle);
        SparseArray<Bundle> a3 = cj.a(this.c);
        if (a3 != null) {
            cj.a(build).putSparseParcelableArray("android.support.actionExtras", a3);
        }
        return build;
    }
}
