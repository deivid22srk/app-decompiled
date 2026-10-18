package com.google.android.finsky.b;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v extends AsyncTask<Void, Void, Map<String, Integer>> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2133a;
    private final String c = "assets14.db";
    private final String d = "assets10";
    private final String e = "package_name";
    private final String f = "auto_update";
    private final Boolean g = false;
    private final String h = "market_assets.db";
    private final String i = "assets";
    private final String j = "PACKAGE";
    private final String k = "AUTO_UPDATE";
    private final Boolean l = true;

    /* renamed from: b, reason: collision with root package name */
    private final a f2134b = FinskyApp.a().s;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Map<String, Integer> map) {
        Boolean a2;
        Map<String, Integer> map2 = map;
        for (String str : map2.keySet()) {
            b a3 = this.f2134b.a(str);
            if (a3 != null && a3.c != null && (a3.d == null || a3.d.f2131b == 0)) {
                int intValue = map2.get(str).intValue();
                FinskyLog.a("Migrating %s autoupdate = %d", str, Integer.valueOf(intValue));
                this.f2134b.f2060a.a(str, intValue);
            }
        }
        this.f2133a.deleteDatabase("assets14.db");
        this.f2133a.deleteDatabase("market_assets.db");
        com.google.android.finsky.autoupdate.p.a(this.f2134b);
        for (Account account : com.google.android.finsky.api.a.a(this.f2133a)) {
            String str2 = account.name;
            com.google.android.finsky.c.o<Boolean> b2 = bg.P.b(str2);
            com.google.android.finsky.c.o<Integer> b3 = bg.Q.b(str2);
            if (b2.b() && (a2 = b2.a()) != null) {
                b3.a((com.google.android.finsky.c.o<Integer>) Integer.valueOf(a2.booleanValue() ? 0 : com.google.android.finsky.c.d.cP.b().intValue()));
                b2.c();
            }
            com.google.android.finsky.c.o<Boolean> b4 = bg.as.b(str2);
            com.google.android.finsky.c.o<Integer> b5 = bg.Q.b(str2);
            com.google.android.finsky.c.o<Integer> b6 = bg.R.b(str2);
            com.google.android.finsky.d.d e = FinskyApp.a().e();
            com.google.android.finsky.a.i f = FinskyApp.a().f(str2);
            if (e.a(12602050L) && !b4.a().booleanValue() && !b6.b() && b5.a().intValue() == 0) {
                b5.c();
                f.a(400, (Integer) null, (Integer) 0, "cleanup-auth-settings");
            }
        }
    }

    public v(Context context) {
        this.f2133a = context;
    }

    private void a(Map<String, Integer> map, String str, String str2, String str3, String str4, boolean z) {
        File databasePath = this.f2133a.getDatabasePath(str);
        if (databasePath.exists()) {
            try {
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(databasePath.getAbsolutePath(), null, 1);
                FinskyLog.a("Reading from legacy database %s", str);
                Cursor query = openDatabase.query(str2, new String[]{str3, str4}, null, null, null, null, null);
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(0);
                            if (!TextUtils.isEmpty(string)) {
                                int i = 0;
                                if (z) {
                                    String string2 = query.getString(1);
                                    if ("DISABLED".equals(string2)) {
                                        i = 1;
                                    } else if ("ENABLED".equals(string2)) {
                                        i = 2;
                                    }
                                } else {
                                    i = query.getInt(1);
                                }
                                switch (i) {
                                    case 1:
                                        map.put(string, 2);
                                        break;
                                    case 2:
                                        map.put(string, 1);
                                        break;
                                }
                            }
                        } finally {
                            query.close();
                        }
                    }
                }
                openDatabase.close();
            } catch (SQLiteException e) {
                FinskyLog.d("Unable to open %s because %s", str, e.toString());
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Map<String, Integer> doInBackground(Void[] voidArr) {
        this.f2134b.f2060a.c();
        HashMap hashMap = new HashMap();
        a(hashMap, "assets14.db", "assets10", "package_name", "auto_update", this.g.booleanValue());
        a(hashMap, "market_assets.db", "assets", "PACKAGE", "AUTO_UPDATE", this.l.booleanValue());
        return hashMap;
    }
}
