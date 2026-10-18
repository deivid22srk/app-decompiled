package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zza {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.zza$zza, reason: collision with other inner class name */
    public class C0000zza extends RuntimeException {
        public C0000zza(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static int a(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a2 = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(a2 + dataPosition);
        return createFromParcel;
    }

    public static void a(Parcel parcel, int i, int i2) {
        int a2 = a(parcel, i);
        if (a2 != i2) {
            throw new C0000zza("Expected size " + i2 + " got " + a2 + " (0x" + Integer.toHexString(a2) + ")", parcel);
        }
    }

    public static void b(Parcel parcel, int i) {
        parcel.setDataPosition(a(parcel, i) + parcel.dataPosition());
    }

    public static void b(Parcel parcel, int i, int i2) {
        if (i != i2) {
            throw new C0000zza("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
        }
    }

    public static <T> T[] b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a2 = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(a2 + dataPosition);
        return tArr;
    }

    public static <T> ArrayList<T> c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a2 = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a2 + dataPosition);
        return createTypedArrayList;
    }

    public static boolean c(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte d(Parcel parcel, int i) {
        a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static int e(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt();
    }

    public static long f(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long g(Parcel parcel, int i) {
        int a2 = a(parcel, i);
        if (a2 == 0) {
            return null;
        }
        b(parcel, a2, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static double h(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readDouble();
    }

    public static String i(Parcel parcel, int i) {
        int a2 = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a2 + dataPosition);
        return readString;
    }

    public static IBinder j(Parcel parcel, int i) {
        int a2 = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a2 + dataPosition);
        return readStrongBinder;
    }

    public static Bundle k(Parcel parcel, int i) {
        int a2 = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a2 + dataPosition);
        return readBundle;
    }

    public static byte[] l(Parcel parcel, int i) {
        int a2 = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a2 + dataPosition);
        return createByteArray;
    }

    public static String[] m(Parcel parcel, int i) {
        int a2 = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a2 + dataPosition);
        return createStringArray;
    }

    public static ArrayList<Integer> n(Parcel parcel, int i) {
        int a2 = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + a2);
        return arrayList;
    }

    public static ArrayList<String> o(Parcel parcel, int i) {
        int a2 = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a2 + dataPosition);
        return createStringArrayList;
    }

    public static int a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a2 = a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            throw new C0000zza("Expected object header. Got 0x" + Integer.toHexString(readInt), parcel);
        }
        int i = dataPosition + a2;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new C0000zza("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        return i;
    }
}
