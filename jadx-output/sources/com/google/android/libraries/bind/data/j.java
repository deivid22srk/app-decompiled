package com.google.android.libraries.bind.data;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f6693a = new j(true, true);

    /* renamed from: b, reason: collision with root package name */
    public static final j f6694b = new j(false, true);
    public static final j c = new j(false, false);
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final DataException g;

    public j(DataException dataException) {
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = dataException;
    }

    private j(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
        this.f = false;
        this.g = null;
    }

    public final String toString() {
        return String.format("isInvalidation: %b, affectsPrimaryKey: %b, exception: %s", Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.g);
    }
}
