package com.google.android.finsky.utils;

import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.CipherSpi;

/* loaded from: classes.dex */
public class bi extends CipherSpi {

    /* renamed from: a, reason: collision with root package name */
    private String f4776a;

    /* renamed from: b, reason: collision with root package name */
    private String f4777b;
    private String c;
    private Cipher d;

    public bi(String str) {
        this.f4776a = str;
    }

    private Cipher a() {
        String str;
        if (this.d != null) {
            return this.d;
        }
        String str2 = "Cipher." + this.f4776a;
        if (this.f4777b != null && this.c != null) {
            str = this.f4776a + "/" + this.f4777b + "/" + this.c;
        } else {
            str = this.f4776a;
        }
        for (Provider provider : Security.getProviders(str2)) {
            if (!(provider instanceof bh)) {
                try {
                    Cipher cipher = Cipher.getInstance(str, provider);
                    this.d = cipher;
                    return cipher;
                } catch (GeneralSecurityException e) {
                }
            }
        }
        throw new RuntimeException("No other providers offer " + str);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        this.f4777b = str;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(String str) {
        this.c = str;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) {
        a().init(i, key, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        a().init(i, key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        a().init(i, key, algorithmParameters, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        return a().getParameters();
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return a().getIV();
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return a().getBlockSize();
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return a().getOutputSize(i);
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        byte[] update = a().update(bArr, i, i2);
        if (update != null) {
            return update;
        }
        bArr2 = bh.f4775a;
        return bArr2;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return a().update(bArr, i, i2, bArr2, i3);
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        return a().doFinal(bArr, i, i2);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return a().doFinal(bArr, i, i2, bArr2, i3);
    }
}
