package com.google.android.vending.verifier;

import com.google.android.finsky.utils.jm;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f7175a = {"classes.dex", "AndroidManifest.xml", "resources.arsc", "META-INF/MANIFEST.MF"};

    private static final <T> List<T> a(List<T> list, int i) {
        if (list.size() > i) {
            Collections.shuffle(list);
            return list.subList(0, i);
        }
        return list;
    }

    static com.google.android.vending.verifier.apkg.e[] a(File file) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        com.google.android.b.d dVar = new com.google.android.b.d(file);
        try {
            List unmodifiableList = Collections.unmodifiableList(dVar.f1418a);
            for (int i = 0; i < unmodifiableList.size(); i++) {
                com.google.android.b.c cVar = (com.google.android.b.c) unmodifiableList.get(i);
                dVar.a(cVar, true);
                String str = cVar.f1416a;
                String[] strArr = f7175a;
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        z = false;
                        break;
                    }
                    if (strArr[i2].equals(str)) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    arrayList.add(cVar);
                } else if (cVar.g != 0) {
                    arrayList2.add(cVar);
                } else {
                    arrayList3.add(cVar);
                }
            }
            List a2 = a(arrayList, 20);
            List a3 = a(arrayList2, 10);
            List a4 = a(arrayList3, 10);
            ArrayList arrayList4 = new ArrayList(a2.size() + a3.size() + a4.size());
            arrayList4.addAll(a2);
            arrayList4.addAll(a3);
            arrayList4.addAll(a4);
            com.google.android.vending.verifier.apkg.e[] eVarArr = new com.google.android.vending.verifier.apkg.e[arrayList4.size()];
            for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                com.google.android.b.c cVar2 = (com.google.android.b.c) arrayList4.get(i3);
                InputStream inputStream = null;
                try {
                    inputStream = dVar.a(cVar2, false);
                    eVarArr[i3] = new com.google.android.vending.verifier.apkg.e(cVar2.f1416a, PackageVerificationService.a(inputStream), cVar2.g);
                    jm.a((Closeable) inputStream);
                } finally {
                }
            }
            return eVarArr;
        } finally {
            jm.a(dVar);
        }
    }
}
