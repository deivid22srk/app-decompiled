package com.google.android.finsky.utils;

import android.util.Base64;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes.dex */
public final class dg {
    public static String a(com.google.protobuf.nano.c cVar) {
        return Base64.encodeToString(com.google.protobuf.nano.c.a(cVar), 3);
    }

    public static boolean a(String str, com.google.protobuf.nano.c cVar) {
        try {
            byte[] decode = Base64.decode(str, 3);
            com.google.protobuf.nano.c.a(cVar, decode, decode.length);
            return true;
        } catch (InvalidProtocolBufferNanoException e) {
            FinskyLog.a(e, "Error parsing string into proto", new Object[0]);
            return false;
        }
    }
}
