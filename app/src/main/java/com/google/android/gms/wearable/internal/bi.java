package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public final class bi extends com.google.android.gms.common.data.a<Object> implements com.google.android.gms.wearable.q {

    /* renamed from: b, reason: collision with root package name */
    private static final long[] f6594b = new long[0];
    private static final int[] c = new int[0];
    private final Status d;
    private final android.support.v4.h.f<bj> e;

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.d;
    }

    public final String toString() {
        return "QueueEntryBufferImpl{status=" + this.d + ", entryMetadataByTransferId=" + this.e + "}";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(DataHolder dataHolder) {
        super(dataHolder);
        android.support.v4.h.f<bj> fVar;
        int i;
        this.d = bo.a(dataHolder.e);
        Bundle bundle = dataHolder.f;
        if (bundle == null) {
            fVar = new android.support.v4.h.f<>(0);
        } else {
            long[] longArray = bundle.getLongArray("notPausedTransferIds");
            longArray = longArray == null ? f6594b : longArray;
            int[] intArray = bundle.getIntArray("notPausedStates");
            if (intArray == null) {
                bj bjVar = new bj(2, 0);
                com.google.android.gms.common.internal.av.a(bjVar);
                android.support.v4.h.f<bj> fVar2 = new android.support.v4.h.f<>(longArray.length);
                for (long j : longArray) {
                    fVar2.a(j, bjVar);
                }
                fVar = fVar2;
            } else {
                int[] intArray2 = bundle.getIntArray("refuseCodes");
                intArray2 = intArray2 == null ? c : intArray2;
                com.google.android.gms.common.internal.av.b(longArray.length == intArray.length, "transferIds and states differ in length.");
                com.google.android.gms.common.internal.av.a(intArray2);
                android.support.v4.h.f<bj> fVar3 = new android.support.v4.h.f<>(longArray.length);
                int i2 = 0;
                for (int i3 = 0; i3 < longArray.length; i3++) {
                    if (intArray[i3] == 4) {
                        com.google.android.gms.common.internal.av.b(i2 < intArray2.length, "More entries in STATE_REFUSED than refuseCodes");
                        i = intArray2[i2];
                        i2++;
                    } else {
                        i = 0;
                    }
                    fVar3.a(longArray[i3], new bj(intArray[i3], i));
                }
                fVar = fVar3;
            }
        }
        this.e = fVar;
    }

    @Override // com.google.android.gms.common.data.b
    public final /* synthetic */ Object a(int i) {
        int a2 = this.f5619a.a(i);
        long a3 = this.f5619a.a("transferId", i, a2);
        bj a4 = this.e.a(a3);
        int i2 = a4 == null ? 1 : a4.f6595a;
        String b2 = this.f5619a.b("path", i, a2);
        String b3 = this.f5619a.b("nodeId", i, a2);
        Uri parse = Uri.parse(this.f5619a.b("destinationUri", i, a2));
        bj a5 = this.e.a(a3);
        return new LargeAssetQueueEntryParcelable(a3, i2, b2, b3, parse, a5 == null ? 0 : a5.f6596b, this.f5619a.c("append", i, a2), this.f5619a.c("allowedOverMetered", i, a2), this.f5619a.c("allowedWithLowBattery", i, a2));
    }

    static /* synthetic */ int b(int i) {
        com.google.android.gms.common.internal.av.a(i == 2 || i == 1 || i == 3 || i == 4 || i == 5, "Invalid queue entry state: %s", Integer.valueOf(i));
        return i;
    }
}
