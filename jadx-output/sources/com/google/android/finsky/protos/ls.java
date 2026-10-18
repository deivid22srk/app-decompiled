package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ls extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4095a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4096b = false;
    public boolean c = false;
    public boolean d = false;
    public v e = null;
    public String[] f = com.google.protobuf.nano.e.f;
    public String g = "";
    public boolean h = false;
    public int i = 1;
    public boolean j = false;
    public String k = "";
    public boolean l = false;
    public dp m = null;
    public int n = 1;
    public boolean o = false;
    public long p = 0;
    public boolean q = false;
    public byte[] r = com.google.protobuf.nano.e.h;
    public boolean s = false;

    public ls() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4096b || !this.f4095a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4095a);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (int i = 0; i < this.f.length; i++) {
                String str = this.f[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(4, str);
                }
            }
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        if (this.i != 1 || this.j) {
            codedOutputByteBufferNano.a(6, this.i);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(7, this.k);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(8, this.m);
        }
        if (this.n != 1 || this.o) {
            codedOutputByteBufferNano.a(9, this.n);
        }
        if (this.q || this.p != 0) {
            codedOutputByteBufferNano.b(10, this.p);
        }
        if (this.s || !Arrays.equals(this.r, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(11, this.r);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4096b || !this.f4095a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4095a);
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f.length; i3++) {
                String str = this.f[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.g);
        }
        if (this.i != 1 || this.j) {
            a2 += CodedOutputByteBufferNano.c(6, this.i);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.k);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.m);
        }
        if (this.n != 1 || this.o) {
            a2 += CodedOutputByteBufferNano.c(9, this.n);
        }
        if (this.q || this.p != 0) {
            a2 += CodedOutputByteBufferNano.e(10, this.p);
        }
        if (this.s || !Arrays.equals(this.r, com.google.protobuf.nano.e.h)) {
            return a2 + CodedOutputByteBufferNano.b(11, this.r);
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
                    this.f4095a = aVar.c();
                    this.f4096b = true;
                    break;
                case 16:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new v();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.f == null ? 0 : this.f.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f = strArr;
                    break;
                case 42:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 48:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.i = e;
                            this.j = true;
                            break;
                    }
                case 58:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 66:
                    if (this.m == null) {
                        this.m = new dp();
                    }
                    aVar.a(this.m);
                    break;
                case 72:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.n = e2;
                            this.o = true;
                            break;
                    }
                case 80:
                    this.p = aVar.f();
                    this.q = true;
                    break;
                case 90:
                    this.r = aVar.d();
                    this.s = true;
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
