package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class eu extends com.google.protobuf.nano.c {
    private static volatile eu[] i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3800a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3801b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public byte[] g = com.google.protobuf.nano.e.h;
    public boolean h = false;

    public static eu[] b() {
        if (i == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (i == null) {
                    i = new eu[0];
                }
            }
        }
        return i;
    }

    public eu() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3801b || this.f3800a) {
            codedOutputByteBufferNano.a(1, this.f3800a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !Arrays.equals(this.g, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3801b || this.f3800a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !Arrays.equals(this.g, com.google.protobuf.nano.e.h)) {
            return a2 + CodedOutputByteBufferNano.b(4, this.g);
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
                    this.f3800a = aVar.b();
                    this.f3801b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.d();
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
