package com.google.android.wallet.common.util;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f7302a = Log.isLoggable("ImProto", 2);

    public static <T extends com.google.protobuf.nano.c> T a(byte[] bArr, Class<T> cls) {
        try {
            return (T) com.google.protobuf.nano.c.a(cls.newInstance(), bArr, bArr.length);
        } catch (IOException e) {
            String valueOf = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf.length() != 0 ? "Failed to parse a known parcelable proto ".concat(valueOf) : new String("Failed to parse a known parcelable proto "));
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Failed to parse a known parcelable proto ".concat(valueOf2) : new String("Failed to parse a known parcelable proto "));
        } catch (InstantiationException e3) {
            String valueOf3 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf3.length() != 0 ? "Failed to parse a known parcelable proto ".concat(valueOf3) : new String("Failed to parse a known parcelable proto "));
        }
    }

    public static <T extends com.google.protobuf.nano.c> T a(T t) {
        return (T) a(com.google.protobuf.nano.c.a(t), t.getClass());
    }

    public static void a(com.google.protobuf.nano.c cVar, String str) {
        if (f7302a) {
            if (com.google.android.wallet.a.a.g.b().booleanValue()) {
                synchronized (m.class) {
                    Log.v("ImProto", str);
                    for (String str2 : cVar.toString().split("\n")) {
                        String valueOf = String.valueOf(str2);
                        Log.v("ImProto", valueOf.length() != 0 ? "| ".concat(valueOf) : new String("| "));
                    }
                }
                return;
            }
            Log.v("ImProto", "allowPiiLogging needs to be enabled for proto logging");
        }
    }

    public static void b(com.google.protobuf.nano.c cVar, String str) {
        String valueOf = String.valueOf(str);
        a(cVar, valueOf.length() != 0 ? "Response for ".concat(valueOf) : new String("Response for "));
    }

    private m() {
    }
}
