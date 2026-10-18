package com.google.android.finsky.services;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.widget.recommendation.RecommendationList;
import com.google.android.finsky.widget.recommendation.RecommendedWidgetProvider;

/* loaded from: classes.dex */
public class LoadRecommendationsService extends IntentService {
    public LoadRecommendationsService() {
        super("LoadRecommendationsService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("backendId", -1);
        int intExtra2 = intent.getIntExtra("appWidgetId", 0);
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        if (b2 == null) {
            com.google.android.finsky.widget.a.a(this, (Class<?>) RecommendedWidgetProvider.class, intExtra2);
            return;
        }
        RecommendationList a2 = com.google.android.finsky.widget.recommendation.c.a(this, b2, intExtra, intExtra2, FinskyApp.a().p);
        if (a2 != null) {
            RecommendedWidgetProvider.a(this, intExtra2, a2.c, intExtra);
        }
    }

    public static void a(Context context, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) LoadRecommendationsService.class);
        intent.setData(Uri.parse("content://market/load/for/" + i));
        intent.putExtra("backendId", i2);
        intent.putExtra("appWidgetId", i);
        context.startService(intent);
    }
}
