package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class oq extends com.google.protobuf.nano.c {
    private static volatile oq[] e;

    /* renamed from: a, reason: collision with root package name */
    public int f4223a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4224b = false;
    public byte[] c = com.google.protobuf.nano.e.h;
    public boolean d = false;

    public static oq[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new oq[0];
                }
            }
        }
        return e;
    }

    public oq() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4223a != 0 || this.f4224b) {
            codedOutputByteBufferNano.a(1, this.f4223a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4223a != 0 || this.f4224b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4223a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            return a2 + CodedOutputByteBufferNano.b(2, this.c);
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                            this.f4223a = e2;
                            this.f4224b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.d();
                    this.d = true;
                    break;
                default:
                    if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
