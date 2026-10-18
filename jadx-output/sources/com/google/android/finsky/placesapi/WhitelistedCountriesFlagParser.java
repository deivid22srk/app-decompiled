package com.google.android.finsky.placesapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class WhitelistedCountriesFlagParser {

    /* renamed from: a, reason: collision with root package name */
    public Set<String> f3556a;

    public WhitelistedCountriesFlagParser(Context context) {
        try {
            this.f3556a = a(com.google.android.finsky.c.d.cM.b(), a(context));
        } catch (ParseException e) {
            FinskyLog.d("Malformatted format for places api whitelisting flag: %s", e);
        }
    }

    private static Set<String> a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length != 2) {
                throw new ParseException("The following part must have exactly one ':': " + str2);
            }
            try {
                if (i >= Integer.parseInt(split[0])) {
                    hashSet.addAll(Arrays.asList(split[1].split(",")));
                }
            } catch (NumberFormatException e) {
                throw new ParseException("Can't parse version: " + split[0]);
            }
        }
        return hashSet;
    }

    private static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    class ParseException extends Exception {
        ParseException(String str) {
            super(str);
        }
    }
}
