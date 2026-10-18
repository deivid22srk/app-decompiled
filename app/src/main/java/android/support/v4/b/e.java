package android.support.v4.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.OperationCanceledException;

/* loaded from: classes.dex */
class e implements d {
    e() {
    }

    @Override // android.support.v4.b.d
    public Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, android.support.v4.os.a aVar) {
        if (aVar == null || !aVar.a()) {
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
        throw new OperationCanceledException();
    }
}
