package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ng extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public gx f4165a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f4166b = "";
    public boolean c = false;

    public ng() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4165a != null) {
            codedOutputByteBufferNano.b(1, this.f4165a);
        }
        if (this.c || !this.f4166b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4166b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4165a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4165a);
        }
        if (this.c || !this.f4166b.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(2, this.f4166b);
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
                    if (this.f4165a == null) {
                        this.f4165a = new gx();
                    }
                    aVar.a(this.f4165a);
                    break;
                case 18:
                    this.f4166b = aVar.c();
                    this.c = true;
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
