package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator<LogEventParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LogEventParcelable createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static LogEventParcelable a(Parcel parcel) {
        int[] createIntArray;
        int a2 = zza.a(parcel);
        int[] iArr = null;
        byte[] bArr = null;
        PlayLoggerContext playLoggerContext = null;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    playLoggerContext = (PlayLoggerContext) zza.a(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr = zza.l(parcel, readInt);
                    break;
                case 4:
                    int a3 = zza.a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a3 == 0) {
                        createIntArray = null;
                    } else {
                        createIntArray = parcel.createIntArray();
                        parcel.setDataPosition(a3 + dataPosition);
                    }
                    iArr = createIntArray;
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new LogEventParcelable(i, playLoggerContext, bArr, iArr);
    }

    static void a(LogEventParcelable logEventParcelable, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, logEventParcelable.f5550a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, logEventParcelable.f5551b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, logEventParcelable.c);
        int[] iArr = logEventParcelable.d;
        if (iArr != null) {
            int a3 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4);
            parcel.writeIntArray(iArr);
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, a3);
        }
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LogEventParcelable[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
