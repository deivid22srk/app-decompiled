package com.google.android.finsky.search;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import com.android.vending.R;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.jd;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.cr;
import com.google.android.play.search.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class o {
    private static final Map<String, Drawable> c = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final int f4539b;
    private final Context e;

    /* renamed from: a, reason: collision with root package name */
    final List<v> f4538a = new ArrayList();
    private final Set<Pair<String, Integer>> d = new HashSet();

    public o(Context context, int i) {
        this.e = context;
        this.f4539b = i;
    }

    private Uri a(int i) {
        if (i != 3) {
            try {
                String a2 = cr.a(i);
                PackageManager packageManager = this.e.getPackageManager();
                int i2 = packageManager.queryIntentActivities(packageManager.getLaunchIntentForPackage(a2), 65536).get(0).activityInfo.applicationInfo.icon;
                if (i2 != 0) {
                    return new Uri.Builder().scheme("android.resource").authority(a2).path(Integer.toString(i2)).build();
                }
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public final v a(String str, String str2, Drawable drawable, ds dsVar, jd jdVar, byte[] bArr, boolean z, int i) {
        int i2;
        Drawable drawable2;
        String string;
        Uri a2;
        if (i != this.f4539b) {
            switch (i) {
                case 0:
                case 3:
                    break;
                case 1:
                case 2:
                case 4:
                case 6:
                case 7:
                case 13:
                    i = 13;
                    break;
                case 5:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    FinskyLog.e("Unexpected search suggestion backend %d", Integer.valueOf(i));
                    break;
            }
            i2 = i;
        } else {
            i2 = i;
        }
        Pair<String, Integer> create = Pair.create(str, Integer.valueOf(i2));
        if (this.d.contains(create)) {
            return null;
        }
        String str3 = dsVar != null ? dsVar.f : null;
        boolean z2 = str3 != null && dsVar.l;
        if (str3 == null && jdVar != null && (a2 = a(as.a(str2))) != null) {
            str3 = a2.toString();
        }
        String str4 = null;
        if (i2 != this.f4539b) {
            Resources resources = this.e.getResources();
            switch (i2) {
                case 3:
                    string = resources.getString(R.string.search_suggest_subtext_apps_games);
                    break;
                case 13:
                    string = resources.getString(R.string.search_suggest_subtext_entertainment);
                    break;
                default:
                    string = null;
                    break;
            }
            str4 = string;
        }
        if (dsVar == null || !dsVar.s) {
            drawable2 = null;
        } else {
            if (!c.containsKey(dsVar.r)) {
                Map<String, Drawable> map = c;
                String str5 = dsVar.r;
                int parseColor = Color.parseColor(dsVar.r);
                Drawable a3 = android.support.v4.b.g.a(this.e, R.drawable.search_suggest_icon_background);
                a3.mutate().setColorFilter(parseColor, PorterDuff.Mode.MULTIPLY);
                map.put(str5, a3);
            }
            drawable2 = c.get(dsVar.r);
        }
        b bVar = new b(str, str4, str2, drawable, str3, z2, drawable2, jdVar, bArr, z, i2);
        this.f4538a.add(bVar);
        this.d.add(create);
        return bVar;
    }
}
