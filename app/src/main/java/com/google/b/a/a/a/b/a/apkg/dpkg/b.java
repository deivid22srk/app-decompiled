package com.google.b.a.a.a.b.a.apkg.dpkg;

import com.google.b.a.a.a.b.a.apkg.j;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;

/* loaded from: classes.dex */
public final class b extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public j f7614a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f7615b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public int f = 0;
    public boolean g = false;
    public String[] h = e.f;
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7614a != null) {
            codedOutputByteBufferNano.b(1, this.f7614a);
        }
        if (!this.f7615b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7615b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(5, this.e);
        }
        if (this.f != 0) {
            codedOutputByteBufferNano.a(7, this.f);
        }
        if (this.g) {
            codedOutputByteBufferNano.a(8, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i = 0; i < this.h.length; i++) {
                String str = this.h[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(9, str);
                }
            }
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.a(10, this.i);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.a(13, this.j);
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.a(14, this.k);
        }
        if (!this.l.equals("")) {
            codedOutputByteBufferNano.a(15, this.l);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7614a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7614a);
        }
        if (!this.f7615b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7615b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.d);
        }
        if (!this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.e);
        }
        if (this.f != 0) {
            a2 += CodedOutputByteBufferNano.c(7, this.f);
        }
        if (this.g) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.h != null && this.h.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.h.length; i3++) {
                String str = this.h[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (!this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.i);
        }
        if (!this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.j);
        }
        if (!this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.k);
        }
        if (!this.l.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(15, this.l);
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
                    if (this.f7614a == null) {
                        this.f7614a = new j();
                    }
                    aVar.a(this.f7614a);
                    break;
                case 18:
                    this.f7615b = aVar.c();
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 34:
                    this.d = aVar.c();
                    break;
                case 42:
                    this.e = aVar.c();
                    break;
                case 56:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f = e;
                            break;
                    }
                case 64:
                    this.g = aVar.b();
                    break;
                case 74:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 74);
                    int length = this.h == null ? 0 : this.h.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.h, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.h = strArr;
                    break;
                case 82:
                    this.i = aVar.c();
                    break;
                case 106:
                    this.j = aVar.c();
                    break;
                case 114:
                    this.k = aVar.c();
                    break;
                case 122:
                    this.l = aVar.c();
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
