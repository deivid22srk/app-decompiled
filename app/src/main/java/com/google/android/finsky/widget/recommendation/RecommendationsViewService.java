package com.google.android.finsky.widget.recommendation;

import android.annotation.TargetApi;
import android.content.Intent;
import android.widget.RemoteViewsService;

@TargetApi(11)
/* loaded from: classes.dex */
public class RecommendationsViewService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new h(this, intent.getIntExtra("appWidgetId", 0), intent.getIntExtra("RecWidget.heightLandscape", 0), intent.getIntExtra("RecWidget.heightPortrait", 0));
    }
}
