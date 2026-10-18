package com.google.android.finsky.download.apkg;

import com.google.android.finsky.download.am;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2678a = Pattern.compile("^patch\\.(\\d+)\\.([\\w\\.]+)\\.obb$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f2679b = Pattern.compile("^main\\.(\\d+)\\.([\\w\\.]+)\\.obb$");
    public String c;
    public final boolean d;
    public int e;
    public long f;
    public int g;
    public final String h;
    public final String i = "temp.";

    d(boolean z, String str, int i, long j) {
        this.g = -1;
        this.d = z;
        this.e = i;
        this.f = j;
        this.h = str;
        this.c = a(this.d, this.e, this.h);
        this.g = 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.c == null ? dVar.c != null : !this.c.equals(dVar.c)) {
            return false;
        }
        if (this.d == dVar.d && this.e == dVar.e && this.f == dVar.f) {
            if (this.g < 0 ? dVar.g >= 0 : this.g != dVar.g) {
                return false;
            }
            if (this.h != null) {
                if (this.h.equals(dVar.h)) {
                    return true;
                }
            } else if (dVar.h == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = this.d ? "Patch" : "Main";
        objArr[1] = this.h;
        objArr[2] = Integer.valueOf(this.e);
        int i = this.g;
        switch (i) {
            case 1:
                str = "DOWNLOAD_PENDING";
                break;
            case 2:
                str = "DOWNLOADING";
                break;
            case 3:
                str = "DOWNLOADED";
                break;
            case 4:
                str = "NOT_ON_STORAGE";
                break;
            case 5:
                str = "NOT_APPLICABLE";
                break;
            default:
                str = Integer.toString(i);
                break;
        }
        objArr[3] = str;
        return String.format("%s: %s v:%d %s", objArr);
    }

    @Override // com.google.android.finsky.download.apkg.a
    public final void e() {
        boolean z = false;
        if (this.g != 5) {
            if (!am.a()) {
                a(4);
                return;
            }
            File f = f();
            if (f != null && f.exists() && f.length() == this.f) {
                z = true;
            }
            if (!z) {
                a(4);
            } else {
                a(3);
            }
        }
    }

    @Override // com.google.android.finsky.download.apkg.a
    public final File f() {
        if (!am.a() || this.f <= 0) {
            return null;
        }
        File a2 = c.a(this.h);
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return new File(a2, this.c);
    }

    @Override // com.google.android.finsky.download.apkg.a
    public final File g() {
        File f = f();
        if (f == null) {
            return null;
        }
        return new File(f.getParentFile(), "temp." + f.getName());
    }

    @Override // com.google.android.finsky.download.apkg.a
    public final boolean h() {
        File f = f();
        if (f == null) {
            a("main file null");
            return false;
        }
        File g = g();
        if (g == null) {
            a("temp file null");
            return false;
        }
        if (g.length() != this.f) {
            a("size mismatch: tempfile size=" + String.valueOf(g.length()));
            return false;
        }
        if (!g.renameTo(f)) {
            a("renameTo() returned false");
            return false;
        }
        return true;
    }

    @Override // com.google.android.finsky.download.apkg.a
    public final boolean i() {
        File f = f();
        if (f == null) {
            a("main file null");
            return false;
        }
        File g = g();
        if (g != null) {
            return !g.exists() && f.length() == this.f;
        }
        a("temp file null");
        return false;
    }

    public void a(String str) {
        try {
            FinskyLog.c("Failure %s while finalizing %s", str, toString());
            FinskyLog.c(" file=%s, size=%d", this.c, Long.valueOf(this.f));
            File a2 = c.a(this.h);
            FinskyLog.c(" Contents of %s:", a2.getAbsolutePath());
            if (!a2.exists()) {
                FinskyLog.c(" (Does not exist)", new Object[0]);
                return;
            }
            if (!a2.isDirectory()) {
                FinskyLog.c(" (Is not a directory)", new Object[0]);
                return;
            }
            File[] listFiles = a2.listFiles();
            if (listFiles == null) {
                FinskyLog.c(" (listFiles() returned null)", new Object[0]);
                return;
            }
            for (File file : listFiles) {
                FinskyLog.c("  name=%s size=%d", file.getName(), Long.valueOf(file.length()));
            }
        } catch (Exception e) {
            FinskyLog.b(e, "Unexpected exception", new Object[0]);
        }
    }

    public static String a(boolean z, int i, String str) {
        return (z ? "patch" : "main") + "." + i + "." + str + ".obb";
    }

    public static Integer a(String str, String str2, boolean z) {
        Matcher matcher = (z ? f2678a : f2679b).matcher(str);
        if (matcher.matches()) {
            if (matcher.group(2).equals(str2)) {
                try {
                    return Integer.valueOf(Integer.parseInt(matcher.group(1)));
                } catch (NumberFormatException e) {
                }
            }
            FinskyLog.d("Unable to parse version code from OBB file name %s for package %s", str, str2);
        }
        return null;
    }

    @Override // com.google.android.finsky.download.apkg.a
    public final long c() {
        return this.f;
    }

    @Override // com.google.android.finsky.download.apkg.a
    public final boolean a() {
        return this.d;
    }

    @Override // com.google.android.finsky.download.apkg.a
    public final String b() {
        return this.h;
    }

    @Override // com.google.android.finsky.download.apkg.a
    public final int d() {
        return this.g;
    }

    public void a(int i) {
        if (i == 5) {
            this.e = -1;
            this.f = -1L;
            this.c = "";
        }
        this.g = i;
    }
}
