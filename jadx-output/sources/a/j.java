package a;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13b;
    private transient int d;
    private transient String e;
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a, reason: collision with root package name */
    public static final j f12a = a(new byte[0]);

    j(byte[] bArr) {
        this.f13b = bArr;
    }

    public static j a(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new j((byte[]) bArr.clone());
    }

    public static j a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        j jVar = new j(str.getBytes(ab.f3a));
        jVar.e = str;
        return jVar;
    }

    public final String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f13b, ab.f3a);
        this.e = str2;
        return str2;
    }

    public final String b() {
        char[] cArr = new char[this.f13b.length * 2];
        int i = 0;
        for (byte b2 : this.f13b) {
            int i2 = i + 1;
            cArr[i] = c[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = c[b2 & 15];
        }
        return new String(cArr);
    }

    public final j c() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f13b.length) {
                byte b2 = this.f13b[i2];
                if (b2 < 65 || b2 > 90) {
                    i = i2 + 1;
                } else {
                    byte[] bArr = (byte[]) this.f13b.clone();
                    bArr[i2] = (byte) (b2 + 32);
                    for (int i3 = i2 + 1; i3 < bArr.length; i3++) {
                        byte b3 = bArr[i3];
                        if (b3 >= 65 && b3 <= 90) {
                            bArr[i3] = (byte) (b3 + 32);
                        }
                    }
                    return new j(bArr);
                }
            } else {
                return this;
            }
        }
    }

    public final byte[] d() {
        return (byte[]) this.f13b.clone();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof j) && Arrays.equals(((j) obj).f13b, this.f13b));
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f13b);
        this.d = hashCode;
        return hashCode;
    }

    public final String toString() {
        if (this.f13b.length == 0) {
            return "ByteString[size=0]";
        }
        if (this.f13b.length <= 16) {
            return String.format("ByteString[size=%s data=%s]", Integer.valueOf(this.f13b.length), b());
        }
        try {
            return String.format("ByteString[size=%s md5=%s]", Integer.valueOf(this.f13b.length), a(MessageDigest.getInstance("MD5").digest(this.f13b)).b());
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError();
        }
    }
}
