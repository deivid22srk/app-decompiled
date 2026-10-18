package com.google.android.vending.verifier.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h extends com.google.protobuf.nano.c {
    public static volatile h[] i;

    /* renamed from: a, reason: collision with root package name */
    public String f7130a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f7131b = false;
    public int c = 0;
    public boolean d = false;
    public byte[] e = com.google.protobuf.nano.e.h;
    public boolean f = false;
    public String g = "";
    public boolean h = false;

    public static h[] b() {
        if (i == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (i == null) {
                    i = new h[0];
                }
            }
        }
        return i;
    }

    public h() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7131b || !this.f7130a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7130a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7131b || !this.f7130a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7130a);
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
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
                case 10:
                    this.f7130a = aVar.c();
                    this.f7131b = true;
                    break;
                case 16:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 2:
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 26:
                    this.e = aVar.d();
                    this.f = true;
                    break;
                case 34:
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
