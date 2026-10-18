package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public interface ContentFilters {

    public final class ContentFilterSettingsResponse extends com.google.protobuf.nano.c {

        /* renamed from: a, reason: collision with root package name */
        public ew[] f3574a = ew.b();

        /* renamed from: b, reason: collision with root package name */
        public String f3575b = "";
        public boolean c = false;
        public ds d = null;
        public String e = "";
        public boolean f = false;
        public String g = "";
        public boolean h = false;

        public ContentFilterSettingsResponse() {
            this.ar = -1;
        }

        @Override // com.google.protobuf.nano.c
        public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            if (this.f3574a != null && this.f3574a.length > 0) {
                for (int i = 0; i < this.f3574a.length; i++) {
                    ew ewVar = this.f3574a[i];
                    if (ewVar != null) {
                        codedOutputByteBufferNano.b(1, ewVar);
                    }
                }
            }
            if (this.c || !this.f3575b.equals("")) {
                codedOutputByteBufferNano.a(2, this.f3575b);
            }
            if (this.d != null) {
                codedOutputByteBufferNano.b(3, this.d);
            }
            if (this.f || !this.e.equals("")) {
                codedOutputByteBufferNano.a(4, this.e);
            }
            if (this.h || !this.g.equals("")) {
                codedOutputByteBufferNano.a(5, this.g);
            }
            super.a(codedOutputByteBufferNano);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.nano.c
        public final int a() {
            int a2 = super.a();
            if (this.f3574a != null && this.f3574a.length > 0) {
                for (int i = 0; i < this.f3574a.length; i++) {
                    ew ewVar = this.f3574a[i];
                    if (ewVar != null) {
                        a2 += CodedOutputByteBufferNano.d(1, ewVar);
                    }
                }
            }
            if (this.c || !this.f3575b.equals("")) {
                a2 += CodedOutputByteBufferNano.b(2, this.f3575b);
            }
            if (this.d != null) {
                a2 += CodedOutputByteBufferNano.d(3, this.d);
            }
            if (this.f || !this.e.equals("")) {
                a2 += CodedOutputByteBufferNano.b(4, this.e);
            }
            if (this.h || !this.g.equals("")) {
                return a2 + CodedOutputByteBufferNano.b(5, this.g);
            }
            return a2;
        }

        public static ContentFilterSettingsResponse parseFrom(byte[] bArr) {
            return (ContentFilterSettingsResponse) com.google.protobuf.nano.c.a(new ContentFilterSettingsResponse(), bArr, bArr.length);
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
                        int length = this.f3574a == null ? 0 : this.f3574a.length;
                        ew[] ewVarArr = new ew[b2 + length];
                        if (length != 0) {
                            System.arraycopy(this.f3574a, 0, ewVarArr, 0, length);
                        }
                        while (length < ewVarArr.length - 1) {
                            ewVarArr[length] = new ew();
                            aVar.a(ewVarArr[length]);
                            aVar.a();
                            length++;
                        }
                        ewVarArr[length] = new ew();
                        aVar.a(ewVarArr[length]);
                        this.f3574a = ewVarArr;
                        break;
                    case 18:
                        this.f3575b = aVar.c();
                        this.c = true;
                        break;
                    case 26:
                        if (this.d == null) {
                            this.d = new ds();
                        }
                        aVar.a(this.d);
                        break;
                    case 34:
                        this.e = aVar.c();
                        this.f = true;
                        break;
                    case 42:
                        this.g = aVar.c();
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
}
