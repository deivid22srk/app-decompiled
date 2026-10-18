package com.google.android.finsky.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.api.model.x;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cr;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final n f5164a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<String, int[]> f5165b = new d();
    private final HashMap<String, String> c = new HashMap<>();
    private final com.google.android.play.image.e d = FinskyApp.a().d;

    public b() {
        this.c.put("apps", com.google.android.finsky.c.d.u.b());
        this.c.put("books", com.google.android.finsky.c.d.w.b());
        this.c.put("movies", com.google.android.finsky.c.d.x.b());
        this.c.put("music", com.google.android.finsky.c.d.v.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.finsky.widget.a
    public final void a(Context context, AppWidgetManager appWidgetManager, int... iArr) {
        if (iArr != null) {
            r a2 = r.a(context);
            com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
            for (int i : iArr) {
                if (a(a2, i) == null) {
                    FinskyLog.a("Defaulting %d to %s", Integer.valueOf(i), "apps");
                    a2.a((Class<? extends a>) getClass(), i, "apps");
                }
                l lVar = new l(this.d, f5165b.get(a(a2, i)), f5164a);
                lVar.d = false;
                lVar.f5218a.clear();
                b(context, i, lVar);
                if (b2 == null) {
                    c(context, i);
                } else {
                    b(context, i, lVar);
                    com.google.android.finsky.api.b b3 = FinskyApp.a().b((String) null);
                    String str = this.c.get(a2.b(getClass(), i));
                    if (str == null) {
                        FinskyLog.a("%d has null URL", Integer.valueOf(i));
                        c(context, i);
                    } else {
                        e eVar = new e(this, context, i, a2, lVar);
                        if (!lVar.d) {
                            lVar.d = true;
                            lVar.c = eVar;
                            if (lVar.e != null) {
                                lVar.e.b((x) lVar);
                                lVar.e.b((com.android.volley.s) lVar);
                            }
                            lVar.f = context.getResources().getDimensionPixelSize(lVar.f5219b);
                            lVar.e = new com.google.android.finsky.api.model.i(b3, str, false);
                            lVar.e.a((com.android.volley.s) lVar);
                            lVar.e.a((x) lVar);
                            lVar.e.q();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, int i, l lVar) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
        if (lVar.f5218a.isEmpty()) {
            a(context, remoteViews);
        } else {
            remoteViews.removeAllViews(R.id.widget_flipper);
            remoteViews.setViewVisibility(R.id.widget_empty, 8);
            remoteViews.setViewVisibility(R.id.widget_flipper, 0);
            for (o oVar : lVar.f5218a) {
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_item);
                remoteViews2.setTextViewText(R.id.widget_title, oVar.c);
                remoteViews2.setTextViewText(R.id.widget_creator, oVar.d);
                remoteViews2.setImageViewBitmap(R.id.widget_promo, oVar.f5222a);
                Intent b2 = cr.b(context, oVar.e);
                b2.addFlags(268435456);
                remoteViews2.setOnClickPendingIntent(R.id.widget_base, PendingIntent.getActivity(context, 0, b2, 134217728));
                remoteViews2.setImageViewResource(R.id.widget_logo, R.mipmap.ic_launcher_play_store);
                remoteViews.addView(R.id.widget_flipper, remoteViews2);
            }
        }
        AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
    }

    private static void a(Context context, RemoteViews remoteViews) {
        remoteViews.setImageViewResource(R.id.app_icon, R.mipmap.ic_launcher_play_store);
        remoteViews.removeAllViews(R.id.widget_flipper);
        remoteViews.setViewVisibility(R.id.widget_empty, 0);
        remoteViews.setViewVisibility(R.id.widget_flipper, 8);
        remoteViews.setOnClickPendingIntent(R.id.widget_empty, PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class), 134217728));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int i) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
        a(context, remoteViews);
        AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String a(r rVar, int i) {
        return rVar.b(getClass(), i);
    }
}
