package com.google.android.finsky.g;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ax extends SQLiteOpenHelper {
    public ax(Context context) {
        super(context, "library.db", (SQLiteDatabase.CursorFactory) null, 11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ownership (account STRING, library_id STRING, backend INTEGER, doc_id STRING, doc_type INTEGER, offer_type INTEGER, document_hash INTEGER, subs_valid_until_time INTEGER, app_certificate_hash STRING, app_refund_pre_delivery_endtime_ms INTEGER, app_refund_post_delivery_window_ms INTEGER, subs_auto_renewing INTEGER, subs_initiation_time INTEGER, subs_trial_until_time INTEGER, inapp_purchase_data STRING, inapp_signature STRING, preordered INTEGER, owned_via_license INTEGER, shared_by_me INTEGER, sharer_gaia_id TEXT, shareability INTEGER, PRIMARY KEY (account, library_id, backend, doc_id, doc_type, offer_type))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE ownership ADD COLUMN inapp_purchase_data STRING");
                sQLiteDatabase.execSQL("ALTER TABLE ownership ADD COLUMN inapp_signature STRING");
            case 6:
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE ownership ADD COLUMN preordered INTEGER");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE ownership ADD COLUMN owned_via_license INTEGER");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE ownership ADD COLUMN shared_by_me INTEGER");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE ownership ADD COLUMN sharer_gaia_id TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE ownership ADD COLUMN shareability INTEGER");
                break;
            default:
                a(sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        FinskyLog.a("Downgrading Library from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
        a(sQLiteDatabase);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE ownership");
        } catch (SQLException e) {
        }
        onCreate(sQLiteDatabase);
    }
}
