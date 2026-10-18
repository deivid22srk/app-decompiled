package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class iv extends com.google.protobuf.nano.c {
    private static volatile iv[] k;

    /* renamed from: a, reason: collision with root package name */
    public int f3973a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3974b = false;
    public String c = "";
    public boolean d = false;
    public byte[] e = com.google.protobuf.nano.e.h;
    public boolean f = false;
    public long g = 0;
    public boolean h = false;
    public int i = 0;
    public boolean j = false;

    public static iv[] b() {
        if (k == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (k == null) {
                    k = new iv[0];
                }
            }
        }
        return k;
    }

    public iv() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3973a != 0 || this.f3974b) {
            codedOutputByteBufferNano.a(1, this.f3973a);
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.b(3, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(4, this.i);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(5, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3973a != 0 || this.f3974b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3973a);
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.g);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.i);
        }
        if (this.d || !this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(5, this.c);
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
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.f3973a = e;
                            this.f3974b = true;
                            break;
                    }
                case 18:
                    this.e = aVar.d();
                    this.f = true;
                    break;
                case 24:
                    this.g = aVar.f();
                    this.h = true;
                    break;
                case 32:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 42:
                    this.c = aVar.c();
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
