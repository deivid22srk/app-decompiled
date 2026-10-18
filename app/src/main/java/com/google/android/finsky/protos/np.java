package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class np extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4179a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4180b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public String k = "";
    public boolean l = false;
    public nm m = null;
    public String n = "";
    public boolean o = false;
    public no p = null;
    public String q = "";
    public boolean r = false;
    public nn s = null;
    public dp t = null;
    public byte[] u = com.google.protobuf.nano.e.h;
    public boolean v = false;
    public int w = 0;
    public boolean x = false;
    public String y = "";
    public boolean z = false;

    public np() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4180b || !this.f4179a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4179a);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(2, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(3, this.g);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(4, this.m);
        }
        if (this.o || !this.n.equals("")) {
            codedOutputByteBufferNano.a(5, this.n);
        }
        if (this.p != null) {
            codedOutputByteBufferNano.b(6, this.p);
        }
        if (this.v || !Arrays.equals(this.u, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(7, this.u);
        }
        if (this.t != null) {
            codedOutputByteBufferNano.b(8, this.t);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(9, this.i);
        }
        if (this.w != 0 || this.x) {
            codedOutputByteBufferNano.a(10, this.w);
        }
        if (this.z || !this.y.equals("")) {
            codedOutputByteBufferNano.a(11, this.y);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(12, this.k);
        }
        if (this.s != null) {
            codedOutputByteBufferNano.b(13, this.s);
        }
        if (this.r || !this.q.equals("")) {
            codedOutputByteBufferNano.a(14, this.q);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(15, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4180b || !this.f4179a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4179a);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.g);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.m);
        }
        if (this.o || !this.n.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.n);
        }
        if (this.p != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.p);
        }
        if (this.v || !Arrays.equals(this.u, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(7, this.u);
        }
        if (this.t != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.t);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.i);
        }
        if (this.w != 0 || this.x) {
            a2 += CodedOutputByteBufferNano.c(10, this.w);
        }
        if (this.z || !this.y.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.y);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(12, this.k);
        }
        if (this.s != null) {
            a2 += CodedOutputByteBufferNano.d(13, this.s);
        }
        if (this.r || !this.q.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.q);
        }
        if (this.d || !this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(15, this.c);
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
                    this.f4179a = aVar.c();
                    this.f4180b = true;
                    break;
                case 18:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 26:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 34:
                    if (this.m == null) {
                        this.m = new nm();
                    }
                    aVar.a(this.m);
                    break;
                case 42:
                    this.n = aVar.c();
                    this.o = true;
                    break;
                case 50:
                    if (this.p == null) {
                        this.p = new no();
                    }
                    aVar.a(this.p);
                    break;
                case 58:
                    this.u = aVar.d();
                    this.v = true;
                    break;
                case 66:
                    if (this.t == null) {
                        this.t = new dp();
                    }
                    aVar.a(this.t);
                    break;
                case 74:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 80:
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
                            this.w = e;
                            this.x = true;
                            break;
                    }
                case 90:
                    this.y = aVar.c();
                    this.z = true;
                    break;
                case 98:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 106:
                    if (this.s == null) {
                        this.s = new nn();
                    }
                    aVar.a(this.s);
                    break;
                case 114:
                    this.q = aVar.c();
                    this.r = true;
                    break;
                case 122:
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
