package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class cb {

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f5914b = null;

    /* renamed from: a, reason: collision with root package name */
    protected Object f5915a = new Object();

    protected final MessageDigest a() {
        MessageDigest messageDigest;
        synchronized (this.f5915a) {
            if (f5914b != null) {
                messageDigest = f5914b;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        f5914b = MessageDigest.getInstance("MD5");
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = f5914b;
            }
        }
        return messageDigest;
    }

    abstract byte[] a(String str);
}
