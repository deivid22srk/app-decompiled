package android.support.v4.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final d f248a;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f248a = new f();
        } else {
            f248a = new e();
        }
    }

    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, android.support.v4.os.a aVar) {
        return f248a.a(contentResolver, uri, strArr, str, strArr2, str2, aVar);
    }
}
