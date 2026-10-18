package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;

/* loaded from: classes.dex */
final class g extends h {
    private g() {
        super((byte) 0);
    }

    /* synthetic */ g(byte b2) {
        this();
    }

    @Override // android.support.v4.app.h
    public final String a(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    @Override // android.support.v4.app.h
    public final int a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }
}
