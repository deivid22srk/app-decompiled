package com.google.android.finsky.services;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.google.android.finsky.utils.dy;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class ConsumptionAppDoc implements Parcelable {
    public static final Parcelable.Creator<ConsumptionAppDoc> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final Uri f4540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4541b;
    public final long c;
    public final String d;
    public final Intent e;

    public ConsumptionAppDoc(Bundle bundle) {
        this((Uri) bundle.getParcelable("Play.ImageUri"), (CharSequence) bundle.get("Play.Reason"), bundle.getLong("Play.LastUpdateTimeMillis"), bundle.getString("Play.FinskyDocId"), (Intent) bundle.getParcelable("Play.ViewIntent"));
    }

    ConsumptionAppDoc(Uri uri, CharSequence charSequence, long j, String str, Intent intent) {
        SpannableString spannableString;
        this.f4540a = uri;
        this.c = j;
        this.d = str;
        this.e = intent;
        String str2 = (String) charSequence;
        if (TextUtils.isEmpty(str2) && (spannableString = (SpannableString) charSequence) != null) {
            str2 = spannableString.toString();
        }
        this.f4541b = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConsumptionAppDoc)) {
            return false;
        }
        ConsumptionAppDoc consumptionAppDoc = (ConsumptionAppDoc) obj;
        return dy.a(this.f4540a, consumptionAppDoc.f4540a) && TextUtils.equals(this.f4541b, consumptionAppDoc.f4541b) && this.c == consumptionAppDoc.c && TextUtils.equals(this.d, consumptionAppDoc.d);
    }

    public String toString() {
        return String.format("Doc %s, Image %s, Reason %s, Last update %s", this.d, this.f4540a, this.f4541b, SimpleDateFormat.getDateTimeInstance().format(new Date(this.c)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(1L);
        parcel.writeParcelable(this.f4540a, 0);
        parcel.writeString(this.f4541b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, 0);
    }
}
