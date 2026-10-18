package com.google.android.finsky.utils;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.finsky.activities.DebugActivity;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Pattern;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class jm {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f5032a = Pattern.compile(",");

    /* renamed from: b, reason: collision with root package name */
    private static String[] f5033b = new String[0];
    private static long[] c = new long[0];

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalStateException("This method must be called from the UI thread.");
        }
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
        } else {
            throw new IllegalStateException("This method cannot be called from the UI thread.");
        }
    }

    @TargetApi(11)
    public static <P> void a(AsyncTask<P, ?, ?> asyncTask, P... pArr) {
        if (Build.VERSION.SDK_INT >= 11) {
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
        } else {
            asyncTask.execute(pArr);
        }
    }

    public static String a(String str, String str2) {
        return str2 + ":" + str;
    }

    @SuppressLint({"NewApi"})
    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT < 14) {
            return connectivityManager.getBackgroundDataSetting();
        }
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo != null && networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) {
                return false;
            }
        }
        return true;
    }

    public static String a(String str) {
        try {
            return URLEncoder.encode(str, Keyczar.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e) {
            FinskyLog.e("%s", e);
            throw new RuntimeException(e);
        }
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, Keyczar.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e) {
            FinskyLog.e("%s", e);
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e2) {
            FinskyLog.c("Unable to parse %s - %s", str, e2.getMessage());
            return null;
        }
    }

    public static void c(String str) {
        boolean a2 = com.google.android.play.utils.j.a();
        Uri parse = Uri.parse(str);
        if (!parse.getScheme().equals("https")) {
            if (a2 && (parse.getHost().toLowerCase().endsWith("corp.google.com") || parse.getHost().startsWith("192.168.0") || parse.getHost().startsWith("127.0.0"))) {
            } else {
                throw new RuntimeException("Insecure URL: " + str);
            }
        }
    }

    public static String a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public static String a(List<String> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        int size = list.size();
        if (size == 1) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static String[] d(String str) {
        if (str == null || str.length() == 0) {
            return f5033b;
        }
        if (str.indexOf(44) == -1) {
            return new String[]{str};
        }
        return f5032a.split(str);
    }

    public static String a(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return "";
        }
        if (jArr.length == 1) {
            return String.valueOf(jArr[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jArr.length; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(jArr[i]);
        }
        return sb.toString();
    }

    public static long[] e(String str) {
        if (str == null || str.length() == 0) {
            return c;
        }
        if (str.indexOf(44) == -1) {
            try {
                return new long[]{Long.parseLong(str)};
            } catch (NumberFormatException e) {
                FinskyLog.e("Error parsing a string as long - %s", str);
                return c;
            }
        }
        String[] split = f5032a.split(str);
        long[] jArr = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            try {
                jArr[i] = Long.parseLong(trim);
            } catch (NumberFormatException e2) {
                FinskyLog.e("Error parsing a string as long - %s", trim);
                return c;
            }
        }
        return jArr;
    }

    public static void b(Context context) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) DebugActivity.class), com.google.android.finsky.cpkg.d.f.b().booleanValue() ? 1 : 2, 1);
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(inputStream, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } finally {
            byteArrayOutputStream.close();
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                inputStream.close();
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static boolean a(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            if (charSequence == null) {
                charSequence = null;
            } else {
                int length = charSequence.length() - 1;
                int i = 0;
                while (i <= length && charSequence.charAt(i) <= ' ') {
                    i++;
                }
                int i2 = length;
                while (i2 >= i && charSequence.charAt(i2) <= ' ') {
                    i2--;
                }
                if (i != 0 || i2 != length) {
                    charSequence = charSequence.subSequence(i, i2 + 1);
                }
            }
            if (charSequence.length() != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    public static String f(String str) {
        return str + " ";
    }

    public static String a(String str, Context context) {
        return (str == null || !ic.b(context)) ? str : a(com.google.android.finsky.api.a.a(str, context));
    }

    public static String a(Account account) {
        if (account == null) {
            return null;
        }
        if ("cn.google".equals(account.type)) {
            return account.name.substring(0, account.name.indexOf("@"));
        }
        return account.name;
    }

    public static String g(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            FinskyLog.e("Can't get system properties: %s", e);
            return "";
        }
    }

    @TargetApi(21)
    public static boolean c(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return Build.VERSION.SDK_INT >= 21 ? powerManager.isInteractive() : powerManager.isScreenOn();
    }
}
