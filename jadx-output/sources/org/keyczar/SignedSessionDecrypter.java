package org.keyczar;

import org.keyczar.annotations.Experimental;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.util.Base64Coder;

@Experimental
/* loaded from: classes2.dex */
public class SignedSessionDecrypter {
    private final SessionMaterial session;
    private final Verifier verifier;

    public SignedSessionDecrypter(Crypter crypter, Verifier verifier, String str) {
        this.verifier = verifier;
        this.session = SessionMaterial.read(new String(crypter.decrypt(Base64Coder.decodeWebSafe(str))));
    }

    public byte[] decrypt(byte[] bArr) {
        if (this.session == null) {
            throw new KeyczarException("Session has not been initialized");
        }
        return new Crypter(new ImportedKeyReader(this.session.getKey())).decrypt(this.verifier.getAttachedData(bArr, Base64Coder.decodeWebSafe(this.session.getNonce())));
    }
}
