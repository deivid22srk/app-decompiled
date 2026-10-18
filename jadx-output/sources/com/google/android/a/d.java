package com.google.android.a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class d {
    private static HashMap<String, String> e;
    private static Object f;

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f1408a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f1409b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static String[] g = new String[0];
    private static Context h = null;

    private static void b(ContentResolver contentResolver) {
        if (e == null) {
            e = new HashMap<>();
            f = new Object();
            new e("Gservices", contentResolver).start();
        }
    }

    private static void c() {
        if (h != null) {
            h.enforceCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", "attempting to read gservices without permission");
        }
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        c();
        synchronized (d.class) {
            b(contentResolver);
            Object obj = f;
            if (!e.containsKey(str)) {
                String[] strArr = g;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (str.startsWith(strArr[i])) {
                            break;
                        }
                        i++;
                    } else {
                        Cursor query = contentResolver.query(f1408a, null, null, new String[]{str}, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    String string = query.getString(1);
                                    synchronized (d.class) {
                                        if (obj == f) {
                                            e.put(str, string);
                                        }
                                    }
                                    if (string != null) {
                                        str2 = string;
                                    }
                                    if (query != null) {
                                        query.close();
                                    }
                                }
                            } catch (Throwable th) {
                                if (query != null) {
                                    query.close();
                                }
                                throw th;
                            }
                        }
                        e.put(str, null);
                        if (query != null) {
                            query.close();
                        }
                    }
                }
            } else {
                String str3 = e.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            }
        }
        return str2;
    }

    public static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        c();
        Cursor query = contentResolver.query(f1409b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    public static void b(ContentResolver contentResolver, String... strArr) {
        c();
        Map<String, String> a2 = a(contentResolver, strArr);
        synchronized (d.class) {
            b(contentResolver);
            g = strArr;
            for (Map.Entry<String, String> entry : a2.entrySet()) {
                e.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static Object a(ContentResolver contentResolver) {
        Object obj;
        c();
        synchronized (d.class) {
            b(contentResolver);
            obj = f;
        }
        return obj;
    }

    public static int a(ContentResolver contentResolver, String str, int i) {
        String a2 = a(contentResolver, str, (String) null);
        if (a2 != null) {
            try {
                return Integer.parseInt(a2);
            } catch (NumberFormatException e2) {
                return i;
            }
        }
        return i;
    }

    public static long a(ContentResolver contentResolver, String str, long j) {
        String a2 = a(contentResolver, str, (String) null);
        if (a2 != null) {
            try {
                return Long.parseLong(a2);
            } catch (NumberFormatException e2) {
                return j;
            }
        }
        return j;
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        String a2 = a(contentResolver, str, (String) null);
        if (a2 != null && !a2.equals("")) {
            if (c.matcher(a2).matches()) {
                return true;
            }
            if (d.matcher(a2).matches()) {
                return false;
            }
            Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a2 + "\") as boolean");
            return z;
        }
        return z;
    }
}
