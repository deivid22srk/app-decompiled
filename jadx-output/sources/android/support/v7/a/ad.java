package android.support.v7.a;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final v f473a;

    /* renamed from: b, reason: collision with root package name */
    private int f474b;

    public ad(Context context) {
        this(context, ac.a(context, 0));
    }

    public ad(Context context, int i) {
        this.f473a = new v(new ContextThemeWrapper(context, ac.a(context, i)));
        this.f474b = i;
    }

    public final ad a(CharSequence charSequence) {
        this.f473a.f = charSequence;
        return this;
    }

    public final ad a(DialogInterface.OnKeyListener onKeyListener) {
        this.f473a.r = onKeyListener;
        return this;
    }

    public final ac a() {
        p pVar;
        int i;
        ListAdapter abVar;
        ac acVar = new ac(this.f473a.f543a, this.f474b);
        v vVar = this.f473a;
        pVar = acVar.f472a;
        if (vVar.g == null) {
            if (vVar.f != null) {
                pVar.a(vVar.f);
            }
            if (vVar.d != null) {
                Drawable drawable = vVar.d;
                pVar.y = drawable;
                pVar.x = 0;
                if (pVar.z != null) {
                    if (drawable != null) {
                        pVar.z.setVisibility(0);
                        pVar.z.setImageDrawable(drawable);
                    } else {
                        pVar.z.setVisibility(8);
                    }
                }
            }
            if (vVar.c != 0) {
                pVar.a(vVar.c);
            }
            if (vVar.e != 0) {
                int i2 = vVar.e;
                TypedValue typedValue = new TypedValue();
                pVar.f532a.getTheme().resolveAttribute(i2, typedValue, true);
                pVar.a(typedValue.resourceId);
            }
        } else {
            pVar.C = vVar.g;
        }
        if (vVar.h != null) {
            CharSequence charSequence = vVar.h;
            pVar.e = charSequence;
            if (pVar.B != null) {
                pVar.B.setText(charSequence);
            }
        }
        if (vVar.i != null) {
            pVar.a(-1, vVar.i, vVar.j, null);
        }
        if (vVar.k != null) {
            pVar.a(-2, vVar.k, vVar.l, null);
        }
        if (vVar.m != null) {
            pVar.a(-3, vVar.m, vVar.n, null);
        }
        if (vVar.s != null || vVar.H != null || vVar.t != null) {
            ListView listView = (ListView) vVar.f544b.inflate(pVar.H, (ViewGroup) null);
            if (vVar.D) {
                if (vVar.H == null) {
                    abVar = new w(vVar, vVar.f543a, pVar.I, vVar.s, listView);
                } else {
                    abVar = new x(vVar, vVar.f543a, vVar.H, listView, pVar);
                }
            } else {
                if (vVar.E) {
                    i = pVar.J;
                } else {
                    i = pVar.K;
                }
                if (vVar.H != null) {
                    abVar = new SimpleCursorAdapter(vVar.f543a, i, vVar.H, new String[]{vVar.I}, new int[]{R.id.text1});
                } else if (vVar.t != null) {
                    abVar = vVar.t;
                } else {
                    abVar = new ab(vVar.f543a, i, vVar.s);
                }
            }
            pVar.D = abVar;
            pVar.E = vVar.F;
            if (vVar.u != null) {
                listView.setOnItemClickListener(new y(vVar, pVar));
            } else if (vVar.G != null) {
                listView.setOnItemClickListener(new z(vVar, listView, pVar));
            }
            if (vVar.L != null) {
                listView.setOnItemSelectedListener(vVar.L);
            }
            if (vVar.E) {
                listView.setChoiceMode(1);
            } else if (vVar.D) {
                listView.setChoiceMode(2);
            }
            pVar.f = listView;
        }
        if (vVar.w != null) {
            if (vVar.B) {
                View view = vVar.w;
                int i3 = vVar.x;
                int i4 = vVar.y;
                int i5 = vVar.z;
                int i6 = vVar.A;
                pVar.g = view;
                pVar.h = 0;
                pVar.m = true;
                pVar.i = i3;
                pVar.j = i4;
                pVar.k = i5;
                pVar.l = i6;
            } else {
                pVar.g = vVar.w;
                pVar.h = 0;
                pVar.m = false;
            }
        } else if (vVar.v != 0) {
            int i7 = vVar.v;
            pVar.g = null;
            pVar.h = i7;
            pVar.m = false;
        }
        acVar.setCancelable(this.f473a.o);
        if (this.f473a.o) {
            acVar.setCanceledOnTouchOutside(true);
        }
        acVar.setOnCancelListener(this.f473a.p);
        acVar.setOnDismissListener(this.f473a.q);
        if (this.f473a.r != null) {
            acVar.setOnKeyListener(this.f473a.r);
        }
        return acVar;
    }
}
