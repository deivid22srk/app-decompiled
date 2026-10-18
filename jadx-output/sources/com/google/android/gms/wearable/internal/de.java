package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
final class de extends ct<com.google.android.gms.wearable.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PutDataRequest f6613a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dd f6614b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    de(dd ddVar, com.google.android.gms.common.api.m mVar, PutDataRequest putDataRequest) {
        super(mVar);
        this.f6614b = ddVar;
        this.f6613a = putDataRequest;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* synthetic */ void a(ca caVar) {
        ca caVar2 = caVar;
        PutDataRequest putDataRequest = this.f6613a;
        Iterator<Map.Entry<String, Asset>> it = putDataRequest.a().entrySet().iterator();
        while (it.hasNext()) {
            Asset value = it.next().getValue();
            if (value.f6457b == null && value.c == null && value.d == null && value.e == null) {
                throw new IllegalArgumentException("Put for " + putDataRequest.f6461b + " contains invalid asset: " + value);
            }
        }
        PutDataRequest a2 = PutDataRequest.a(putDataRequest.f6461b);
        a2.d = putDataRequest.d;
        if (putDataRequest.e == 0) {
            a2.e = 0L;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Asset> entry : putDataRequest.a().entrySet()) {
            Asset value2 = entry.getValue();
            if (value2.f6457b != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: replacing data with FD in asset: " + value2 + " read:" + createPipe[0] + " write:" + createPipe[1]);
                    }
                    a2.a(entry.getKey(), Asset.a(createPipe[0]));
                    FutureTask futureTask = new FutureTask(new cb(caVar2, createPipe[1], value2.f6457b));
                    arrayList.add(futureTask);
                    caVar2.f.submit(futureTask);
                } catch (IOException e) {
                    throw new IllegalStateException("Unable to create ParcelFileDescriptor for asset in request: " + putDataRequest, e);
                }
            } else if (value2.e != null) {
                try {
                    a2.a(entry.getKey(), Asset.a(caVar2.f5716a.getContentResolver().openFileDescriptor(value2.e, "r")));
                } catch (FileNotFoundException e2) {
                    new bz(this, arrayList).a(new PutDataResponse());
                    Log.w("WearableClient", "Couldn't resolve asset URI: " + value2.e);
                    return;
                }
            } else {
                a2.a(entry.getKey(), value2);
            }
        }
        caVar2.o().a(new bz(this, arrayList), a2);
    }

    @Override // com.google.android.gms.internal.kt
    public final /* synthetic */ com.google.android.gms.common.api.x a(Status status) {
        return new dj(status, null);
    }
}
