package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;

/* loaded from: classes.dex */
public interface am extends IInterface {
    void a(ag agVar);

    void a(ag agVar, byte b2);

    void a(ag agVar, int i);

    void a(ag agVar, Uri uri);

    void a(ag agVar, Uri uri, int i);

    void a(ag agVar, Asset asset);

    void a(ag agVar, ConnectionConfiguration connectionConfiguration);

    void a(ag agVar, PutDataRequest putDataRequest);

    void a(ag agVar, AddListenerRequest addListenerRequest);

    void a(ag agVar, AncsNotificationParcelable ancsNotificationParcelable);

    void a(ag agVar, LargeAssetEnqueueRequest largeAssetEnqueueRequest);

    void a(ag agVar, LargeAssetQuery largeAssetQuery);

    void a(ag agVar, LargeAssetRemoveRequest largeAssetRemoveRequest);

    void a(ag agVar, RemoveListenerRequest removeListenerRequest);

    void a(ag agVar, x xVar, String str);

    void a(ag agVar, String str);

    void a(ag agVar, String str, int i);

    void a(ag agVar, String str, ParcelFileDescriptor parcelFileDescriptor);

    void a(ag agVar, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2);

    void a(ag agVar, String str, String str2);

    void a(ag agVar, String str, String str2, byte[] bArr);

    void a(ag agVar, boolean z);

    void b(ag agVar);

    void b(ag agVar, int i);

    void b(ag agVar, Uri uri);

    void b(ag agVar, Uri uri, int i);

    void b(ag agVar, ConnectionConfiguration connectionConfiguration);

    void b(ag agVar, x xVar, String str);

    void b(ag agVar, String str);

    void b(ag agVar, String str, int i);

    void b(ag agVar, boolean z);

    void c(ag agVar);

    void c(ag agVar, int i);

    void c(ag agVar, Uri uri);

    void c(ag agVar, String str);

    void d(ag agVar);

    void d(ag agVar, String str);

    void e(ag agVar);

    void e(ag agVar, String str);

    void f(ag agVar);

    void f(ag agVar, String str);

    void g(ag agVar);

    void h(ag agVar);

    void i(ag agVar);

    void j(ag agVar);

    void k(ag agVar);

    void l(ag agVar);

    void m(ag agVar);

    void n(ag agVar);

    void o(ag agVar);

    void p(ag agVar);

    void q(ag agVar);
}
