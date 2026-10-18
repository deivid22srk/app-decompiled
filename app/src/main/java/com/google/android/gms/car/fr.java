package com.google.android.gms.car;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class fr extends Binder implements fq {
    public static fq a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICar");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof fq)) ? new fs(iBinder) : (fq) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                CarInfo a2 = a();
                parcel2.writeNoException();
                if (a2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                a2.writeToParcel(parcel2, 1);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                CarUiInfo b2 = b();
                parcel2.writeNoException();
                if (b2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                b2.writeToParcel(parcel2, 1);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                boolean c = c();
                parcel2.writeNoException();
                parcel2.writeInt(c ? 1 : 0);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                int d = d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                a(ck.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                b(ck.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                dw e = e();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(e != null ? e.asBinder() : null);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                fw f = f();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(f != null ? f.asBinder() : null);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                de g = g();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(g != null ? g.asBinder() : null);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                boolean a3 = a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(a3 ? 1 : 0);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                List<ResolveInfo> b3 = b(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeTypedList(b3);
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                ca h = h();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(h != null ? h.asBinder() : null);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                ec a4 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a4 != null ? a4.asBinder() : null);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                cs i3 = i();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(i3 != null ? i3.asBinder() : null);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                cm j = j();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(j != null ? j.asBinder() : null);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                dk k = k();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(k != null ? k.asBinder() : null);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                cy l = l();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(l != null ? l.asBinder() : null);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                bu m = m();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(m != null ? m.asBinder() : null);
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                boolean a5 = a(parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(a5 ? 1 : 0);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                a(fu.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                b(fu.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                n();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                String a6 = a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a6);
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                b(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                b(parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                String b4 = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b4);
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                o();
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                a(parcel.readInt() != 0 ? CarFacet.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                a(ch.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                b(ch.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                p();
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                com.google.android.gms.car.apkg.a q = q();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(q != null ? q.asBinder() : null);
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                a(parcel.readInt() != 0 ? CarFrxEvent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                dq r = r();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(r != null ? r.asBinder() : null);
                return true;
            case 36:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                ay s = s();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(s != null ? s.asBinder() : null);
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                List<CarInfo> t = t();
                parcel2.writeNoException();
                parcel2.writeTypedList(t);
                return true;
            case 38:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                List<CarInfo> u = u();
                parcel2.writeNoException();
                parcel2.writeTypedList(u);
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                a(parcel.readInt() != 0 ? CarInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                List<ResolveInfo> a7 = a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedList(a7);
                return true;
            case 41:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                boolean a8 = a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(a8 ? 1 : 0);
                return true;
            case 42:
                parcel.enforceInterface("com.google.android.gms.car.ICar");
                a(parcel.readInt() != 0 ? CarInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICar");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
