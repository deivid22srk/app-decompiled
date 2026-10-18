package android.support.v4.b;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final j f249a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 15) {
            f249a = new m();
        } else if (i >= 11) {
            f249a = new l();
        } else {
            f249a = new k();
        }
    }

    public static Intent a(ComponentName componentName) {
        return f249a.a(componentName);
    }
}
