package org.keyczar;

import org.keyczar.annotations.Experimental;

@Experimental
/* loaded from: classes2.dex */
public class SessionCrypter {
    private final byte[] sessionMaterial;
    private final Crypter symmetricCrypter;

    public SessionCrypter(Encrypter encrypter) {
        AesKey generate = AesKey.generate(DefaultKeyType.AES.getAcceptableSizes().get(0).intValue());
        this.symmetricCrypter = new Crypter(new ImportedKeyReader(generate));
        this.sessionMaterial = encrypter.encrypt(generate.getEncoded());
    }

    public SessionCrypter(Crypter crypter, byte[] bArr) {
        this.symmetricCrypter = new Crypter(new ImportedKeyReader(AesKey.fromPackedKey(crypter.decrypt(bArr))));
        this.sessionMaterial = bArr;
    }

    public byte[] decrypt(byte[] bArr) {
        return this.symmetricCrypter.decrypt(bArr);
    }

    public byte[] encrypt(byte[] bArr) {
        return this.symmetricCrypter.encrypt(bArr);
    }

    public byte[] getSessionMaterial() {
        return this.sessionMaterial;
    }
}
