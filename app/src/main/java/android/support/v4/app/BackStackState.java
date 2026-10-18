package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
static final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    final int[] f157a;

    /* renamed from: b, reason: collision with root package name */
    final int f158b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList<String> j;
    final ArrayList<String> k;

    public BackStackState(i iVar) {
        int i = 0;
        for (m mVar = iVar.c; mVar != null; mVar = mVar.f227a) {
            if (mVar.i != null) {
                i += mVar.i.size();
            }
        }
        this.f157a = new int[i + (iVar.e * 7)];
        if (!iVar.l) {
            throw new IllegalStateException("Not on back stack");
        }
        int i2 = 0;
        for (m mVar2 = iVar.c; mVar2 != null; mVar2 = mVar2.f227a) {
            int i3 = i2 + 1;
            this.f157a[i2] = mVar2.c;
            int i4 = i3 + 1;
            this.f157a[i3] = mVar2.d != null ? mVar2.d.p : -1;
            int i5 = i4 + 1;
            this.f157a[i4] = mVar2.e;
            int i6 = i5 + 1;
            this.f157a[i5] = mVar2.f;
            int i7 = i6 + 1;
            this.f157a[i6] = mVar2.g;
            int i8 = i7 + 1;
            this.f157a[i7] = mVar2.h;
            if (mVar2.i != null) {
                int size = mVar2.i.size();
                int i9 = i8 + 1;
                this.f157a[i8] = size;
                int i10 = 0;
                while (i10 < size) {
                    this.f157a[i9] = mVar2.i.get(i10).p;
                    i10++;
                    i9++;
                }
                i2 = i9;
            } else {
                i2 = i8 + 1;
                this.f157a[i8] = 0;
            }
        }
        this.f158b = iVar.j;
        this.c = iVar.k;
        this.d = iVar.n;
        this.e = iVar.p;
        this.f = iVar.q;
        this.g = iVar.r;
        this.h = iVar.s;
        this.i = iVar.t;
        this.j = iVar.u;
        this.k = iVar.v;
    }

    public BackStackState(Parcel parcel) {
        this.f157a = parcel.createIntArray();
        this.f158b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
    }

    public final i a(ad adVar) {
        i iVar = new i(adVar);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f157a.length) {
            m mVar = new m();
            int i3 = i2 + 1;
            mVar.c = this.f157a[i2];
            if (ad.f164a) {
                Log.v("FragmentManager", "Instantiate " + iVar + " op #" + i + " base fragment #" + this.f157a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f157a[i3];
            if (i5 >= 0) {
                mVar.d = adVar.f.get(i5);
            } else {
                mVar.d = null;
            }
            int i6 = i4 + 1;
            mVar.e = this.f157a[i4];
            int i7 = i6 + 1;
            mVar.f = this.f157a[i6];
            int i8 = i7 + 1;
            mVar.g = this.f157a[i7];
            int i9 = i8 + 1;
            mVar.h = this.f157a[i8];
            int i10 = i9 + 1;
            int i11 = this.f157a[i9];
            if (i11 > 0) {
                mVar.i = new ArrayList<>(i11);
                int i12 = 0;
                while (i12 < i11) {
                    if (ad.f164a) {
                        Log.v("FragmentManager", "Instantiate " + iVar + " set remove fragment #" + this.f157a[i10]);
                    }
                    mVar.i.add(adVar.f.get(this.f157a[i10]));
                    i12++;
                    i10++;
                }
            }
            iVar.a(mVar);
            i++;
            i2 = i10;
        }
        iVar.j = this.f158b;
        iVar.k = this.c;
        iVar.n = this.d;
        iVar.p = this.e;
        iVar.l = true;
        iVar.q = this.f;
        iVar.r = this.g;
        iVar.s = this.h;
        iVar.t = this.i;
        iVar.u = this.j;
        iVar.v = this.k;
        iVar.a(1);
        return iVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f157a);
        parcel.writeInt(this.f158b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
    }
}
