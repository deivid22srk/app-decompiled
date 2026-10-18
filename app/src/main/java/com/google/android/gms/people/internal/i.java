package com.google.android.gms.people.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ag;
import com.google.android.gms.common.internal.ah;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

/* loaded from: classes.dex */
final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6412a;

    i(IBinder iBinder) {
        this.f6412a = iBinder;
    }

    @Override // com.google.android.gms.people.internal.g
    public final Bundle a(Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6412a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final Bundle a(d dVar, boolean z, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f6412a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final Bundle a(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f6412a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final Bundle a(String str, String str2, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeLong(j);
            this.f6412a.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final Bundle a(String str, String str2, long j, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeLong(j);
            obtain.writeInt(z ? 1 : 0);
            this.f6412a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final Bundle a(String str, String str2, long j, boolean z, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeLong(j);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            this.f6412a.transact(205, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag a(d dVar, DataHolder dataHolder, int i, int i2, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            if (dataHolder != null) {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.f6412a.transact(602, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag a(d dVar, AccountToken accountToken, ParcelableListOptions parcelableListOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            if (accountToken != null) {
                obtain.writeInt(1);
                accountToken.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (parcelableListOptions != null) {
                obtain.writeInt(1);
                parcelableListOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6412a.transact(601, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag a(d dVar, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            if (avatarReference != null) {
                obtain.writeInt(1);
                avatarReference.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (parcelableLoadImageOptions != null) {
                obtain.writeInt(1);
                parcelableLoadImageOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6412a.transact(508, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag a(d dVar, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f6412a.transact(509, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag a(d dVar, String str, String str2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6412a.transact(1201, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag a(d dVar, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(z2 ? 1 : 0);
            this.f6412a.transact(507, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, long j, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeLong(j);
            obtain.writeInt(z ? 1 : 0);
            this.f6412a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6412a.transact(302, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            if (accountToken != null) {
                obtain.writeInt(1);
                accountToken.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStringList(list);
            if (parcelableGetOptions != null) {
                obtain.writeInt(1);
                parcelableGetOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6412a.transact(501, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            this.f6412a.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f6412a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f6412a.transact(25, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f6412a.transact(403, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f6412a.transact(29, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6412a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, Uri uri, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(z ? 1 : 0);
            this.f6412a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.f6412a.transact(204, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, int i, String str4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeString(str4);
            this.f6412a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, int i, String str4, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeString(str4);
            obtain.writeInt(z ? 1 : 0);
            this.f6412a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeString(str4);
            this.f6412a.transact(202, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeString(str4);
            obtain.writeInt(z2 ? 1 : 0);
            this.f6412a.transact(203, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeString(str4);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeInt(i4);
            obtain.writeInt(i5);
            this.f6412a.transact(402, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, String str4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            this.f6412a.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, String str4, int i, String str5) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeInt(i);
            obtain.writeString(str5);
            this.f6412a.transact(303, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, String str4, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeInt(z ? 1 : 0);
            this.f6412a.transact(701, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, List<String> list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            this.f6412a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, List<String> list, int i, boolean z, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeLong(j);
            this.f6412a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeLong(j);
            obtain.writeString(str4);
            obtain.writeInt(i2);
            this.f6412a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeLong(j);
            obtain.writeString(str4);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.f6412a.transact(401, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeLong(j);
            obtain.writeString(str4);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            this.f6412a.transact(404, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, List<String> list, List<String> list2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeStringList(list2);
            this.f6412a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeStringList(list2);
            if (favaDiagnosticsEntity != null) {
                obtain.writeInt(1);
                favaDiagnosticsEntity.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6412a.transact(23, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(z ? 1 : 0);
            this.f6412a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, boolean z, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i);
            this.f6412a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, String str2, String str3, boolean z, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f6412a.transact(201, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, String str, boolean z, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeStringArray(strArr);
            this.f6412a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, boolean z, boolean z2, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f6412a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(d dVar, boolean z, boolean z2, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f6412a.transact(305, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void a(boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeInt(z ? 1 : 0);
            this.f6412a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final boolean a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            this.f6412a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6412a;
    }

    @Override // com.google.android.gms.people.internal.g
    public final Bundle b(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f6412a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag b(d dVar, long j, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeLong(j);
            obtain.writeInt(z ? 1 : 0);
            this.f6412a.transact(503, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag b(d dVar, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            this.f6412a.transact(504, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag b(d dVar, String str, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f6412a.transact(502, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag b(d dVar, String str, String str2, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f6412a.transact(505, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void b(d dVar, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6412a.transact(304, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void b(d dVar, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f6412a.transact(101, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void b(d dVar, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f6412a.transact(301, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void b(d dVar, String str, String str2, String str3, int i, String str4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeString(str4);
            this.f6412a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void b(d dVar, String str, String str2, String str3, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(z ? 1 : 0);
            this.f6412a.transact(603, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final ag c(d dVar, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f6412a.transact(506, obtain, obtain2, 0);
            obtain2.readException();
            return ah.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.people.internal.g
    public final void c(d dVar, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f6412a.transact(102, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
