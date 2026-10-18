package android.support.v4.b;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
class l extends k {
    l() {
    }

    @Override // android.support.v4.b.k, android.support.v4.b.j
    public final Intent a(ComponentName componentName) {
        return Intent.makeMainActivity(componentName);
    }
}
