package com.google.android.play.search;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ai extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static final Intent f7031a = new Intent("android.speech.action.RECOGNIZE_SPEECH");

    /* renamed from: b, reason: collision with root package name */
    boolean f7032b;
    private final l c;

    public static boolean a(Context context) {
        return context.getPackageManager().queryIntentActivities(f7031a, 0).size() > 0;
    }

    public ai(l lVar) {
        this.c = lVar;
    }

    final void b(Context context) {
        if (this.f7032b) {
            context.unregisterReceiver(this);
            this.f7032b = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
            this.c.a(stringArrayListExtra.get(0), true);
        }
        b(context);
    }
}
