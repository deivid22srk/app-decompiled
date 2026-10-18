package com.google.android.gms.people.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ag;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

/* loaded from: classes.dex */
public interface g extends IInterface {
    Bundle a(Uri uri);

    Bundle a(d dVar, boolean z, String str, String str2, int i);

    Bundle a(String str, String str2);

    Bundle a(String str, String str2, long j);

    Bundle a(String str, String str2, long j, boolean z);

    Bundle a(String str, String str2, long j, boolean z, boolean z2);

    ag a(d dVar, DataHolder dataHolder, int i, int i2, long j);

    ag a(d dVar, AccountToken accountToken, ParcelableListOptions parcelableListOptions);

    ag a(d dVar, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions);

    ag a(d dVar, String str, int i);

    ag a(d dVar, String str, String str2, Bundle bundle);

    ag a(d dVar, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2);

    void a(d dVar, long j, boolean z);

    void a(d dVar, Bundle bundle);

    void a(d dVar, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions);

    void a(d dVar, String str);

    void a(d dVar, String str, int i, int i2);

    void a(d dVar, String str, String str2);

    void a(d dVar, String str, String str2, int i);

    void a(d dVar, String str, String str2, int i, int i2);

    void a(d dVar, String str, String str2, Uri uri);

    void a(d dVar, String str, String str2, Uri uri, boolean z);

    void a(d dVar, String str, String str2, String str3);

    void a(d dVar, String str, String str2, String str3, int i, String str4);

    void a(d dVar, String str, String str2, String str3, int i, String str4, boolean z);

    void a(d dVar, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4);

    void a(d dVar, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2);

    void a(d dVar, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5);

    void a(d dVar, String str, String str2, String str3, String str4);

    void a(d dVar, String str, String str2, String str3, String str4, int i, String str5);

    void a(d dVar, String str, String str2, String str3, String str4, boolean z);

    void a(d dVar, String str, String str2, String str3, List<String> list);

    void a(d dVar, String str, String str2, String str3, List<String> list, int i, boolean z, long j);

    void a(d dVar, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2);

    void a(d dVar, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3);

    void a(d dVar, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4);

    void a(d dVar, String str, String str2, String str3, List<String> list, List<String> list2);

    void a(d dVar, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity);

    void a(d dVar, String str, String str2, String str3, boolean z);

    void a(d dVar, String str, String str2, String str3, boolean z, int i);

    void a(d dVar, String str, String str2, String str3, boolean z, int i, int i2);

    void a(d dVar, String str, boolean z, String[] strArr);

    void a(d dVar, boolean z, boolean z2, String str, String str2);

    void a(d dVar, boolean z, boolean z2, String str, String str2, int i);

    void a(boolean z);

    boolean a();

    Bundle b(String str, String str2);

    ag b(d dVar, long j, boolean z);

    ag b(d dVar, String str);

    ag b(d dVar, String str, int i, int i2);

    ag b(d dVar, String str, String str2, int i, int i2);

    void b(d dVar, Bundle bundle);

    void b(d dVar, String str, String str2);

    void b(d dVar, String str, String str2, int i);

    void b(d dVar, String str, String str2, String str3, int i, String str4);

    void b(d dVar, String str, String str2, String str3, boolean z);

    ag c(d dVar, String str, String str2, int i);

    void c(d dVar, String str, String str2);
}
