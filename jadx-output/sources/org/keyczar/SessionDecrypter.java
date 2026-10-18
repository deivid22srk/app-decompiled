package org.keyczar;

@Deprecated
/* loaded from: classes.dex */
public class SessionDecrypter {
    private final Crypter symmetricCrypter;

    public SessionDecrypter(Crypter crypter, byte[] bArr) {
        this.symmetricCrypter = new Crypter(new ImportedKeyReader(AesKey.fromPackedKey(crypter.decrypt(bArr))));
    }

    public byte[] decrypt(byte[] bArr) {
        return this.symmetricCrypter.decrypt(bArr);
    }
}
