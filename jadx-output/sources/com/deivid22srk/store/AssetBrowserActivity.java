package com.deivid22srk.store;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.activities.MainActivity;

/* loaded from: classes.dex */
public class AssetBrowserActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.google.android.finsky.safemode.a.b()) {
            com.google.android.finsky.safemode.a.d();
            finish();
            return;
        }
        Intent intent = getIntent();
        intent.setClass(this, MainActivity.class);
        intent.setFlags(intent.getFlags() & (-2097153));
        startActivity(intent);
        finish();
    }
}
