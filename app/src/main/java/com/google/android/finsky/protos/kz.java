package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class kz extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public kx f4064a = null;

    /* renamed from: b, reason: collision with root package name */
    public kx f4065b = null;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public String m = "";
    public boolean n = false;
    public int o = 0;
    public boolean p = false;
    public byte[] q = com.google.protobuf.nano.e.h;
    public boolean r = false;
    public kv[] s = kv.b();

    public kz() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4064a != null) {
            codedOutputByteBufferNano.b(1, this.f4064a);
        }
        if (this.f4065b != null) {
            codedOutputByteBufferNano.b(2, this.f4065b);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(6, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(7, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(8, this.i);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(9, this.k);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(10, this.m);
        }
        if (this.p || this.o != 0) {
            codedOutputByteBufferNano.a(11, this.o);
        }
        if (this.r || !Arrays.equals(this.q, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(12, this.q);
        }
        if (this.s != null && this.s.length > 0) {
            for (int i = 0; i < this.s.length; i++) {
                kv kvVar = this.s[i];
                if (kvVar != null) {
                    codedOutputByteBufferNano.b(13, kvVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4064a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4064a);
        }
        if (this.f4065b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4065b);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.i);
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(9) + 1;
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.m);
        }
        if (this.p || this.o != 0) {
            a2 += CodedOutputByteBufferNano.c(11, this.o);
        }
        if (this.r || !Arrays.equals(this.q, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(12, this.q);
        }
        if (this.s != null && this.s.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.s.length; i2++) {
                kv kvVar = this.s[i2];
                if (kvVar != null) {
                    i += CodedOutputByteBufferNano.d(13, kvVar);
                }
            }
            return i;
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
                case 10:
                    if (this.f4064a == null) {
                        this.f4064a = new kx();
                    }
                    aVar.a(this.f4064a);
                    break;
                case 18:
                    if (this.f4065b == null) {
                        this.f4065b = new kx();
                    }
                    aVar.a(this.f4065b);
                    break;
                case 26:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 50:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 58:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 66:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 72:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 82:
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 88:
                    this.o = aVar.e();
                    this.p = true;
                    break;
                case 98:
                    this.q = aVar.d();
                    this.r = true;
                    break;
                case 106:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 106);
                    int length = this.s == null ? 0 : this.s.length;
                    kv[] kvVarArr = new kv[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.s, 0, kvVarArr, 0, length);
                    }
                    while (length < kvVarArr.length - 1) {
                        kvVarArr[length] = new kv();
                        aVar.a(kvVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    kvVarArr[length] = new kv();
                    aVar.a(kvVarArr[length]);
                    this.s = kvVarArr;
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
