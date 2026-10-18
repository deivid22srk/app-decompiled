package com.google.android.finsky.download;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class MimeTypeActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FinskyLog.e("MimeTypeActivity finishing", new Object[0]);
        finish();
    }
}
