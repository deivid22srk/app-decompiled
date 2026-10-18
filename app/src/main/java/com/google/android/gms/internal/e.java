package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class e {
    private static int a(String str, i[] iVarArr) {
        int i = 14;
        for (i iVar : iVarArr) {
            if (i != 14) {
                if (iVar.f6044a != i) {
                    throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + str + " contains items of type " + i + " and " + iVar.f6044a);
                }
            } else if (iVar.f6044a == 9 || iVar.f6044a == 2 || iVar.f6044a == 6) {
                i = iVar.f6044a;
            } else if (iVar.f6044a != 14) {
                throw new IllegalArgumentException("Unexpected TypedValue type: " + iVar.f6044a + " for key " + str);
            }
        }
        return i;
    }

    public static com.google.android.gms.wearable.o a(f fVar) {
        com.google.android.gms.wearable.o oVar = new com.google.android.gms.wearable.o();
        for (h hVar : fVar.f5970a.f5997a) {
            a(fVar.f5971b, oVar, hVar.f6014a, hVar.f6015b);
        }
        return oVar;
    }

    private static ArrayList a(List<Asset> list, j jVar, int i) {
        ArrayList arrayList = new ArrayList(jVar.j.length);
        for (i iVar : jVar.j) {
            if (iVar.f6044a == 14) {
                arrayList.add(null);
            } else if (i == 9) {
                com.google.android.gms.wearable.o oVar = new com.google.android.gms.wearable.o();
                h[] hVarArr = iVar.f6045b.i;
                for (h hVar : hVarArr) {
                    a(list, oVar, hVar.f6014a, hVar.f6015b);
                }
                arrayList.add(oVar);
            } else if (i == 2) {
                arrayList.add(iVar.f6045b.f6079b);
            } else {
                if (i != 6) {
                    throw new IllegalArgumentException("Unexpected typeOfArrayList: " + i);
                }
                arrayList.add(Integer.valueOf(iVar.f6045b.f));
            }
        }
        return arrayList;
    }

    private static void a(List<Asset> list, com.google.android.gms.wearable.o oVar, String str, i iVar) {
        int i = iVar.f6044a;
        if (i == 14) {
            oVar.a(str, (String) null);
            return;
        }
        j jVar = iVar.f6045b;
        if (i == 1) {
            oVar.a(str, jVar.f6078a);
            return;
        }
        if (i == 11) {
            oVar.a(str, jVar.k);
            return;
        }
        if (i == 12) {
            oVar.a(str, jVar.l);
            return;
        }
        if (i == 15) {
            oVar.a(str, jVar.m);
            return;
        }
        if (i == 2) {
            oVar.a(str, jVar.f6079b);
            return;
        }
        if (i == 3) {
            oVar.a(str, jVar.c);
            return;
        }
        if (i == 4) {
            oVar.a(str, jVar.d);
            return;
        }
        if (i == 5) {
            oVar.a(str, jVar.e);
            return;
        }
        if (i == 6) {
            oVar.a(str, jVar.f);
            return;
        }
        if (i == 7) {
            oVar.a(str, (byte) jVar.g);
            return;
        }
        if (i == 8) {
            oVar.a(str, jVar.h);
            return;
        }
        if (i == 13) {
            if (list == null) {
                throw new RuntimeException("populateBundle: unexpected type for: " + str);
            }
            oVar.a(str, list.get((int) jVar.n));
            return;
        }
        if (i == 9) {
            com.google.android.gms.wearable.o oVar2 = new com.google.android.gms.wearable.o();
            for (h hVar : jVar.i) {
                a(list, oVar2, hVar.f6014a, hVar.f6015b);
            }
            oVar.a(str, oVar2);
            return;
        }
        if (i != 10) {
            throw new RuntimeException("populateBundle: unexpected type " + i);
        }
        int a2 = a(str, jVar.j);
        ArrayList<Integer> a3 = a(list, jVar, a2);
        if (a2 == 14) {
            oVar.c(str, a3);
            return;
        }
        if (a2 == 9) {
            oVar.a(str, (ArrayList<com.google.android.gms.wearable.o>) a3);
        } else if (a2 == 2) {
            oVar.c(str, a3);
        } else {
            if (a2 != 6) {
                throw new IllegalStateException("Unexpected typeOfArrayList: " + a2);
            }
            oVar.b(str, a3);
        }
    }

    public static h[] a(com.google.android.gms.wearable.o oVar, List<Asset> list) {
        TreeSet treeSet = new TreeSet(oVar.f6633a.keySet());
        h[] hVarArr = new h[treeSet.size()];
        int i = 0;
        Iterator it = treeSet.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return hVarArr;
            }
            String str = (String) it.next();
            Object b2 = oVar.b(str);
            hVarArr[i2] = new h();
            hVarArr[i2].f6014a = str;
            hVarArr[i2].f6015b = a(list, b2);
            i = i2 + 1;
        }
    }

    private static i a(List<Asset> list, Object obj) {
        int i;
        int i2 = 0;
        i iVar = new i();
        if (obj == null) {
            iVar.f6044a = 14;
            return iVar;
        }
        iVar.f6045b = new j();
        if (obj instanceof String) {
            iVar.f6044a = 2;
            iVar.f6045b.f6079b = (String) obj;
        } else if (obj instanceof Integer) {
            iVar.f6044a = 6;
            iVar.f6045b.f = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            iVar.f6044a = 5;
            iVar.f6045b.e = ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            iVar.f6044a = 3;
            iVar.f6045b.c = ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            iVar.f6044a = 4;
            iVar.f6045b.d = ((Float) obj).floatValue();
        } else if (obj instanceof Boolean) {
            iVar.f6044a = 8;
            iVar.f6045b.h = ((Boolean) obj).booleanValue();
        } else if (obj instanceof Byte) {
            iVar.f6044a = 7;
            iVar.f6045b.g = ((Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            iVar.f6044a = 1;
            iVar.f6045b.f6078a = (byte[]) obj;
        } else if (obj instanceof String[]) {
            iVar.f6044a = 11;
            iVar.f6045b.k = (String[]) obj;
        } else if (obj instanceof long[]) {
            iVar.f6044a = 12;
            iVar.f6045b.l = (long[]) obj;
        } else if (obj instanceof float[]) {
            iVar.f6044a = 15;
            iVar.f6045b.m = (float[]) obj;
        } else if (obj instanceof Asset) {
            iVar.f6044a = 13;
            j jVar = iVar.f6045b;
            list.add((Asset) obj);
            jVar.n = list.size() - 1;
        } else if (obj instanceof com.google.android.gms.wearable.o) {
            iVar.f6044a = 9;
            com.google.android.gms.wearable.o oVar = (com.google.android.gms.wearable.o) obj;
            TreeSet treeSet = new TreeSet(oVar.f6633a.keySet());
            h[] hVarArr = new h[treeSet.size()];
            Iterator it = treeSet.iterator();
            while (true) {
                int i3 = i2;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                hVarArr[i3] = new h();
                hVarArr[i3].f6014a = str;
                hVarArr[i3].f6015b = a(list, oVar.b(str));
                i2 = i3 + 1;
            }
            iVar.f6045b.i = hVarArr;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new RuntimeException("newFieldValueFromValue: unexpected value " + obj.getClass().getSimpleName());
            }
            iVar.f6044a = 10;
            ArrayList arrayList = (ArrayList) obj;
            i[] iVarArr = new i[arrayList.size()];
            Object obj2 = null;
            int size = arrayList.size();
            int i4 = 0;
            int i5 = 14;
            while (i4 < size) {
                Object obj3 = arrayList.get(i4);
                i a2 = a(list, obj3);
                if (a2.f6044a != 14 && a2.f6044a != 2 && a2.f6044a != 6 && a2.f6044a != 9) {
                    throw new IllegalArgumentException("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a " + obj3.getClass());
                }
                if (i5 == 14 && a2.f6044a != 14) {
                    i = a2.f6044a;
                } else {
                    if (a2.f6044a != i5) {
                        throw new IllegalArgumentException("ArrayList elements must all be of the sameclass, but this one contains a " + obj2.getClass() + " and a " + obj3.getClass());
                    }
                    obj3 = obj2;
                    i = i5;
                }
                iVarArr[i4] = a2;
                i4++;
                i5 = i;
                obj2 = obj3;
            }
            iVar.f6045b.j = iVarArr;
        }
        return iVar;
    }
}
