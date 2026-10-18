package com.google.android.wallet.common.apkg;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f7258b = Pattern.compile("[\\r\\n]");
    public final Activity c;

    public k(Activity activity) {
        super("DeviceAddressSource", activity);
        this.c = activity;
    }

    @Override // com.google.android.wallet.common.apkg.m
    public final int b() {
        return com.google.android.wallet.a.a.d.b().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.wallet.common.apkg.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ArrayList<com.google.c.a.b> c() {
        int i;
        if (!com.google.android.wallet.common.util.l.a(this.c, "android.permission.READ_CONTACTS")) {
            return null;
        }
        int memoryClass = (((ActivityManager) this.c.getSystemService("activity")).getMemoryClass() / 16) * 1024 * 1024;
        int i2 = memoryClass == 0 ? 1048576 : memoryClass;
        ContentResolver contentResolver = this.c.getContentResolver();
        Cursor query = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1"}, "in_visible_group=1 AND mimetype=?", new String[]{"vnd.android.cursor.item/name"}, "contact_id");
        try {
            SparseArray sparseArray = new SparseArray(query.getCount());
            if (query.getCount() > 0) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("contact_id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("data1");
                while (query.moveToNext()) {
                    int i3 = query.getInt(columnIndexOrThrow);
                    String string = query.getString(columnIndexOrThrow2);
                    if (!TextUtils.isEmpty(string)) {
                        sparseArray.append(i3, string);
                    }
                }
            }
            query.close();
            query = contentResolver.query(ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, new String[]{"contact_id", "data4", "data7", "data6", "data8", "data9", "data10", "data5"}, "in_visible_group=1", null, null);
            try {
                ArrayList<com.google.c.a.b> arrayList = new ArrayList<>(query.getCount());
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(sparseArray.size());
                if (query.getCount() > 0) {
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow("contact_id");
                    int columnIndexOrThrow4 = query.getColumnIndexOrThrow("data4");
                    int columnIndexOrThrow5 = query.getColumnIndexOrThrow("data7");
                    int columnIndexOrThrow6 = query.getColumnIndexOrThrow("data6");
                    int columnIndexOrThrow7 = query.getColumnIndexOrThrow("data8");
                    int columnIndexOrThrow8 = query.getColumnIndexOrThrow("data9");
                    int columnIndexOrThrow9 = query.getColumnIndexOrThrow("data10");
                    int columnIndexOrThrow10 = query.getColumnIndexOrThrow("data5");
                    while (query.moveToNext()) {
                        com.google.c.a.b bVar = new com.google.c.a.b();
                        int i4 = query.getInt(columnIndexOrThrow3);
                        String a2 = a((String) sparseArray.get(i4));
                        if (!TextUtils.isEmpty(a2)) {
                            bVar.s = a2;
                        }
                        if (!query.isNull(columnIndexOrThrow4)) {
                            String[] split = f7258b.split(query.getString(columnIndexOrThrow4));
                            ArrayList arrayList2 = new ArrayList(split.length);
                            for (String str : split) {
                                String a3 = a(str);
                                if (!TextUtils.isEmpty(a3)) {
                                    arrayList2.add(a3);
                                }
                            }
                            bVar.q = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                        }
                        String a4 = a(query.getString(columnIndexOrThrow5));
                        if (!TextUtils.isEmpty(a4)) {
                            bVar.f = a4;
                        }
                        String a5 = a(query.getString(columnIndexOrThrow6));
                        if (!TextUtils.isEmpty(a5)) {
                            bVar.g = a5;
                        }
                        String a6 = a(query.getString(columnIndexOrThrow7));
                        if (!TextUtils.isEmpty(a6)) {
                            bVar.d = a6;
                        }
                        String a7 = a(query.getString(columnIndexOrThrow8));
                        if (!TextUtils.isEmpty(a7)) {
                            bVar.k = a7;
                        }
                        String a8 = a(query.getString(columnIndexOrThrow9));
                        if (!TextUtils.isEmpty(a8)) {
                            bVar.f7728a = a8;
                        }
                        String a9 = a(query.getString(columnIndexOrThrow10));
                        if (!TextUtils.isEmpty(a9)) {
                            bVar.n = a9;
                        }
                        i2 = a(i2, a(bVar));
                        arrayList.add(bVar);
                        sparseBooleanArray.put(i4, true);
                    }
                }
                query.close();
                int size = sparseArray.size();
                int i5 = 0;
                int i6 = i2;
                while (i5 < size) {
                    if (sparseBooleanArray.get(sparseArray.keyAt(i5))) {
                        i = i6;
                    } else {
                        String str2 = (String) sparseArray.valueAt(i5);
                        com.google.c.a.b bVar2 = new com.google.c.a.b();
                        bVar2.s = str2;
                        i = a(i6, a(bVar2));
                        arrayList.add(bVar2);
                    }
                    i5++;
                    i6 = i;
                }
                return arrayList;
            } finally {
            }
        } finally {
        }
    }

    public static String a(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    public static int a(com.google.c.a.b bVar) {
        return (((bVar.d() * 2) + 45) / 8) * 8;
    }

    public static int a(int i, int i2) {
        int i3 = i - i2;
        if (i3 < 0) {
            throw new OutOfMemoryError("Device data exceeds allowed storage for source");
        }
        return i3;
    }
}
