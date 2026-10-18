package com.google.android.finsky.uninstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v7.widget.dt;
import android.support.v7.widget.eq;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l extends dt<eq> implements b, q {
    o h;
    private Context i;
    private LayoutInflater j;
    ArrayList<i> c = new ArrayList<>();
    ArrayList<Boolean> d = new ArrayList<>();
    ArrayList<Boolean> e = new ArrayList<>();
    int g = 0;
    Comparator<i> f = g(this.g);

    public l(Context context) {
        this.i = context;
        this.j = LayoutInflater.from(this.i);
    }

    final void a(int i, boolean z) {
        this.d.set(i, Boolean.valueOf(z));
        if (this.h != null) {
            if (this.c.get(i).c != -1) {
                this.h.a(z, this.c.get(i).c);
            } else {
                this.h.a(z, 0L);
            }
        }
    }

    private boolean h(int i) {
        return this.d.get(i).booleanValue();
    }

    public final boolean c() {
        return this.d.contains(Boolean.TRUE);
    }

    @Override // android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        switch (i) {
            case R.layout.uninstall_manager_row /* 2130969173 */:
                a aVar = new a(this.j.inflate(R.layout.uninstall_manager_row, viewGroup, false), this.i);
                aVar.l = this;
                return aVar;
            case R.layout.uninstall_manager_selector /* 2130969174 */:
                p pVar = new p(this.j.inflate(R.layout.uninstall_manager_selector, viewGroup, false), this.i);
                pVar.m = this;
                return pVar;
            default:
                FinskyLog.e("Uninstall Manager unknown ViewHolder type requested", new Object[0]);
                return null;
        }
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        return this.c.size() + 1;
    }

    @Override // android.support.v7.widget.dt
    public final int a(int i) {
        return i == 0 ? R.layout.uninstall_manager_selector : R.layout.uninstall_manager_row;
    }

    @Override // com.google.android.finsky.uninstall.b
    public final void e_(int i) {
        if (i != -1) {
            int i2 = i - 1;
            a(i2, !h(i2));
            c(i);
        }
    }

    @Override // com.google.android.finsky.uninstall.q
    public final void f(int i) {
        this.g = i;
        this.f = g(i);
        a(new ArrayList(this.c));
    }

    static Comparator<i> g(int i) {
        switch (i) {
            case 0:
                return new n((byte) 0);
            default:
                return new m((byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(List<i> list) {
        long j;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (int i = 0; i < this.c.size(); i++) {
            String str = this.c.get(i).f4699a;
            hashMap.put(str, this.c.get(i));
            hashMap2.put(str, this.d.get(i));
            hashMap3.put(str, this.e.get(i));
        }
        this.e.clear();
        this.d.clear();
        this.c.clear();
        if (list != null) {
            this.c.addAll(list);
        }
        Collections.sort(this.c, this.f);
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            String str2 = this.c.get(i2).f4699a;
            if (hashMap.containsKey(str2)) {
                this.d.add(i2, hashMap2.get(str2));
                this.e.add(i2, hashMap3.get(str2));
                hashMap2.remove(str2);
            } else {
                this.d.add(i2, Boolean.FALSE);
                this.e.add(i2, Boolean.FALSE);
            }
        }
        if (this.h != null) {
            long j2 = 0;
            Iterator it = hashMap2.entrySet().iterator();
            while (true) {
                j = j2;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                j2 = entry.getValue() == Boolean.TRUE ? ((i) hashMap.get((String) entry.getKey())).c + j : j;
            }
            this.h.a(false, j);
        }
        this.f774a.a();
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        switch (eqVar.e) {
            case R.id.uninstall_row /* 2131887268 */:
                int i2 = i - 1;
                i iVar = this.c.get(i2);
                a aVar = (a) eqVar;
                boolean h = h(i2);
                boolean booleanValue = this.e.get(i2).booleanValue();
                aVar.o.setText(iVar.f4700b);
                if (iVar.c == -1) {
                    aVar.p.setText(aVar.m.getResources().getString(R.string.uninstall_manager_size_error));
                } else {
                    aVar.p.setText(Formatter.formatFileSize(aVar.m, iVar.c));
                }
                aVar.r.setChecked(h);
                try {
                    aVar.n.setImageDrawable(aVar.m.getPackageManager().getApplicationIcon(iVar.f4699a));
                } catch (PackageManager.NameNotFoundException e) {
                    FinskyLog.e("%s not found in PackageManager", iVar.f4699a);
                    aVar.n.a();
                }
                if (booleanValue) {
                    aVar.r.setVisibility(8);
                    aVar.q.setVisibility(0);
                    aVar.r.setEnabled(false);
                    break;
                } else {
                    aVar.q.setVisibility(8);
                    aVar.r.setVisibility(0);
                    aVar.r.setEnabled(true);
                    break;
                }
            case R.id.uninstall_selector /* 2131887274 */:
                p pVar = (p) eqVar;
                int i3 = this.g;
                if (i3 >= 0 && i3 < 2) {
                    pVar.l.setSelection(i3);
                    break;
                } else {
                    FinskyLog.e("Tried to set Uninstall Wizard spinner to an invalid selection", new Object[0]);
                    break;
                }
                break;
            default:
                FinskyLog.e("Uninstall Manager binding ViewHolder of unknown type", new Object[0]);
                break;
        }
    }
}
