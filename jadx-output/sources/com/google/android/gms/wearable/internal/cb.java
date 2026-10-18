package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class cb implements Callable<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ParcelFileDescriptor f6599a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f6600b;
    final /* synthetic */ ca c;

    cb(ca caVar, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.c = caVar;
        this.f6599a = parcelFileDescriptor;
        this.f6600b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (Log.isLoggable("WearableClient", 3)) {
            Log.d("WearableClient", "processAssets: writing data to FD : " + this.f6599a);
        }
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.f6599a);
        try {
            try {
                autoCloseOutputStream.write(this.f6600b);
                autoCloseOutputStream.flush();
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: wrote data: " + this.f6599a);
                }
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + this.f6599a);
                    }
                    autoCloseOutputStream.close();
                    return true;
                } catch (IOException e) {
                    return true;
                }
            } catch (IOException e2) {
                Log.w("WearableClient", "processAssets: writing data failed: " + this.f6599a);
                return false;
            }
        } finally {
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: closing: " + this.f6599a);
                }
                autoCloseOutputStream.close();
            } catch (IOException e3) {
            }
        }
    }
}
