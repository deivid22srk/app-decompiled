package com.google.android.wallet.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public final class q extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f7306a;

    public q(p pVar) {
        this.f7306a = pVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.unregisterReceiver(this);
        int resultCode = getResultCode();
        switch (resultCode) {
            case -1:
                this.f7306a.a(1);
                break;
            case 0:
            default:
                Log.d("SmsSender", new StringBuilder(36).append("SMS failed, result code: ").append(resultCode).toString());
                this.f7306a.a(2);
                break;
            case 1:
                Log.d("SmsSender", new StringBuilder(35).append("SMS failed, error code: ").append(intent.getIntExtra("errorCode", -1)).toString());
                this.f7306a.a(2);
                break;
            case 2:
                this.f7306a.a(3);
                break;
            case 3:
                this.f7306a.a(4);
                break;
        }
    }
}
