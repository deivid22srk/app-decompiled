package com.google.protobuf.nano;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class c {
    public volatile int ar = -1;

    public abstract c a(a aVar);

    public final int d() {
        if (this.ar < 0) {
            e();
        }
        return this.ar;
    }

    public final int e() {
        int a2 = a();
        this.ar = a2;
        return a2;
    }

    public int a() {
        return 0;
    }

    public void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
    }

    public static final byte[] a(c cVar) {
        byte[] bArr = new byte[cVar.e()];
        try {
            CodedOutputByteBufferNano codedOutputByteBufferNano = new CodedOutputByteBufferNano(bArr, bArr.length);
            cVar.a(codedOutputByteBufferNano);
            if (codedOutputByteBufferNano.f7874a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static <T extends c> T a(T t, byte[] bArr, int i) {
        try {
            a a2 = a.a(bArr, i);
            t.a(a2);
            a2.a(0);
            return t;
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public String toString() {
        return d.a(this);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return (c) super.clone();
    }
}
