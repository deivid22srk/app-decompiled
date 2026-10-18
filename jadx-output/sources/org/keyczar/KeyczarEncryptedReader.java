package org.keyczar;

import org.keyczar.interfaces.EncryptedReader;
import org.keyczar.interfaces.KeyczarReader;

/* loaded from: classes2.dex */
public class KeyczarEncryptedReader implements EncryptedReader {
    private Crypter crypter;
    private KeyczarReader reader;

    public KeyczarEncryptedReader(KeyczarReader keyczarReader, Crypter crypter) {
        this.reader = keyczarReader;
        this.crypter = crypter;
    }

    @Override // org.keyczar.interfaces.KeyczarReader
    public String getKey() {
        return this.crypter.decrypt(this.reader.getKey());
    }

    @Override // org.keyczar.interfaces.KeyczarReader
    public String getKey(int i) {
        return this.crypter.decrypt(this.reader.getKey(i));
    }

    @Override // org.keyczar.interfaces.KeyczarReader
    public String getMetadata() {
        return this.reader.getMetadata();
    }
}
