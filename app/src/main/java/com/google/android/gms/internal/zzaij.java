package com.google.android.gms.internal;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzaij extends IOException {
    private zzaij(String str) {
        super(str);
    }

    static zzaij a() {
        return new zzaij("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzaij b() {
        return new zzaij("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzaij c() {
        return new zzaij("CodedInputStream encountered a malformed varint.");
    }

    static zzaij d() {
        return new zzaij("Protocol message contained an invalid tag (zero).");
    }

    static zzaij e() {
        return new zzaij("Protocol message end-group tag did not match expected tag.");
    }

    static zzaij f() {
        return new zzaij("Protocol message tag had invalid wire type.");
    }

    static zzaij g() {
        return new zzaij("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
