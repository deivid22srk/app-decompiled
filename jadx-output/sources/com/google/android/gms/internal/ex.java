package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;

/* loaded from: classes.dex */
public abstract class ex extends Binder implements ew {
    public static ew a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ew)) ? new ey(iBinder) : (ew) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        AdRequestParcel adRequestParcel;
        NativeAdOptionsParcel nativeAdOptionsParcel;
        AdRequestParcel adRequestParcel2;
        com.google.android.gms.ads.internal.reward.mediation.client.a cVar;
        AdRequestParcel adRequestParcel3;
        AdSizeParcel adSizeParcel;
        AdRequestParcel adRequestParcel4;
        AdSizeParcel adSizeParcel2;
        AdRequestParcel adRequestParcel5;
        AdRequestParcel adRequestParcel6 = null;
        AdRequestParcel adRequestParcel7 = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                com.google.android.gms.dynamic.a a2 = com.google.android.gms.dynamic.b.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.ads.internal.client.h hVar = AdSizeParcel.CREATOR;
                    adSizeParcel2 = com.google.android.gms.ads.internal.client.h.a(parcel);
                } else {
                    adSizeParcel2 = null;
                }
                if (parcel.readInt() != 0) {
                    com.google.android.gms.ads.internal.client.g gVar = AdRequestParcel.CREATOR;
                    adRequestParcel5 = com.google.android.gms.ads.internal.client.g.a(parcel);
                } else {
                    adRequestParcel5 = null;
                }
                a(a2, adSizeParcel2, adRequestParcel5, parcel.readString(), fa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                com.google.android.gms.dynamic.a a3 = a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a3 != null ? a3.asBinder() : null);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                com.google.android.gms.dynamic.a a4 = com.google.android.gms.dynamic.b.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.ads.internal.client.g gVar2 = AdRequestParcel.CREATOR;
                    adRequestParcel6 = com.google.android.gms.ads.internal.client.g.a(parcel);
                }
                a(a4, adRequestParcel6, parcel.readString(), fa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                b();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                c();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                com.google.android.gms.dynamic.a a5 = com.google.android.gms.dynamic.b.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.ads.internal.client.h hVar2 = AdSizeParcel.CREATOR;
                    adSizeParcel = com.google.android.gms.ads.internal.client.h.a(parcel);
                } else {
                    adSizeParcel = null;
                }
                if (parcel.readInt() != 0) {
                    com.google.android.gms.ads.internal.client.g gVar3 = AdRequestParcel.CREATOR;
                    adRequestParcel4 = com.google.android.gms.ads.internal.client.g.a(parcel);
                } else {
                    adRequestParcel4 = null;
                }
                a(a5, adSizeParcel, adRequestParcel4, parcel.readString(), parcel.readString(), fa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                com.google.android.gms.dynamic.a a6 = com.google.android.gms.dynamic.b.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.ads.internal.client.g gVar4 = AdRequestParcel.CREATOR;
                    adRequestParcel3 = com.google.android.gms.ads.internal.client.g.a(parcel);
                } else {
                    adRequestParcel3 = null;
                }
                a(a6, adRequestParcel3, parcel.readString(), parcel.readString(), fa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                d();
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                e();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                com.google.android.gms.dynamic.a a7 = com.google.android.gms.dynamic.b.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.ads.internal.client.g gVar5 = AdRequestParcel.CREATOR;
                    adRequestParcel2 = com.google.android.gms.ads.internal.client.g.a(parcel);
                } else {
                    adRequestParcel2 = null;
                }
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    cVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    cVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.google.android.gms.ads.internal.reward.mediation.client.a)) ? new com.google.android.gms.ads.internal.reward.mediation.client.c(readStrongBinder) : (com.google.android.gms.ads.internal.reward.mediation.client.a) queryLocalInterface;
                }
                a(a7, adRequestParcel2, readString, cVar, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                if (parcel.readInt() != 0) {
                    com.google.android.gms.ads.internal.client.g gVar6 = AdRequestParcel.CREATOR;
                    adRequestParcel7 = com.google.android.gms.ads.internal.client.g.a(parcel);
                }
                a(adRequestParcel7, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                f();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                boolean g = g();
                parcel2.writeNoException();
                parcel2.writeInt(g ? 1 : 0);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                com.google.android.gms.dynamic.a a8 = com.google.android.gms.dynamic.b.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.ads.internal.client.g gVar7 = AdRequestParcel.CREATOR;
                    adRequestParcel = com.google.android.gms.ads.internal.client.g.a(parcel);
                } else {
                    adRequestParcel = null;
                }
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                ez a9 = fa.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.ads.internal.formats.a aVar = NativeAdOptionsParcel.CREATOR;
                    nativeAdOptionsParcel = com.google.android.gms.ads.internal.formats.a.a(parcel);
                } else {
                    nativeAdOptionsParcel = null;
                }
                a(a8, adRequestParcel, readString2, readString3, a9, nativeAdOptionsParcel, parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                fg h = h();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(h != null ? h.asBinder() : null);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                fj i3 = i();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(i3 != null ? i3.asBinder() : null);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                Bundle j = j();
                parcel2.writeNoException();
                if (j == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                j.writeToParcel(parcel2, 1);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                Bundle k = k();
                parcel2.writeNoException();
                if (k == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                k.writeToParcel(parcel2, 1);
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                Bundle l = l();
                parcel2.writeNoException();
                if (l == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                l.writeToParcel(parcel2, 1);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
