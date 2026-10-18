package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.PopupWindow;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@gw
/* loaded from: classes.dex */
public final class hk {
    private String j;

    /* renamed from: b, reason: collision with root package name */
    private static final String f6032b = com.google.android.gms.ads.d.class.getName();
    private static final String c = com.google.android.gms.ads.g.class.getName();
    private static final String d = com.google.android.gms.ads.apkg.c.class.getName();
    private static final String e = com.google.android.gms.ads.apkg.d.class.getName();
    private static final String f = com.google.android.gms.ads.dpkg.a.class.getName();
    private static final String g = com.google.android.gms.ads.b.class.getName();

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f6031a = new hd(Looper.getMainLooper());
    private final Object h = new Object();
    private boolean i = true;
    private boolean k = false;

    public static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not parse value:" + e2);
            return 0;
        }
    }

    public static Bitmap a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static PopupWindow a(View view, int i, int i2) {
        return new PopupWindow(view, i, i2, false);
    }

    public static String a() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return bigInteger;
    }

    protected static String a(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }

    public static Map<String, String> a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : com.google.android.gms.ads.internal.d.e().a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private JSONArray a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            a(jSONArray, it.next());
        }
        return jSONArray;
    }

    private JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static void a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void a(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
    }

    public static void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static void a(Context context, String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            new Cif(context, str, it.next()).b();
        }
    }

    public static void a(Context context, String str, List<String> list, String str2) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            new Cif(context, str, it.next(), str2).b();
        }
    }

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f6031a.post(runnable);
        }
    }

    public static void a(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", str);
        httpURLConnection.setUseCaches(false);
    }

    private void a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, a((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, a((Map<String, ?>) obj));
            return;
        }
        if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, a((Collection<?>) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public static boolean a(PackageManager packageManager, String str, String str2) {
        return packageManager.checkPermission(str2, str) == 0;
    }

    public static int[] a(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? d() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static AlertDialog.Builder b(Context context) {
        return new AlertDialog.Builder(context);
    }

    public static Bitmap b(Context context, String str) {
        com.google.android.gms.common.internal.av.c("getBackgroundImage must not be called on the main UI thread.");
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            Bitmap decodeStream = BitmapFactory.decodeStream(openFileInput);
            openFileInput.close();
            return decodeStream;
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.b.b("Fail to get background image");
            return null;
        }
    }

    public static String b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : str + " " + str2;
    }

    public static void b(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static int[] b(Activity activity) {
        int[] a2 = a(activity);
        com.google.android.gms.ads.internal.client.j.a();
        com.google.android.gms.ads.internal.client.j.a();
        return new int[]{com.google.android.gms.ads.internal.util.client.a.b(activity, a2[0]), com.google.android.gms.ads.internal.util.client.a.b(activity, a2[1])};
    }

    public static cm c(Context context) {
        return new cm(context);
    }

    private static String c() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            stringBuffer.append(" ").append(Build.VERSION.RELEASE);
        }
        stringBuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    private static int[] d() {
        return new int[]{0, 0};
    }

    public final String a(Context context, String str) {
        String str2;
        synchronized (this.h) {
            if (this.j != null) {
                str2 = this.j;
            } else {
                try {
                    this.j = com.google.android.gms.ads.internal.d.e().a(context);
                } catch (Exception e2) {
                }
                if (TextUtils.isEmpty(this.j)) {
                    com.google.android.gms.ads.internal.client.j.a();
                    if (com.google.android.gms.ads.internal.util.client.a.a()) {
                        try {
                            this.j = a(context);
                        } catch (Exception e3) {
                            this.j = c();
                        }
                    } else {
                        this.j = null;
                        f6031a.post(new hl(this, context));
                        while (this.j == null) {
                            try {
                                this.h.wait();
                            } catch (InterruptedException e4) {
                                this.j = c();
                                com.google.android.gms.ads.internal.util.client.b.e("Interrupted, use default user agent: " + this.j);
                            }
                        }
                    }
                }
                this.j += " (Mobile; " + str + ")";
                str2 = this.j;
            }
        }
        return str2;
    }

    public final JSONObject a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            throw new JSONException("Could not convert map to JSON: " + e2.getMessage());
        }
    }

    public final void a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", a(context, str));
        httpURLConnection.setUseCaches(false);
    }

    private void a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(a((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(a((Map<String, ?>) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(a((Collection<?>) obj));
            return;
        }
        if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Object obj2 : (Object[]) obj) {
            a(jSONArray2, obj2);
        }
        jSONArray.put(jSONArray2);
    }

    public static int[] c(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] d2 = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? d() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        com.google.android.gms.ads.internal.client.j.a();
        com.google.android.gms.ads.internal.client.j.a();
        return new int[]{com.google.android.gms.ads.internal.util.client.a.b(activity, d2[0]), com.google.android.gms.ads.internal.util.client.a.b(activity, d2[1])};
    }

    public static String a(Context context, au auVar, String str) {
        boolean z = false;
        if (auVar == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (auVar.b(parse)) {
                String[] strArr = au.d;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (parse.getPath().endsWith(strArr[i])) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                parse = auVar.a(parse, context);
            }
            return parse.toString();
        } catch (Exception e2) {
            return str;
        }
    }

    public static void a(Context context, String str, String str2, Bundle bundle) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        com.google.android.gms.ads.internal.d.c();
        bundle.putString("device", b());
        bundle.putString("appid", applicationContext.getPackageName());
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.apkg.f.a()));
        if (str != null) {
            bundle.putString("js", str);
        } else {
            bundle.putString("gmscore_version", Integer.toString(com.google.android.gms.common.c.g(context)));
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        com.google.android.gms.ads.internal.d.c();
        String builder = appendQueryParameter.toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(builder);
        a(context, str, arrayList);
    }
}
