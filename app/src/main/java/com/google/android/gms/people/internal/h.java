package com.google.android.gms.people.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ag;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h extends Binder implements g {
    public static g a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof g)) ? new i(iBinder) : (g) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DataHolder dataHolder;
        AccountToken accountToken;
        ParcelableListOptions parcelableListOptions;
        AvatarReference avatarReference;
        ParcelableLoadImageOptions parcelableLoadImageOptions;
        AccountToken accountToken2;
        ParcelableGetOptions parcelableGetOptions;
        FavaDiagnosticsEntity favaDiagnosticsEntity;
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readLong(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                Bundle a2 = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a2 != null) {
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                Bundle a3 = a(e.a(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                if (a3 != null) {
                    parcel2.writeInt(1);
                    a3.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                Bundle a4 = a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a4 != null) {
                    parcel2.writeInt(1);
                    a4.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                boolean a5 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a5 ? 1 : 0);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                Bundle b2 = b(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (b2 != null) {
                    parcel2.writeInt(1);
                    b2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                Bundle a6 = a(parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                if (a6 != null) {
                    parcel2.writeInt(1);
                    a6.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                d a7 = e.a(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    com.google.android.gms.common.server.a aVar = FavaDiagnosticsEntity.CREATOR;
                    favaDiagnosticsEntity = com.google.android.gms.common.server.a.a(parcel);
                } else {
                    favaDiagnosticsEntity = null;
                }
                a(a7, readString, readString2, readString3, createStringArrayList, createStringArrayList2, favaDiagnosticsEntity);
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                Bundle a8 = a(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
                parcel2.writeNoException();
                if (a8 != null) {
                    parcel2.writeInt(1);
                    a8.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 101:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 102:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                c(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 201:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 202:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 203:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 204:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 205:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                Bundle a9 = a(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                if (a9 != null) {
                    parcel2.writeInt(1);
                    a9.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 301:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 302:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 303:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 304:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b(e.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 305:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 401:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 402:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 403:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 404:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 501:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                d a10 = e.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.people.identity.internal.a aVar2 = AccountToken.CREATOR;
                    accountToken2 = com.google.android.gms.people.identity.internal.a.a(parcel);
                } else {
                    accountToken2 = null;
                }
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    com.google.android.gms.people.identity.internal.g gVar = ParcelableGetOptions.CREATOR;
                    parcelableGetOptions = com.google.android.gms.people.identity.internal.g.a(parcel);
                } else {
                    parcelableGetOptions = null;
                }
                a(a10, accountToken2, createStringArrayList3, parcelableGetOptions);
                parcel2.writeNoException();
                return true;
            case 502:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                ag b3 = b(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b3 != null ? b3.asBinder() : null);
                return true;
            case 503:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                ag b4 = b(e.a(parcel.readStrongBinder()), parcel.readLong(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b4 != null ? b4.asBinder() : null);
                return true;
            case 504:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                ag b5 = b(e.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b5 != null ? b5.asBinder() : null);
                return true;
            case 505:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                ag b6 = b(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b6 != null ? b6.asBinder() : null);
                return true;
            case 506:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                ag c = c(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(c != null ? c.asBinder() : null);
                return true;
            case 507:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                ag a11 = a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a11 != null ? a11.asBinder() : null);
                return true;
            case 508:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                d a12 = e.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.people.model.d dVar = AvatarReference.CREATOR;
                    avatarReference = com.google.android.gms.people.model.d.a(parcel);
                } else {
                    avatarReference = null;
                }
                if (parcel.readInt() != 0) {
                    j jVar = ParcelableLoadImageOptions.CREATOR;
                    parcelableLoadImageOptions = j.a(parcel);
                } else {
                    parcelableLoadImageOptions = null;
                }
                ag a13 = a(a12, avatarReference, parcelableLoadImageOptions);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a13 != null ? a13.asBinder() : null);
                return true;
            case 509:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                ag a14 = a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a14 != null ? a14.asBinder() : null);
                return true;
            case 601:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                d a15 = e.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.people.identity.internal.a aVar3 = AccountToken.CREATOR;
                    accountToken = com.google.android.gms.people.identity.internal.a.a(parcel);
                } else {
                    accountToken = null;
                }
                if (parcel.readInt() != 0) {
                    com.google.android.gms.people.identity.internal.h hVar = ParcelableListOptions.CREATOR;
                    parcelableListOptions = com.google.android.gms.people.identity.internal.h.a(parcel);
                } else {
                    parcelableListOptions = null;
                }
                ag a16 = a(a15, accountToken, parcelableListOptions);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a16 != null ? a16.asBinder() : null);
                return true;
            case 602:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                d a17 = e.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    com.google.android.gms.common.data.e eVar = DataHolder.CREATOR;
                    dataHolder = com.google.android.gms.common.data.e.a(parcel);
                } else {
                    dataHolder = null;
                }
                ag a18 = a(a17, dataHolder, parcel.readInt(), parcel.readInt(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a18 != null ? a18.asBinder() : null);
                return true;
            case 603:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 701:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 1201:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                ag a19 = a(e.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a19 != null ? a19.asBinder() : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.people.internal.IPeopleService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
