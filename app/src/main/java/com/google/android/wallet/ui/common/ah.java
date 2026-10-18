package com.google.android.wallet.ui.common;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.protobuf.nano.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ah<T extends com.google.protobuf.nano.c> extends d implements com.google.android.wallet.analytics.e, ag, y {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.wallet.analytics.e f7480a;
    public com.google.android.wallet.b.e aA;
    public T aw;
    public ArrayList<T> ax;
    public com.google.android.wallet.b.a az;
    public boolean av = true;
    public int ay = -1;

    public abstract void u();

    public abstract <S, F extends ai<S>> List<F> w();

    public static <T extends com.google.protobuf.nano.c, F extends ah<T>> Bundle a(int i, T t) {
        Bundle c = c(i);
        c.putParcelable("formProto", ParcelableProto.a(t));
        return c;
    }

    @Override // com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.av = bundle.getBoolean("uiEnabled", true);
        }
        Bundle bundle2 = this.r;
        if (bundle2.containsKey("formProto")) {
            this.aw = (T) ParcelableProto.a(bundle2, "formProto");
            return;
        }
        if (bundle2.containsKey("formProtos")) {
            this.ax = ParcelableProto.b(bundle2, "formProtos");
            if (bundle != null) {
                this.ay = bundle.getInt("currentFormIndex", -1);
                return;
            } else {
                this.ay = bundle2.getInt("initialFormProtoIndex");
                return;
            }
        }
        throw new IllegalArgumentException("FormFragment cannot be created without required form proto");
    }

    @Override // com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("uiEnabled", this.av);
        if (this.ax != null && this.ay >= 0) {
            bundle.putInt("currentFormIndex", this.ay);
        }
    }

    @Override // com.google.android.wallet.analytics.e
    public com.google.android.wallet.analytics.e getParentUiNode() {
        if (this.f7480a != null) {
            return this.f7480a;
        }
        if (this.E != null) {
            return (com.google.android.wallet.analytics.e) this.E;
        }
        return (com.google.android.wallet.analytics.e) f();
    }

    @Override // com.google.android.wallet.analytics.e
    public void setParentUiNode(com.google.android.wallet.analytics.e eVar) {
        this.f7480a = eVar;
    }

    public boolean a(String str, int i) {
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public void o() {
        super.o();
        a(4, Bundle.EMPTY);
    }

    @Override // com.google.android.wallet.ui.common.y
    public final void b(boolean z) {
        this.av = z;
        u();
    }

    public boolean z() {
        return false;
    }

    public void A() {
    }

    public String B() {
        return null;
    }

    public boolean b(int[] iArr) {
        return a(iArr, true);
    }

    @Override // com.google.android.wallet.ui.common.ak
    public final boolean c(int[] iArr) {
        return a(iArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean a(int[] iArr, boolean z) {
        boolean z2;
        if (iArr != null && iArr.length == 0) {
            return true;
        }
        List<F> w = w();
        int size = w.size();
        int i = 0;
        boolean z3 = true;
        while (i < size) {
            ai aiVar = (ai) w.get(i);
            if (aiVar.f7482b instanceof ak) {
                ak akVar = (ak) aiVar.f7482b;
                int[] iArr2 = a(aiVar.f7481a, iArr) ? null : iArr;
                if (z) {
                    z2 = akVar.b(iArr2) && z3;
                } else {
                    if (!akVar.c(iArr2)) {
                        return false;
                    }
                    z2 = z3;
                }
            } else {
                if (a(aiVar.f7481a, iArr)) {
                    if (aiVar.f7482b instanceof t) {
                        t tVar = (t) aiVar.f7482b;
                        if (z) {
                            z2 = tVar.af_() && z3;
                        } else {
                            if (!tVar.ag_()) {
                                return false;
                            }
                            z2 = z3;
                        }
                    } else if (aiVar.f7482b instanceof View) {
                        if (z) {
                            z2 = bj.e((View) aiVar.f7482b, true) && z3;
                        } else if (!bj.e((View) aiVar.f7482b, false)) {
                            return false;
                        }
                    } else {
                        String valueOf = String.valueOf(aiVar.f7482b.getClass().getName());
                        throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected field type: ".concat(valueOf) : new String("Unexpected field type: "));
                    }
                }
                z2 = z3;
            }
            i++;
            z3 = z2;
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.wallet.ui.common.ak
    public final boolean d(int[] iArr) {
        if (iArr != null && iArr.length == 0) {
            return false;
        }
        List<F> w = w();
        int size = w.size();
        for (int i = 0; i < size; i++) {
            ai aiVar = (ai) w.get(i);
            T t = aiVar.f7482b;
            if (t instanceof ak) {
                if (((ak) t).d(iArr)) {
                    return true;
                }
            } else if (!a(aiVar.f7481a, iArr)) {
                continue;
            } else if (t instanceof t) {
                if (!TextUtils.isEmpty(((t) t).getError())) {
                    return true;
                }
            } else if (t instanceof View) {
                if (!TextUtils.isEmpty(bj.d((View) t))) {
                    return true;
                }
            } else {
                String valueOf = String.valueOf(t.getClass().getName());
                throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected field type: ".concat(valueOf) : new String("Unexpected field type: "));
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.wallet.ui.common.y
    public final boolean c() {
        List<F> w = w();
        int size = w.size();
        for (int i = 0; i < size; i++) {
            T t = ((ai) w.get(i)).f7482b;
            if (t instanceof y) {
                if (((y) t).c()) {
                    return true;
                }
            } else if (t instanceof t) {
                if (!TextUtils.isEmpty(((t) t).getError())) {
                    if (t instanceof View) {
                        bj.b((View) t);
                    } else {
                        if (!(t instanceof aq)) {
                            String valueOf = String.valueOf(t.getClass().getName());
                            throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected field type: ".concat(valueOf) : new String("Unexpected field type: "));
                        }
                        bj.b(((aq) t).f7487a);
                    }
                    return true;
                }
            } else if (t instanceof View) {
                if (!TextUtils.isEmpty(bj.d((View) t))) {
                    bj.b((View) t);
                    return true;
                }
            } else {
                String valueOf2 = String.valueOf(t.getClass().getName());
                throw new IllegalStateException(valueOf2.length() != 0 ? "Unexpected field type: ".concat(valueOf2) : new String("Unexpected field type: "));
            }
        }
        return false;
    }

    private static boolean a(int i, int[] iArr) {
        return iArr == null || (i > 100 && com.google.android.wallet.common.util.b.a(iArr, i));
    }

    public void a(int i, Bundle bundle) {
        if (this.E != null) {
            ((ag) this.E).a(i, bundle);
        } else {
            ((ag) f()).a(i, bundle);
        }
    }
}
