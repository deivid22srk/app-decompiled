package android.support.v4.app;

import android.os.Bundle;

/* loaded from: classes.dex */
final class cx {
    static Bundle[] a(cv[] cvVarArr) {
        if (cvVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[cvVarArr.length];
        for (int i = 0; i < cvVarArr.length; i++) {
            cv cvVar = cvVarArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", cvVar.a());
            bundle.putCharSequence("label", cvVar.b());
            bundle.putCharSequenceArray("choices", cvVar.c());
            bundle.putBoolean("allowFreeFormInput", cvVar.d());
            bundle.putBundle("extras", cvVar.e());
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
