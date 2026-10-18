package android.support.v4.app;

import android.app.RemoteInput;

/* loaded from: classes.dex */
final class ct {
    static RemoteInput[] a(cv[] cvVarArr) {
        if (cvVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[cvVarArr.length];
        for (int i = 0; i < cvVarArr.length; i++) {
            cv cvVar = cvVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(cvVar.a()).setLabel(cvVar.b()).setChoices(cvVar.c()).setAllowFreeFormInput(cvVar.d()).addExtras(cvVar.e()).build();
        }
        return remoteInputArr;
    }
}
