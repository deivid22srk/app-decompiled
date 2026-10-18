package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class aq extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3603a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3604b = false;
    public int[] c = com.google.protobuf.nano.e.f7878a;

    public aq() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3603a != 1 || this.f3604b) {
            codedOutputByteBufferNano.a(1, this.f3603a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                codedOutputByteBufferNano.a(2, this.c[i]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3603a != 1 || this.f3604b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3603a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.c[i2]);
            }
            return a2 + i + (this.c.length * 1);
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        int i;
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f3603a = e;
                            this.f3604b = true;
                            break;
                    }
                case 16:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 16);
                    int[] iArr = new int[b2];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < b2) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int e2 = aVar.e();
                        switch (e2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                                i = i3 + 1;
                                iArr[i3] = e2;
                                break;
                            default:
                                i = i3;
                                break;
                        }
                        i2++;
                        i3 = i;
                    }
                    if (i3 != 0) {
                        int length = this.c == null ? 0 : this.c.length;
                        if (length == 0 && i3 == iArr.length) {
                            this.c = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length + i3];
                            if (length != 0) {
                                System.arraycopy(this.c, 0, iArr2, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr2, length, i3);
                            this.c = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 18:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i4 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        aVar.e(j);
                        int length2 = this.c == null ? 0 : this.c.length;
                        int[] iArr3 = new int[i4 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.c, 0, iArr3, 0, length2);
                        }
                        while (aVar.i() > 0) {
                            int e3 = aVar.e();
                            switch (e3) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                    iArr3[length2] = e3;
                                    length2++;
                                    break;
                            }
                        }
                        this.c = iArr3;
                    }
                    aVar.d(c);
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
