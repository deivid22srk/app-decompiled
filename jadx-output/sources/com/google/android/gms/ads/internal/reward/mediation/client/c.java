package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5350a;

    public c(IBinder iBinder) {
        this.f5350a = iBinder;
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.a
    public final void a(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5350a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.a
    public final void a(com.google.android.gms.dynamic.a aVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5350a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.a
    public final void a(com.google.android.gms.dynamic.a aVar, RewardItemParcel rewardItemParcel) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            if (rewardItemParcel != null) {
                obtain.writeInt(1);
                rewardItemParcel.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5350a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5350a;
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.a
    public final void b(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5350a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.a
    public final void b(com.google.android.gms.dynamic.a aVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5350a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.a
    public final void c(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5350a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.a
    public final void d(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5350a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.a
    public final void e(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5350a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.a
    public final void f(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5350a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.a
    public final void g(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5350a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
