package android.support.v4.f;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
final class f implements c {
    f() {
    }

    @Override // android.support.v4.f.c
    public final boolean a(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
