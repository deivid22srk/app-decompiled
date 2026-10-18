package android.support.v4.d.a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;

/* loaded from: classes.dex */
public final class e {
    static FingerprintManager a(Context context) {
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }
}
