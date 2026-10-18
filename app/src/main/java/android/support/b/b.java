package android.support.b;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
final class b {
    static void a(ClassLoader classLoader, List<File> list) {
        Field b2;
        int size = list.size();
        b2 = a.b(classLoader, "path");
        StringBuilder sb = new StringBuilder((String) b2.get(classLoader));
        String[] strArr = new String[size];
        File[] fileArr = new File[size];
        ZipFile[] zipFileArr = new ZipFile[size];
        DexFile[] dexFileArr = new DexFile[size];
        ListIterator<File> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            File next = listIterator.next();
            String absolutePath = next.getAbsolutePath();
            sb.append(':').append(absolutePath);
            int previousIndex = listIterator.previousIndex();
            strArr[previousIndex] = absolutePath;
            fileArr[previousIndex] = next;
            zipFileArr[previousIndex] = new ZipFile(next);
            dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
        }
        b2.set(classLoader, sb.toString());
        a.a(classLoader, "mPaths", strArr);
        a.a(classLoader, "mFiles", fileArr);
        a.a(classLoader, "mZips", zipFileArr);
        a.a(classLoader, "mDexs", dexFileArr);
    }
}
