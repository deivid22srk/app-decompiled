package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class aa extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f1438a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f1439b = false;
    public int c = 0;
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public byte[] m = com.google.protobuf.nano.e.h;
    public boolean n = false;
    public String o = "";
    public boolean p = false;
    public String q = "";
    public boolean r = false;

    public aa() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1439b || !this.f1438a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f1438a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || !Arrays.equals(this.m, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        if (this.r || !this.q.equals("")) {
            codedOutputByteBufferNano.a(9, this.q);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1439b || !this.f1438a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f1438a);
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.j || this.i) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.n || !Arrays.equals(this.m, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(7, this.m);
        }
        if (this.p || !this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.o);
        }
        if (this.r || !this.q.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(9, this.q);
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
                    this.f1438a = aVar.c();
                    this.f1439b = true;
                    break;
                case 16:
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
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 40:
                    this.i = aVar.b();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 58:
                    this.m = aVar.d();
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
