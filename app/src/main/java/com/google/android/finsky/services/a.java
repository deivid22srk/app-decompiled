package com.google.android.finsky.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import com.google.android.finsky.widget.consumption.ConsumptionAppDocList;
import com.google.android.finsky.widget.consumption.NowPlayingWidgetProvider;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    private static a c;
    private final Handler d = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public SparseArray<List<ConsumptionAppDoc>> f4560a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public SparseArray<Integer> f4561b = new SparseArray<>();

    public static a a() {
        if (c == null) {
            c = new a();
        }
        return c;
    }

    public final boolean a(int i) {
        jm.a();
        return b(i) == 2;
    }

    public final int b(int i) {
        jm.a();
        if (this.f4561b.get(i) != null) {
            return this.f4561b.get(i).intValue();
        }
        return 0;
    }

    public final ConsumptionAppDocList c(int i) {
        jm.a();
        ConsumptionAppDocList consumptionAppDocList = new ConsumptionAppDocList(i);
        if (a(i)) {
            consumptionAppDocList.addAll(this.f4560a.get(i));
        }
        return consumptionAppDocList;
    }

    public static void a(Context context, int i) {
        Intent intent = new Intent("com.deivid22srk.store.action.APPWIDGET_UPDATE_CONSUMPTION_DATA");
        intent.setClass(context, NowPlayingWidgetProvider.class);
        intent.putExtra("backendId", i);
        context.sendBroadcast(intent);
    }

    public static File b(Context context, int i) {
        File file = new File(context.getCacheDir(), "consumption");
        file.mkdirs();
        return new File(file, "ConsumptionAppDataCache_" + i + ".cache");
    }

    public final void a(Context context, int i, List<Bundle> list) {
        int i2;
        String b2 = com.google.android.finsky.cpkg.d.y.b();
        if (com.google.android.finsky.cpkg.d.f.b().booleanValue() && !TextUtils.isEmpty(b2)) {
            String[] split = b2.split(";");
            String[] strArr = null;
            for (String str : split) {
                String[] split2 = str.trim().split(":");
                if (split2.length != 2) {
                    FinskyLog.a("Bad corpus filter expression %s", str);
                } else {
                    int parseInt = Integer.parseInt(split2[0]);
                    if (parseInt == 0 || parseInt == i) {
                        strArr = split2[1].trim().split(",");
                    }
                    if (parseInt == i) {
                        break;
                    }
                }
            }
            String[] strArr2 = strArr;
            if (strArr2 == null) {
                list.clear();
            } else {
                int length = strArr2.length;
                if (!strArr2[length + (-1)].equals("...")) {
                    while (list.size() > length) {
                        list.remove(list.size() - 1);
                    }
                    i2 = length;
                } else {
                    i2 = length - 1;
                }
                long currentTimeMillis = System.currentTimeMillis();
                for (int i3 = 0; i3 < list.size(); i3++) {
                    list.get(i3).putLong("Play.LastUpdateTimeMillis", (long) (currentTimeMillis - (8.64E7f * Float.parseFloat(strArr2[Math.min(i2 - 1, i3)]))));
                }
                new Object[1][0] = Integer.valueOf(i);
                Iterator<Bundle> it = list.iterator();
                while (it.hasNext()) {
                    new Object[1][0] = new ConsumptionAppDoc(it.next()).toString();
                }
            }
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.d.post(new b(this, context, i, list));
        } else if (list != null) {
            a(context, ConsumptionAppDocList.a(i, list), true);
        }
    }

    public final void a(Context context, ConsumptionAppDocList consumptionAppDocList, boolean z) {
        boolean z2;
        int i = consumptionAppDocList.f5167a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.d.post(new c(this, context, consumptionAppDocList, z));
            return;
        }
        if (a(i)) {
            z2 = !c(i).equals(consumptionAppDocList);
        } else {
            z2 = consumptionAppDocList.size() > 0;
        }
        this.f4560a.put(i, consumptionAppDocList);
        this.f4561b.put(i, 2);
        if (!z2) {
            FinskyLog.a("data didn't change for backend=[%s], ignoring!", Integer.valueOf(i));
        } else if (z) {
            a(context, i);
        }
    }
}
