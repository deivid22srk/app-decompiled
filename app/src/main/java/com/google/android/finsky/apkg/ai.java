package com.google.android.finsky.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ai extends com.google.protobuf.nano.c {
    public static volatile ai[] g;

    /* renamed from: a, reason: collision with root package name */
    public int f1453a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1454b;
    public byte[] c;
    public boolean d;
    public aj e;
    public ai[] f;

    public static ai[] b() {
        if (g == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (g == null) {
                    g = new ai[0];
                }
            }
        }
        return g;
    }

    public ai() {
        c();
    }

    public final ai c() {
        this.f1453a = 0;
        this.f1454b = false;
        this.c = com.google.protobuf.nano.e.h;
        this.d = false;
        this.e = null;
        this.f = b();
        this.ar = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1453a != 0 || this.f1454b) {
            codedOutputByteBufferNano.a(1, this.f1453a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (int i = 0; i < this.f.length; i++) {
                ai aiVar = this.f[i];
                if (aiVar != null) {
                    codedOutputByteBufferNano.b(4, aiVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1453a != 0 || this.f1454b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f1453a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f.length; i2++) {
                ai aiVar = this.f[i2];
                if (aiVar != null) {
                    i += CodedOutputByteBufferNano.d(4, aiVar);
                }
            }
            return i;
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 200:
                        case 201:
                        case 202:
                        case 203:
                        case 204:
                        case 205:
                        case 206:
                        case 207:
                        case 208:
                        case 209:
                        case 210:
                        case 211:
                        case 212:
                        case 213:
                        case 214:
                        case 215:
                        case 216:
                        case 217:
                        case 218:
                        case 219:
                        case 220:
                        case 221:
                        case 222:
                        case 223:
                        case 224:
                        case 225:
                        case 226:
                        case 227:
                        case 228:
                        case 229:
                        case 230:
                        case 231:
                        case 232:
                        case 233:
                        case 234:
                        case 235:
                        case 236:
                        case 237:
                        case 238:
                        case 239:
                        case 240:
                        case 241:
                        case 242:
                        case 243:
                        case 244:
                        case 245:
                        case 246:
                        case 247:
                        case 248:
                        case 249:
                        case 250:
                        case 251:
                        case 252:
                        case 253:
                        case 254:
                        case 255:
                        case 256:
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                        case 261:
                        case 262:
                        case 263:
                        case 264:
                        case 265:
                        case 266:
                        case 269:
                        case 270:
                        case 271:
                        case 272:
                        case 273:
                        case 274:
                        case 275:
                        case 276:
                        case 277:
                        case 278:
                        case 279:
                        case 280:
                        case 281:
                        case 282:
                        case 283:
                        case 284:
                        case 285:
                        case 286:
                        case 287:
                        case 288:
                        case 289:
                        case 290:
                        case 291:
                        case 292:
                        case 293:
                        case 294:
                        case 295:
                        case 296:
                        case 297:
                        case 298:
                        case 299:
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                        case 304:
                        case 305:
                        case 306:
                        case 307:
                        case 308:
                        case 309:
                        case 310:
                        case 311:
                        case 312:
                        case 313:
                        case 314:
                        case 315:
                        case 317:
                        case 318:
                        case 319:
                        case 320:
                        case 321:
                        case 322:
                        case 323:
                        case 324:
                        case 325:
                        case 326:
                        case 400:
                        case 401:
                        case 402:
                        case 403:
                        case 404:
                        case 405:
                        case 406:
                        case 407:
                        case 408:
                        case 409:
                        case 410:
                        case 411:
                        case 412:
                        case 413:
                        case 414:
                        case 415:
                        case 416:
                        case 417:
                        case 418:
                        case 419:
                        case 420:
                        case 421:
                        case 422:
                        case 423:
                        case 424:
                        case 425:
                        case 426:
                        case 427:
                        case 428:
                        case 429:
                        case 430:
                        case 431:
                        case 500:
                        case 501:
                        case 502:
                        case 503:
                        case 504:
                        case 505:
                        case 506:
                        case 507:
                        case 508:
                        case 509:
                        case 510:
                        case 511:
                        case 512:
                        case 513:
                        case 514:
                        case 515:
                        case 516:
                        case 517:
                        case 518:
                        case 519:
                        case 520:
                        case 521:
                        case 522:
                        case 523:
                        case 600:
                        case 601:
                        case 602:
                        case 603:
                        case 700:
                        case 710:
                        case 711:
                        case 712:
                        case 713:
                        case 714:
                        case 715:
                        case 716:
                        case 717:
                        case 718:
                        case 719:
                        case 720:
                        case 740:
                        case 750:
                        case 751:
                        case 752:
                        case 753:
                        case 754:
                        case 755:
                        case 756:
                        case 770:
                        case 771:
                        case 775:
                        case 776:
                        case 777:
                        case 778:
                        case 780:
                        case 781:
                        case 782:
                        case 790:
                        case 791:
                        case 792:
                        case 793:
                        case 800:
                        case 801:
                        case 802:
                        case 803:
                        case 810:
                        case 811:
                        case 812:
                        case 813:
                        case 814:
                        case 820:
                        case 821:
                        case 822:
                        case 823:
                        case 824:
                        case 825:
                        case 841:
                        case 842:
                        case 843:
                        case 844:
                        case 845:
                        case 846:
                        case 847:
                        case 848:
                        case 849:
                        case 880:
                        case 881:
                        case 882:
                        case 883:
                        case 884:
                        case 885:
                        case 886:
                        case 887:
                        case 888:
                        case 889:
                        case 892:
                        case 893:
                        case 894:
                        case 895:
                        case 896:
                        case 897:
                        case 898:
                        case 900:
                        case 901:
                        case 902:
                        case 903:
                        case 904:
                        case 905:
                        case 1000:
                        case 1001:
                        case 1002:
                        case 1003:
                        case 1004:
                        case 1005:
                        case 1006:
                        case 1007:
                        case 1008:
                        case 1009:
                        case 1010:
                        case 1101:
                        case 1102:
                        case 1103:
                        case 1104:
                        case 1105:
                        case 1106:
                        case 1107:
                        case 1108:
                        case 1109:
                        case 1110:
                        case 1150:
                        case 1151:
                        case 1152:
                        case 1153:
                        case 1154:
                        case 1155:
                        case 1156:
                        case 1157:
                        case 1158:
                        case 1159:
                        case 1160:
                        case 1161:
                        case 1162:
                        case 1200:
                        case 1201:
                        case 1202:
                        case 1203:
                        case 1204:
                        case 1205:
                        case 1206:
                        case 1207:
                        case 1208:
                        case 1209:
                        case 1210:
                        case 1211:
                        case 1212:
                        case 1213:
                        case 1214:
                        case 1215:
                        case 1216:
                        case 1220:
                        case 1221:
                        case 1230:
                        case 1231:
                        case 1232:
                        case 1233:
                        case 1234:
                        case 1235:
                        case 1236:
                        case 1237:
                        case 1238:
                        case 1250:
                        case 1251:
                        case 1252:
                        case 1270:
                        case 1271:
                        case 1280:
                        case 1281:
                        case 1290:
                        case 1291:
                        case 1300:
                        case 1301:
                        case 1310:
                        case 1311:
                        case 1320:
                        case 1321:
                        case 1322:
                        case 1400:
                        case 1401:
                        case 1402:
                        case 1403:
                        case 1404:
                        case 1405:
                        case 1406:
                        case 1407:
                        case 1408:
                        case 1409:
                        case 1600:
                        case 1601:
                        case 1619:
                        case 1620:
                        case 1621:
                        case 1622:
                        case 1623:
                        case 1624:
                        case 1625:
                        case 1626:
                        case 1627:
                        case 1628:
                        case 1629:
                        case 1630:
                        case 1631:
                        case 1632:
                        case 1633:
                        case 1634:
                        case 1635:
                        case 1636:
                        case 1650:
                        case 1651:
                        case 1652:
                        case 1653:
                        case 1654:
                        case 1655:
                        case 1656:
                        case 1665:
                        case 1666:
                        case 1667:
                        case 1668:
                        case 1680:
                        case 1681:
                        case 1700:
                        case 1715:
                        case 1716:
                        case 1730:
                        case 1737:
                        case 1745:
                        case 1746:
                        case 1760:
                        case 1800:
                        case 1801:
                        case 1802:
                        case 1803:
                        case 1804:
                        case 1805:
                        case 1806:
                        case 1820:
                        case 1840:
                        case 2500:
                        case 2501:
                        case 2502:
                        case 2503:
                        case 2504:
                        case 2505:
                        case 2506:
                        case 2507:
                        case 2508:
                        case 2509:
                        case 2510:
                        case 2520:
                        case 2600:
                        case 2601:
                        case 2602:
                        case 2603:
                        case 2605:
                        case 2606:
                        case 2620:
                        case 2621:
                        case 2622:
                        case 2623:
                        case 2624:
                        case 2625:
                        case 2626:
                        case 2627:
                        case 2628:
                        case 2629:
                        case 2630:
                        case 2640:
                        case 2641:
                        case 2642:
                        case 2643:
                        case 2644:
                        case 2645:
                        case 2660:
                        case 2661:
                        case 2662:
                        case 2663:
                        case 2670:
                        case 2671:
                        case 2672:
                        case 2673:
                        case 2674:
                        case 2680:
                        case 2681:
                        case 2682:
                        case 2683:
                        case 2684:
                        case 2700:
                        case 2701:
                        case 2702:
                        case 2703:
                        case 2800:
                        case 2801:
                        case 2802:
                        case 2803:
                        case 2804:
                        case 2900:
                        case 2901:
                        case 2902:
                        case 2903:
                        case 2904:
                        case 2905:
                        case 2906:
                        case 2907:
                        case 2908:
                        case 2909:
                        case 2910:
                        case 2911:
                        case 2912:
                        case 2913:
                        case 5000:
                        case 5001:
                        case 5002:
                        case 5003:
                        case 5004:
                        case 5005:
                        case 5006:
                        case 5007:
                        case 5008:
                        case 5009:
                        case 5010:
                        case 5100:
                        case 5101:
                        case 5102:
                        case 5103:
                        case 5104:
                        case 5105:
                        case 5106:
                        case 5107:
                        case 5108:
                        case 5109:
                        case 5110:
                        case 5111:
                        case 5112:
                        case 5200:
                        case 5201:
                        case 5210:
                        case 5211:
                        case 5212:
                        case 5220:
                        case 5221:
                        case 5222:
                        case 5223:
                        case 5300:
                        case 5301:
                        case 5302:
                        case 5400:
                        case 5401:
                        case 5402:
                        case 5500:
                        case 5501:
                        case 5502:
                        case 10000:
                        case 10001:
                        case 10002:
                        case 10003:
                        case 10004:
                        case 10005:
                        case 10006:
                        case 10007:
                        case 10100:
                        case 10101:
                        case 10102:
                        case 10103:
                        case 10104:
                        case 10105:
                        case 10106:
                        case 10107:
                        case 10200:
                        case 10201:
                        case 10202:
                        case 10203:
                        case 10204:
                        case 10205:
                        case 10206:
                        case 10207:
                        case 10208:
                        case 10209:
                        case 10210:
                        case 10211:
                        case 10212:
                        case 10213:
                        case 10214:
                        case 10215:
                        case 10216:
                        case 10217:
                        case 10218:
                        case 10300:
                        case 10301:
                        case 10302:
                        case 10303:
                        case 10304:
                        case 10305:
                        case 10306:
                        case 10307:
                        case 10308:
                        case 10309:
                        case 10310:
                        case 10311:
                        case 10312:
                        case 10313:
                        case 10314:
                        case 10315:
                            this.f1453a = e;
                            this.f1454b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.d();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new aj();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.f == null ? 0 : this.f.length;
                    ai[] aiVarArr = new ai[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f, 0, aiVarArr, 0, length);
                    }
                    while (length < aiVarArr.length - 1) {
                        aiVarArr[length] = new ai();
                        aVar.a(aiVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    aiVarArr[length] = new ai();
                    aVar.a(aiVarArr[length]);
                    this.f = aiVarArr;
                    break;
                default:
                    if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
