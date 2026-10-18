package com.google.android.finsky.widget.recommendation;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.services.LoadRecommendationsService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.widget.r;
import com.google.android.finsky.widget.s;

@TargetApi(16)
/* loaded from: classes.dex */
public class RecommendedWidgetProvider extends com.google.android.finsky.widget.a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f5230a = {R.id.page_error_indicator, R.id.widget_flipper, R.id.widget_background_accessibility, R.id.interactive_container, R.id.empty_container, R.id.widget_loading_indicator};

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        a(context, appWidgetManager, i);
        appWidgetManager.notifyAppWidgetViewDataChanged(i, R.id.widget_flipper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.a
    public final void a(Context context, AppWidgetManager appWidgetManager, int... iArr) {
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        for (int i : iArr) {
            if (b2 != null) {
                String b3 = r.a(context).b(RecommendedWidgetProvider.class, i);
                if (b3 != null) {
                    int a2 = s.a(b3);
                    appWidgetManager.updateAppWidget(i, a(context, R.id.widget_loading_indicator));
                    LoadRecommendationsService.a(context, i, a2);
                } else {
                    a(context, i, R.string.widget_configuration_needed, com.google.android.finsky.widget.f.b(context, RecommendedTrampoline.class, i));
                }
            } else {
                a(context, i, R.string.auth_required_error, a(context));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.a
    public final int a() {
        return 2;
    }

    public static void a(Context context, int i, String str) {
        RemoteViews a2 = a(context, R.id.page_error_indicator);
        a2.setTextViewText(R.id.error_msg, str);
        AppWidgetManager.getInstance(context).updateAppWidget(i, a2);
    }

    private static void a(Context context, int i, int i2, PendingIntent pendingIntent) {
        RemoteViews a2 = a(context, R.id.interactive_container, R.id.widget_background_accessibility);
        a2.setTextViewText(R.id.interactive_error_msg, context.getString(i2));
        a2.setOnClickPendingIntent(R.id.widget_background_accessibility, pendingIntent);
        AppWidgetManager.getInstance(context).updateAppWidget(i, a2);
    }

    private static RemoteViews a(Context context, int... iArr) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.rec_widget_base);
        remoteViews.setImageViewResource(R.id.widget_title_icon, R.drawable.ic_play_widgets_store);
        remoteViews.setTextViewText(R.id.widget_title, "");
        remoteViews.setContentDescription(R.id.widget_title_icon, "");
        for (int i : f5230a) {
            remoteViews.setViewVisibility(i, 8);
        }
        for (int i2 : iArr) {
            remoteViews.setViewVisibility(i2, 0);
        }
        return remoteViews;
    }

    public static void a(Context context, int i, String str, int i2) {
        String str2 = null;
        RemoteViews a2 = a(context, R.id.widget_flipper);
        a2.setEmptyView(R.id.widget_flipper, R.id.empty_container);
        int[] a3 = a(context, i);
        int a4 = s.a(context, R.dimen.now_playing_title_height);
        int i3 = a3[1] - a4;
        int i4 = a3[3] - a4;
        Intent intent = new Intent(context, (Class<?>) RecommendationsViewService.class);
        intent.setData(Uri.parse("content://market/factory/for/" + i));
        intent.putExtra("appWidgetId", i);
        intent.putExtra("RecWidget.heightLandscape", i3);
        intent.putExtra("RecWidget.heightPortrait", i4);
        a2.setRemoteAdapter(R.id.widget_flipper, intent);
        if (!TextUtils.isEmpty(str)) {
            a2.setTextViewText(R.id.widget_title, str.toUpperCase());
            DfeToc dfeToc = FinskyApp.a().g;
            if (dfeToc != null) {
                if (i2 != 0) {
                    pt a5 = dfeToc.a(i2);
                    if (a5 != null) {
                        str2 = a5.e;
                    }
                } else {
                    str2 = dfeToc.f1961a.l;
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                a2.setOnClickPendingIntent(R.id.widget_title_accessibility_overlay, PendingIntent.getActivity(context, 0, cr.a(context, str2, str, i2, true), 0));
                a2.setViewVisibility(R.id.widget_title_accessibility_overlay, 0);
                a2.setContentDescription(R.id.widget_title_accessibility_overlay, str);
            } else {
                FinskyLog.d("No browse URL found for backend=%s", Integer.valueOf(i2));
            }
        }
        AppWidgetManager.getInstance(context).updateAppWidget(i, a2);
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, R.id.widget_flipper);
    }
}
