package com.google.android.finsky.services;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelUtils;
import com.google.android.finsky.widget.consumption.ConsumptionAppDocList;
import java.io.File;

/* loaded from: classes.dex */
public class LoadConsumptionDataService extends IntentService {
    public LoadConsumptionDataService() {
        super("LoadConsumptionDataService");
    }

    public static boolean a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                return true;
            case 5:
            default:
                return false;
        }
    }

    public static boolean b(int i) {
        switch (i) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public static void a(Context context, int... iArr) {
        Intent intent = new Intent(context, (Class<?>) LoadConsumptionDataService.class);
        intent.setAction(String.valueOf(iArr.hashCode()));
        intent.putExtra("backendIds", iArr);
        context.startService(intent);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        ConsumptionAppDocList consumptionAppDocList;
        int i;
        a a2 = a.a();
        int[] intArrayExtra = intent.getIntArrayExtra("backendIds");
        int[] iArr = new int[intArrayExtra.length];
        int length = intArrayExtra.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = intArrayExtra[i2];
            ConsumptionAppDocList consumptionAppDocList2 = new ConsumptionAppDocList(i4);
            File b2 = a.b(this, i4);
            if (!b2.exists()) {
                FinskyLog.a("%s doesn't exist", b2.getAbsolutePath());
                consumptionAppDocList = consumptionAppDocList2;
            } else {
                consumptionAppDocList = (ConsumptionAppDocList) ParcelUtils.a(b2);
                if (consumptionAppDocList == null) {
                    consumptionAppDocList = consumptionAppDocList2;
                }
            }
            if (consumptionAppDocList.isEmpty()) {
                i = i3;
            } else {
                iArr[i3] = i4;
                a2.a((Context) this, consumptionAppDocList, false);
                FinskyLog.a("Was able to read from cache for %d", Integer.valueOf(i4));
                i = i3 + 1;
            }
            FetchConsumptionDataService.a(this, i4);
            i2++;
            i3 = i;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            a.a(this, iArr[i5]);
        }
    }
}
