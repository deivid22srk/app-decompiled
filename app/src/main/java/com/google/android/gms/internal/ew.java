package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.List;

/* loaded from: classes.dex */
public interface ew extends IInterface {
    com.google.android.gms.dynamic.a a();

    void a(AdRequestParcel adRequestParcel, String str);

    void a(com.google.android.gms.dynamic.a aVar, AdRequestParcel adRequestParcel, String str, com.google.android.gms.ads.internal.reward.mediation.client.a aVar2, String str2);

    void a(com.google.android.gms.dynamic.a aVar, AdRequestParcel adRequestParcel, String str, ez ezVar);

    void a(com.google.android.gms.dynamic.a aVar, AdRequestParcel adRequestParcel, String str, String str2, ez ezVar);

    void a(com.google.android.gms.dynamic.a aVar, AdRequestParcel adRequestParcel, String str, String str2, ez ezVar, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list);

    void a(com.google.android.gms.dynamic.a aVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, ez ezVar);

    void a(com.google.android.gms.dynamic.a aVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, ez ezVar);

    void b();

    void c();

    void d();

    void e();

    void f();

    boolean g();

    fg h();

    fj i();

    Bundle j();

    Bundle k();

    Bundle l();
}
