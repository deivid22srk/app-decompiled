package com.google.android.finsky.utils;

import android.util.Base64;
import java.io.Closeable;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class hy {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static hz a(InputStream inputStream) {
        byte[] bArr = new byte[8192];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            long j = 0;
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                            j = read + j;
                        }
                    } else {
                        hz hzVar = new hz(Base64.encodeToString(messageDigest.digest(), 11), j, (byte) 0);
                        jm.a((Closeable) inputStream);
                        return hzVar;
                    }
                } catch (Throwable th) {
                    jm.a((Closeable) inputStream);
                    throw th;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            FinskyLog.e("Unable to access SHA-1 hash", new Object[0]);
            jm.a((Closeable) inputStream);
            return null;
        }
    }
}
