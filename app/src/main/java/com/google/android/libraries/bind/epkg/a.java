package com.google.android.libraries.bind.epkg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.cpkg.b;
import com.google.android.libraries.bind.data.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6711a = b.a(a.class);

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<View, View> f6712b = null;
    public final LayoutInflater c;
    public final Map<Integer, List<View>> d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    public final View a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        com.google.android.libraries.bind.dpkg.a.a(true);
        this.h = false;
        Integer num = view == null ? null : (Integer) view.getTag();
        b bVar = f6711a;
        Object[] objArr = new Object[1];
        objArr[0] = num == null ? "null" : a(num.intValue());
        bVar.b("convertViewResId: %s", objArr);
        if (num != null) {
            if (view instanceof ViewGroup) {
                f6711a.b("recycling children", new Object[0]);
                a((ViewGroup) view);
            }
            if (i == num.intValue()) {
                a(i, false);
                view.setLayoutParams(layoutParams);
                if (f6712b != null) {
                    com.google.android.libraries.bind.dpkg.a.a(f6712b.containsKey(view));
                    return view;
                }
                return view;
            }
        }
        List<View> list = this.d.get(Integer.valueOf(i));
        View remove = (list == null || list.size() <= 0) ? null : list.remove(list.size() - 1);
        if (remove == null) {
            try {
                remove = this.c.inflate(i, (ViewGroup) null, false);
                remove.setTag(Integer.valueOf(i));
                this.f++;
                f6711a.d("Inflating view of type %s, efficiency: %d %%", a(i), Integer.valueOf(a()));
            } catch (RuntimeException e) {
                f6711a.c("Failed to inflate view resource: %s", com.google.android.libraries.bind.dpkg.a.a(i));
                throw e;
            }
        } else {
            a(i, true);
        }
        remove.setLayoutParams(layoutParams);
        if (f6712b != null) {
            com.google.android.libraries.bind.dpkg.a.a(f6712b.put(remove, remove) == null);
        }
        return remove;
    }

    public void a(int i, boolean z) {
        this.e++;
        if (!z) {
            this.g++;
        }
        f6711a.a("Reusing view of type %s, efficiency: %d %%", a(i), Integer.valueOf(a()));
    }

    public int a() {
        return (this.e * 100) / (this.e + this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if ((childAt instanceof d) && !((d) childAt).c()) {
                viewGroup.removeViewAt(childCount);
                if (((Integer) childAt.getTag()) != null) {
                    if ((childAt instanceof d) && !((d) childAt).c()) {
                        ((d) childAt).a();
                    }
                    if (childAt instanceof ViewGroup) {
                        a((ViewGroup) childAt);
                    }
                    if (!(childAt instanceof d) || ((d) childAt).c()) {
                        childAt.measure(0, 0);
                    }
                    com.google.android.libraries.bind.dpkg.a.a(childAt.getParent() == null);
                    Integer num = (Integer) childAt.getTag();
                    if (this.h) {
                        f6711a.b("The heap is temporarily disabled after being cleared, not recycling view of type %s", a(num.intValue()));
                    } else {
                        List<View> list = this.d.get(num);
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        list.add(childAt);
                        f6711a.b("Recycled view of type %s, got %d in heap", a(num.intValue()), Integer.valueOf(list.size()));
                        this.d.put(num, list);
                        if (f6712b != null) {
                            com.google.android.libraries.bind.dpkg.a.a(f6712b.remove(childAt) != null, "Recycling a view we didn't create: " + childAt);
                        }
                        this.g++;
                    }
                }
            } else if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            }
        }
    }

    public static String a(int i) {
        return f6711a.a() ? com.google.android.libraries.bind.dpkg.a.a(i) : Integer.toString(i);
    }
}
