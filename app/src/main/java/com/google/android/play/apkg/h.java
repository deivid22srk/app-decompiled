package com.google.android.play.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class h extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6762a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6763b = false;
    public boolean c = false;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    public h() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6763b || this.f6762a) {
            codedOutputByteBufferNano.a(1, this.f6762a);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != 0 || this.f) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f6763b || this.f6762a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (this.e != 0 || this.f) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.h || this.g) {
            return a2 + CodedOutputByteBufferNano.c(4) + 1;
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
                    this.f6762a = aVar.b();
                    this.f6763b = true;
                    break;
                case 16:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 24:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.e = e;
                            this.f = true;
                            break;
                    }
                case 32:
                    this.g = aVar.b();
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
