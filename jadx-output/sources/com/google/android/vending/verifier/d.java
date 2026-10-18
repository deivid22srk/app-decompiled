package com.google.android.vending.verifier;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
final class d extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f7151a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Context context) {
        super(context, "package_verification.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f7151a = cVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE verification_cache (package_name STRING PRIMARY KEY, cache_fingerprint INTEGER, sha256_digest BLOB, length INTEGER, forward_locked INTEGER, suppress_user_warning INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE verification_cache");
        } catch (SQLException e) {
        }
        onCreate(sQLiteDatabase);
    }
}
