package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ax extends com.google.protobuf.nano.c {
    private static volatile ax[] h;

    /* renamed from: a, reason: collision with root package name */
    public String f3613a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3614b = false;
    public ds c = null;
    public String d = "";
    public boolean e = false;
    public byte[] f = com.google.protobuf.nano.e.h;
    public boolean g = false;

    public static ax[] b() {
        if (h == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (h == null) {
                    h = new ax[0];
                }
            }
        }
        return h;
    }

    public ax() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3614b || !this.f3613a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3613a);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || !Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(5, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3614b || !this.f3613a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3613a);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || !Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.c != null) {
            return a2 + CodedOutputByteBufferNano.d(5, this.c);
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
                    this.f3613a = aVar.c();
                    this.f3614b = true;
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 34:
                    this.f = aVar.d();
                    this.g = true;
                    break;
                case 42:
                    if (this.c == null) {
                        this.c = new ds();
                    }
                    aVar.a(this.c);
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
