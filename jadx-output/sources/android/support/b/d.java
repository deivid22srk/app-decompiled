package android.support.b;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes.dex */
final class d implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f58a;

    d(String str) {
        this.f58a = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().startsWith(this.f58a);
    }
}
