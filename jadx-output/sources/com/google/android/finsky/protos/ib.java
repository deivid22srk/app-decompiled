package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ib extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public hn f3941a = null;

    /* renamed from: b, reason: collision with root package name */
    public ho[] f3942b = ho.b();
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;

    public ib() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3941a != null) {
            codedOutputByteBufferNano.b(1, this.f3941a);
        }
        if (this.f3942b != null && this.f3942b.length > 0) {
            for (int i = 0; i < this.f3942b.length; i++) {
                ho hoVar = this.f3942b[i];
                if (hoVar != null) {
                    codedOutputByteBufferNano.b(2, hoVar);
                }
            }
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3941a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3941a);
        }
        if (this.f3942b != null && this.f3942b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f3942b.length; i2++) {
                ho hoVar = this.f3942b[i2];
                if (hoVar != null) {
                    i += CodedOutputByteBufferNano.d(2, hoVar);
                }
            }
            a2 = i;
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.e);
        }
        if (this.h || !this.g.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(5, this.g);
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
                    if (this.f3941a == null) {
                        this.f3941a = new hn();
                    }
                    aVar.a(this.f3941a);
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f3942b == null ? 0 : this.f3942b.length;
                    ho[] hoVarArr = new ho[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3942b, 0, hoVarArr, 0, length);
                    }
                    while (length < hoVarArr.length - 1) {
                        hoVarArr[length] = new ho();
                        aVar.a(hoVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    hoVarArr[length] = new ho();
                    aVar.a(hoVarArr[length]);
                    this.f3942b = hoVarArr;
                    break;
                case 26:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 34:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 42:
                    this.g = aVar.c();
                    this.h = true;
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
