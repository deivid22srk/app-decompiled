package org.keyczar;

@Deprecated
/* loaded from: classes.dex */
public class SessionEncrypter {
    private final byte[] sessionMaterial;
    private final Crypter symmetricCrypter;

    public SessionEncrypter(Encrypter encrypter) {
        AesKey generate = AesKey.generate(DefaultKeyType.AES.getAcceptableSizes().get(0).intValue());
        this.symmetricCrypter = new Crypter(new ImportedKeyReader(generate));
        this.sessionMaterial = encrypter.encrypt(generate.getEncoded());
    }

    public byte[] encrypt(byte[] bArr) {
        return this.symmetricCrypter.encrypt(bArr);
    }

    public byte[] getSessionMaterial() {
        return this.sessionMaterial;
    }

    protected Crypter getSymmetricCrypter() {
        return this.symmetricCrypter;
    }
}
