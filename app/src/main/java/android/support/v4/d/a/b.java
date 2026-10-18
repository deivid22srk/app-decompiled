package android.support.v4.d.a;

import android.content.Context;

/* loaded from: classes.dex */
final class b implements c {
    @Override // android.support.v4.d.a.c
    public final boolean a(Context context) {
        return e.a(context).hasEnrolledFingerprints();
    }

    @Override // android.support.v4.d.a.c
    public final boolean b(Context context) {
        return e.a(context).isHardwareDetected();
    }
}
