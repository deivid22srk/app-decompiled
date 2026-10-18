package com.google.android.finsky.providers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* loaded from: classes.dex */
final class b extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private int f4425a;

    public b(Context context, int i) {
        super(context, "suggestions.db", (SQLiteDatabase.CursorFactory) null, i);
        this.f4425a = i;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE suggestions (_id INTEGER PRIMARY KEY,display1 TEXT UNIQUE ON CONFLICT REPLACE");
        if ((this.f4425a & 2) != 0) {
            sb.append(",display2 TEXT");
        }
        sb.append(",query TEXT,date LONG);");
        sQLiteDatabase.execSQL(sb.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if ((i2 & 2) != 0 && (i & 2) == 0) {
            sQLiteDatabase.execSQL("ALTER TABLE suggestions ADD COLUMN display2 TEXT");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.w("SuggestionsProvider", "Downgrading database from version " + i + " to " + i2 + ", which will destroy all old data");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS suggestions");
        onCreate(sQLiteDatabase);
    }
}
