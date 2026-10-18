package com.google.android.gms.auth.api.signin.apkg;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.av;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Lock f5379a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public static a f5380b;
    public final Lock c = new ReentrantLock();
    public final SharedPreferences d;

    public a(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        av.a(context);
        f5379a.lock();
        try {
            if (f5380b == null) {
                f5380b = new a(context.getApplicationContext());
            }
            return f5380b;
        } finally {
            f5379a.unlock();
        }
    }

    public final String b(String str) {
        this.c.lock();
        try {
            return this.d.getString(str, null);
        } finally {
            this.c.unlock();
        }
    }

    public final GoogleSignInAccount a(String str) {
        String b2;
        if (TextUtils.isEmpty(str) || (b2 = b("googleSignInAccount:" + str)) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.a(b2);
        } catch (JSONException e) {
            return null;
        }
    }
}
