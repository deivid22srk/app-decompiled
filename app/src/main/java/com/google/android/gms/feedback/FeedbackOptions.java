package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FeedbackOptions implements SafeParcelable {
    public static final Parcelable.Creator<FeedbackOptions> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f5798a;

    /* renamed from: b, reason: collision with root package name */
    public String f5799b;
    public Bundle c;
    public String d;
    public ApplicationErrorReport e;
    public String f;
    public BitmapTeleporter g;
    public String h;
    public ArrayList<FileTeleporter> i;
    public boolean j;
    public ThemeSettings k;
    public LogOptions l;

    private FeedbackOptions() {
        this(3, null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null);
    }

    public /* synthetic */ FeedbackOptions(byte b2) {
        this();
    }

    FeedbackOptions(int i, String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, ArrayList<FileTeleporter> arrayList, boolean z, ThemeSettings themeSettings, LogOptions logOptions) {
        this.f5798a = i;
        this.f5799b = str;
        this.c = bundle;
        this.d = str2;
        this.e = applicationErrorReport;
        this.f = str3;
        this.g = bitmapTeleporter;
        this.h = str4;
        this.i = arrayList;
        this.j = z;
        this.k = themeSettings;
        this.l = logOptions;
    }

    public final ApplicationErrorReport.CrashInfo a() {
        if (this.e == null) {
            return null;
        }
        return this.e.crashInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }

    public static /* synthetic */ FeedbackOptions a(FeedbackOptions feedbackOptions, Bitmap bitmap) {
        if (bitmap != null) {
            feedbackOptions.g = new BitmapTeleporter(bitmap);
        }
        return feedbackOptions;
    }

    public static /* synthetic */ FeedbackOptions a(FeedbackOptions feedbackOptions, String str) {
        feedbackOptions.f5799b = str;
        return feedbackOptions;
    }

    public static /* synthetic */ FeedbackOptions b(FeedbackOptions feedbackOptions, String str) {
        feedbackOptions.d = str;
        return feedbackOptions;
    }

    public static /* synthetic */ FeedbackOptions a(FeedbackOptions feedbackOptions, Bundle bundle) {
        feedbackOptions.c = bundle;
        return feedbackOptions;
    }

    public static /* synthetic */ FeedbackOptions c(FeedbackOptions feedbackOptions, String str) {
        feedbackOptions.f = str;
        return feedbackOptions;
    }

    public static /* synthetic */ FeedbackOptions a(FeedbackOptions feedbackOptions, ArrayList arrayList) {
        feedbackOptions.i = arrayList;
        return feedbackOptions;
    }

    public static /* synthetic */ FeedbackOptions a(FeedbackOptions feedbackOptions, boolean z) {
        feedbackOptions.j = z;
        return feedbackOptions;
    }

    public static /* synthetic */ FeedbackOptions a(FeedbackOptions feedbackOptions, ThemeSettings themeSettings) {
        feedbackOptions.k = themeSettings;
        return feedbackOptions;
    }

    public static /* synthetic */ FeedbackOptions a(FeedbackOptions feedbackOptions, LogOptions logOptions) {
        feedbackOptions.l = logOptions;
        return feedbackOptions;
    }
}
