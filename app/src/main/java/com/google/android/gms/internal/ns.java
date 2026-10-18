package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import java.util.List;

/* loaded from: classes.dex */
public interface ns extends IInterface {
    void a(Status status, List<PredictedNetworkQuality> list);
}
