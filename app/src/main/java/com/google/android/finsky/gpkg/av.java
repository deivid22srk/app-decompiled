package com.google.android.finsky.gpkg;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.google.android.finsky.utils.jm;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class av implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2811b = {"account", "library_id", "backend", "doc_id", "doc_type", "offer_type", "document_hash", "subs_valid_until_time", "app_certificate_hash", "app_refund_pre_delivery_endtime_ms", "app_refund_post_delivery_window_ms", "subs_auto_renewing", "subs_initiation_time", "subs_trial_until_time", "inapp_purchase_data", "inapp_signature", "preordered", "owned_via_license", "shared_by_me", "sharer_gaia_id", "shareability"};

    /* renamed from: a, reason: collision with root package name */
    public final ax f2812a;
    public final Context c;

    public av(Context context) {
        this.c = context;
        this.f2812a = new ax(this.c);
    }

    public static int a() {
        return 11;
    }

    @Override // com.google.android.finsky.gpkg.p
    public final synchronized boolean b(r rVar) {
        boolean z;
        synchronized (this) {
            Cursor rawQuery = this.f2812a.getWritableDatabase().rawQuery("SELECT COUNT(*) FROM ownership WHERE account=? AND library_id=? AND backend=? AND doc_id=? AND doc_type=? AND offer_type=?", new String[]{rVar.g, rVar.h, String.valueOf(rVar.i), rVar.j, String.valueOf(rVar.k), String.valueOf(rVar.l)});
            try {
                rawQuery.moveToNext();
                z = rawQuery.getLong(0) >= 1;
            } finally {
                rawQuery.close();
            }
        }
        return z;
    }

    public synchronized void c(r rVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", rVar.g);
        contentValues.put("library_id", rVar.h);
        contentValues.put("backend", Integer.valueOf(rVar.i));
        contentValues.put("doc_id", rVar.j);
        contentValues.put("doc_type", Integer.valueOf(rVar.k));
        contentValues.put("offer_type", Integer.valueOf(rVar.l));
        contentValues.put("document_hash", Long.valueOf(rVar.m));
        contentValues.put("preordered", Boolean.valueOf(rVar.o));
        contentValues.put("shared_by_me", Boolean.valueOf(rVar.p));
        contentValues.put("sharer_gaia_id", rVar.q);
        contentValues.put("shareability", Integer.valueOf(rVar.r));
        if (rVar.n != Long.MAX_VALUE) {
            contentValues.put("subs_valid_until_time", Long.valueOf(rVar.n));
        } else {
            contentValues.putNull("subs_valid_until_time");
        }
        if (rVar instanceof q) {
            q qVar = (q) rVar;
            contentValues.put("app_certificate_hash", jm.a(qVar.f2835b));
            contentValues.put("app_refund_pre_delivery_endtime_ms", Long.valueOf(qVar.c));
            contentValues.put("app_refund_post_delivery_window_ms", Long.valueOf(qVar.d));
            contentValues.put("owned_via_license", Boolean.valueOf(qVar.e));
        } else if (rVar instanceof u) {
            u uVar = (u) rVar;
            contentValues.put("subs_auto_renewing", Boolean.valueOf(uVar.e));
            contentValues.put("subs_initiation_time", Long.valueOf(uVar.c));
            contentValues.put("subs_trial_until_time", Long.valueOf(uVar.d));
            contentValues.put("inapp_purchase_data", uVar.f2838a);
            contentValues.put("inapp_signature", uVar.f2839b);
        } else if (rVar instanceof aq) {
            aq aqVar = (aq) rVar;
            contentValues.put("subs_auto_renewing", Boolean.valueOf(aqVar.e));
            contentValues.put("subs_initiation_time", Long.valueOf(aqVar.c));
            contentValues.put("subs_trial_until_time", Long.valueOf(aqVar.d));
        } else if (rVar instanceof t) {
            t tVar = (t) rVar;
            contentValues.put("inapp_purchase_data", tVar.f2836a);
            contentValues.put("inapp_signature", tVar.f2837b);
        }
        this.f2812a.getWritableDatabase().replace("ownership", null, contentValues);
    }

    @Override // com.google.android.finsky.gpkg.p
    public final synchronized r a(r rVar) {
        throw new UnsupportedOperationException("getEntry not supported.");
    }

    public final synchronized void a(Collection<? extends r> collection) {
        this.f2812a.getWritableDatabase().beginTransaction();
        try {
            Iterator<? extends r> it = collection.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            this.f2812a.getWritableDatabase().setTransactionSuccessful();
        } finally {
            this.f2812a.getWritableDatabase().endTransaction();
        }
    }

    @Override // com.google.android.finsky.gpkg.p
    public final synchronized void d(r rVar) {
        this.f2812a.getWritableDatabase().execSQL("DELETE FROM ownership WHERE account=? AND library_id=? AND backend=? AND doc_id=? AND doc_type=? AND offer_type=?", new Object[]{rVar.g, rVar.h, Integer.valueOf(rVar.i), rVar.j, Integer.valueOf(rVar.k), Integer.valueOf(rVar.l)});
    }

    @Override // com.google.android.finsky.gpkg.p
    public final synchronized int g() {
        Cursor rawQuery;
        rawQuery = this.f2812a.getWritableDatabase().rawQuery("SELECT COUNT(*) FROM ownership", new String[0]);
        try {
            rawQuery.moveToNext();
        } finally {
            rawQuery.close();
        }
        return rawQuery.getInt(0);
    }

    public final synchronized void a(Account account, String str) {
        this.f2812a.getWritableDatabase().execSQL("DELETE FROM ownership WHERE account=? AND library_id=?", new Object[]{account.name, str});
    }

    @Override // java.lang.Iterable
    public final synchronized Iterator<r> iterator() {
        return new aw(this, this.f2812a.getWritableDatabase().query("ownership", f2811b, null, null, null, null, null));
    }
}
