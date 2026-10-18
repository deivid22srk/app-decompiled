package com.google.android.gms.common;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    static final i[] f5666a = {gb.f5657a[0], ge.f5658a[0], fd.f5647a[0], li.f5761a[0], bq.f5596a[0], kw.f5757a[0], fg.f5648a[0], cj.f5608a[0], lf.f5760a[0], kz.f5758a[0], ex.f5643a[0], dq.f5632a[0], fq.f5653a[0], am.f5568a[0], dn.f5631a[0], fv.f5655a[0], je.f5742a[0], cf.f5606a[0], ie.f5679a[0], ik.f5681a[0], hv.f5675a[0], bk.f5594a[0], cv.f5612a[0], cp.f5610a[0], cs.f5611a[0], ib.f5678a[0], ju.f5748a[0], be.f5592a[0], bh.f5593a[0], ei.f5638a[0], de.f5628a[0], kd.f5751a[0], kd.f5751a[1], as.f5585a[0], ag.f5566a[0], jx.f5749a[0], jk.f5744a[0], jb.f5741a[0], db.f5627a[0], ha.f5668a[0], ha.f5668a[1], cm.f5609a[0], cy.f5613a[0], bb.f5591a[0], o.f5767a[0], cc.f5605a[0], x.f5786a[0], dk.f5630a[0], iq.f5736a[0], iy.f5739a[0], ef.f5637a[0], fy.f5656a[0], jh.f5743a[0], gp.f5662a[0], fn.f5652a[0], ec.f5636a[0], m.f5766a[0], bw.f5598a[0], gm.f5661a[0], ki.f5752a[0], u.f5785a[0], bz.f5599a[0], eo.f5640a[0], gs.f5663a[0], kl.f5753a[0], ay.f5587a[0], dh.f5629a[0], hy.f5676a[0], aa.f5564a[0], jp.f5746a[0], hq.f5673a[0], ka.f5750a[0], dw.f5634a[0], he.f5669a[0], kt.f5756a[0], lc.f5759a[0], kq.f5755a[0], r.f5770a[0], el.f5639a[0], j.f5740a[0], gj.f5660a[0], eu.f5642a[0], dt.f5633a[0], gh.f5659a[0], hk.f5671a[0], av.f5586a[0], in.f5682a[0], ih.f5680a[0], ad.f5565a[0], gu.f5664a[0], bt.f5597a[0], fk.f5651a[0], hh.f5670a[0], iv.f5738a[0], jn.f5745a[0], ap.f5569a[0], fa.f5646a[0], hs.f5674a[0], dz.f5635a[0], is.f5737a[0], js.f5747a[0], fs.f5654a[0], ll.f5762a[0], lu.f5765a[0], hn.f5672a[0], lo.f5763a[0], gx.f5665a[0], aj.f5567a[0], lr.f5764a[0], bn.f5595a[0], er.f5641a[0]};

    /* renamed from: b, reason: collision with root package name */
    static final i[] f5667b;
    private static Set<i> c;
    private static Set<i> d;

    static Set<i> a() {
        if (c == null) {
            c = a(f5667b);
        }
        return c;
    }

    private static Set<i> a(i[] iVarArr) {
        HashSet hashSet = new HashSet(iVarArr.length);
        for (i iVar : iVarArr) {
            hashSet.add(iVar);
        }
        return hashSet;
    }

    static Set<i> b() {
        if (d == null) {
            d = a(f5666a);
        }
        return d;
    }

    static {
        i[][] iVarArr = {gb.f5657a, ge.f5658a, ko.f5754a, fd.f5647a, li.f5761a, bq.f5596a, kw.f5757a, fg.f5648a, cj.f5608a, lf.f5760a, kz.f5758a, ex.f5643a, dq.f5632a, fq.f5653a, am.f5568a, dn.f5631a, fv.f5655a, je.f5742a, cf.f5606a, ie.f5679a, ik.f5681a, hv.f5675a, bk.f5594a, cv.f5612a, cp.f5610a, cs.f5611a, ib.f5678a, ju.f5748a, be.f5592a, bh.f5593a, ei.f5638a, de.f5628a, kd.f5751a, as.f5585a, ag.f5566a, jx.f5749a, jk.f5744a, jb.f5741a, db.f5627a, ha.f5668a, cm.f5609a, cy.f5613a, bb.f5591a, o.f5767a, cc.f5605a, x.f5786a, dk.f5630a, iq.f5736a, iy.f5739a, ef.f5637a, fy.f5656a, jh.f5743a, gp.f5662a, fn.f5652a, ec.f5636a, m.f5766a, bw.f5598a, gm.f5661a, ki.f5752a, u.f5785a, bz.f5599a, eo.f5640a, gs.f5663a, kl.f5753a, ay.f5587a, dh.f5629a, hy.f5676a, aa.f5564a, jp.f5746a, hq.f5673a, ka.f5750a, dw.f5634a, he.f5669a, kt.f5756a, lc.f5759a, kq.f5755a, r.f5770a, el.f5639a, j.f5740a, gj.f5660a, eu.f5642a, dt.f5633a, gh.f5659a, hk.f5671a, av.f5586a, in.f5682a, ih.f5680a, ad.f5565a, gu.f5664a, bt.f5597a, fk.f5651a, hh.f5670a, iv.f5738a, jn.f5745a, ap.f5569a, fa.f5646a, hs.f5674a, dz.f5635a, is.f5737a, js.f5747a, fs.f5654a, ll.f5762a, lu.f5765a, hn.f5672a, lo.f5763a, gx.f5665a, aj.f5567a, lr.f5764a, bn.f5595a, er.f5641a};
        int i = 0;
        for (int i2 = 0; i2 < 110; i2++) {
            i += iVarArr[i2].length;
        }
        i[] iVarArr2 = new i[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 110) {
            i[] iVarArr3 = iVarArr[i3];
            int i5 = i4;
            int i6 = 0;
            while (i6 < iVarArr3.length) {
                iVarArr2[i5] = iVarArr3[i6];
                i6++;
                i5++;
            }
            i3++;
            i4 = i5;
        }
        f5667b = iVarArr2;
    }
}
