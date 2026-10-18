package com.a.a;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class q {
    public static String a(String str, String str2) {
        try {
            return "Basic " + a.e.a(a.j.a((str + ":" + str2).getBytes("ISO-8859-1")).f13b);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError();
        }
    }
}
