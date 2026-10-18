package com.google.android.finsky.providers;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class RecentSuggestionsProvider extends a {
    @Override // com.google.android.finsky.providers.a, android.content.ContentProvider
    public /* bridge */ /* synthetic */ int delete(Uri uri, String str, String[] strArr) {
        return super.delete(uri, str, strArr);
    }

    @Override // com.google.android.finsky.providers.a, android.content.ContentProvider
    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return super.getType(uri);
    }

    @Override // com.google.android.finsky.providers.a, android.content.ContentProvider
    public /* bridge */ /* synthetic */ Uri insert(Uri uri, ContentValues contentValues) {
        return super.insert(uri, contentValues);
    }

    @Override // com.google.android.finsky.providers.a, android.content.ContentProvider
    public /* bridge */ /* synthetic */ boolean onCreate() {
        return super.onCreate();
    }

    @Override // com.google.android.finsky.providers.a, android.content.ContentProvider
    public /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return super.query(uri, strArr, str, strArr2, str2);
    }

    @Override // com.google.android.finsky.providers.a, android.content.ContentProvider
    public /* bridge */ /* synthetic */ int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return super.update(uri, contentValues, str, strArr);
    }

    public RecentSuggestionsProvider() {
        if (TextUtils.isEmpty("com.google.android.finsky.RecentSuggestionsProvider")) {
            throw new IllegalArgumentException();
        }
        this.c = true;
        this.f4423a = new String("com.google.android.finsky.RecentSuggestionsProvider");
        this.f4424b = 3;
        this.d = Uri.parse("content://" + this.f4423a + "/suggestions");
        this.e = new UriMatcher(-1);
        this.e.addURI(this.f4423a, "search_suggest_query", 1);
        if (this.c) {
            this.f = "display1 LIKE ? OR display2 LIKE ?";
            this.g = new String[]{"0 AS suggest_format", "display1 AS suggest_text_1", "display2 AS suggest_text_2", "query AS suggest_intent_query", "_id"};
        } else {
            this.f = "display1 LIKE ?";
            this.g = new String[]{"0 AS suggest_format", "display1 AS suggest_text_1", "query AS suggest_intent_query", "_id"};
        }
    }
}
