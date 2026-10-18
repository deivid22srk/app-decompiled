package android.support.v7.a;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.by;
import android.support.v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class ac extends bd implements DialogInterface {

    /* renamed from: a, reason: collision with root package name */
    public p f472a;

    ac(Context context, int i) {
        super(context, a(context, i));
        this.f472a = new p(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if (i < 16777216) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.support.v7.b.b.alertDialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // android.support.v7.a.bd, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f472a.a(charSequence);
    }

    @Override // android.support.v7.a.bd, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        int i;
        View view;
        View findViewById;
        super.onCreate(bundle);
        p pVar = this.f472a;
        pVar.f533b.a().b(1);
        if (pVar.G != 0 && pVar.L == 1) {
            i = pVar.G;
        } else {
            i = pVar.F;
        }
        pVar.f533b.setContentView(i);
        View findViewById2 = pVar.c.findViewById(android.support.v7.b.g.parentPanel);
        View findViewById3 = findViewById2.findViewById(android.support.v7.b.g.topPanel);
        View findViewById4 = findViewById2.findViewById(android.support.v7.b.g.contentPanel);
        View findViewById5 = findViewById2.findViewById(android.support.v7.b.g.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(android.support.v7.b.g.customPanel);
        if (pVar.g != null) {
            view = pVar.g;
        } else if (pVar.h != 0) {
            view = LayoutInflater.from(pVar.f532a).inflate(pVar.h, viewGroup, false);
        } else {
            view = null;
        }
        boolean z = view != null;
        if (!z || !p.a(view)) {
            pVar.c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) pVar.c.findViewById(android.support.v7.b.g.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (pVar.m) {
                frameLayout.setPadding(pVar.i, pVar.j, pVar.k, pVar.l);
            }
            if (pVar.f != null) {
                ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(android.support.v7.b.g.topPanel);
        View findViewById7 = viewGroup.findViewById(android.support.v7.b.g.contentPanel);
        View findViewById8 = viewGroup.findViewById(android.support.v7.b.g.buttonPanel);
        ViewGroup a2 = p.a(findViewById6, findViewById3);
        ViewGroup a3 = p.a(findViewById7, findViewById4);
        ViewGroup a4 = p.a(findViewById8, findViewById5);
        pVar.w = (NestedScrollView) pVar.c.findViewById(android.support.v7.b.g.scrollView);
        pVar.w.setFocusable(false);
        pVar.w.setNestedScrollingEnabled(false);
        pVar.B = (TextView) a3.findViewById(R.id.message);
        if (pVar.B != null) {
            if (pVar.e != null) {
                pVar.B.setText(pVar.e);
            } else {
                pVar.B.setVisibility(8);
                pVar.w.removeView(pVar.B);
                if (pVar.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) pVar.w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(pVar.w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(pVar.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    a3.setVisibility(8);
                }
            }
        }
        int i2 = 0;
        pVar.n = (Button) a4.findViewById(R.id.button1);
        pVar.n.setOnClickListener(pVar.N);
        if (TextUtils.isEmpty(pVar.o)) {
            pVar.n.setVisibility(8);
        } else {
            pVar.n.setText(pVar.o);
            pVar.n.setVisibility(0);
            i2 = 1;
        }
        pVar.q = (Button) a4.findViewById(R.id.button2);
        pVar.q.setOnClickListener(pVar.N);
        if (TextUtils.isEmpty(pVar.r)) {
            pVar.q.setVisibility(8);
        } else {
            pVar.q.setText(pVar.r);
            pVar.q.setVisibility(0);
            i2 |= 2;
        }
        pVar.t = (Button) a4.findViewById(R.id.button3);
        pVar.t.setOnClickListener(pVar.N);
        if (TextUtils.isEmpty(pVar.u)) {
            pVar.t.setVisibility(8);
        } else {
            pVar.t.setText(pVar.u);
            pVar.t.setVisibility(0);
            i2 |= 4;
        }
        if (!(i2 != 0)) {
            a4.setVisibility(8);
        }
        if (pVar.C != null) {
            a2.addView(pVar.C, 0, new ViewGroup.LayoutParams(-1, -2));
            pVar.c.findViewById(android.support.v7.b.g.title_template).setVisibility(8);
        } else {
            pVar.z = (ImageView) pVar.c.findViewById(R.id.icon);
            if (!TextUtils.isEmpty(pVar.d)) {
                pVar.A = (TextView) pVar.c.findViewById(android.support.v7.b.g.alertTitle);
                pVar.A.setText(pVar.d);
                if (pVar.x != 0) {
                    pVar.z.setImageResource(pVar.x);
                } else if (pVar.y != null) {
                    pVar.z.setImageDrawable(pVar.y);
                } else {
                    pVar.A.setPadding(pVar.z.getPaddingLeft(), pVar.z.getPaddingTop(), pVar.z.getPaddingRight(), pVar.z.getPaddingBottom());
                    pVar.z.setVisibility(8);
                }
            } else {
                pVar.c.findViewById(android.support.v7.b.g.title_template).setVisibility(8);
                pVar.z.setVisibility(8);
                a2.setVisibility(8);
            }
        }
        boolean z2 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z3 = (a2 == null || a2.getVisibility() == 8) ? false : true;
        boolean z4 = (a4 == null || a4.getVisibility() == 8) ? false : true;
        if (!z4 && a3 != null && (findViewById = a3.findViewById(android.support.v7.b.g.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (z3 && pVar.w != null) {
            pVar.w.setClipToPadding(true);
        }
        if (!z2) {
            ViewGroup viewGroup3 = pVar.f != null ? pVar.f : pVar.w;
            if (viewGroup3 != null) {
                int i3 = (z3 ? 1 : 0) | (z4 ? 2 : 0);
                View findViewById9 = pVar.c.findViewById(android.support.v7.b.g.scrollIndicatorUp);
                View findViewById10 = pVar.c.findViewById(android.support.v7.b.g.scrollIndicatorDown);
                if (Build.VERSION.SDK_INT >= 23) {
                    by.d((View) viewGroup3, i3);
                    if (findViewById9 != null) {
                        a3.removeView(findViewById9);
                    }
                    if (findViewById10 != null) {
                        a3.removeView(findViewById10);
                    }
                } else {
                    if (findViewById9 != null && (i3 & 1) == 0) {
                        a3.removeView(findViewById9);
                        findViewById9 = null;
                    }
                    if (findViewById10 != null && (i3 & 2) == 0) {
                        a3.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById9 != null || findViewById10 != null) {
                        if (pVar.e != null) {
                            pVar.w.setOnScrollChangeListener(new r(pVar, findViewById9, findViewById10));
                            pVar.w.post(new s(pVar, findViewById9, findViewById10));
                        } else if (pVar.f != null) {
                            pVar.f.setOnScrollListener(new t(pVar, findViewById9, findViewById10));
                            pVar.f.post(new u(pVar, findViewById9, findViewById10));
                        } else {
                            if (findViewById9 != null) {
                                a3.removeView(findViewById9);
                            }
                            if (findViewById10 != null) {
                                a3.removeView(findViewById10);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = pVar.f;
        if (listView == null || pVar.D == null) {
            return;
        }
        listView.setAdapter(pVar.D);
        int i4 = pVar.E;
        if (i4 < 0) {
            return;
        }
        listView.setItemChecked(i4, true);
        listView.setSelection(i4);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        p pVar = this.f472a;
        if (pVar.w != null && pVar.w.a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        p pVar = this.f472a;
        if (pVar.w != null && pVar.w.a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
