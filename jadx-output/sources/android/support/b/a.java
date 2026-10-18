package android.support.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f55a = "code_cache" + File.separator + "secondary-dexes";

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f56b = new HashSet();
    private static final boolean c = a(System.getProperty("java.vm.version"));

    public static void a(Context context) {
        Log.i("MultiDex", "install");
        if (c) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        if (Build.VERSION.SDK_INT < 4) {
            throw new RuntimeException("Multi dex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4.");
        }
        try {
            ApplicationInfo b2 = b(context);
            if (b2 != null) {
                synchronized (f56b) {
                    String str = b2.sourceDir;
                    if (!f56b.contains(str)) {
                        f56b.add(str);
                        if (Build.VERSION.SDK_INT > 20) {
                            Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                        }
                        try {
                            ClassLoader classLoader = context.getClassLoader();
                            if (classLoader == null) {
                                Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                                return;
                            }
                            try {
                                c(context);
                            } catch (Throwable th) {
                                Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                            }
                            File file = new File(b2.dataDir, f55a);
                            List<File> a2 = c.a(context, b2, file, false);
                            if (a(a2)) {
                                a(classLoader, file, a2);
                            } else {
                                Log.w("MultiDex", "Files were not valid zip files.  Forcing a reload.");
                                List<File> a3 = c.a(context, b2, file, true);
                                if (a(a3)) {
                                    a(classLoader, file, a3);
                                } else {
                                    throw new RuntimeException("Zip files were not valid.");
                                }
                            }
                            Log.i("MultiDex", "install done");
                        } catch (RuntimeException e) {
                            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Log.e("MultiDex", "Multidex installation failure", e2);
            throw new RuntimeException("Multi dex installation failed (" + e2.getMessage() + ").");
        }
    }

    private static ApplicationInfo b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageManager == null || packageName == null) {
                return null;
            }
            return packageManager.getApplicationInfo(packageName, 128);
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    private static boolean a(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException e) {
                }
            }
        }
        Log.i("MultiDex", "VM with version " + str + (z ? " has multidex support" : " does not have multidex support"));
        return z;
    }

    private static void a(ClassLoader classLoader, File file, List<File> list) {
        IOException[] iOExceptionArr;
        if (!list.isEmpty()) {
            if (Build.VERSION.SDK_INT < 19) {
                if (Build.VERSION.SDK_INT >= 14) {
                    Object obj = b(classLoader, "pathList").get(classLoader);
                    a(obj, "dexElements", (Object[]) a(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class}).invoke(obj, new ArrayList(list), file));
                    return;
                }
                b.a(classLoader, list);
                return;
            }
            Object obj2 = b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            a(obj2, "dexElements", (Object[]) a(obj2, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj2, new ArrayList(list), file, arrayList));
            if (arrayList.size() <= 0) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
            }
            Field b2 = b(classLoader, "dexElementsSuppressedExceptions");
            IOException[] iOExceptionArr2 = (IOException[]) b2.get(classLoader);
            if (iOExceptionArr2 == null) {
                iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
            } else {
                IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                arrayList.toArray(iOExceptionArr3);
                System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                iOExceptionArr = iOExceptionArr3;
            }
            b2.set(classLoader, iOExceptionArr);
        }
    }

    private static boolean a(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            if (!c.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field b(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException e) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    private static Method a(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException e) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    private static void c(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!file2.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
            }
        }
    }

    static /* synthetic */ void a(Object obj, String str, Object[] objArr) {
        Field b2 = b(obj, str);
        Object[] objArr2 = (Object[]) b2.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        b2.set(obj, objArr3);
    }
}
