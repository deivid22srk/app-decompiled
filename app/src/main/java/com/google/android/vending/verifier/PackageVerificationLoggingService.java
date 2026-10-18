package com.google.android.vending.verifier;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class PackageVerificationLoggingService extends IntentService {
    public PackageVerificationLoggingService() {
        super("PackageVerificationLoggingService");
    }

    private static void a(Context context, com.google.android.vending.verifier.bpkg.q qVar) {
        byte[] a2 = com.google.protobuf.nano.c.a(qVar);
        Intent intent = new Intent(context, (Class<?>) PackageVerificationLoggingService.class);
        intent.putExtra("proto_bytes", a2);
        context.startService(intent);
    }

    public static void a(Context context, com.google.android.vending.verifier.bpkg.m mVar) {
        com.google.android.vending.verifier.bpkg.q qVar = new com.google.android.vending.verifier.bpkg.q();
        qVar.f7147a = mVar;
        a(context, qVar);
    }

    public static void a(Context context, boolean z, int i, String str, Integer num, byte[] bArr, Integer num2) {
        com.google.android.vending.verifier.bpkg.q qVar = new com.google.android.vending.verifier.bpkg.q();
        qVar.f7148b = new com.google.android.vending.verifier.bpkg.p();
        qVar.f7148b.f7145a = z;
        qVar.f7148b.f7146b = true;
        qVar.f7148b.c = i;
        qVar.f7148b.d = true;
        if (str != null) {
            qVar.f7148b.e = str;
            qVar.f7148b.f = true;
        }
        if (num != null) {
            qVar.f7148b.g = num.intValue();
            qVar.f7148b.h = true;
        }
        if (bArr != null) {
            qVar.f7148b.i = bArr;
            qVar.f7148b.j = true;
        }
        if (num2 != null) {
            qVar.f7148b.k = num2.intValue();
            qVar.f7148b.l = true;
        }
        a(context, qVar);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("proto_bytes");
        com.google.android.gms.common.api.m a2 = a();
        try {
            if (a2 != null) {
                Status a3 = new com.google.android.gms.clearcut.a(this, "ANDROID_VERIFY_APPS").a(byteArrayExtra).a(a2).a(10000L, TimeUnit.MILLISECONDS);
                if (!a3.a()) {
                    FinskyLog.d("Could not log user response to Clearcut: %s", a3.h);
                }
            }
        } catch (RuntimeException e) {
            FinskyLog.d("Could not log user response to Clearcut: %s", e);
        } finally {
            a2.d();
        }
    }

    private com.google.android.gms.common.api.m a() {
        try {
            com.google.android.gms.common.api.m b2 = new com.google.android.gms.common.api.n(this).a(com.google.android.gms.clearcut.a.c).b();
            ConnectionResult a2 = b2.a(10000L, TimeUnit.MILLISECONDS);
            if (a2.b()) {
                return b2;
            }
            FinskyLog.c("Could not connect to Clearcut: %s", a2);
            return null;
        } catch (RuntimeException e) {
            FinskyLog.d("Could not connect to Clearcut: %s", e);
            return null;
        }
    }
}
