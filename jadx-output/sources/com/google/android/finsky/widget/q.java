package com.google.android.finsky.widget;

import android.annotation.SuppressLint;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.Build;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public abstract class q extends f {
    public abstract Class<? extends a> g();

    @Override // com.google.android.finsky.widget.f
    @SuppressLint({"NewApi"})
    public final void a(int i, String str) {
        int intExtra = getIntent().getIntExtra("appWidgetId", 0);
        if (str != null) {
            r.a(this).a(g(), intExtra, str);
        }
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", intExtra);
        setResult(i, intent);
        finish();
        int[] iArr = {intExtra};
        Intent intent2 = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
        intent2.putExtra("appWidgetIds", iArr);
        intent2.setClass(this, g());
        sendBroadcast(intent2);
        if (Build.VERSION.SDK_INT >= 11) {
            AppWidgetManager.getInstance(this).notifyAppWidgetViewDataChanged(iArr, R.id.widget_flipper);
        }
    }
}
