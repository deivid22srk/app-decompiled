package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ok extends com.google.protobuf.nano.c {
    private static volatile ok[] o;

    /* renamed from: a, reason: collision with root package name */
    public int f4211a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4212b = false;
    public String c = "";
    public boolean d = false;
    public ds e = null;
    public jd f = null;
    public byte[] g = com.google.protobuf.nano.e.h;
    public boolean h = false;
    public gx i = null;
    public int j = 0;
    public boolean k = false;
    public String l = "";
    public boolean m = false;
    public oi n = null;

    public static ok[] b() {
        if (o == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (o == null) {
                    o = new ok[0];
                }
            }
        }
        return o;
    }

    public ok() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4211a != 1 || this.f4212b) {
            codedOutputByteBufferNano.a(1, this.f4211a);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(2, this.l);
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(3, this.n);
        }
        if (this.h || !Arrays.equals(this.g, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(5, this.e);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(6, this.c);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(7, this.f);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(8, this.i);
        }
        if (this.j != 0 || this.k) {
            codedOutputByteBufferNano.a(9, this.j);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4211a != 1 || this.f4212b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4211a);
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.l);
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.n);
        }
        if (this.h || !Arrays.equals(this.g, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.e);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.c);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.f);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.i);
        }
        if (this.j != 0 || this.k) {
            return a2 + CodedOutputByteBufferNano.c(9, this.j);
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
                        case 1:
                        case 2:
                        case 3:
                            this.f4211a = e;
                            this.f4212b = true;
                            break;
                    }
                case 18:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 26:
                    if (this.n == null) {
                        this.n = new oi();
                    }
                    aVar.a(this.n);
                    break;
                case 34:
                    this.g = aVar.d();
                    this.h = true;
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new ds();
                    }
                    aVar.a(this.e);
                    break;
                case 50:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 58:
                    if (this.f == null) {
                        this.f = new jd();
                    }
                    aVar.a(this.f);
                    break;
                case 66:
                    if (this.i == null) {
                        this.i = new gx();
                    }
                    aVar.a(this.i);
                    break;
                case 72:
                    int e2 = aVar.e();
                    switch (e2) {
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
                            this.j = e2;
                            this.k = true;
                            break;
                    }
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
