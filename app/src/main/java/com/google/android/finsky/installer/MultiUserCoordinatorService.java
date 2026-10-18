package com.google.android.finsky.installer;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.UserHandle;
import java.util.HashMap;

@TargetApi(17)
/* loaded from: classes.dex */
public class MultiUserCoordinatorService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2853a = false;

    /* renamed from: b, reason: collision with root package name */
    private String f2854b = null;
    private final HashMap<String, UserHandle> c = new HashMap<>();
    private final HashMap<UserHandle, k> d = new HashMap<>();
    private final boolean e;
    private final i f;

    public MultiUserCoordinatorService() {
        this.e = Build.VERSION.SDK_INT > 22 || Build.VERSION.CODENAME.equals("MNC");
        this.f = new q(this);
    }

    public static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) MultiUserCoordinatorService.class));
        return intent;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f;
    }
}
