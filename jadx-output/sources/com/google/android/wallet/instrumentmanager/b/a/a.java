package com.google.android.wallet.instrumentmanager.b.a;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.ui.card.h;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.y;
import com.google.b.a.a.a.b.a.a.b.a.d;
import com.google.b.a.a.a.b.a.a.b.a.e;
import com.google.b.a.a.a.b.a.a.b.a.f;
import com.google.b.a.a.a.b.a.a.b.a.g;
import com.google.b.a.a.a.b.a.a.b.a.m;
import com.google.b.a.a.a.b.a.a.b.a.n;
import com.google.b.a.a.a.b.a.a.b.a.o;
import com.google.b.a.a.a.b.a.a.b.a.u;
import com.google.b.a.a.a.b.a.a.b.a.v;
import com.google.b.a.a.a.b.a.a.b.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {
    public static ah a(com.google.b.a.a.a.b.a.a.b.b bVar, int i) {
        if (bVar.f7600a != null) {
            return com.google.android.wallet.instrumentmanager.ui.b.a.a(bVar.f7600a, i);
        }
        if (bVar.e != null) {
            return com.google.android.wallet.instrumentmanager.ui.a.a.a(bVar.e, i);
        }
        if (bVar.c != null) {
            return com.google.android.wallet.instrumentmanager.ui.f.a.a(bVar.c, i);
        }
        if (bVar.f7601b != null) {
            return com.google.android.wallet.instrumentmanager.ui.d.a.a(bVar.f7601b, i);
        }
        if (bVar.d != null) {
            return com.google.android.wallet.instrumentmanager.ui.e.a.a(bVar.d, i);
        }
        if (bVar.f != null) {
            if (bVar.f.f == 1) {
                return com.google.android.wallet.instrumentmanager.ui.redirect.b.a(bVar.f, i);
            }
            throw new IllegalArgumentException(new StringBuilder(51).append("Unsupported redirect form display type: ").append(bVar.f.f).toString());
        }
        throw new IllegalArgumentException("Instrument form did not contain a recognized subform.");
    }

    public static c a(y yVar, Bundle bundle) {
        c cVar = new c();
        if (yVar instanceof com.google.android.wallet.instrumentmanager.ui.b.a) {
            com.google.android.wallet.instrumentmanager.ui.b.a aVar = (com.google.android.wallet.instrumentmanager.ui.b.a) yVar;
            String cardNumber = aVar.i.getCardNumber();
            String a2 = i.a(aVar.al.getText().toString());
            String substring = cardNumber.substring(Math.max(0, cardNumber.length() - 4));
            m cardType = aVar.i.getCardType();
            o oVar = new o();
            oVar.f7585a = ((n) aVar.aw).f7583a;
            oVar.e = aVar.ak.getExpMonth();
            oVar.f = aVar.ak.getExpYear();
            if (cardType != null) {
                oVar.j = cardType.d;
            }
            oVar.h = substring;
            oVar.c = cardNumber;
            oVar.d = a2;
            oVar.g = aVar.as.L();
            if (aVar.c != null) {
                oVar.k = aVar.c.c;
            }
            cVar.f7602a = oVar;
        } else if (yVar instanceof com.google.android.wallet.instrumentmanager.ui.a.a) {
            com.google.android.wallet.instrumentmanager.ui.a.a aVar2 = (com.google.android.wallet.instrumentmanager.ui.a.a) yVar;
            e eVar = new e();
            eVar.f7567a = ((d) aVar2.aw).f7565a.f7628a;
            eVar.f7568b = ((d) aVar2.aw).f7565a.c;
            eVar.c = aVar2.d.getCardNumber();
            com.google.b.a.a.a.b.a.a.b.a.i panCategory = aVar2.d.getPanCategory();
            if (panCategory != null) {
                eVar.f = panCategory.f7576b;
                int length = panCategory.h.length;
                eVar.d = new g[length];
                for (int i = 0; i < length; i++) {
                    int i2 = panCategory.h[i];
                    f fVar = ((d) aVar2.aw).c[i2];
                    g gVar = new g();
                    gVar.f7571a = fVar.f7569a.f7628a;
                    gVar.f7572b = fVar.f7569a.c;
                    ArrayList<h> arrayList = ((com.google.android.wallet.ui.card.a) aVar2).f7416a.get(i2);
                    int length2 = fVar.c.length;
                    gVar.c = new com.google.b.a.a.a.b.a.a.b.a.c[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        h hVar = arrayList.get(i3);
                        com.google.b.a.a.a.b.a.a.b.a.c cVar2 = new com.google.b.a.a.a.b.a.a.b.a.c();
                        switch (hVar.f7426a) {
                            case 1:
                                cVar2.f7563a = bj.a(aVar2.aj.get(hVar.f7427b), fVar.c[i3].f7561a);
                                break;
                            case 2:
                                cVar2.c = aVar2.al.get(hVar.f7427b).c(bundle);
                                break;
                            case 3:
                            default:
                                throw new IllegalStateException(new StringBuilder(45).append("Unknown field type ").append(hVar.f7426a).append(" in SimpleForm.").toString());
                            case 4:
                                cVar2.f7564b = aVar2.ak.get(hVar.f7427b).L();
                                break;
                        }
                        gVar.c[i3] = cVar2;
                    }
                    if (fVar.f != null) {
                        gVar.d = fVar.f.c;
                    }
                    eVar.d[i] = gVar;
                }
            }
            cVar.e = eVar;
        } else if (yVar instanceof com.google.android.wallet.instrumentmanager.ui.f.a) {
            cVar.c = ((com.google.android.wallet.instrumentmanager.ui.f.a) yVar).x();
        } else if (yVar instanceof com.google.android.wallet.instrumentmanager.ui.d.a) {
            com.google.android.wallet.instrumentmanager.ui.d.a aVar3 = (com.google.android.wallet.instrumentmanager.ui.d.a) yVar;
            v vVar = new v();
            if (((u) aVar3.aw).c != null) {
                vVar.f7595a = ((u) aVar3.aw).c.c;
            }
            cVar.f7603b = vVar;
        } else if (yVar instanceof com.google.android.wallet.ui.b.a) {
            cVar.d = ((com.google.android.wallet.ui.b.a) yVar).c(bundle);
        } else if (yVar instanceof com.google.android.wallet.instrumentmanager.ui.redirect.b) {
            cVar.f = ((com.google.android.wallet.instrumentmanager.ui.redirect.b) yVar).x();
        } else if (yVar instanceof com.google.android.wallet.instrumentmanager.ui.redirect.a) {
            cVar.f = ((com.google.android.wallet.instrumentmanager.ui.redirect.a) yVar).f7347a;
        } else {
            String valueOf = String.valueOf(yVar);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 55).append("The provided form ").append(valueOf).append(" is not a recognized instrument form.").toString());
        }
        return cVar;
    }

    public static boolean a(com.google.b.a.a.a.b.a.a.b.b bVar) {
        return (bVar == null || bVar.f == null) ? false : true;
    }

    public static void a(Activity activity, boolean z) {
        Window window;
        if (Build.VERSION.SDK_INT >= 11 && "user".equals(Build.TYPE) && (window = activity.getWindow()) != null) {
            if (z) {
                window.clearFlags(8192);
            } else {
                window.addFlags(8192);
            }
        }
    }

    public static void a(com.google.b.a.a.a.b.a.a.b.b bVar, com.google.android.wallet.common.pub.g[] gVarArr, com.google.d.b.a.a.d[] dVarArr) {
        if (gVarArr.length != dVarArr.length) {
            throw new IllegalArgumentException(String.format("Lengths of SecurePaymentsData (%d) and SecureDataMapping (%d) do not match", Integer.valueOf(gVarArr.length), Integer.valueOf(dVarArr.length)));
        }
        ArrayList arrayList = new ArrayList(gVarArr.length);
        for (com.google.android.wallet.common.pub.g gVar : gVarArr) {
            int length = dVarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    com.google.d.b.a.a.d dVar = dVarArr[i];
                    if (gVar.f7291a != dVar.f7741a) {
                        i++;
                    } else {
                        arrayList.add(new b(dVar.f7742b, gVar.f7292b));
                        break;
                    }
                }
            }
        }
        if (arrayList.size() == gVarArr.length) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar2 = (b) arrayList.get(i2);
                if (bVar.f != null && bVar2.f7320a.f7650a.equals(bVar.f.f7614a.f7628a)) {
                    switch (bVar2.f7320a.f7651b) {
                        case 1:
                            bVar.f.f7615b = bVar2.f7321b;
                            break;
                        case 2:
                            bVar.f.c = bVar2.f7321b;
                            break;
                        default:
                            throw new IllegalArgumentException(new StringBuilder(43).append("Unsupported SecureData fieldId: ").append(bVar2.f7320a.f7651b).toString());
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Unsupported SecureData FormFieldReference formId=%s fieldId=%d", bVar2.f7320a.f7650a, Integer.valueOf(bVar2.f7320a.f7651b)));
                }
            }
            return;
        }
        throw new IllegalArgumentException("SecurePaymentsData and SecureDataMapping are mismatched.");
    }
}
