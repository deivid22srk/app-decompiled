package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fd extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3812a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3813b = false;
    public byte[] c = com.google.protobuf.nano.e.h;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public int g = 0;
    public boolean h = false;

    public fd() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3813b || !this.f3812a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3812a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != 0 || this.f) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3813b || !this.f3812a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3812a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != 0 || this.f) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.h || this.g != 0) {
            return a2 + CodedOutputByteBufferNano.c(4, this.g);
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
                    this.f3812a = aVar.c();
                    this.f3813b = true;
                    break;
                case 18:
                    this.c = aVar.d();
                    this.d = true;
                    break;
                case 24:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                            this.e = e;
                            this.f = true;
                            break;
                    }
                case 32:
                    this.g = aVar.e();
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
