package com.google.android.finsky.installer;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ea;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class z implements s {

    /* renamed from: a, reason: collision with root package name */
    String f2880a = null;

    /* renamed from: b, reason: collision with root package name */
    File f2881b = null;
    Uri c = null;
    private final Context d;

    public z(Context context) {
        this.d = context;
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(String str, long j, String str2, int i) {
    }

    @Override // com.google.android.finsky.installer.s
    public final boolean a(String str) {
        return false;
    }

    @Override // com.google.android.finsky.installer.s
    public final synchronized void b(String str) {
        if (str.equals(this.f2880a)) {
            if (this.f2881b != null) {
                this.f2881b.delete();
                this.f2881b = null;
            }
            if (this.c != null) {
                this.c = null;
            }
            this.f2880a = null;
        }
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(List<String> list) {
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(String str, long j, long j2) {
    }

    @Override // com.google.android.finsky.installer.s
    public final int a() {
        return -1;
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // com.google.android.finsky.installer.s
    public final boolean a(boolean z) {
        return z;
    }

    @Override // com.google.android.finsky.installer.s
    public final synchronized OutputStream a(String str, String str2, long j) {
        FileOutputStream fileOutputStream;
        synchronized (this) {
            if (this.f2881b != null) {
                FinskyLog.e("Already streaming file %s for %s", this.f2881b.getName(), this.f2880a);
            }
            if (this.c != null) {
                FinskyLog.e("Already tracking file %s for %s", this.c, this.f2880a);
                this.f2881b = null;
            }
            File cacheDir = this.d.getCacheDir();
            if (!cacheDir.setExecutable(true, false)) {
                FinskyLog.c("Could not make executable %s", cacheDir);
                throw new IOException("Could not make cache dir executable");
            }
            File file = new File(cacheDir, "copies");
            file.mkdirs();
            if (!(file.setExecutable(true, false) && file.setReadable(true, false))) {
                FinskyLog.c("Could not make readable %s", file);
                throw new IOException("Could not make destination dir readable");
            }
            File createTempFile = File.createTempFile(str, ".apk", file);
            if (!createTempFile.setReadable(true, false)) {
                FinskyLog.c("Could not make readable %s", createTempFile);
                createTempFile.delete();
                throw new IOException("Could not make destination file writeable");
            }
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
                this.f2880a = str;
                this.f2881b = createTempFile;
            } catch (IOException e) {
                createTempFile.delete();
                throw e;
            }
        }
        return fileOutputStream;
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(OutputStream outputStream) {
        outputStream.flush();
        outputStream.close();
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(String str, Uri uri) {
        if (this.f2881b != null) {
            FinskyLog.e("Already streaming file %s for %s", this.f2881b.getName(), this.f2880a);
        }
        if (this.c != null) {
            FinskyLog.e("Already tracking file %s for %s", this.c, this.f2880a);
            this.f2881b = null;
        }
        this.f2880a = str;
        this.c = uri;
    }

    @Override // com.google.android.finsky.installer.s
    public final synchronized void a(String str, boolean z, t tVar) {
        Uri uri;
        if (this.f2881b != null) {
            uri = Uri.fromFile(this.f2881b);
        } else if (this.c != null) {
            uri = this.c;
        } else {
            throw new IllegalStateException("No file or URI to install from");
        }
        ea.a(uri, -1L, null, new aa(this, tVar), z, str);
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(String str, boolean z) {
        ea.a(str, z);
    }
}
