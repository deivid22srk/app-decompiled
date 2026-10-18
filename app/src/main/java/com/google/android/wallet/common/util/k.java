package com.google.android.wallet.common.util;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f7300a;

    public k(Context context, String str) {
        this.f7300a = a(Settings.Secure.getString(context.getContentResolver(), "android_id"), str);
    }

    private static String a(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str2.getBytes(Keyczar.DEFAULT_ENCODING));
            messageDigest.update(str.getBytes(Keyczar.DEFAULT_ENCODING));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static SecretKey a() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] a(Certificate certificate, SecretKey secretKey) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            try {
                cipher.init(1, certificate.getPublicKey());
                try {
                    byte[] doFinal = cipher.doFinal(secretKey.getEncoded());
                    a(doFinal);
                    return doFinal;
                } catch (BadPaddingException e) {
                    throw new RuntimeException(e);
                } catch (IllegalBlockSizeException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (InvalidKeyException e3) {
                throw new CertificateException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        } catch (NoSuchPaddingException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static byte[] a(long j, String str, String str2) {
        int i = (int) (j / 1000);
        try {
            byte[] bytes = str.getBytes(Keyczar.DEFAULT_ENCODING);
            int length = bytes.length;
            if (length != str.length()) {
                throw new IllegalArgumentException(new StringBuilder(61).append("Hashed device ID not 8 bits per char: ").append(length).append(" ").append(str.length()).toString());
            }
            if (length > 255) {
                throw new IllegalArgumentException(new StringBuilder(38).append("Hashed device ID too long: ").append(length).toString());
            }
            try {
                byte[] bytes2 = str2.getBytes("UTF-16LE");
                int length2 = str2.length();
                if (length2 > 255) {
                    throw new IllegalArgumentException(new StringBuilder(30).append("Password too long: ").append(length2).toString());
                }
                ByteBuffer allocate = ByteBuffer.allocate(length + 5 + 1 + bytes2.length);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putInt(i);
                allocate.put((byte) length);
                allocate.put(bytes);
                allocate.put((byte) length2);
                allocate.put(bytes2);
                return allocate.array();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] a(SecretKey secretKey, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            try {
                cipher.init(1, secretKey, new IvParameterSpec(new byte[16]));
                try {
                    return cipher.doFinal(bArr);
                } catch (BadPaddingException e) {
                    throw new RuntimeException(e);
                } catch (IllegalBlockSizeException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (InvalidAlgorithmParameterException e3) {
                throw new RuntimeException(e3);
            } catch (InvalidKeyException e4) {
                throw new RuntimeException(e4);
            }
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchPaddingException e6) {
            throw new RuntimeException(e6);
        }
    }

    private static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int length = (bArr.length - 1) - i;
            byte b2 = bArr[i];
            bArr[i] = bArr[length];
            bArr[length] = b2;
        }
    }
}
