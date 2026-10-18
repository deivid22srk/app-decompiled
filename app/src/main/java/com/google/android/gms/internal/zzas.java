package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzas {

    /* renamed from: a, reason: collision with root package name */
    private final av f6262a;

    /* renamed from: b, reason: collision with root package name */
    private final SecureRandom f6263b = null;

    public class zza extends Exception {
        public zza() {
        }

        public zza(Throwable th) {
            super(th);
        }
    }

    public zzas(av avVar) {
        this.f6262a = avVar;
    }

    public final byte[] a(byte[] bArr, String str) {
        if (bArr.length != 16) {
            throw new zza();
        }
        try {
            byte[] a2 = this.f6262a.a(str, false);
            if (a2.length <= 16) {
                throw new zza();
            }
            ByteBuffer allocate = ByteBuffer.allocate(a2.length);
            allocate.put(a2);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[a2.length - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr3);
        } catch (IllegalArgumentException e) {
            throw new zza(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new zza(e2);
        } catch (InvalidKeyException e3) {
            throw new zza(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new zza(e4);
        } catch (BadPaddingException e5) {
            throw new zza(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new zza(e6);
        } catch (NoSuchPaddingException e7) {
            throw new zza(e7);
        }
    }

    public final byte[] a(String str) {
        try {
            byte[] a2 = this.f6262a.a(str, false);
            if (a2.length != 32) {
                throw new zza();
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a2, 4, 16).get(bArr);
            for (int i = 0; i < 16; i++) {
                bArr[i] = (byte) (bArr[i] ^ 68);
            }
            return bArr;
        } catch (IllegalArgumentException e) {
            throw new zza(e);
        }
    }
}
