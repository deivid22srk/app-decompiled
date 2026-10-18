package com.google.android.finsky.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.pt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    private static Class f4809a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final List<Integer> f4810b;
    private static final cx c;
    private static final cx d;
    private static final cx e;
    private static final cx f;
    private static final cx g;

    static {
        ArrayList arrayList = new ArrayList();
        f4810b = arrayList;
        arrayList.add(2);
        c = new cs();
        d = new ct();
        e = new cu();
        f = new cv();
        g = new cw();
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "com.google.android.apps.books";
            case 2:
                return "com.google.android.music";
            case 3:
                return "com.deivid22srk.store";
            case 4:
                return "com.google.android.videos";
            case 5:
            default:
                return null;
            case 6:
                return "com.google.android.apps.magazines";
        }
    }

    public static int a(String str) {
        if ("com.google.android.apps.books".equals(str)) {
            return 1;
        }
        if ("com.google.android.videos".equals(str)) {
            return 4;
        }
        if ("com.google.android.music".equals(str)) {
            return 2;
        }
        if ("com.google.android.apps.magazines".equals(str)) {
            return 6;
        }
        if ("com.deivid22srk.store".equals(str)) {
            return 3;
        }
        return -1;
    }

    public static boolean a(PackageManager packageManager) {
        if (a(packageManager, "com.google.android.music")) {
            return !(FinskyApp.a().s.f2061b.a("com.google.android.music").c < com.google.android.finsky.c.d.cc.b().intValue());
        }
        return false;
    }

    private static boolean a(PackageManager packageManager, String str) {
        List<ResolveInfo> queryIntentActivities;
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        return (launchIntentForPackage == null || (queryIntentActivities = packageManager.queryIntentActivities(launchIntentForPackage, 65536)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    public static boolean a(PackageManager packageManager, Intent intent) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return (queryIntentActivities == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    public static boolean a(PackageManager packageManager, int i) {
        switch (i) {
            case 1:
                return a(packageManager, "com.google.android.apps.books");
            case 2:
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("com.google.android.music.PLAY"), 65536);
                return (queryIntentActivities == null || queryIntentActivities.isEmpty()) ? false : true;
            case 3:
            case 5:
            default:
                return false;
            case 4:
                if (a(packageManager, "com.google.android.videos") && FinskyApp.a().v.a("com.google.android.videos").c >= a()) {
                    return true;
                }
                return false;
            case 6:
                if (a(packageManager, "com.google.android.apps.magazines")) {
                    return !(FinskyApp.a().s.f2061b.a("com.google.android.apps.magazines").c < com.google.android.finsky.c.d.dy.b().intValue());
                }
                return false;
        }
    }

    public static boolean a(com.google.android.finsky.b.x xVar, int i) {
        com.google.android.finsky.b.y a2 = xVar.a(a(i));
        return a2 != null && a2.f;
    }

    private static cx b(int i) {
        switch (i) {
            case 1:
                return c;
            case 2:
                return g;
            case 3:
                return d;
            case 4:
                return e;
            case 5:
            default:
                throw new IllegalStateException("Unknown backend " + i);
            case 6:
                return f;
        }
    }

    public static Intent a(Context context, int i, String str) {
        return b(i).a(context, str);
    }

    public static Intent a(int i, String str, String str2) {
        return b(i).a(str, str2);
    }

    public static Intent a(Uri uri) {
        if (uri.getScheme() == null) {
            uri = Uri.parse("http://" + uri.toString());
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(524288);
        return intent;
    }

    private static Intent b(PackageManager packageManager, Intent intent) {
        if (packageManager.resolveActivity(intent, 65536) == null) {
            Intent intent2 = new Intent(intent.getAction(), intent.getData());
            intent2.setFlags(intent.getFlags());
            return intent2;
        }
        return intent;
    }

    public static Intent a(PackageManager packageManager, Uri uri, String str) {
        if (uri != null) {
            uri = Uri.parse(uri.toString().trim());
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.google.android.youtube");
        intent.putExtra("authAccount", str);
        intent.putExtra("force_fullscreen", true);
        intent.putExtra("finish_on_ended", true);
        intent.setFlags(524288);
        return b(packageManager, intent);
    }

    public static Intent b(Uri uri) {
        Intent intent = new Intent("android.intent.action.SENDTO", uri);
        intent.setFlags(524288);
        return intent;
    }

    public static Intent a(Context context, Class<?> cls, String str, String str2) {
        Intent intent = new Intent(context, cls);
        intent.putExtra(str, str2);
        return intent;
    }

    public static void a(Context context, Document document, com.google.android.finsky.layout.play.cy cyVar) {
        a(context, document);
        FinskyApp.a().h().a(202, (byte[]) null, cyVar);
    }

    public static Intent a(Context context, Intent intent) {
        Intent a2 = a(context, c(), "authAccount", intent.getStringExtra("authAccount"));
        a2.setData(intent.getData());
        a2.setAction("android.intent.action.VIEW");
        return a2;
    }

    public static Intent a(PackageManager packageManager, String str, Intent intent) {
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 0)) {
            if (resolveInfo.activityInfo != null && str.equals(resolveInfo.activityInfo.packageName)) {
                Intent intent2 = new Intent(intent);
                intent2.setClassName(str, resolveInfo.activityInfo.name);
                return intent2;
            }
        }
        FinskyLog.d("Could not find receiver for %s", str);
        return null;
    }

    public static boolean a(PackageManager packageManager, String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str2));
        intent.setPackage(str);
        return a(packageManager, intent);
    }

    public static Intent a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("market");
        builder.authority("details");
        builder.appendQueryParameter("id", str);
        builder.appendQueryParameter("url", jm.a(str2));
        intent.setData(builder.build());
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.deivid22srk.store");
        return intent;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, c());
        intent.setAction("com.google.android.finsky.DETAILS");
        intent.setData(Uri.parse(str));
        return intent;
    }

    public static Intent a(Context context, int i, DfeToc dfeToc) {
        pt a2 = dfeToc.a(i);
        Intent intent = new Intent(context, c());
        intent.setData(Uri.parse(a2.e));
        intent.setAction("com.google.android.finsky.CORPUS_HOME");
        intent.putExtra("title", a2.c);
        intent.putExtra("backend_id", i);
        return intent;
    }

    public static Intent a(Context context) {
        return new Intent(context, c());
    }

    public static Intent a(Context context, String str, String str2, int i, boolean z) {
        Intent intent = new Intent(context, c());
        intent.setData(Uri.parse(str));
        intent.setAction("com.google.android.finsky.VIEW_BROWSE");
        intent.putExtra("title", str2);
        intent.putExtra("backend_id", i);
        intent.putExtra("clear_back_stack", z);
        return intent;
    }

    public static int a() {
        return (Build.VERSION.SDK_INT < 11 ? com.google.android.finsky.c.d.ca.b() : com.google.android.finsky.c.d.cb.b()).intValue();
    }

    public static boolean a(int i, Intent intent) {
        if (f4810b.contains(Integer.valueOf(i)) && com.google.android.finsky.c.d.en.b().booleanValue()) {
            return b(i, intent);
        }
        return false;
    }

    public static boolean b(int i, Intent intent) {
        if (!a(FinskyApp.a().getPackageManager(), i)) {
            return false;
        }
        List<ResolveInfo> queryIntentActivities = FinskyApp.a().getPackageManager().queryIntentActivities(intent, 65536);
        String a2 = a(i);
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            if (a2.equals(it.next().activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized Class<?> c() {
        Class<?> cls;
        synchronized (cr.class) {
            if (f4809a == null) {
                if (ik.a()) {
                    try {
                        f4809a = Class.forName("com.google.android.finsky.activities.TvMainActivity");
                    } catch (ClassNotFoundException e2) {
                        FinskyLog.d("Could not find com.google.android.finsky.activities.TvMainActivity", new Object[0]);
                    }
                } else {
                    f4809a = MainActivity.class;
                }
            }
            cls = f4809a;
        }
        return cls;
    }

    public static Intent a(Context context, Document document, String str) {
        return b(document.f1963a.g).a(context, document, str);
    }

    public static Intent b(Context context, Document document, String str) {
        return b(document.f1963a.g).b(context, document, str);
    }

    public static Intent b(PackageManager packageManager, Uri uri, String str) {
        boolean z;
        if (a(packageManager, "com.google.android.videos")) {
            z = FinskyApp.a().v.a("com.google.android.videos").c >= com.google.android.finsky.c.d.dx.b().intValue();
        } else {
            z = false;
        }
        if (z) {
            Intent intent = new Intent("com.google.android.videos.intent.action.trailers.VIEW", uri);
            intent.putExtra("authAccount", str);
            intent.setPackage("com.google.android.videos");
            intent.setFlags(524288);
            return b(packageManager, intent);
        }
        return a(packageManager, uri, str);
    }

    public static void a(Context context, Document document) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setFlags(524288);
        intent.putExtra("android.intent.extra.TEXT", document.f1963a.F);
        if (document.P()) {
            intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.share_subject_preregistration, document.f1963a.i));
        } else {
            intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.share_subject, document.f1963a.i));
        }
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.share_dialog_title, document.f1963a.i)));
    }

    public static Intent b(Context context, Document document) {
        return a(context, document.f1963a.D);
    }

    static /* synthetic */ Intent a(String str, String str2, PackageManager packageManager) {
        Intent launchIntentForPackage;
        Intent b2 = !TextUtils.isEmpty(str2) ? b(packageManager, a(str, str2)) : null;
        if (b2 != null) {
            return b2;
        }
        if (ik.a()) {
            launchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(str);
        } else {
            launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        }
        if (launchIntentForPackage != null) {
            return launchIntentForPackage;
        }
        return dt.a(FinskyApp.a(), str, (String) null, (String) null, com.google.android.finsky.api.s.a(str));
    }
}
