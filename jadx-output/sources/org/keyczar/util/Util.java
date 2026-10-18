package org.keyczar.util;

import com.google.gson.a;
import com.google.gson.ah;
import com.google.gson.b.o;
import com.google.gson.k;
import com.google.gson.t;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.KeyType;

/* loaded from: classes2.dex */
public class Util {
    private static final int READ_BUF_SIZE = 8192;
    private static final ConcurrentLinkedQueue<MessageDigest> DIGEST_QUEUE = new ConcurrentLinkedQueue<>();
    private static final ConcurrentLinkedQueue<SecureRandom> RAND_QUEUE = new ConcurrentLinkedQueue<>();
    private static final ThreadLocal<k> GSON_THREAD_LOCAL = new ThreadLocal<k>() { // from class: org.keyczar.util.Util.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public final k initialValue() {
            a aVar;
            t tVar = new t();
            o clone = tVar.f7870a.clone();
            clone.e = true;
            tVar.f7870a = clone;
            t a2 = tVar.a(KeyType.class, new KeyType.KeyTypeSerializer()).a(KeyType.class, new KeyType.KeyTypeDeserializer());
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a2.e);
            Collections.reverse(arrayList);
            arrayList.addAll(a2.f);
            String str = a2.h;
            int i = a2.i;
            int i2 = a2.j;
            if (str != null && !"".equals(str.trim())) {
                aVar = new a(str);
            } else {
                if (i != 2 && i2 != 2) {
                    aVar = new a(i, i2);
                }
                return new k(a2.f7870a, a2.c, a2.d, a2.g, a2.k, a2.o, a2.m, a2.n, a2.l, a2.f7871b, arrayList);
            }
            arrayList.add(ah.a((com.google.gson.c.a<?>) com.google.gson.c.a.a(Date.class), aVar));
            arrayList.add(ah.a((com.google.gson.c.a<?>) com.google.gson.c.a.a(Timestamp.class), aVar));
            arrayList.add(ah.a((com.google.gson.c.a<?>) com.google.gson.c.a.a(java.sql.Date.class), aVar));
            return new k(a2.f7870a, a2.c, a2.d, a2.g, a2.k, a2.o, a2.m, a2.n, a2.l, a2.f7871b, arrayList);
        }
    };

    private Util() {
    }

    public static k gson() {
        return GSON_THREAD_LOCAL.get();
    }

    public static byte[] stripLeadingZeros(byte[] bArr) {
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        if (i != 0) {
            byte[] bArr2 = new byte[bArr.length - i];
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            return bArr2;
        }
        return bArr;
    }

    public static byte[] fromInt(int i) {
        byte[] bArr = new byte[4];
        writeInt(i, bArr, 0);
        return bArr;
    }

    public static byte[] fromLong(long j) {
        byte[] bArr = new byte[8];
        writeLong(j, bArr, 0);
        return bArr;
    }

    public static byte[] prefixHash(byte[]... bArr) {
        MessageDigest poll = DIGEST_QUEUE.poll();
        if (poll == null) {
            try {
                poll = MessageDigest.getInstance("SHA-1");
            } catch (NoSuchAlgorithmException e) {
                throw new KeyczarException(e);
            }
        }
        for (byte[] bArr2 : bArr) {
            poll.update(fromInt(bArr2.length));
            poll.update(bArr2);
        }
        byte[] digest = poll.digest();
        DIGEST_QUEUE.add(poll);
        return digest;
    }

    public static byte[] lenPrefix(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? fromInt(0) : ByteBuffer.allocate(bArr.length + 4).putInt(bArr.length).put(bArr).array();
    }

    public static byte[] lenPrefixPack(byte[]... bArr) {
        int length = (bArr.length + 1) * 4;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        ByteBuffer wrap = ByteBuffer.wrap(bArr3);
        wrap.putInt(bArr.length);
        for (byte[] bArr4 : bArr) {
            wrap.putInt(bArr4.length);
            wrap.put(bArr4);
        }
        return bArr3;
    }

    public static byte[][] lenPrefixUnpack(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = wrap.getInt();
        byte[][] bArr2 = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr3 = new byte[wrap.getInt()];
            wrap.get(bArr3);
            bArr2[i2] = bArr3;
        }
        return bArr2;
    }

    public static byte[] hash(byte[]... bArr) {
        MessageDigest poll = DIGEST_QUEUE.poll();
        if (poll == null) {
            try {
                poll = MessageDigest.getInstance("SHA-1");
            } catch (NoSuchAlgorithmException e) {
                throw new KeyczarException(e);
            }
        }
        for (byte[] bArr2 : bArr) {
            poll.update(bArr2);
        }
        byte[] digest = poll.digest();
        DIGEST_QUEUE.add(poll);
        return digest;
    }

    public static void rand(byte[] bArr) {
        SecureRandom poll = RAND_QUEUE.poll();
        if (poll == null) {
            poll = new SecureRandom();
        }
        poll.nextBytes(bArr);
        RAND_QUEUE.add(poll);
    }

    public static byte[] rand(int i) {
        byte[] bArr = new byte[i];
        rand(bArr);
        return bArr;
    }

    static int readInt(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((bArr[i2] & 255) << 16) | ((bArr[i] & 255) << 24) | 0 | ((bArr[i3] & 255) << 8) | (bArr[i3 + 1] & 255);
    }

    static long readLong(byte[] bArr, int i) {
        long j = 0 | ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48);
        long j2 = j | ((bArr[r3] & 255) << 40);
        long j3 = j2 | ((bArr[r2] & 255) << 32);
        long j4 = j3 | ((bArr[r3] & 255) << 24);
        int i2 = i + 1 + 1 + 1 + 1 + 1 + 1;
        return j4 | ((bArr[r2] & 255) << 16) | ((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255);
    }

    public static int toInt(byte[] bArr) {
        return readInt(bArr, 0);
    }

    public static long toLong(byte[] bArr) {
        return readLong(bArr, 0);
    }

    static void writeInt(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >> 16);
        bArr[i4] = (byte) (i >> 8);
        bArr[i4 + 1] = (byte) i;
    }

    static void writeLong(long j, byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = (byte) (j >> 56);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j >> 48);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j >> 40);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j >> 32);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j >> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j >> 16);
        bArr[i7] = (byte) (j >> 8);
        bArr[i7 + 1] = (byte) j;
    }

    public static boolean safeArrayEquals(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return bArr == bArr2;
        }
        if (bArr.length != bArr2.length) {
            return false;
        }
        byte b2 = 0;
        for (int i = 0; i < bArr.length; i++) {
            b2 = (byte) (b2 | (bArr[i] ^ bArr2[i]));
        }
        return b2 == 0;
    }

    public static byte[] cat(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    public static List<String> split(String str, int i) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            arrayList.add(str.substring(i2, Math.min(length, i2 + i)));
            i2 += i;
        }
        return arrayList;
    }

    public static byte[] readStreamFully(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[READ_BUF_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String encodeBigInteger(BigInteger bigInteger) {
        return Base64Coder.encodeWebSafe(bigInteger.toByteArray());
    }

    public static BigInteger decodeBigInteger(String str) {
        return new BigInteger(Base64Coder.decodeWebSafe(str));
    }

    public static KeyPair generateKeyPair(String str, int i) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str);
            keyPairGenerator.initialize(i);
            return keyPairGenerator.generateKeyPair();
        } catch (GeneralSecurityException e) {
            throw new KeyczarException(e);
        }
    }
}
