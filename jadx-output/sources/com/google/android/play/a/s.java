package com.google.android.play.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class s extends com.google.protobuf.nano.c {
    private static volatile s[] e;

    /* renamed from: a, reason: collision with root package name */
    public String f6783a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f6784b = false;
    public int c = 0;
    public boolean d = false;

    public static s[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new s[0];
                }
            }
        }
        return e;
    }

    public s() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6784b || !this.f6783a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f6783a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f6784b || !this.f6783a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f6783a);
        }
        if (this.c != 0 || this.d) {
            return a2 + CodedOutputByteBufferNano.c(2, this.c);
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
                    this.f6783a = aVar.c();
                    this.f6784b = true;
                    break;
                case 16:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.c = e2;
                            this.d = true;
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
