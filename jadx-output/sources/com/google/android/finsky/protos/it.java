package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class it extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public jb[] f3971a = jb.b();

    /* renamed from: b, reason: collision with root package name */
    public String[] f3972b = com.google.protobuf.nano.e.f;

    public it() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3971a != null && this.f3971a.length > 0) {
            for (int i = 0; i < this.f3971a.length; i++) {
                jb jbVar = this.f3971a[i];
                if (jbVar != null) {
                    codedOutputByteBufferNano.b(1, jbVar);
                }
            }
        }
        if (this.f3972b != null && this.f3972b.length > 0) {
            for (int i2 = 0; i2 < this.f3972b.length; i2++) {
                String str = this.f3972b[i2];
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3971a != null && this.f3971a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f3971a.length; i2++) {
                jb jbVar = this.f3971a[i2];
                if (jbVar != null) {
                    i += CodedOutputByteBufferNano.d(1, jbVar);
                }
            }
            a2 = i;
        }
        if (this.f3972b != null && this.f3972b.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.f3972b.length; i5++) {
                String str = this.f3972b[i5];
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.a(str);
                }
            }
            return a2 + i3 + (i4 * 1);
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
                    int length = this.f3971a == null ? 0 : this.f3971a.length;
                    jb[] jbVarArr = new jb[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3971a, 0, jbVarArr, 0, length);
                    }
                    while (length < jbVarArr.length - 1) {
                        jbVarArr[length] = new jb();
                        aVar.a(jbVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    jbVarArr[length] = new jb();
                    aVar.a(jbVarArr[length]);
                    this.f3971a = jbVarArr;
                    break;
                case 18:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length2 = this.f3972b == null ? 0 : this.f3972b.length;
                    String[] strArr = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f3972b, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr[length2] = aVar.c();
                    this.f3972b = strArr;
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
