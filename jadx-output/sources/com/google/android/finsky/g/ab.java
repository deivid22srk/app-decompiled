package com.google.android.finsky.g;

import android.text.format.DateFormat;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.finsky.protos.jb;

/* loaded from: classes.dex */
final class ab {

    /* renamed from: a, reason: collision with root package name */
    long f2786a;

    /* renamed from: b, reason: collision with root package name */
    int f2787b;
    String c;
    jb d;
    VolleyError e;

    private ab() {
    }

    /* synthetic */ ab(byte b2) {
        this();
    }

    public final void a(String str) {
        String str2;
        Log.d("FinskyLibrary", str + "Event {");
        StringBuilder append = new StringBuilder().append(str).append("  type=");
        int i = this.f2787b;
        switch (i) {
            case 0:
                str2 = "APPLY_LIBRARY_UPDATE";
                break;
            case 1:
                str2 = "SCHEDULE_REPLICATION";
                break;
            case 2:
                str2 = "REPLICATE";
                break;
            case 3:
                str2 = "ERROR_VOLLEY";
                break;
            case 4:
                str2 = "ERROR_TOKEN_CHANGED";
                break;
            case 5:
                str2 = "ERROR_UNSUPPORTED_LIBRARY";
                break;
            default:
                str2 = String.valueOf(i) + " (FIXME)";
                break;
        }
        Log.d("FinskyLibrary", append.append(str2).toString());
        Log.d("FinskyLibrary", str + "  timestampMs=" + this.f2786a);
        Log.d("FinskyLibrary", str + "  timestamp=" + ((Object) DateFormat.format("MM-dd hh:mm:ss", this.f2786a)));
        if (this.c != null) {
            Log.d("FinskyLibrary", str + "  tag=" + this.c);
        }
        if (this.d != null) {
            String[] split = com.google.protobuf.nano.d.a(this.d).split("\n");
            Log.d("FinskyLibrary", str + "  libraryUpdate=");
            for (String str3 : split) {
                Log.d("FinskyLibrary", str + "    " + str3);
            }
        }
        if (this.e != null) {
            Log.d("FinskyLibrary", str + "  volleyError=" + this.e);
        }
        Log.d("FinskyLibrary", str + "}");
    }
}
