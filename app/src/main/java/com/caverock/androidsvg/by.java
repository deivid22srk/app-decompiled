package com.caverock.androidsvg;

import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class by extends bh {
    protected by() {
    }

    @Override // com.caverock.androidsvg.bh, com.caverock.androidsvg.bj
    public final void a(bn bnVar) {
        if (bnVar instanceof bx) {
            this.i.add(bnVar);
            return;
        }
        throw new SAXException("Text content elements cannot contain " + bnVar + " elements.");
    }
}
