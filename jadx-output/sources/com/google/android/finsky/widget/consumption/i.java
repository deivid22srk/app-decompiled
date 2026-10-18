package com.google.android.finsky.widget.consumption;

import java.util.Comparator;

/* loaded from: classes.dex */
final class i implements Comparator<ConsumptionAppDocList> {
    i() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ConsumptionAppDocList consumptionAppDocList, ConsumptionAppDocList consumptionAppDocList2) {
        ConsumptionAppDocList consumptionAppDocList3 = consumptionAppDocList;
        ConsumptionAppDocList consumptionAppDocList4 = consumptionAppDocList2;
        if (consumptionAppDocList3.isEmpty() || consumptionAppDocList4.isEmpty()) {
            return consumptionAppDocList4.size() - consumptionAppDocList3.size();
        }
        return (int) (consumptionAppDocList4.get(0).c - consumptionAppDocList3.get(0).c);
    }
}
