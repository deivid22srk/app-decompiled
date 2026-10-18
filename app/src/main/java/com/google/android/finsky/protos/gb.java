package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gb extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public gw f3857a = null;

    /* renamed from: b, reason: collision with root package name */
    public gx f3858b = null;
    public ny c = null;
    public String d = "";
    public boolean e = false;
    public byte[] f = com.google.protobuf.nano.e.h;
    public boolean g = false;
    public gc[] h = gc.b();
    public boolean i = true;
    public boolean j = false;

    public gb() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3857a != null) {
            codedOutputByteBufferNano.b(1, this.f3857a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.f3858b != null) {
            codedOutputByteBufferNano.b(4, this.f3858b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(5, this.d);
        }
        if (this.g || !Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i = 0; i < this.h.length; i++) {
                gc gcVar = this.h[i];
                if (gcVar != null) {
                    codedOutputByteBufferNano.b(7, gcVar);
                }
            }
        }
        if (this.j || !this.i) {
            codedOutputByteBufferNano.a(8, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3857a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3857a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.f3858b != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f3858b);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.d);
        }
        if (this.g || !Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(6, this.f);
        }
        if (this.h != null && this.h.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.h.length; i2++) {
                gc gcVar = this.h[i2];
                if (gcVar != null) {
                    i += CodedOutputByteBufferNano.d(7, gcVar);
                }
            }
            a2 = i;
        }
        if (this.j || !this.i) {
            return a2 + CodedOutputByteBufferNano.c(8) + 1;
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
                    if (this.f3857a == null) {
                        this.f3857a = new gw();
                    }
                    aVar.a(this.f3857a);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new ny();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    if (this.f3858b == null) {
                        this.f3858b = new gx();
                    }
                    aVar.a(this.f3858b);
                    break;
                case 42:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 50:
                    this.f = aVar.d();
                    this.g = true;
                    break;
                case 58:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 58);
                    int length = this.h == null ? 0 : this.h.length;
                    gc[] gcVarArr = new gc[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.h, 0, gcVarArr, 0, length);
                    }
                    while (length < gcVarArr.length - 1) {
                        gcVarArr[length] = new gc();
                        aVar.a(gcVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    gcVarArr[length] = new gc();
                    aVar.a(gcVarArr[length]);
                    this.h = gcVarArr;
                    break;
                case 64:
                    this.i = aVar.b();
                    this.j = true;
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
