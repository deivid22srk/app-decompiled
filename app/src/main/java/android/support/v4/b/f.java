package android.support.v4.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* loaded from: classes.dex */
final class f extends e {
    f() {
    }

    @Override // android.support.v4.b.e, android.support.v4.b.d
    public final Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, android.support.v4.os.a aVar) {
        Object b2;
        if (aVar != null) {
            try {
                b2 = aVar.b();
            } catch (Exception e) {
                if (e instanceof OperationCanceledException) {
                    throw new android.support.v4.os.OperationCanceledException();
                }
                throw e;
            }
        } else {
            b2 = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) b2);
    }
}
