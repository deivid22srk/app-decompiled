package com.google.android.play.a;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ae<T> {

    /* renamed from: a, reason: collision with root package name */
    final long f6748a;

    /* renamed from: b, reason: collision with root package name */
    final af<T> f6749b;
    File c;
    FileOutputStream d;
    final ArrayList<File> e;
    final ArrayList<File> f;
    private final long g;
    private final int h;
    private final File i;
    private final String j;
    private final String k;

    public ae(File file, String str, String str2, long j, long j2, int i, af<T> afVar) {
        com.google.android.play.utils.a.b(j > 0, "recommendedFileSize must be positive");
        com.google.android.play.utils.a.b(j2 > 0, "maxStorageSize must be positive");
        com.google.android.play.utils.a.b(afVar != null, "callbacks cannot be null");
        this.i = file;
        this.j = str;
        this.k = str2;
        this.f6748a = j;
        this.g = j2;
        this.h = i;
        this.f6749b = afVar;
        a();
        if (this.c == null) {
            Log.e("RollingFileStream", "Could not create a temp file with prefix: \"" + this.j + "\" and suffix: \"" + this.k + "\" in dir: \"" + this.i.getAbsolutePath() + "\".");
        }
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        f();
        b();
    }

    final void a() {
        if (!this.i.exists()) {
            this.i.mkdirs();
        }
        this.c = null;
        try {
            this.c = File.createTempFile(this.j, this.k, this.i);
            this.d = new FileOutputStream(this.c);
            this.f6749b.a();
        } catch (FileNotFoundException e) {
            if (this.c != null) {
                this.c.delete();
            }
            this.c = null;
        } catch (IOException e2) {
        }
    }

    final void b() {
        long j;
        long j2 = 0;
        Iterator<File> it = this.f.iterator();
        while (true) {
            j = j2;
            if (!it.hasNext()) {
                break;
            } else {
                j2 = it.next().length() + j;
            }
        }
        Iterator<File> it2 = this.e.iterator();
        while (it2.hasNext()) {
            j += it2.next().length();
        }
        if (this.c != null) {
            j += this.c.length();
        }
        int i = 0;
        while (j > this.g) {
            int i2 = i + 1;
            if (this.f.size() > 0) {
                File remove = this.f.remove(0);
                j -= remove.length();
                remove.delete();
                i = i2;
            } else if (this.e.size() > 0) {
                File remove2 = this.e.remove(0);
                j -= remove2.length();
                remove2.delete();
                i = i2;
            } else if (this.c != null) {
                j -= this.c.length();
                this.c.delete();
                this.c = null;
                i = i2;
            } else {
                i = i2;
            }
        }
        if (i > 0) {
            Log.d("RollingFileStream", i + " files were purged due to exceeding total storage size of: " + this.g);
        }
    }

    private void f() {
        if (!this.i.exists()) {
            this.i.mkdirs();
        }
        com.google.android.play.utils.a.a(this.i.isDirectory(), "Expected a directory for path: " + this.i.getAbsolutePath());
        this.e.clear();
        for (File file : this.i.listFiles()) {
            if (file.isFile() && !file.equals(this.c)) {
                if (file.length() == 0) {
                    file.delete();
                } else {
                    this.e.add(file);
                }
            }
        }
        Collections.sort(this.e, com.google.android.play.utils.d.f7079a);
    }

    public final boolean c() {
        if (this.c == null) {
            return false;
        }
        int size = this.e.size() + this.f.size() + 1;
        if (this.h > 0 && size >= this.h) {
            return false;
        }
        try {
            this.d.close();
            this.e.add(this.c);
            b();
            this.c = null;
            this.d = null;
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public final void d() {
        Iterator<File> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
        this.f.clear();
    }

    public final void e() {
        this.e.addAll(this.f);
        Collections.sort(this.e, com.google.android.play.utils.d.f7079a);
        this.f.clear();
    }

    static byte[] a(File file) {
        int i = 0;
        long length = file.length();
        if (length > 2147483647L) {
            throw new OutOfMemoryError("Too large to fit in a byte array: " + length);
        }
        if (length == 0) {
            return new byte[0];
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[(int) length];
            while (i < bArr.length) {
                int read = fileInputStream.read(bArr, i, bArr.length - i);
                if (read == -1) {
                    throw new IOException("Unexpected EOS: " + bArr.length + ", " + i);
                }
                i += read;
            }
            return bArr;
        } finally {
            fileInputStream.close();
        }
    }
}
