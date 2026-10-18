package com.deivid22srk.store;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bz;
import com.google.android.finsky.utils.ca;

/* loaded from: classes.dex */
public class GCMIntentService extends com.google.android.gcm.a {
    public GCMIntentService() {
        super("932144863878");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gcm.a
    public final void a(String str) {
        FinskyLog.d("%s", str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gcm.a
    public final void a(Intent intent) {
        new Object[1][0] = intent.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gcm.a
    public final void b(String str) {
        new Object[1][0] = str;
        new Handler(Looper.getMainLooper()).post(new bz());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gcm.a
    public final void a(Context context) {
        FinskyLog.a("GcmUnregistered - invalidating and requesting new id.", new Object[0]);
        new Handler(Looper.getMainLooper()).post(new ca(context));
    }
}
