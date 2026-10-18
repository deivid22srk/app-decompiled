package com.google.android.gms.car;

import android.os.IInterface;
import java.util.List;

/* loaded from: classes.dex */
public interface dt extends IInterface {
    void a(int i, int i2);

    void a(int i, int i2, int i3);

    void a(int i, int i2, RadioStationInfo radioStationInfo);

    void a(int i, int i2, List<TrafficIncident> list);

    void a(int i, int i2, boolean z);

    void a(int i, int i2, boolean z, List<RadioStationInfo> list);

    void a(int i, RadioStationInfo radioStationInfo);

    void a(int i, boolean z);

    void a(List<StationPresetList> list);

    void b(int i, int i2);

    void b(int i, int i2, boolean z);

    void c(int i, int i2);

    void d(int i, int i2);
}
