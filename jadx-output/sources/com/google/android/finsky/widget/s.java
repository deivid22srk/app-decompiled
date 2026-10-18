package com.google.android.finsky.widget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.SparseIntArray;
import com.android.vending.R;
import com.google.android.finsky.g.ah;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.widget.recommendation.RecommendedWidgetProvider;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static int[] f5241a = {0, 3, 2, 6, 1, 4};

    public static int a(String str) {
        if ("all".equals(str)) {
            return 0;
        }
        if ("apps".equals(str)) {
            return 3;
        }
        if ("books".equals(str)) {
            return 1;
        }
        if ("movies".equals(str)) {
            return 4;
        }
        if ("music".equals(str)) {
            return 2;
        }
        if ("magazines".equals(str)) {
            return 6;
        }
        throw new IllegalArgumentException("Invalid backend type: " + str);
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "all";
            case 1:
                return "books";
            case 2:
                return "music";
            case 3:
                return "apps";
            case 4:
                return "movies";
            case 5:
            default:
                throw new IllegalArgumentException("Invalid backend ID: " + i);
            case 6:
                return "magazines";
        }
    }

    public static SparseIntArray b(String str) {
        String[] split = str.split(",");
        SparseIntArray sparseIntArray = new SparseIntArray(split.length);
        for (String str2 : split) {
            int indexOf = str2.indexOf(58);
            if (indexOf < 0) {
                FinskyLog.c("Invalid tuple: map=%s, tuple=%s", str, str2);
            } else {
                try {
                    sparseIntArray.put(Integer.parseInt(str2.substring(0, indexOf)), Integer.parseInt(str2.substring(indexOf + 1, str2.length())));
                } catch (NumberFormatException e) {
                    FinskyLog.c("Malformed key or value: map=%s, tuple=%s", str, str2);
                }
            }
        }
        return sparseIntArray;
    }

    public static String a(SparseIntArray sparseIntArray) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            if (keyAt >= 0) {
                if (!z) {
                    sb.append(',');
                }
                sb.append(keyAt).append(':').append(sparseIntArray.get(keyAt));
                z = false;
            }
        }
        return sb.toString();
    }

    public static void a(Context context, ah ahVar) {
        ahVar.a(new t(context));
    }

    public static void a(Context context) {
        for (int i : f5241a) {
            com.google.android.finsky.widget.recommendation.c.a(context, i);
        }
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) RecommendedWidgetProvider.class));
        if (appWidgetIds.length > 0) {
            com.google.android.finsky.widget.recommendation.h.a(context, appWidgetIds);
        }
    }

    public static int a(Context context, int i) {
        return (int) (r0.getDimensionPixelSize(i) / context.getResources().getDisplayMetrics().density);
    }

    public static int b(int i) {
        switch (i) {
            case 1:
                return R.mipmap.ic_launcher_play_books;
            case 2:
                return R.mipmap.ic_launcher_play_music;
            case 3:
                return R.mipmap.ic_launcher_play_apps;
            case 4:
                return R.mipmap.ic_launcher_play_movietv;
            case 5:
            default:
                return R.mipmap.ic_menu_play;
            case 6:
                return R.mipmap.ic_launcher_play_newsstand;
        }
    }

    public static int c(int i) {
        switch (i) {
            case 1:
                return R.drawable.ic_hotseat_check_book;
            case 2:
                return R.drawable.ic_hotseat_check_music;
            case 3:
            case 5:
            default:
                throw new IllegalArgumentException("Unsupported backend ID (" + i + ")");
            case 4:
                return R.drawable.ic_hotseat_check_movies;
            case 6:
                return R.drawable.ic_hotseat_check_newsstand;
        }
    }

    public static int d(int i) {
        switch (i) {
            case 1:
                return com.google.android.finsky.c.d.dk.b().intValue();
            case 2:
                return com.google.android.finsky.c.d.dn.b().intValue();
            case 3:
            case 5:
            default:
                throw new IllegalArgumentException("Unsupported backend ID (" + i + ")");
            case 4:
                return com.google.android.finsky.c.d.dm.b().intValue();
            case 6:
                return com.google.android.finsky.c.d.dl.b().intValue();
        }
    }

    static /* synthetic */ String c(String str) {
        if (com.google.android.finsky.g.a.f2782a.equals(str)) {
            return "apps";
        }
        if (com.google.android.finsky.g.a.f2783b.equals(str)) {
            return "books";
        }
        if (com.google.android.finsky.g.a.c.equals(str)) {
            return "movies";
        }
        if (com.google.android.finsky.g.a.d.equals(str)) {
            return "music";
        }
        if (com.google.android.finsky.g.a.e.equals(str)) {
            return "magazines";
        }
        return null;
    }
}
