package com.google.android.finsky.widget.consumption;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.widget.RemoteViews;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.services.ConsumptionAppDoc;
import com.google.android.finsky.services.LoadConsumptionDataService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.utils.jm;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

@TargetApi(16)
/* loaded from: classes.dex */
public class NowPlayingWidgetProvider extends com.google.android.finsky.widget.a {

    /* renamed from: a, reason: collision with root package name */
    public static a f5168a;
    private static final String c;
    private static final File d;
    private static final Random e;
    private static int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static final g k;
    private static final g[] l;
    private static final g[] m;

    /* renamed from: b, reason: collision with root package name */
    private final SparseIntArray f5169b = new SparseIntArray();

    static {
        String b2 = com.google.android.finsky.c.d.dS.b();
        c = b2;
        d = TextUtils.isEmpty(b2) ? null : new File(c);
        e = new Random();
        f = new int[]{2, 4, 1, 6};
        g = new int[]{R.id.large_image_1, R.id.large_image_2, R.id.large_image_3, R.id.large_image_4};
        h = new int[]{R.id.accessibility_overlay_1, R.id.accessibility_overlay_2, R.id.accessibility_overlay_3, R.id.accessibility_overlay_4};
        i = new int[]{1, 4, 2, 6};
        j = new int[]{R.id.widget_content_1, R.id.widget_content_2, R.id.widget_content_3, R.id.widget_content_4};
        k = new g(R.layout.now_playing_all_quad_portrait_small).a(R.dimen.now_playing_all_portrait_large_width, R.dimen.now_playing_all_portrait_large_height).a(4, R.dimen.now_playing_all_portrait_small_width, R.dimen.now_playing_all_portrait_small_height);
        g a2 = new g(R.layout.now_playing_all_portrait_large).a(R.dimen.now_playing_all_portrait_large_width, R.dimen.now_playing_all_portrait_large_height);
        a2.d = k;
        a2.c = true;
        l = new g[]{a2, new g(R.layout.now_playing_all_stack_portrait_small).a(R.dimen.now_playing_all_portrait_small_width, R.dimen.now_playing_all_portrait_large_height).a(2, R.dimen.now_playing_all_portrait_small_width, R.dimen.now_playing_all_portrait_small_height), new g(R.layout.now_playing_all_stack_portrait_very_small_triple).a(R.dimen.now_playing_all_portrait_very_small_width, R.dimen.now_playing_all_portrait_large_height).a(3, R.dimen.now_playing_all_portrait_very_small_width, R.dimen.now_playing_all_portrait_very_small_height), new g(R.layout.now_playing_all_portrait_small).a(R.dimen.now_playing_all_portrait_small_width, R.dimen.now_playing_all_portrait_small_height), new g(R.layout.now_playing_all_portrait_very_small).a(R.dimen.now_playing_all_portrait_very_small_width, R.dimen.now_playing_all_portrait_very_small_height)};
        g a3 = new g(R.layout.now_playing_all_square_very_large).a(R.dimen.now_playing_all_square_very_large, R.dimen.now_playing_all_square_very_large);
        a3.e = 1;
        a3.c = true;
        g a4 = new g(R.layout.now_playing_all_square_large).a(R.dimen.now_playing_all_square_large, R.dimen.now_playing_all_square_large);
        a4.c = true;
        g a5 = new g(R.layout.now_playing_all_square_small).a(R.dimen.now_playing_all_square_small, R.dimen.now_playing_all_square_small);
        a5.e = 1;
        a5.c = true;
        g a6 = new g(R.layout.now_playing_all_tower_square_large).a(R.dimen.now_playing_all_square_large, R.dimen.now_playing_all_square_very_large);
        a6.f5180b = 4;
        g b3 = a6.b(0, R.dimen.now_playing_all_square_large, R.dimen.now_playing_all_square_very_large).b(1, R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_very_small).b(2, R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_very_small).b(3, R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_very_small);
        b3.e = 0;
        g a7 = new g(R.layout.now_playing_all_tower_square_small).a(R.dimen.now_playing_all_square_small, R.dimen.now_playing_all_square_large);
        a7.f5180b = 3;
        g b4 = a7.b(0, R.dimen.now_playing_all_square_small, R.dimen.now_playing_all_square_small).b(1, R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_very_small).b(2, R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_very_small);
        b4.e = 0;
        g a8 = new g(R.layout.now_playing_all_square_very_small).a(R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_very_small);
        a8.c = true;
        m = new g[]{a3, a4, new g(R.layout.now_playing_all_stack_square_small_double).a(R.dimen.now_playing_all_square_small, R.dimen.now_playing_all_square_very_large).a(2, R.dimen.now_playing_all_square_small, R.dimen.now_playing_all_square_small), a5, new g(R.layout.now_playing_all_stack_square_very_small_quad).a(R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_very_large).a(4, R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_very_small), new g(R.layout.now_playing_all_stack_square_very_small_triple).a(R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_large).a(3, R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_very_small), new g(R.layout.now_playing_all_stack_square_very_small_double).a(R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_small).a(2, R.dimen.now_playing_all_square_very_small, R.dimen.now_playing_all_square_very_small), b3, b4, a8};
    }

    @Override // com.google.android.finsky.widget.a, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("android.intent.action.PACKAGE_CHANGED".equals(intent.getAction())) {
            if (intent.getIntExtra("android.intent.extra.UID", -1) != -1) {
                String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                com.google.android.finsky.widget.r a2 = com.google.android.finsky.widget.r.a(context);
                int a3 = cr.a(schemeSpecificPart);
                if (a3 != -1 && a3 != 9) {
                    a(context, AppWidgetManager.getInstance(context), a2.a(NowPlayingWidgetProvider.class, com.google.android.finsky.widget.s.a(a3), true));
                    return;
                }
                return;
            }
            return;
        }
        if ("NowPlayingWidgetProvider.DoneButton".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("appWidgetId", -1);
            if (intExtra != -1) {
                FinskyLog.a("Received ACTION_DONE_BUTTON, updating widget %d.", Integer.valueOf(intExtra));
                v a4 = v.a(intExtra);
                a4.f5201a = true;
                v.a(intExtra, a4);
                a(context, AppWidgetManager.getInstance(context), intExtra);
                return;
            }
            FinskyLog.d("Received ACTION_DONE_BUTTON, but no appWidgetId was specified.", new Object[0]);
            return;
        }
        if ("NowPlayingWidgetProvider.WarmWelcome".equals(intent.getAction())) {
            int intExtra2 = intent.getIntExtra("appWidgetId", -1);
            int intExtra3 = intent.getIntExtra("backendId", -1);
            if (intExtra2 != -1 && intExtra3 != -1) {
                FinskyLog.a("Received ACTION_LAUNCH_WARM_WELCOME for backend %d and widget %d", Integer.valueOf(intExtra3), Integer.valueOf(intExtra2));
                v a5 = v.a(intExtra2);
                switch (intExtra3) {
                    case 1:
                        a5.e = true;
                        break;
                    case 2:
                        a5.f5202b = true;
                        break;
                    case 4:
                        a5.d = true;
                        break;
                    case 6:
                        a5.c = true;
                        break;
                }
                v.a(intExtra2, a5);
                FinskyApp.a().startActivity(cr.a(context, intExtra3, FinskyApp.a().j()));
                a(context, AppWidgetManager.getInstance(context), intExtra2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.a
    public final int a() {
        return 3;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i2, Bundle bundle) {
        a(context, appWidgetManager, i2);
    }

    @Override // com.google.android.finsky.widget.a, android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        for (int i2 : iArr) {
            FinskyLog.a("Deleting widget data for widget ID=%d", Integer.valueOf(i2));
            bg.ai.a(i2).c();
        }
        super.onDeleted(context, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.a
    public final void a(Context context, AppWidgetManager appWidgetManager, int... iArr) {
        a(context, appWidgetManager, b(context).f5171a, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void a(Context context, AppWidgetManager appWidgetManager, Map<k, Bitmap> map, int... iArr) {
        if (iArr != null) {
            com.google.android.finsky.widget.r a2 = com.google.android.finsky.widget.r.a(context);
            int a3 = com.google.android.finsky.widget.s.a(context, R.dimen.now_playing_title_height);
            for (int i2 : iArr) {
                if (FinskyApp.a().b((String) null) != null) {
                    String b2 = a2.b(getClass(), i2);
                    if (b2 != null) {
                        int a4 = com.google.android.finsky.widget.s.a(b2);
                        if (a4 != 0 && !cr.a(context.getPackageManager(), a4)) {
                            RemoteViews a5 = a(context, true);
                            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.now_playing_configuration_needed);
                            remoteViews.setTextViewText(R.id.error_msg, context.getString(R.string.widget_consumption_app_uninstalled));
                            a5.addView(R.id.widget_content, remoteViews);
                            Uri build = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").appendQueryParameter("id", cr.a(a4)).build();
                            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(build);
                            intent.addFlags(268435456);
                            a5.setOnClickPendingIntent(R.id.widget_background_accessibility, PendingIntent.getActivity(context, 0, intent, 0));
                            a5.setViewVisibility(R.id.widget_background_accessibility, 0);
                            a(context, a5, a4);
                            appWidgetManager.updateAppWidget(i2, a5);
                        } else {
                            String a6 = cr.a(a4);
                            if (a6 != null && context.getPackageManager().getApplicationEnabledSetting(a6) == 3) {
                                appWidgetManager.updateAppWidget(i2, c(context, a4));
                            } else {
                                int[] a7 = a(context, i2);
                                if (a7[0] == 0 && a7[1] == 0 && a7[2] == 0 && a7[3] == 0) {
                                    if (a4 == 0) {
                                        b(context, a4);
                                    }
                                    appWidgetManager.updateAppWidget(i2, a(context, true));
                                } else {
                                    int i3 = a7[0];
                                    int i4 = a7[1] - a3;
                                    int i5 = a7[2];
                                    int i6 = a7[3] - a3;
                                    DfeToc dfeToc = FinskyApp.a().g;
                                    w a8 = a(a4, i2, dfeToc, context, map, i5, i4);
                                    w a9 = a(a4, i2, dfeToc, context, map, i3, i6);
                                    RemoteViews remoteViews2 = new RemoteViews(a8.f5203a, a9.f5203a);
                                    if (!a8.f5204b || !a9.f5204b) {
                                        b(context).a(new j(a4, a(a9.c, a8.c), new t(this, context, i2)));
                                    } else {
                                        appWidgetManager.updateAppWidget(i2, remoteViews2);
                                    }
                                }
                            }
                        }
                    } else {
                        RemoteViews a10 = a(context, true);
                        a10.addView(R.id.widget_content, new RemoteViews(context.getPackageName(), R.layout.now_playing_configuration_needed));
                        a10.setOnClickPendingIntent(R.id.widget_background_accessibility, com.google.android.finsky.widget.f.b(context, NowPlayingTrampoline.class, i2));
                        a10.setViewVisibility(R.id.widget_background_accessibility, 0);
                        a(context, a10, 0);
                        appWidgetManager.updateAppWidget(i2, a10);
                    }
                } else {
                    RemoteViews a11 = a(context, true);
                    RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), R.layout.now_playing_account_needed);
                    a11.removeAllViews(R.id.widget_content);
                    a11.addView(R.id.widget_content, remoteViews3);
                    a11.setOnClickPendingIntent(R.id.widget_background_accessibility, a(context));
                    a11.setViewVisibility(R.id.widget_background_accessibility, 0);
                    if (a(context, a11, 0)) {
                        a11.setTextViewText(R.id.error_msg, context.getString(R.string.auth_required_error_oem));
                    }
                    appWidgetManager.updateAppWidget(i2, a11);
                }
            }
        }
    }

    private static void b(Context context, int i2) {
        List<ConsumptionAppDocList> c2 = c(i2);
        ArrayList arrayList = new ArrayList();
        for (ConsumptionAppDocList consumptionAppDocList : c2) {
            for (int i3 = 0; i3 < Math.min(4, consumptionAppDocList.size()); i3++) {
                arrayList.add(new k(consumptionAppDocList.get(i3).f4540a, 0, 0));
            }
        }
        if (arrayList.size() > 0) {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(arrayList.size())};
            b(context).a(new j(i2, arrayList, null));
        }
    }

    private static RemoteViews a(Context context, boolean z) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.now_playing_base);
        remoteViews.setTextViewText(R.id.widget_title, "");
        remoteViews.setImageViewResource(R.id.widget_title_icon, b(0));
        remoteViews.setContentDescription(R.id.widget_title_icon, "");
        int a2 = a(0);
        if (z && a2 != 0) {
            remoteViews.setImageViewResource(R.id.widget_background_top, a2);
        }
        remoteViews.removeAllViews(R.id.widget_content);
        remoteViews.setViewVisibility(R.id.widget_background_accessibility, 8);
        remoteViews.setViewVisibility(R.id.accessibility_overlay, 8);
        remoteViews.setViewVisibility(R.id.hotseat, 8);
        remoteViews.setViewVisibility(R.id.message_holder, 4);
        return remoteViews;
    }

    private static RemoteViews c(Context context, int i2) {
        String str;
        RemoteViews a2 = a(context, true);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.now_playing_configuration_needed);
        try {
            PackageManager packageManager = context.getPackageManager();
            str = context.getString(R.string.widget_consumption_app_disabled, packageManager.getApplicationInfo(cr.a(i2), 0).loadLabel(packageManager).toString());
        } catch (PackageManager.NameNotFoundException e2) {
            str = "";
        }
        remoteViews.setTextViewText(R.id.error_msg, str);
        a2.addView(R.id.widget_content, remoteViews);
        a2.setOnClickPendingIntent(R.id.widget_background_accessibility, EnableAppReceiver.a(context, i2));
        a2.setViewVisibility(R.id.widget_background_accessibility, 0);
        a(context, a2, i2);
        return a2;
    }

    private static boolean a(Context context, RemoteViews remoteViews, int i2) {
        if (d == null || !d.exists() || i2 != 0) {
            return false;
        }
        remoteViews.setViewVisibility(R.id.message_holder, 4);
        remoteViews.setTextViewCompoundDrawables(R.id.message_text, 0, R.drawable.flo_widget_empty_logo_white, 0, 0);
        remoteViews.setTextViewCompoundDrawables(R.id.error_msg, 0, R.drawable.flo_widget_empty_logo_white, 0, 0);
        remoteViews.setImageViewUri(R.id.widget_background_top, Uri.fromFile(d));
        remoteViews.setOnClickPendingIntent(R.id.widget_title_accessibility_overlay, null);
        remoteViews.setViewVisibility(R.id.widget_title_accessibility_overlay, 4);
        remoteViews.setTextColor(R.id.message_text, context.getResources().getColor(R.color.play_white));
        remoteViews.setTextColor(R.id.error_msg, context.getResources().getColor(R.color.play_white));
        remoteViews.setViewVisibility(R.id.message_background, 8);
        remoteViews.setTextViewText(R.id.widget_title, a(FinskyApp.a().g, context, i2).toUpperCase());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean, byte] */
    private w a(int i2, int i3, DfeToc dfeToc, Context context, Map<k, Bitmap> map, int i4, int i5) {
        Intent a2;
        RemoteViews remoteViews;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] d2 = d(i2);
        com.google.android.finsky.services.a a3 = com.google.android.finsky.services.a.a();
        int length = d2.length;
        int[] iArr = new int[length];
        int i12 = 0;
        int i13 = 0;
        while (i13 < length) {
            int i14 = d2[i13];
            if (!a3.a(i14)) {
                jm.a();
                if (!(a3.b(i14) == 1)) {
                    jm.a();
                    if (!a3.a(i14)) {
                        a3.f4561b.put(i14, 1);
                    }
                    i11 = i12 + 1;
                    iArr[i12] = i14;
                    i13++;
                    i12 = i11;
                }
            }
            new Object[1][0] = Integer.valueOf(i14);
            i11 = i12;
            i13++;
            i12 = i11;
        }
        if (i12 > 0) {
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            LoadConsumptionDataService.a(context, iArr2);
        }
        RemoteViews a4 = a(context, false);
        w wVar = new w(this);
        wVar.f5203a = a4;
        CharSequence upperCase = a(dfeToc, context, i2).toUpperCase();
        a4.setTextViewText(R.id.widget_title, upperCase);
        a4.setImageViewResource(R.id.widget_title_icon, b(i2));
        switch (i2) {
            case 0:
                a2 = com.google.android.finsky.widget.f.a(context, (Class<? extends com.google.android.finsky.widget.f>) MyLibraryTrampoline.class, i3);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                a2 = cr.a(context, i2, FinskyApp.a().j());
                break;
            case 5:
            default:
                a2 = null;
                break;
        }
        if (a2 != null) {
            a4.setOnClickPendingIntent(R.id.widget_title_accessibility_overlay, PendingIntent.getActivity(context, i3, a2, 0));
            a4.setViewVisibility(R.id.widget_title_accessibility_overlay, 0);
            a4.setContentDescription(R.id.widget_title_accessibility_overlay, upperCase);
        }
        m a5 = l.a(p.a(c(i2), context.getResources().getInteger(R.integer.max_library_widget_backends), System.currentTimeMillis()));
        int length2 = a5.f5187a.length;
        int i15 = a5.f5188b == 0 ? 0 : 1;
        if (length2 > 1) {
            switch (a5.f5187a.length) {
                case 0:
                case 1:
                    i10 = 0;
                    break;
                case 2:
                    i10 = R.layout.now_playing_widget_two;
                    break;
                case 3:
                    if (a5.f5188b == 0) {
                        i10 = R.layout.now_playing_widget_three_left;
                        break;
                    } else {
                        i10 = R.layout.now_playing_widget_three_right;
                        break;
                    }
                case 4:
                    i10 = R.layout.now_playing_widget_four;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid count: " + a5.f5187a.length);
            }
            a4.removeAllViews(R.id.widget_content);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), i10);
            a4.addView(R.id.widget_content, remoteViews2);
            remoteViews = remoteViews2;
        } else {
            remoteViews = a4;
        }
        wVar.d = false;
        wVar.e = true;
        int i16 = 0;
        int i17 = 0;
        while (i17 < length2) {
            int a6 = m.a(a5.f5187a.length, i17, a5.f5188b);
            if (length2 <= 1) {
                i6 = R.id.widget_content;
                i7 = i5;
                i8 = i4;
            } else {
                int i18 = j[i17];
                i8 = i4 / 2;
                if (length2 == 4 || (length2 == 3 && i17 != i15)) {
                    if (i5 / i8 > 2.2f) {
                        if ((a6 & 1) != 0) {
                            i9 = (a6 & 4) != 0 ? i5 / 3 : (i5 * 2) / 3;
                        } else {
                            i9 = (a6 & 4) != 0 ? (i5 * 2) / 3 : i5 / 3;
                        }
                    } else {
                        i9 = i5 / 2;
                    }
                    i7 = i9 + i16;
                    i6 = i18;
                } else {
                    i6 = i18;
                    i7 = i5;
                }
            }
            ConsumptionAppDocList consumptionAppDocList = a5.f5187a[i17];
            this.f5169b.clear();
            new x(this, null, true, i7);
            x a7 = a(context, consumptionAppDocList.size(), consumptionAppDocList.f5167a, i8, i7);
            w a8 = a(context, remoteViews, i6, a6, a7, consumptionAppDocList, map);
            a8.d = a7.f5205a;
            a8.e = consumptionAppDocList.isEmpty();
            a8.f = a7.f5206b;
            int i19 = (length2 == 4 || (length2 == 3 && i17 != i15)) ? a8.f : i16;
            wVar.d = (byte) ((a8.d ? 1 : 0) | (wVar.d ? 1 : 0));
            wVar.e = (byte) ((a8.e ? 1 : 0) & (wVar.e ? 1 : 0));
            if (!a8.f5204b) {
                wVar.f5204b = false;
            }
            wVar.c.addAll(a8.c);
            i17++;
            i16 = i19;
        }
        int i20 = 0;
        if (!wVar.d) {
            if (wVar.e) {
                if (i2 != 0) {
                    i20 = a(i2);
                    Intent a9 = cr.a(context, i2, FinskyApp.a().j());
                    if (a9 != null) {
                        a4.setOnClickPendingIntent(R.id.widget_background_accessibility, PendingIntent.getActivity(context, 0, a9, 0));
                    }
                    a4.setViewVisibility(R.id.widget_background_accessibility, 0);
                } else if (a2 != null) {
                    a4.setOnClickPendingIntent(R.id.widget_background_accessibility, PendingIntent.getActivity(context, i3, a2, 0));
                    a4.setViewVisibility(R.id.widget_background_accessibility, 0);
                }
            }
        } else {
            switch (i2) {
                case 0:
                    i20 = R.drawable.bg_play_widget_np;
                    break;
                case 1:
                    i20 = R.drawable.bg_play_widget_books;
                    break;
                case 2:
                    i20 = R.drawable.bg_play_widget_music;
                    break;
                case 3:
                case 5:
                default:
                    i20 = 0;
                    break;
                case 4:
                    i20 = R.drawable.bg_play_widget_movies;
                    break;
                case 6:
                    i20 = R.drawable.bg_play_widget_newsstand;
                    break;
            }
        }
        if (!a(context, a4, i2) && i20 != 0) {
            a4.setImageViewResource(R.id.widget_background_top, i20);
        }
        if (wVar.e && i2 == 0 && i4 >= com.google.android.finsky.widget.s.a(context, R.dimen.hotseat_bar_threshold_width)) {
            a4.setViewVisibility(R.id.message_holder, 0);
        } else {
            a4.setViewVisibility(R.id.message_holder, 4);
        }
        if (i2 == 0) {
            a(context, dfeToc, a4, i3, i4, i5);
        } else {
            a4.setViewVisibility(R.id.hotseat, 8);
        }
        return wVar;
    }

    private static void a(Context context, DfeToc dfeToc, RemoteViews remoteViews, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        remoteViews.setViewVisibility(R.id.hotseat, 8);
        if (dfeToc != null) {
            Resources resources = context.getResources();
            if (i4 > com.google.android.finsky.widget.s.a(context, R.dimen.hotseat_bar_threshold_height) && i3 > com.google.android.finsky.widget.s.a(context, R.dimen.hotseat_bar_threshold_width)) {
                v a2 = v.a(i2);
                if (a2.f5201a) {
                    new Object[1][0] = Integer.valueOf(i2);
                    return;
                }
                int a3 = i3 / com.google.android.finsky.widget.s.a(context, R.dimen.hotseat_corpus_title_width);
                com.google.android.finsky.services.a a4 = com.google.android.finsky.services.a.a();
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z2 = false;
                int i12 = 0;
                while (i12 < f.length) {
                    int i13 = f[i12];
                    pt a5 = dfeToc.a(i13);
                    if (a5 == null || !cr.a(context.getPackageManager(), i13) || cr.a(FinskyApp.a().v, i13)) {
                        i5 = i9;
                        i6 = i10;
                        i7 = i11;
                    } else {
                        int i14 = i11 + 1;
                        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.now_playing_widget_hotseat_choice);
                        remoteViews2.setImageViewResource(R.id.backend_check_icon, com.google.android.finsky.widget.s.c(i13));
                        remoteViews2.setTextViewText(R.id.backend_name, a5.c);
                        remoteViews2.setTextColor(R.id.backend_name, ai.a(context, i13));
                        jm.a();
                        List<ConsumptionAppDoc> list = a4.f4560a.get(i13);
                        int size = list == null ? 0 : list.size();
                        z2 |= size > 0;
                        boolean z3 = false;
                        if (a4.a(i13) && size >= com.google.android.finsky.widget.s.d(i13)) {
                            i9++;
                            remoteViews2.setViewVisibility(R.id.backend_check_icon, 0);
                            z3 = true;
                        } else {
                            switch (i13) {
                                case 1:
                                    z = a2.e;
                                    break;
                                case 2:
                                    z = a2.f5202b;
                                    break;
                                case 3:
                                case 5:
                                default:
                                    z = true;
                                    break;
                                case 4:
                                    z = a2.d;
                                    break;
                                case 6:
                                    z = a2.c;
                                    break;
                            }
                            if (z) {
                                i10++;
                                remoteViews2.setViewVisibility(R.id.backend_check_icon, 0);
                                z3 = true;
                            } else {
                                remoteViews2.setViewVisibility(R.id.backend_check_icon, 8);
                            }
                        }
                        switch (i13) {
                            case 1:
                                if (!z3) {
                                    i8 = R.string.content_description_widget_hotseat_explore_books;
                                    break;
                                } else {
                                    i8 = R.string.content_description_widget_hotseat_explored_books;
                                    break;
                                }
                            case 2:
                                if (!z3) {
                                    i8 = R.string.content_description_widget_hotseat_explore_music;
                                    break;
                                } else {
                                    i8 = R.string.content_description_widget_hotseat_explored_music;
                                    break;
                                }
                            case 3:
                            case 5:
                            default:
                                throw new IllegalArgumentException("Invalid backend");
                            case 4:
                                if (!z3) {
                                    i8 = R.string.content_description_widget_hotseat_explore_movies;
                                    break;
                                } else {
                                    i8 = R.string.content_description_widget_hotseat_explored_movies;
                                    break;
                                }
                            case 6:
                                if (!z3) {
                                    i8 = R.string.content_description_widget_hotseat_explore_newsstand;
                                    break;
                                } else {
                                    i8 = R.string.content_description_widget_hotseat_explored_newsstand;
                                    break;
                                }
                        }
                        remoteViews2.setContentDescription(R.id.container, context.getString(i8));
                        Intent intent = new Intent(context, (Class<?>) NowPlayingWidgetProvider.class);
                        intent.setAction("NowPlayingWidgetProvider.WarmWelcome");
                        intent.putExtra("appWidgetId", i2);
                        intent.putExtra("backendId", i13);
                        remoteViews2.setOnClickPendingIntent(R.id.container, PendingIntent.getBroadcast(context, e.nextInt(), intent, 0));
                        if (i14 == 1) {
                            remoteViews2.setViewVisibility(R.id.separator_left, 8);
                        }
                        if (i14 <= a3) {
                            remoteViews.addView(R.id.hotseat_selectors, remoteViews2);
                        }
                        i5 = i9;
                        i6 = i10;
                        i7 = i14;
                    }
                    i12++;
                    i11 = i7;
                    i10 = i6;
                    i9 = i5;
                }
                if (i9 > 0 || (i10 > 0 && z2)) {
                    remoteViews.setTextViewText(R.id.start_playing, Html.fromHtml(resources.getString(R.string.widget_hotseat_title)));
                    remoteViews.setViewVisibility(R.id.start_playing_separator, 0);
                    remoteViews.setViewVisibility(R.id.done_button, 0);
                    Intent intent2 = new Intent(context, (Class<?>) NowPlayingWidgetProvider.class);
                    intent2.setAction("NowPlayingWidgetProvider.DoneButton");
                    intent2.putExtra("appWidgetId", i2);
                    remoteViews.setOnClickPendingIntent(R.id.done_button, PendingIntent.getBroadcast(context, e.nextInt(), intent2, 0));
                } else {
                    remoteViews.setTextViewText(R.id.start_playing, Html.fromHtml(resources.getString(R.string.widget_hotseat_title)));
                    remoteViews.setViewVisibility(R.id.start_playing_separator, 8);
                    remoteViews.setViewVisibility(R.id.done_button, 8);
                }
                remoteViews.setViewVisibility(R.id.hotseat, 0);
            }
        }
    }

    private w a(Context context, RemoteViews remoteViews, int i2, int i3, List<List<g>> list, List<ConsumptionAppDoc> list2, Map<k, Bitmap> map) {
        int i4;
        int intValue;
        Resources resources = context.getResources();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        String packageName = context.getPackageName();
        remoteViews.removeAllViews(i2);
        n nVar = new n();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= list.size()) {
                break;
            }
            List<g> list3 = list.get(i6);
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 < list3.size()) {
                    int i9 = list3.get(i8).f5180b;
                    for (int i10 = 0; i10 < i9; i10++) {
                        o oVar = new o(nVar, i6, i8, i10);
                        oVar.d = resources.getDimensionPixelSize(r7.a(i10)) * resources.getDimensionPixelSize(r7.b(i10));
                        arrayList2.add(oVar);
                    }
                    i7 = i8 + 1;
                }
            }
            i5 = i6 + 1;
        }
        Collections.sort(arrayList2);
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 >= arrayList2.size()) {
                break;
            }
            o oVar2 = (o) arrayList2.get(i12);
            nVar.f5189a.put(n.a(oVar2.f5190a, oVar2.f5191b, oVar2.c), Integer.valueOf(i12));
            i11 = i12 + 1;
        }
        boolean z2 = false;
        for (int i13 = 0; i13 < list.size(); i13++) {
            List<g> list4 = list.get(i13);
            RemoteViews remoteViews2 = new RemoteViews(packageName, R.layout.now_playing_row);
            ArrayList arrayList3 = new ArrayList();
            int i14 = 0;
            while (true) {
                int i15 = i14;
                if (i15 >= list4.size()) {
                    break;
                }
                g gVar = list4.get(i15);
                RemoteViews remoteViews3 = new RemoteViews(packageName, gVar.f5179a);
                int min = Math.min(g.length, gVar.f5180b);
                int i16 = 0;
                while (true) {
                    int i17 = i16;
                    if (i17 < min) {
                        String a2 = n.a(i13, i15, i17);
                        if (!nVar.f5189a.containsKey(a2)) {
                            intValue = -1;
                        } else {
                            intValue = nVar.f5189a.get(a2).intValue();
                        }
                        if (intValue >= 0 && intValue < list2.size()) {
                            ConsumptionAppDoc consumptionAppDoc = list2.get(intValue);
                            if (map != null) {
                                Bitmap a3 = a(context, map, consumptionAppDoc.f4540a, gVar.a(i17), gVar.b(i17));
                                remoteViews3.setImageViewBitmap(g[i17], a3);
                                if (a3 == null) {
                                    z2 = true;
                                }
                            } else {
                                z2 = true;
                            }
                            arrayList.add(new k(consumptionAppDoc.f4540a, resources.getDimensionPixelSize(gVar.a(i17)), resources.getDimensionPixelSize(gVar.b(i17))));
                            if (gVar.c) {
                                if (!TextUtils.isEmpty(consumptionAppDoc.f4541b) && !z) {
                                    remoteViews3.setTextViewText(R.id.metadata, consumptionAppDoc.f4541b.toUpperCase());
                                    remoteViews3.setViewVisibility(R.id.metadata, 0);
                                    z = true;
                                } else {
                                    remoteViews3.setViewVisibility(R.id.metadata, 8);
                                }
                            }
                            remoteViews3.setOnClickPendingIntent(h[i17], PendingIntent.getActivity(context, i17, consumptionAppDoc.e, 0));
                        }
                        i16 = i17 + 1;
                    }
                }
                arrayList3.add(remoteViews3);
                i14 = i15 + 1;
            }
            boolean z3 = (i3 & 1) != 0;
            boolean z4 = (i3 & 2) != 0;
            int i18 = 1;
            if (z3) {
                i18 = 8388613;
            } else if (z4) {
                i18 = 8388611;
            }
            if (i13 % 2 == 0) {
                i4 = i18 | 80;
            } else {
                i4 = i18 | 48;
            }
            remoteViews2.setInt(R.id.now_playing_row, "setGravity", i4);
            if (z3) {
                Collections.reverse(arrayList3);
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                remoteViews2.addView(R.id.now_playing_row, (RemoteViews) it.next());
            }
            remoteViews.addView(i2, remoteViews2);
        }
        return new w(this, !z2, arrayList);
    }

    private static Bitmap a(Context context, Map<k, Bitmap> map, Uri uri, int i2, int i3) {
        int a2 = com.google.android.finsky.widget.s.a(context, i2);
        int a3 = com.google.android.finsky.widget.s.a(context, i3);
        for (k kVar : map.keySet()) {
            if (kVar.a(uri, a2, a3)) {
                return map.get(kVar);
            }
        }
        return null;
    }

    private static int a(int i2) {
        switch (i2) {
            case 0:
                return R.drawable.bg_empty_play_widget_np;
            case 1:
                return R.drawable.bg_empty_play_widget_books;
            case 2:
                return R.drawable.bg_empty_play_widget_music;
            case 3:
            case 5:
            default:
                return 0;
            case 4:
                return R.drawable.bg_empty_play_widget_videos;
            case 6:
                return R.drawable.bg_empty_play_widget_newsstand;
        }
    }

    private static String a(DfeToc dfeToc, Context context, int i2) {
        int i3 = R.string.widget_now_playing;
        switch (i2) {
            case 0:
                return context.getString(R.string.widget_now_playing);
            case 1:
            case 2:
            default:
                if (dfeToc != null && dfeToc.a(i2) != null) {
                    return dfeToc.a(i2).g;
                }
                switch (i2) {
                    case 1:
                        i3 = R.string.widget_books_now_playing;
                        break;
                    case 2:
                        i3 = R.string.widget_music_now_playing;
                        break;
                    case 4:
                        i3 = R.string.widget_movies_now_playing;
                        break;
                    case 6:
                        i3 = R.string.widget_newsstand_now_playing;
                        break;
                }
                return context.getString(i3);
            case 3:
                return context.getString(R.string.widget_games_now_playing);
        }
    }

    private static int b(int i2) {
        switch (i2) {
            case 0:
            case 3:
                return R.drawable.ic_play_widgets_np;
            case 1:
                return R.drawable.ic_play_widgets_books;
            case 2:
                return R.drawable.ic_play_widgets_music;
            case 4:
                return R.drawable.ic_play_widgets_movies;
            case 5:
            default:
                throw new IllegalArgumentException("Invalid backend");
            case 6:
                return R.drawable.ic_play_widgets_newsstand;
        }
    }

    private static int[] d(int i2) {
        return i2 == 0 ? i : new int[]{i2};
    }

    private static a b(Context context) {
        if (f5168a == null) {
            f5168a = new a(context, FinskyApp.a().f);
        }
        return f5168a;
    }

    private static List<k> a(List<k> list, List<k> list2) {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (list2 != null && list != null) {
            if (list2.size() >= list.size()) {
                list = list2;
                list2 = list;
            }
            for (k kVar : list) {
                Iterator<k> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    k next = it.next();
                    if (kVar.f5183a.equals(next.f5183a)) {
                        if (next.f5183a.equals(kVar.f5183a)) {
                            arrayList.add(new k(next.f5183a, Math.max(next.f5184b, kVar.f5184b), Math.max(next.c, kVar.c)));
                            z2 = true;
                        } else {
                            throw new IllegalStateException("tried to merge wrappers with different uris!");
                        }
                    }
                }
                if (!z2) {
                    arrayList.add(kVar);
                }
            }
            for (k kVar2 : list2) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((k) it2.next()).f5183a.equals(kVar2.f5183a)) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    arrayList.add(kVar2);
                }
            }
        }
        return arrayList;
    }

    private x a(Context context, int i2, int i3, int i4, int i5) {
        g[] gVarArr;
        int i6;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = i5;
        while (i8 > 0 && i2 > i7) {
            ArrayList<g> arrayList2 = new ArrayList();
            int i9 = 0;
            boolean z = true;
            int i10 = 0;
            int i11 = i4;
            while (i11 > 0 && i2 > i7) {
                int i12 = i9 == 0 ? i8 : i9;
                int i13 = i2 - i7;
                switch (i3) {
                    case 1:
                    case 4:
                    case 6:
                        gVarArr = l;
                        break;
                    case 2:
                    case 3:
                        gVarArr = m;
                        break;
                    case 5:
                    default:
                        throw new IllegalArgumentException("Invalid backend");
                }
                g gVar = null;
                for (g gVar2 : gVarArr) {
                    int i14 = this.f5169b.get(gVar2.hashCode(), 0);
                    if (z) {
                        i6 = ((gVar2.e >= 0) && i14 >= gVar2.e) ? i6 + 1 : 0;
                    }
                    boolean z2 = true;
                    boolean z3 = true;
                    if (gVar != null) {
                        z2 = gVar2.b(context) > gVar.b(context);
                        z3 = gVar2.a(context) >= gVar.a(context);
                    }
                    if (z2 && gVar2.b(context) <= i12 && z3 && gVar2.a(context) <= i11 && i13 >= gVar2.f5180b) {
                        gVar = gVar2;
                    }
                }
                if (gVar != null && z) {
                    this.f5169b.put(gVar.hashCode(), this.f5169b.get(gVar.hashCode(), 0) + 1);
                }
                if (gVar != null) {
                    i7 += gVar.f5180b;
                    arrayList2.add(gVar);
                    int a2 = i11 - gVar.a(context);
                    i9 = Math.max(i9, gVar.b(context));
                    z = false;
                    i10++;
                    i11 = a2;
                }
            }
            if (i10 != 0) {
                HashMap hashMap = new HashMap();
                for (g gVar3 : arrayList2) {
                    if (gVar3.d != null) {
                        hashMap.put(gVar3, Integer.valueOf((hashMap.containsKey(gVar3) ? ((Integer) hashMap.get(gVar3)).intValue() : 0) + 1));
                    }
                }
                int i15 = i7;
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (((Integer) entry.getValue()).intValue() != 1) {
                        g gVar4 = (g) entry.getKey();
                        int size = arrayList2.size() - 1;
                        while (true) {
                            if (size < 0) {
                                size = -1;
                            } else if (arrayList2.get(size) != gVar4) {
                                size--;
                            }
                        }
                        g gVar5 = gVar4.d;
                        int i16 = gVar5.f5180b - gVar4.f5180b;
                        if (i16 <= 0 || i2 - i15 >= i16) {
                            arrayList2.remove(size);
                            arrayList2.add(size, gVar5);
                            i15 = i16 + i15;
                        }
                    }
                }
                arrayList.add(arrayList2);
                i8 -= i9;
                i7 = i15;
            }
        }
        Collections.sort(arrayList, new u(this, context));
        return new x(this, arrayList, i7 >= i2, i8);
    }

    private static List<ConsumptionAppDocList> c(int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 : d(i2)) {
            ConsumptionAppDocList c2 = com.google.android.finsky.services.a.a().c(i3);
            ArrayList arrayList2 = new ArrayList();
            for (ConsumptionAppDoc consumptionAppDoc : c2) {
                if (consumptionAppDoc.f4540a != null) {
                    arrayList2.add(consumptionAppDoc);
                } else {
                    FinskyLog.a("filtering out docId=[%s] because uri was null", consumptionAppDoc.d);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new ConsumptionAppDocList(i3, arrayList2));
            }
        }
        Collections.sort(arrayList, ConsumptionAppDocList.f5166b);
        return arrayList;
    }
}
