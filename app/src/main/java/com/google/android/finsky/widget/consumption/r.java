package com.google.android.finsky.widget.consumption;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes.dex */
final class r implements Comparator<ConsumptionAppDocList> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f5194a;

    r(Map map) {
        this.f5194a = map;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ConsumptionAppDocList consumptionAppDocList, ConsumptionAppDocList consumptionAppDocList2) {
        return ((Integer) this.f5194a.get(consumptionAppDocList2)).intValue() - ((Integer) this.f5194a.get(consumptionAppDocList)).intValue();
    }
}
