package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

/* loaded from: classes.dex */
final class be extends bd {
    be() {
    }

    @Override // android.support.v4.app.bd, android.support.v4.app.bc
    public final Intent a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        return super.a(activity);
    }

    @Override // android.support.v4.app.bd, android.support.v4.app.bc
    public final boolean a(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    @Override // android.support.v4.app.bd, android.support.v4.app.bc
    public final void b(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    @Override // android.support.v4.app.bd, android.support.v4.app.bc
    public final String a(Context context, ActivityInfo activityInfo) {
        String str = activityInfo.parentActivityName;
        if (str == null) {
            return super.a(context, activityInfo);
        }
        return str;
    }
}
