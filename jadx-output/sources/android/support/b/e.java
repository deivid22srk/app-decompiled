package android.support.b;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* loaded from: classes.dex */
final class e {
    static long a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, a(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    private static f a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j = length - 65536;
        long j2 = j >= 0 ? j : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        long j3 = length;
        do {
            randomAccessFile.seek(j3);
            if (randomAccessFile.readInt() != reverseBytes) {
                j3--;
            } else {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                f fVar = new f();
                fVar.f60b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                fVar.f59a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return fVar;
            }
        } while (j3 >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }

    private static long a(RandomAccessFile randomAccessFile, f fVar) {
        CRC32 crc32 = new CRC32();
        long j = fVar.f60b;
        randomAccessFile.seek(fVar.f59a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        }
        return crc32.getValue();
    }
}
