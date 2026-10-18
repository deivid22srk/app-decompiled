package com.google.android.wallet.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.util.Log;

/* loaded from: classes.dex */
public final class n extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public o f7303a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.d("SmsReceiver", valueOf.length() != 0 ? "Received intent with action: ".concat(valueOf) : new String("Received intent with action: "));
            return;
        }
        if (this.f7303a == null) {
            Log.v("SmsReceiver", "No listener to handle SMS broadcasts");
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f7303a.a(Telephony.Sms.Intents.getMessagesFromIntent(intent));
            return;
        }
        Object[] objArr = (Object[]) intent.getExtras().get("pdus");
        int length = objArr.length;
        SmsMessage[] smsMessageArr = new SmsMessage[length];
        for (int i = 0; i < length; i++) {
            smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
        }
        this.f7303a.a(smsMessageArr);
    }
}
