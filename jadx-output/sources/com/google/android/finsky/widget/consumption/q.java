package com.google.android.finsky.widget.consumption;

import com.google.android.finsky.services.ConsumptionAppDoc;
import java.util.Comparator;

/* loaded from: classes.dex */
final class q implements Comparator<ConsumptionAppDoc> {
    q() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ConsumptionAppDoc consumptionAppDoc, ConsumptionAppDoc consumptionAppDoc2) {
        return Long.valueOf(consumptionAppDoc.c).compareTo(Long.valueOf(consumptionAppDoc2.c));
    }
}
