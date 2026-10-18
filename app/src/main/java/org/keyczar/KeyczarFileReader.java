package org.keyczar;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.KeyczarReader;

/* loaded from: classes2.dex */
public class KeyczarFileReader implements KeyczarReader {
    static final String META_FILE = "meta";
    private String location;

    public KeyczarFileReader(String str) {
        if (str != null && !str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        this.location = str;
    }

    @Override // org.keyczar.interfaces.KeyczarReader
    public String getKey(int i) {
        return readFile(this.location + i);
    }

    @Override // org.keyczar.interfaces.KeyczarReader
    public String getKey() {
        return getKey(KeyMetadata.read(getMetadata()).getPrimaryVersion().getVersionNumber());
    }

    @Override // org.keyczar.interfaces.KeyczarReader
    public String getMetadata() {
        return readFile(this.location + META_FILE);
    }

    private String readFile(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.read(bArr);
            randomAccessFile.close();
            return new String(bArr);
        } catch (IOException e) {
            throw new KeyczarException(Messages.getString("KeyczarFileReader.FileError", str), e);
        }
    }
}
