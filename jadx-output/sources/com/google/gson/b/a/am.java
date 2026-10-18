package com.google.gson.b.a;

import com.google.gson.JsonSyntaxException;
import java.util.BitSet;

/* loaded from: classes2.dex */
final class am extends com.google.gson.aj<BitSet> {
    am() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ BitSet a(com.google.gson.stream.a aVar) {
        return b(aVar);
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, BitSet bitSet) {
        BitSet bitSet2 = bitSet;
        if (bitSet2 == null) {
            fVar.e();
            return;
        }
        fVar.a();
        for (int i = 0; i < bitSet2.length(); i++) {
            fVar.a(bitSet2.get(i) ? 1 : 0);
        }
        fVar.b();
    }

    private static BitSet b(com.google.gson.stream.a aVar) {
        boolean z;
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        BitSet bitSet = new BitSet();
        aVar.a();
        com.google.gson.stream.e f = aVar.f();
        int i = 0;
        while (f != com.google.gson.stream.e.END_ARRAY) {
            switch (f) {
                case NUMBER:
                    if (aVar.n() == 0) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case BOOLEAN:
                    z = aVar.j();
                    break;
                case STRING:
                    String i2 = aVar.i();
                    try {
                        if (Integer.parseInt(i2) == 0) {
                            z = false;
                            break;
                        } else {
                            z = true;
                            break;
                        }
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + i2);
                    }
                default:
                    throw new JsonSyntaxException("Invalid bitset value type: " + f);
            }
            if (z) {
                bitSet.set(i);
            }
            i++;
            f = aVar.f();
        }
        aVar.b();
        return bitSet;
    }
}
