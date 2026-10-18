package com.google.b.a.a.a.b.a.apkg.dpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7616a = "";

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7617b = e.h;
    public String c = "";
    public String d = "";
    public String e = "";

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7616a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7616a);
        }
        if (!Arrays.equals(this.f7617b, e.h)) {
            codedOutputByteBufferNano.a(2, this.f7617b);
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
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7616a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7616a);
        }
        if (!Arrays.equals(this.f7617b, e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7617b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.d);
        }
        if (!this.e.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(5, this.e);
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
                    this.f7616a = aVar.c();
                    break;
                case 18:
                    this.f7617b = aVar.d();
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
                default:
                    if (!e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
