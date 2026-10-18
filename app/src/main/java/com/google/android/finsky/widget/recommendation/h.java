package com.google.android.finsky.widget.recommendation;

import android.annotation.TargetApi;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.gpkg.p;
import com.google.android.finsky.protos.pi;
import com.google.android.finsky.services.DismissRecommendationService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import com.google.android.finsky.widget.AdvanceFlipperReceiver;
import com.google.android.finsky.widget.r;
import java.util.concurrent.Semaphore;

@TargetApi(16)
/* loaded from: classes.dex */
public final class h implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5237a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5238b;
    private com.google.android.finsky.api.b c;
    private final int e;
    private final int f;
    private final int g;
    private final r i;
    private RecommendationList j;
    private final p d = FinskyApp.a().p;
    private final com.google.android.play.image.e h = FinskyApp.a().d;

    public h(Context context, int i, int i2, int i3) {
        this.f5237a = context;
        this.f5238b = i;
        this.f = i2;
        this.g = i3;
        this.e = context.getResources().getDimensionPixelSize(R.dimen.rec_widget_square_width);
        this.i = r.a(context);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        int a2 = a();
        if (a2 == -1) {
            com.google.android.finsky.widget.a.a(this.f5237a, (Class<?>) RecommendedWidgetProvider.class, this.f5238b);
        } else {
            this.c = FinskyApp.a().b((String) null);
            this.j = a(a2);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        if (this.j != null) {
            return this.j.size();
        }
        return 0;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        int a2 = a();
        if (a2 == -1) {
            com.google.android.finsky.widget.a.a(this.f5237a, (Class<?>) RecommendedWidgetProvider.class, this.f5238b);
            return null;
        }
        if (this.j == null) {
            this.j = a(a2);
            if (this.j == null) {
                return null;
            }
        }
        if (i >= this.j.size()) {
            FinskyLog.a("Item out of bounds (pos = %d, size = %d)", Integer.valueOf(i), Integer.valueOf(this.j.size()));
            return null;
        }
        return new RemoteViews(a(i, 2, a2), a(i, 1, a2));
    }

    private RemoteViews a(int i, int i2, int i3) {
        int i4;
        int i5;
        Recommendation recommendation = this.j.f5228a.get(i);
        Bitmap a2 = c.a(this.h, recommendation, this.e);
        int i6 = recommendation.f5227b != null ? recommendation.f5227b.f3746a : 0;
        int i7 = AppWidgetManager.getInstance(this.f5237a).getAppWidgetOptions(this.f5238b).getInt(i2 == 1 ? "appWidgetMinWidth" : "appWidgetMaxWidth");
        int i8 = i2 == 2 ? this.f : this.g;
        int i9 = recommendation.f5226a.f1963a.g;
        int i10 = (int) (2.5d * i8);
        switch (i3) {
            case 0:
                switch (i9) {
                    case 1:
                    case 4:
                    case 6:
                        i4 = R.layout.rec_widget_side_by_side_portrait;
                        break;
                    case 2:
                        i4 = R.layout.rec_widget_side_by_side_square;
                        break;
                    case 3:
                    case 5:
                    default:
                        switch (i6) {
                            case 2:
                                if (i7 < i10) {
                                    i4 = R.layout.rec_widget_full_width_promo;
                                    break;
                                } else {
                                    i4 = R.layout.rec_widget_side_by_side_promo;
                                    break;
                                }
                            default:
                                i4 = R.layout.rec_widget_side_by_side_square;
                                break;
                        }
                }
            case 1:
            case 4:
            case 6:
                i4 = R.layout.rec_widget_side_by_side_portrait;
                break;
            case 2:
                i4 = R.layout.rec_widget_side_by_side_square;
                break;
            case 3:
                if (i6 == 2) {
                    if (i7 < i10) {
                        i4 = R.layout.rec_widget_full_width_promo;
                        break;
                    } else {
                        i4 = R.layout.rec_widget_side_by_side_promo;
                        break;
                    }
                } else {
                    i4 = R.layout.rec_widget_side_by_side_square;
                    break;
                }
            case 5:
            default:
                throw new IllegalArgumentException("Invalid backend: " + i3);
        }
        RemoteViews remoteViews = new RemoteViews(this.f5237a.getPackageName(), i4);
        Context context = this.f5237a;
        Document document = recommendation.f5226a;
        remoteViews.setTextViewText(R.id.widget_title, document.f1963a.i);
        remoteViews.setTextViewText(R.id.widget_creator, document.f1963a.m);
        pi ar = document.ar();
        remoteViews.setTextViewText(R.id.widget_reason, (ar == null || ar.c.length <= 0) ? "" : ar.c[0].f4161b);
        remoteViews.setImageViewBitmap(R.id.widget_promo, a2);
        int i11 = document.f1963a.g;
        switch (i11) {
            case 0:
            case 3:
                if (!ai.a()) {
                    i5 = R.drawable.rec_widget_strip_apps;
                    break;
                } else {
                    i5 = R.drawable.rec_widget_strip_apps_ent;
                    break;
                }
            case 1:
                i5 = R.drawable.rec_widget_strip_books;
                break;
            case 2:
                i5 = R.drawable.rec_widget_strip_music;
                break;
            case 4:
                i5 = R.drawable.rec_widget_strip_movies;
                break;
            case 5:
            default:
                throw new IllegalArgumentException("Unsupported backend ID (" + i11 + ")");
            case 6:
                i5 = R.drawable.rec_widget_strip_newsstand;
                break;
        }
        remoteViews.setImageViewResource(R.id.widget_strip, i5);
        int c = ai.c(document.f1963a.e);
        if (c > 0) {
            remoteViews.setContentDescription(R.id.widget_title, context.getString(c, document.f1963a.i));
        }
        Context context2 = this.f5237a;
        int i12 = this.f5238b;
        String str = recommendation.f5226a.f1963a.i;
        remoteViews.setOnClickPendingIntent(R.id.widget_content_accessibility, OpenRecommendationReceiver.a(context2, recommendation.f5226a, i3, i12));
        remoteViews.setContentDescription(R.id.widget_content_accessibility, context2.getString(R.string.content_description_recommendation_open, str));
        remoteViews.setOnClickPendingIntent(R.id.widget_refresh, AdvanceFlipperReceiver.b(context2, i12));
        remoteViews.setOnClickPendingIntent(R.id.widget_dismiss, DismissRecommendationService.a(context2, i12, recommendation.f5226a, i3, i));
        remoteViews.setContentDescription(R.id.widget_dismiss, context2.getString(R.string.content_description_recommendation_dismiss_title, str));
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return new RemoteViews(this.f5237a.getPackageName(), R.layout.rec_widget_loading_indicator);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 4;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    private RecommendationList a(int i) {
        return c.a(this.f5237a, this.c, i, this.f5238b, this.d);
    }

    private int a() {
        Semaphore semaphore = new Semaphore(0);
        int[] iArr = new int[1];
        i iVar = new i(this, iArr, semaphore);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            new Handler(Looper.getMainLooper()).post(iVar);
            semaphore.acquireUninterruptibly();
        }
        return iArr[0];
    }

    public static void a(Context context, int... iArr) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (iArr == null || iArr.length == 0) {
            iArr = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) RecommendedWidgetProvider.class));
        }
        appWidgetManager.notifyAppWidgetViewDataChanged(iArr, R.id.widget_flipper);
    }
}
