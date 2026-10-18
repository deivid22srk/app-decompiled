package com.google.android.finsky.widget.recommendation;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.widget.AdvanceFlipperReceiver;

/* loaded from: classes.dex */
public class OpenRecommendationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra("viewIntent");
        intent2.addFlags(268435456);
        context.startActivity(intent2);
        AdvanceFlipperReceiver.a(context, intent.getIntExtra("appWidgetId", 0));
    }

    public static PendingIntent a(Context context, Document document, int i, int i2) {
        Intent b2 = cr.b(context, document);
        if (TextUtils.isEmpty(c.a(i))) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) OpenRecommendationReceiver.class);
        intent.setData(Uri.parse("content://market/open-rec/" + i2 + "/" + document.f1963a.f3890a));
        intent.putExtra("viewIntent", b2);
        intent.putExtra("appWidgetId", i2);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }
}
