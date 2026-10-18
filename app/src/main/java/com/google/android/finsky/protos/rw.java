package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class rw extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public rl[] f4361a = rl.b();

    /* renamed from: b, reason: collision with root package name */
    public kf[] f4362b = kf.b();
    public long c = 0;
    public boolean d = false;

    public rw() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4361a != null && this.f4361a.length > 0) {
            for (int i = 0; i < this.f4361a.length; i++) {
                rl rlVar = this.f4361a[i];
                if (rlVar != null) {
                    codedOutputByteBufferNano.b(1, rlVar);
                }
            }
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f4362b != null && this.f4362b.length > 0) {
            for (int i2 = 0; i2 < this.f4362b.length; i2++) {
                kf kfVar = this.f4362b[i2];
                if (kfVar != null) {
                    codedOutputByteBufferNano.b(3, kfVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4361a != null && this.f4361a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f4361a.length; i2++) {
                rl rlVar = this.f4361a[i2];
                if (rlVar != null) {
                    i += CodedOutputByteBufferNano.d(1, rlVar);
                }
            }
            a2 = i;
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.c);
        }
        if (this.f4362b != null && this.f4362b.length > 0) {
            for (int i3 = 0; i3 < this.f4362b.length; i3++) {
                kf kfVar = this.f4362b[i3];
                if (kfVar != null) {
                    a2 += CodedOutputByteBufferNano.d(3, kfVar);
                }
            }
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
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f4361a == null ? 0 : this.f4361a.length;
                    rl[] rlVarArr = new rl[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4361a, 0, rlVarArr, 0, length);
                    }
                    while (length < rlVarArr.length - 1) {
                        rlVarArr[length] = new rl();
                        aVar.a(rlVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    rlVarArr[length] = new rl();
                    aVar.a(rlVarArr[length]);
                    this.f4361a = rlVarArr;
                    break;
                case 16:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 26:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length2 = this.f4362b == null ? 0 : this.f4362b.length;
                    kf[] kfVarArr = new kf[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f4362b, 0, kfVarArr, 0, length2);
                    }
                    while (length2 < kfVarArr.length - 1) {
                        kfVarArr[length2] = new kf();
                        aVar.a(kfVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    kfVarArr[length2] = new kf();
                    aVar.a(kfVarArr[length2]);
                    this.f4362b = kfVarArr;
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
