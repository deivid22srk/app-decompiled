package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class fs extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String[] f3841a = com.google.protobuf.nano.e.f;

    /* renamed from: b, reason: collision with root package name */
    public ft[] f3842b = ft.b();

    public fs() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3841a != null && this.f3841a.length > 0) {
            for (int i = 0; i < this.f3841a.length; i++) {
                String str = this.f3841a[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if (this.f3842b != null && this.f3842b.length > 0) {
            for (int i2 = 0; i2 < this.f3842b.length; i2++) {
                ft ftVar = this.f3842b[i2];
                if (ftVar != null) {
                    codedOutputByteBufferNano.a(2, ftVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f3841a == null || this.f3841a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f3841a.length; i4++) {
                String str = this.f3841a[i4];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.a(str);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (this.f3842b != null && this.f3842b.length > 0) {
            for (int i5 = 0; i5 < this.f3842b.length; i5++) {
                ft ftVar = this.f3842b[i5];
                if (ftVar != null) {
                    i += CodedOutputByteBufferNano.c(2, ftVar);
                }
            }
        }
        return i;
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
                    int length = this.f3841a == null ? 0 : this.f3841a.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3841a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f3841a = strArr;
                    break;
                case 19:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 19);
                    int length2 = this.f3842b == null ? 0 : this.f3842b.length;
                    ft[] ftVarArr = new ft[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f3842b, 0, ftVarArr, 0, length2);
                    }
                    while (length2 < ftVarArr.length - 1) {
                        ftVarArr[length2] = new ft();
                        aVar.a(ftVarArr[length2], 2);
                        aVar.a();
                        length2++;
                    }
                    ftVarArr[length2] = new ft();
                    aVar.a(ftVarArr[length2], 2);
                    this.f3842b = ftVarArr;
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
