package com.google.android.finsky.search;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.play.search.v;

/* loaded from: classes.dex */
final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f4525a = new Uri.Builder().scheme("content").authority("com.google.android.finsky.RecentSuggestionsProvider").appendPath("search_suggest_query").build();

    /* renamed from: b, reason: collision with root package name */
    private final o f4526b;
    private final Drawable f;
    private final boolean g;

    public f(String str, Context context, o oVar) {
        super(str, context);
        this.f4526b = oVar;
        this.f = android.support.v4.b.g.a(this.d, R.drawable.ic_search_recent);
        this.g = FinskyApp.a().e().a(12607353L);
    }

    @Override // com.google.android.finsky.search.l
    public final void a() {
    }

    @Override // com.google.android.finsky.search.l
    protected final void a(n nVar) {
        v a2;
        Cursor query = this.d.getContentResolver().query(f4525a, null, " ?", new String[]{this.c}, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex("suggest_text_1");
            int columnIndex2 = query.getColumnIndex("suggest_text_2");
            if (columnIndex >= 0 && columnIndex2 >= 0) {
                int intValue = com.google.android.finsky.c.d.fF.b().intValue();
                query.moveToPosition(0);
                int i = 0;
                while (!query.isAfterLast() && i < intValue) {
                    String string = query.getString(columnIndex);
                    if (string.startsWith(this.c)) {
                        String string2 = query.getString(columnIndex2);
                        if (this.g && !TextUtils.isEmpty(string2)) {
                            a2 = this.f4526b.a(string, null, this.f, null, null, null, true, Integer.parseInt(string2));
                        } else {
                            o oVar = this.f4526b;
                            a2 = oVar.a(string, null, this.f, null, null, null, true, oVar.f4539b);
                        }
                        if (a2 != null) {
                            i++;
                        }
                    }
                    query.moveToNext();
                    i = i;
                }
                query.close();
            }
        }
        nVar.a();
    }
}
