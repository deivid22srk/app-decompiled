package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;

/* loaded from: classes.dex */
public abstract class an extends Binder implements am {
    public static am a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof am)) ? new ao(iBinder) : (am) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? ConnectionConfiguration.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                o(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                p(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                q(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? PutDataRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                c(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? Asset.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                c(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                d(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? AddListenerRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? RemoveListenerRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                e(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                f(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? ConnectionConfiguration.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(ah.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                c(ah.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                g(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                h(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? AncsNotificationParcelable.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(ah.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                c(ah.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                i(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                f(ah.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(ah.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), y.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(ah.a(parcel.readStrongBinder()), y.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                k(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 38:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null, parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 42:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 46:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                d(ah.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 47:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                e(ah.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 48:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 49:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                l(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 50:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 51:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                m(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 52:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                n(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 53:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readByte());
                parcel2.writeNoException();
                return true;
            case 54:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? LargeAssetEnqueueRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 55:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? LargeAssetRemoveRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 56:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(ah.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? LargeAssetQuery.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 57:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                j(ah.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.IWearableService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
