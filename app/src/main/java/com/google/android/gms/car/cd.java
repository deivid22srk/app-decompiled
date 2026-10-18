package com.google.android.gms.car;

import android.os.IInterface;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* loaded from: classes.dex */
public interface cd extends IInterface {
    void a(KeyEvent keyEvent);

    void a(CarCall carCall);

    void a(CarCall carCall, int i);

    void a(CarCall carCall, CarCall.Details details);

    void a(CarCall carCall, CarCall carCall2);

    void a(CarCall carCall, String str);

    void a(CarCall carCall, List<CarCall> list);

    void a(boolean z, int i, int i2);

    void b(CarCall carCall);

    void b(CarCall carCall, List<String> list);

    void c(CarCall carCall);

    void c(CarCall carCall, List<CarCall> list);
}
