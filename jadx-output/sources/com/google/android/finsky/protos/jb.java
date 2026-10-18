package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jb extends com.google.protobuf.nano.c {
    private static volatile jb[] l;

    /* renamed from: a, reason: collision with root package name */
    public int f3985a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3986b = false;
    public int c = 0;
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public byte[] g = com.google.protobuf.nano.e.h;
    public boolean h = false;
    public iz[] i = iz.b();
    public boolean j = false;
    public boolean k = false;

    public static jb[] b() {
        if (l == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (l == null) {
                    l = new jb[0];
                }
            }
        }
        return l;
    }

    public jb() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3985a != 1 || this.f3986b) {
            codedOutputByteBufferNano.a(1, this.f3985a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.h || !Arrays.equals(this.g, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(3, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            for (int i = 0; i < this.i.length; i++) {
                iz izVar = this.i[i];
                if (izVar != null) {
                    codedOutputByteBufferNano.b(4, izVar);
                }
            }
        }
        if (this.k || this.j) {
            codedOutputByteBufferNano.a(5, this.j);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(6, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3985a != 1 || this.f3986b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3985a);
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.h || !Arrays.equals(this.g, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(3, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.i.length; i2++) {
                iz izVar = this.i[i2];
                if (izVar != null) {
                    i += CodedOutputByteBufferNano.d(4, izVar);
                }
            }
            a2 = i;
        }
        if (this.k || this.j) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.f || !this.e.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(6, this.e);
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
                            this.f3985a = e;
                            this.f3986b = true;
                            break;
                    }
                case 16:
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
                            this.c = e2;
                            this.d = true;
                            break;
                    }
                case 26:
                    this.g = aVar.d();
                    this.h = true;
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.i == null ? 0 : this.i.length;
                    iz[] izVarArr = new iz[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, izVarArr, 0, length);
                    }
                    while (length < izVarArr.length - 1) {
                        izVarArr[length] = new iz();
                        aVar.a(izVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    izVarArr[length] = new iz();
                    aVar.a(izVarArr[length]);
                    this.i = izVarArr;
                    break;
                case 40:
                    this.j = aVar.b();
                    this.k = true;
                    break;
                case 50:
                    this.e = aVar.c();
                    this.f = true;
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
