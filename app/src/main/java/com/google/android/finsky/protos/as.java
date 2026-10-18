package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class as extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public io[] f3605a = io.b();

    /* renamed from: b, reason: collision with root package name */
    public String f3606b = "";
    public boolean c = false;
    public at[] d = at.b();
    public byte[] e = com.google.protobuf.nano.e.h;
    public boolean f = false;
    public ds g = null;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;
    public String l = "";
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;

    public as() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3605a != null && this.f3605a.length > 0) {
            for (int i = 0; i < this.f3605a.length; i++) {
                io ioVar = this.f3605a[i];
                if (ioVar != null) {
                    codedOutputByteBufferNano.b(1, ioVar);
                }
            }
        }
        if (this.c || !this.f3606b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f3606b);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                at atVar = this.d[i2];
                if (atVar != null) {
                    codedOutputByteBufferNano.b(3, atVar);
                }
            }
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(6, this.e);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(7, this.g);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(8, this.h);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(9, this.j);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(10, this.l);
        }
        if (this.o || this.n) {
            codedOutputByteBufferNano.a(11, this.n);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3605a != null && this.f3605a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f3605a.length; i2++) {
                io ioVar = this.f3605a[i2];
                if (ioVar != null) {
                    i += CodedOutputByteBufferNano.d(1, ioVar);
                }
            }
            a2 = i;
        }
        if (this.c || !this.f3606b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f3606b);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i3 = 0; i3 < this.d.length; i3++) {
                at atVar = this.d[i3];
                if (atVar != null) {
                    a2 += CodedOutputByteBufferNano.d(3, atVar);
                }
            }
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(6, this.e);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.g);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.h);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.j);
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.l);
        }
        if (this.o || this.n) {
            return a2 + CodedOutputByteBufferNano.c(11) + 1;
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
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f3605a == null ? 0 : this.f3605a.length;
                    io[] ioVarArr = new io[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3605a, 0, ioVarArr, 0, length);
                    }
                    while (length < ioVarArr.length - 1) {
                        ioVarArr[length] = new io();
                        aVar.a(ioVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    ioVarArr[length] = new io();
                    aVar.a(ioVarArr[length]);
                    this.f3605a = ioVarArr;
                    break;
                case 18:
                    this.f3606b = aVar.c();
                    this.c = true;
                    break;
                case 26:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length2 = this.d == null ? 0 : this.d.length;
                    at[] atVarArr = new at[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, atVarArr, 0, length2);
                    }
                    while (length2 < atVarArr.length - 1) {
                        atVarArr[length2] = new at();
                        aVar.a(atVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    atVarArr[length2] = new at();
                    aVar.a(atVarArr[length2]);
                    this.d = atVarArr;
                    break;
                case 50:
                    this.e = aVar.d();
                    this.f = true;
                    break;
                case 58:
                    if (this.g == null) {
                        this.g = new ds();
                    }
                    aVar.a(this.g);
                    break;
                case 66:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 74:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 82:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 88:
                    this.n = aVar.b();
                    this.o = true;
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
