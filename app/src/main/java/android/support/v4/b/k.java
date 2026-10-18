package android.support.v4.b;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
class k implements j {
    k() {
    }

    @Override // android.support.v4.b.j
    public Intent a(ComponentName componentName) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }
}
