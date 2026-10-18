package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
class bd implements bc {
    bd() {
    }

    @Override // android.support.v4.app.bc
    public Intent a(Activity activity) {
        Intent intent = null;
        String b2 = bb.b(activity);
        if (b2 != null) {
            ComponentName componentName = new ComponentName(activity, b2);
            try {
                intent = bb.b(activity, componentName) == null ? android.support.v4.b.i.a(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b2 + "' in manifest");
            }
        }
        return intent;
    }

    @Override // android.support.v4.app.bc
    public boolean a(Activity activity, Intent intent) {
        String action = activity.getIntent().getAction();
        return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
    }

    @Override // android.support.v4.app.bc
    public void b(Activity activity, Intent intent) {
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    @Override // android.support.v4.app.bc
    public String a(Context context, ActivityInfo activityInfo) {
        String string;
        if (activityInfo.metaData != null && (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) != null) {
            if (string.charAt(0) == '.') {
                return context.getPackageName() + string;
            }
            return string;
        }
        return null;
    }
}
