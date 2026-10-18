package com.google.android.finsky.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.widget.recommendation.RecommendationList;

/* loaded from: classes.dex */
public class FetchRecommendationsReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("backendId", -1);
        int intExtra2 = intent.getIntExtra("appWidgetId", 0);
        com.google.android.finsky.widget.recommendation.c.a(FinskyApp.a().b((String) null), context, new RecommendationList("", intExtra), FinskyApp.a().p, intExtra2);
    }
}
