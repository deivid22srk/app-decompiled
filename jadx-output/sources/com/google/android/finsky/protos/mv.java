package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mv extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long f4150a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4151b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public ds g = null;
    public ea h = null;
    public String i = "";
    public boolean j = false;
    public byte[] k = com.google.protobuf.nano.e.h;
    public boolean l = false;

    public mv() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4151b || this.f4150a != 0) {
            codedOutputByteBufferNano.b(2, this.f4150a);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(5, this.h);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(6, this.i);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(7, this.c);
        }
        if (this.l || !Arrays.equals(this.k, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(8, this.k);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(9, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4151b || this.f4150a != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.f4150a);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.h);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.i);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.c);
        }
        if (this.l || !Arrays.equals(this.k, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(8, this.k);
        }
        if (this.g != null) {
            return a2 + CodedOutputByteBufferNano.d(9, this.g);
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
                case 16:
                    this.f4150a = aVar.f();
                    this.f4151b = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 42:
                    if (this.h == null) {
                        this.h = new ea();
                    }
                    aVar.a(this.h);
                    break;
                case 50:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 58:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 66:
                    this.k = aVar.d();
                    this.l = true;
                    break;
                case 74:
                    if (this.g == null) {
                        this.g = new ds();
                    }
                    aVar.a(this.g);
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
