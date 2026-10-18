package com.google.android.play.utils;

import java.io.File;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator<File> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7079a = new d();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(File file, File file2) {
        File file3 = file;
        File file4 = file2;
        if (file3.lastModified() == file4.lastModified()) {
            return 0;
        }
        if (file3.lastModified() < file4.lastModified()) {
            return -1;
        }
        return 1;
    }

    private d() {
    }
}
