package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qs extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4308a = com.google.protobuf.nano.e.h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4309b = false;
    public byte[] c = com.google.protobuf.nano.e.h;
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public String k = "";
    public boolean l = false;
    public String m = "";
    public boolean n = false;
    public String o = "";
    public boolean p = false;
    public String q = "";
    public boolean r = false;
    public String s = "";
    public boolean t = false;
    public String u = "";
    public boolean v = false;
    public qt[] w = qt.b();

    public qs() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4309b || !Arrays.equals(this.f4308a, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(1, this.f4308a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        if (this.r || !this.q.equals("")) {
            codedOutputByteBufferNano.a(9, this.q);
        }
        if (this.t || !this.s.equals("")) {
            codedOutputByteBufferNano.a(10, this.s);
        }
        if (this.v || !this.u.equals("")) {
            codedOutputByteBufferNano.a(11, this.u);
        }
        if (this.w != null && this.w.length > 0) {
            for (int i = 0; i < this.w.length; i++) {
                qt qtVar = this.w[i];
                if (qtVar != null) {
                    codedOutputByteBufferNano.b(12, qtVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4309b || !Arrays.equals(this.f4308a, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4308a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.k);
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.m);
        }
        if (this.p || !this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.o);
        }
        if (this.r || !this.q.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.q);
        }
        if (this.t || !this.s.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.s);
        }
        if (this.v || !this.u.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.u);
        }
        if (this.w != null && this.w.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.w.length; i2++) {
                qt qtVar = this.w[i2];
                if (qtVar != null) {
                    i += CodedOutputByteBufferNano.d(12, qtVar);
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
                    this.f4308a = aVar.d();
                    this.f4309b = true;
                    break;
                case 18:
                    this.c = aVar.d();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 42:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 50:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 58:
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 66:
                    this.o = aVar.c();
                    this.p = true;
                    break;
                case 74:
                    this.q = aVar.c();
                    this.r = true;
                    break;
                case 82:
                    this.s = aVar.c();
                    this.t = true;
                    break;
                case 90:
                    this.u = aVar.c();
                    this.v = true;
                    break;
                case 98:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 98);
                    int length = this.w == null ? 0 : this.w.length;
                    qt[] qtVarArr = new qt[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.w, 0, qtVarArr, 0, length);
                    }
                    while (length < qtVarArr.length - 1) {
                        qtVarArr[length] = new qt();
                        aVar.a(qtVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    qtVarArr[length] = new qt();
                    aVar.a(qtVarArr[length]);
                    this.w = qtVarArr;
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
