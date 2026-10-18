package com.google.android.gms.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.av;

/* loaded from: classes.dex */
public final class d {
    private static volatile d d;

    /* renamed from: a, reason: collision with root package name */
    private final String f6277a;

    /* renamed from: b, reason: collision with root package name */
    private final Status f6278b;
    private final boolean c;

    private d(Context context) {
        boolean z = true;
        Resources resources = context.getResources();
        String resourcePackageName = resources.getResourcePackageName(com.google.android.gms.b.common_google_play_services_unknown_issue);
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resourcePackageName);
        if (identifier != 0 && resources.getInteger(identifier) == 0) {
            z = false;
        }
        this.c = z;
        int identifier2 = resources.getIdentifier("google_app_id", "string", resourcePackageName);
        if (identifier2 == 0) {
            if (this.c) {
                this.f6278b = new Status(10, "Missing an expected resource: 'android.R.string.google_app_id' for initializing Google services.  Possible causes are missing google-services.json or com.google.gms.google-services gradle plugin.");
            } else {
                this.f6278b = Status.f5572a;
            }
            this.f6277a = null;
            return;
        }
        String string = resources.getString(identifier2);
        if (!TextUtils.isEmpty(string)) {
            this.f6277a = string;
            this.f6278b = Status.f5572a;
        } else {
            if (this.c) {
                this.f6278b = new Status(10, "The resource 'android.R.string.google_app_id' is invalid, expected an app  identifier and found: '" + string + "'.");
            } else {
                this.f6278b = Status.f5572a;
            }
            this.f6277a = null;
        }
    }

    public static Status a(Context context) {
        av.a(context, "Context must not be null.");
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    d = new d(context);
                }
            }
        }
        return d.f6278b;
    }

    public static String a() {
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    throw new IllegalStateException("Initialize must be called before getGoogleAppId.");
                }
            }
        }
        d dVar = d;
        if (dVar.f6278b.a()) {
            return dVar.f6277a;
        }
        throw new IllegalStateException("Initialize must be successful before calling getGoogleAppId.  The result of the previous call to initialize was: '" + dVar.f6278b + "'.");
    }

    public static boolean b() {
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    throw new IllegalStateException("Initialize must be called before isMeasurementEnabled.");
                }
            }
        }
        d dVar = d;
        if (dVar.f6278b.a()) {
            return dVar.c;
        }
        throw new IllegalStateException("Initialize must be successful before calling isMeasurementEnabledInternal.  The result of the previous call to initialize was: '" + dVar.f6278b + "'.");
    }
}
