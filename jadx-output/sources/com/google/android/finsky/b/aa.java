package com.google.android.finsky.b;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class aa extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f2062a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(z zVar, Context context, String str) {
        super(context, z.b(str), (SQLiteDatabase.CursorFactory) null, 18);
        this.f2062a = zVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE appstate (package_name STRING, auto_update INTEGER, desired_version INTEGER, download_uri STRING, delivery_data BLOB, delivery_data_timestamp_ms INTEGER,installer_state INTEGER, first_download_ms INTEGER, referrer STRING, account STRING, title STRING,flags INTEGER, continue_url STRING, last_notified_version INTEGER, last_update_timestamp_ms INTEGER, account_for_update STRING, auto_acquire_tags STRING, external_referrer_timestamp_ms INTEGER, persistent_flags INTEGER, permissions_version INTEGER, delivery_token STRING,completed_split_ids STRING, active_split_id STRING, request_id STRING, PRIMARY KEY (package_name))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN continue_url STRING");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN delivery_data_timestamp_ms INTEGER");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN last_notified_version INTEGER");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN last_update_timestamp_ms INTEGER");
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN account_for_update STRING");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN auto_acquire_tags STRING");
            case 13:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN external_referrer_timestamp_ms INTEGER");
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN persistent_flags INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN permissions_version INTEGER");
            case 15:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN delivery_token STRING");
            case 16:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN completed_split_ids STRING");
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN active_split_id STRING");
            case 17:
                sQLiteDatabase.execSQL("ALTER TABLE appstate ADD COLUMN request_id STRING");
                break;
            default:
                a(sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        FinskyLog.a("Downgrading InstallerDataStore from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
        a(sQLiteDatabase);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE appstate");
        } catch (SQLException e) {
            FinskyLog.c("Unable to drop table: %s", e);
        }
        onCreate(sQLiteDatabase);
    }
}
