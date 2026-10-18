package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bg extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public bl f3626a = null;

    /* renamed from: b, reason: collision with root package name */
    public bm f3627b = null;
    public bh c = null;
    public String d = "";
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;
    public String[] l = com.google.protobuf.nano.e.f;
    public int m = 0;
    public boolean n = false;
    public String o = "";
    public boolean p = false;
    public cn q = null;
    public String r = "";
    public boolean s = false;
    public String t = "";
    public boolean u = false;
    public String v = "";
    public boolean w = false;
    public String x = "";
    public boolean y = false;
    public byte[] z = com.google.protobuf.nano.e.h;
    public boolean A = false;
    public String B = "";
    public boolean C = false;

    public bg() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3626a != null) {
            codedOutputByteBufferNano.b(1, this.f3626a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(8, this.d);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(9, this.j);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(12, this.f);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(14, this.h);
        }
        if (this.l != null && this.l.length > 0) {
            for (int i = 0; i < this.l.length; i++) {
                String str = this.l[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(37, str);
                }
            }
        }
        if (this.m != 0 || this.n) {
            codedOutputByteBufferNano.a(38, this.m);
        }
        if (this.f3627b != null) {
            codedOutputByteBufferNano.b(39, this.f3627b);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(46, this.o);
        }
        if (this.q != null) {
            codedOutputByteBufferNano.b(49, this.q);
        }
        if (this.s || !this.r.equals("")) {
            codedOutputByteBufferNano.a(50, this.r);
        }
        if (this.u || !this.t.equals("")) {
            codedOutputByteBufferNano.a(51, this.t);
        }
        if (this.w || !this.v.equals("")) {
            codedOutputByteBufferNano.a(52, this.v);
        }
        if (this.y || !this.x.equals("")) {
            codedOutputByteBufferNano.a(53, this.x);
        }
        if (this.A || !Arrays.equals(this.z, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(54, this.z);
        }
        if (this.C || !this.B.equals("")) {
            codedOutputByteBufferNano.a(55, this.B);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3626a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3626a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.d);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.j);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(12, this.f);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.h);
        }
        if (this.l != null && this.l.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.l.length; i3++) {
                String str = this.l[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 2);
        }
        if (this.m != 0 || this.n) {
            a2 += CodedOutputByteBufferNano.c(38, this.m);
        }
        if (this.f3627b != null) {
            a2 += CodedOutputByteBufferNano.d(39, this.f3627b);
        }
        if (this.p || !this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(46, this.o);
        }
        if (this.q != null) {
            a2 += CodedOutputByteBufferNano.d(49, this.q);
        }
        if (this.s || !this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(50, this.r);
        }
        if (this.u || !this.t.equals("")) {
            a2 += CodedOutputByteBufferNano.b(51, this.t);
        }
        if (this.w || !this.v.equals("")) {
            a2 += CodedOutputByteBufferNano.b(52, this.v);
        }
        if (this.y || !this.x.equals("")) {
            a2 += CodedOutputByteBufferNano.b(53, this.x);
        }
        if (this.A || !Arrays.equals(this.z, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(54, this.z);
        }
        if (this.C || !this.B.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(55, this.B);
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
                    if (this.f3626a == null) {
                        this.f3626a = new bl();
                    }
                    aVar.a(this.f3626a);
                    break;
                case 19:
                    if (this.c == null) {
                        this.c = new bh();
                    }
                    aVar.a(this.c, 2);
                    break;
                case 66:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 74:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 98:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 114:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 298:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 298);
                    int length = this.l == null ? 0 : this.l.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.l, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.l = strArr;
                    break;
                case 304:
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
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            this.m = e;
                            this.n = true;
                            break;
                    }
                case 314:
                    if (this.f3627b == null) {
                        this.f3627b = new bm();
                    }
                    aVar.a(this.f3627b);
                    break;
                case 370:
                    this.o = aVar.c();
                    this.p = true;
                    break;
                case 394:
                    if (this.q == null) {
                        this.q = new cn();
                    }
                    aVar.a(this.q);
                    break;
                case 402:
                    this.r = aVar.c();
                    this.s = true;
                    break;
                case 410:
                    this.t = aVar.c();
                    this.u = true;
                    break;
                case 418:
                    this.v = aVar.c();
                    this.w = true;
                    break;
                case 426:
                    this.x = aVar.c();
                    this.y = true;
                    break;
                case 434:
                    this.z = aVar.d();
                    this.A = true;
                    break;
                case 442:
                    this.B = aVar.c();
                    this.C = true;
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
