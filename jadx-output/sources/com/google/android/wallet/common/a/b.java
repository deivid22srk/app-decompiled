package com.google.android.wallet.common.a;

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f7249a = Pattern.compile("^[\\-,\\s]+|[\\-,\\s]+$");

    public static String a(com.google.c.a.b bVar, char c) {
        return a(bVar, c, null);
    }

    private static String a(com.google.c.a.b bVar, char c, String str) {
        if (bVar == null) {
            return null;
        }
        if (str == null) {
            str = "\n";
        }
        switch (c) {
            case '1':
                if (bVar.q.length > 0) {
                    break;
                }
                break;
            case '2':
                if (bVar.q.length >= 2) {
                    break;
                }
                break;
            case '3':
                if (bVar.q.length >= 3) {
                    break;
                }
                break;
            case 'A':
                if (bVar.q.length > 0) {
                    break;
                }
                break;
            case 'B':
                if (!TextUtils.isEmpty(bVar.i)) {
                    break;
                }
                break;
            case 'C':
                if (!TextUtils.isEmpty(bVar.f)) {
                    break;
                }
                break;
            case 'D':
                if (!TextUtils.isEmpty(bVar.g)) {
                    break;
                }
                break;
            case 'F':
                if (!TextUtils.isEmpty(bVar.p)) {
                    break;
                }
                break;
            case 'N':
                if (!TextUtils.isEmpty(bVar.s)) {
                    break;
                }
                break;
            case 'O':
                if (!TextUtils.isEmpty(bVar.r)) {
                    break;
                }
                break;
            case 'P':
                if (!TextUtils.isEmpty(bVar.o)) {
                    break;
                }
                break;
            case 'R':
                if (!TextUtils.isEmpty(bVar.f7729b)) {
                    break;
                } else {
                    int b2 = o.b(bVar.f7728a);
                    if (b2 != 0 && 858 != b2) {
                        break;
                    }
                }
                break;
            case 'S':
                if (!TextUtils.isEmpty(bVar.d)) {
                    break;
                }
                break;
            case 'T':
                if (!TextUtils.isEmpty(bVar.h)) {
                    break;
                }
                break;
            case 'U':
                if (!TextUtils.isEmpty(bVar.e)) {
                    break;
                }
                break;
            case 'X':
                if (!TextUtils.isEmpty(bVar.m)) {
                    break;
                }
                break;
            case 'Z':
                if (!TextUtils.isEmpty(bVar.k)) {
                    break;
                }
                break;
        }
        return null;
    }

    public static String a(com.google.c.a.b bVar, String str, char[] cArr, char[] cArr2) {
        String str2;
        SparseBooleanArray sparseBooleanArray;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (str == null) {
            str = "\n";
        }
        if (cArr == null && cArr2 != null && cArr2.length > 0) {
            cArr = a.a();
        }
        int b2 = o.b(bVar.f7728a);
        if (b2 == 0) {
            b2 = 858;
        }
        String str3 = bVar.c;
        boolean a2 = f.a(b2, str3);
        switch (b2) {
            case 36:
            case 65:
            case 71:
            case 114:
            case 121:
            case 122:
            case 133:
            case 139:
            case 143:
            case 154:
            case 165:
            case 168:
            case 180:
            case 229:
            case 236:
            case 242:
            case 247:
            case 307:
            case 375:
            case 385:
            case 417:
            case 421:
            case 423:
            case 427:
            case 453:
            case 463:
            case 524:
            case 532:
            case 537:
            case 591:
            case 595:
            case 618:
            case 619:
            case 621:
            case 622:
            case 650:
            case 653:
            case 654:
            case 666:
            case 705:
            case 779:
            case 845:
                str2 = "%N%n%O%n%A%n%Z %C";
                break;
            case 37:
            case 466:
                str2 = "%N%n%O%n%A%n%S";
                break;
            case 45:
                str2 = "%N%n%O%n%A%n%Z%n%C%n%S";
                break;
            case 50:
            case 118:
            case 698:
                str2 = "%N%n%O%n%A%n%Z %C%n%S";
                break;
            case 51:
            case 97:
            case 205:
            case 245:
            case 424:
            case 432:
            case 535:
            case 685:
            case 713:
                str2 = "%N%n%O%n%A%n%C %S %Z";
                break;
            case 52:
            case 69:
            case 460:
                str2 = "%O%n%N%n%A%n%Z %C";
                break;
            case 53:
            case 99:
            case 120:
            case 269:
            case 454:
                str2 = "%O%n%N%n%A%n%C %S %Z";
                break;
            case 56:
                str2 = "%O%n%N%n%A%nAX-%Z %C%nÅLAND";
                break;
            case 58:
                str2 = "%N%n%O%n%A%nAZ %Z %C";
                break;
            case 68:
                str2 = "%N%n%O%n%A%n%C - %Z";
                break;
            case 70:
            case 100:
            case 439:
            case 628:
                str2 = "%N%n%O%n%A%n%C %X";
                break;
            case 72:
            case 77:
            case 78:
            case 300:
            case 335:
            case 360:
            case 386:
            case 403:
            case 436:
            case 438:
            case 464:
            case 609:
                str2 = "%N%n%O%n%A%n%C %Z";
                break;
            case 76:
            case 210:
            case 230:
            case 240:
            case 422:
            case 433:
            case 451:
            case 525:
            case 581:
            case 742:
            case 820:
                str2 = "%O%n%N%n%A%n%Z %C %X";
                break;
            case 82:
                str2 = "%O%n%N%n%A%n%D%n%C-%S%n%Z";
                break;
            case 83:
            case 366:
                str2 = "%N%n%O%n%A%n%C, %S";
                break;
            case 89:
                str2 = "%S%n%Z %C %X%n%A%n%O%n%N";
                break;
            case 104:
                str2 = "%O%n%N%n%A%nCH-%Z %C";
                break;
            case 105:
                str2 = "%N%n%O%n%X %A %C %X";
                break;
            case 108:
                str2 = "%N%n%O%n%A%n%Z %C%n%D%n%S";
                break;
            case 110:
                if (a2) {
                    str2 = "%N%n%O%n%A%n%D%n%C%n%S, %Z";
                    break;
                } else {
                    str2 = "%Z%n%S%C%D%n%A%n%O%n%N";
                    break;
                }
            case 111:
                str2 = "%N%n%O%n%A%n%C, %S, %Z";
                break;
            case 163:
            case 437:
            case 493:
                str2 = "%N%n%O%n%A%n%Z%n%C";
                break;
            case 167:
            case 226:
            case 597:
            case 673:
                str2 = "%N%n%O%n%A%n%C%n%S%n%Z";
                break;
            case 179:
            case 308:
            case 518:
            case 697:
                str2 = "%N%n%O%n%A%n%Z %C %S";
                break;
            case 201:
                str2 = "%O%n%N%n%A%nFI-%Z %C";
                break;
            case 203:
            case 243:
            case 301:
            case 303:
            case 526:
            case 616:
            case 643:
                str2 = "%N%n%O%n%A%n%X%n%C%n%Z";
                break;
            case 207:
                str2 = "%N%n%O%n%A%nFO%Z %C";
                break;
            case 231:
                str2 = "%N%n%O%n%A%n%X%n%C%nGUERNSEY%n%Z";
                break;
            case 233:
                str2 = "%N%n%O%n%A%nGIBRALTAR%n%Z";
                break;
            case 238:
                str2 = "%N%n%O%n%Z %A %C";
                break;
            case 244:
                str2 = "%N%n%O%n%A%n%Z- %C";
                break;
            case 267:
                if (a2) {
                    str2 = "%N%n%O%n%A%n%C%n%S";
                    break;
                } else {
                    str2 = "%S%n%C%n%A%n%O%n%N";
                    break;
                }
            case 270:
                str2 = "%N%n%O%n%A%n%C, %S%n%Z";
                break;
            case 274:
                str2 = "%N%n%O%n%A%nHR-%Z %C";
                break;
            case 276:
                str2 = "%N%n%O%n%A%nHT%Z %C %X";
                break;
            case 277:
                str2 = "%N%n%O%n%C%n%A%n%Z";
                break;
            case 292:
            case 718:
                str2 = "%N%n%O%n%A%n%C%n%S %Z";
                break;
            case 293:
            case 513:
            case 611:
                str2 = "%N%n%O%n%A%n%C%n%S";
                break;
            case 302:
            case 455:
                str2 = "%N%n%O%n%A%n%C %Z%n%S";
                break;
            case 305:
                str2 = "%O%n%N%n%A%n%C, %S%n%Z";
                break;
            case 306:
                str2 = "%O%n%N%n%S%n%C, %D%n%A%n%Z";
                break;
            case 325:
                str2 = "%N%n%O%n%A%n%X%n%C%nJERSEY%n%Z";
                break;
            case 333:
                str2 = "%N%n%O%n%A%n%C%n%S %X";
                break;
            case 336:
                if (a2) {
                    str2 = "%N%n%O%n%A%n%C, %S%n%Z";
                    break;
                } else {
                    str2 = "〒%Z%n%S%C%n%A%n%O%n%N";
                    break;
                }
            case 357:
            case 395:
            case 634:
            case 711:
                str2 = "%N%n%O%n%A%n%C%n%Z";
                break;
            case 359:
                str2 = "%Z %C %X%n%A%n%O%n%N";
                break;
            case 361:
                str2 = "%N%n%O%n%A%n%S%n%C";
                break;
            case 370:
                if (a2) {
                    str2 = "%N%n%O%n%A%n%D%n%C%n%S%n%Z";
                    break;
                } else {
                    str2 = "%S %C%D%n%A%n%O%n%N%n%Z";
                    break;
                }
            case 377:
                str2 = "%N%n%O%n%A%n%S %Z";
                break;
            case 378:
                str2 = "%Z%n%S%n%C%n%A%n%O%n%N";
                break;
            case 393:
                str2 = "%O%n%N%n%A%nFL-%Z %C";
                break;
            case 402:
                str2 = "%N%n%O%n%A%n%Z %C %X";
                break;
            case 404:
                str2 = "%O%n%N%n%A%nLT-%Z %C";
                break;
            case 405:
                str2 = "%O%n%N%n%A%nL-%Z %C";
                break;
            case 406:
            case 429:
                str2 = "%N%n%O%n%A%n%C, %Z";
                break;
            case 419:
                str2 = "%N%n%O%n%A%nMC-%Z %C %X";
                break;
            case 420:
                str2 = "%N%n%O%n%A%nMD-%Z %C";
                break;
            case 430:
                str2 = "%N%n%O%n%A%n%S %C-%X%n%Z";
                break;
            case 431:
                if (a2) {
                    str2 = "%N%n%O%n%A";
                    break;
                } else {
                    str2 = "%A%n%O%n%N";
                    break;
                }
            case 440:
                str2 = "%N%n%O%n%A%n%D%n%Z %C, %S";
                break;
            case 441:
                str2 = "%N%n%O%n%A%n%D%n%Z %C%n%S";
                break;
            case 457:
                str2 = "%N%n%O%n%A%n%Z%n%C, %S";
                break;
            case 474:
                str2 = "%N%n%O%n%A%n%D%n%C %Z";
                break;
            case 519:
                str2 = "%N%n%O%n%A%n%C %Z %S";
                break;
            case 520:
                str2 = "%N%n%O%n%A%n%D, %C%n%Z %S";
                break;
            case 523:
                str2 = "%N%n%O%n%A%n%C-%Z";
                break;
            case 530:
                str2 = "%N%n%O%n%A%n%C PR %Z";
                break;
            case 613:
                str2 = "%O%n%N%n%A%nSE-%Z %C";
                break;
            case 615:
                str2 = "%N%n%O%n%A%nSINGAPORE %Z";
                break;
            case 617:
                str2 = "%N%n%O%n%A%nSI- %Z %C";
                break;
            case 623:
            case 691:
                str2 = "%N%n%O%n%A%n%C, %S %Z";
                break;
            case 626:
                str2 = "%N%n%O%n%A%n%C %X%n%S";
                break;
            case 630:
                str2 = "%N%n%O%n%A%n%Z-%C%n%S";
                break;
            case 648:
                if (a2) {
                    str2 = "%N%n%O%n%A%n%D, %C%n%S %Z";
                    break;
                } else {
                    str2 = "%N%n%O%n%A%n%D %C%n%S %Z";
                    break;
                }
            case 658:
                str2 = "%N%n%O%n%A%n%Z %C/%S";
                break;
            case 662:
                str2 = "%N%n%O%n%A%n%X%n%C%n%S";
                break;
            case 663:
                if (a2) {
                    str2 = "%N%n%O%n%A%n%C, %S %Z";
                    break;
                } else {
                    str2 = "%Z%n%S%C%n%A%n%O%n%N";
                    break;
                }
            case 709:
                str2 = "%N%n%O%n%A%n%C %Z, %S";
                break;
            case 833:
                str2 = "%N%n%O%n%A%n%D%n%C%n%Z";
                break;
            default:
                str2 = "%N%n%O%n%A%n%C";
                break;
        }
        StringBuilder sb = new StringBuilder(str2.length() + 4);
        if (!a2 && (f.a("ja", str3) || f.a("ko", str3) || f.a("zh", str3))) {
            sb.append("%R%n");
            sb.append(str2);
        } else {
            sb.append(str2);
            sb.append("%n%R");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        int length = str.length();
        if (cArr != null) {
            sparseBooleanArray = new SparseBooleanArray(a.b() + 1);
            for (char c : cArr) {
                if (a.a(c)) {
                    sparseBooleanArray.put(c, true);
                }
            }
            if (cArr2 != null) {
                for (char c2 : cArr2) {
                    if (a.a(c2)) {
                        sparseBooleanArray.put(c2, false);
                    }
                }
            }
        } else {
            sparseBooleanArray = null;
        }
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        char[] charArray = sb2.replaceAll("%A", "%1%n%2%n%3").toCharArray();
        boolean z11 = false;
        boolean z12 = false;
        for (char c3 : charArray) {
            if (z12) {
                if ('n' == c3) {
                    boolean z13 = false;
                    if (sb4.length() > 0) {
                        sb4.append((CharSequence) sb5);
                        sb3.append(f7249a.matcher(sb4).replaceAll(""));
                        z13 = true;
                        sb4.setLength(0);
                        z6 = z9;
                    } else {
                        if (sb5.length() > 0 && !z10) {
                            String replaceAll = f7249a.matcher(sb5).replaceAll("");
                            if (replaceAll.length() > 0) {
                                sb3.append(replaceAll);
                                z13 = true;
                                z6 = true;
                            }
                        }
                        z6 = z9;
                    }
                    if (z13 && length > 0) {
                        sb3.append(str);
                        z11 = true;
                    }
                    z5 = z7;
                    boolean z14 = z6;
                    z = z8;
                    z2 = z11;
                    z3 = false;
                    z4 = z14;
                } else if (a.a(c3)) {
                    if (sparseBooleanArray == null || sparseBooleanArray.get(c3)) {
                        String a3 = a(bVar, c3, str);
                        if (a3 != null) {
                            a3 = a3.trim();
                        }
                        if (TextUtils.isEmpty(a3)) {
                            z = z8;
                            z2 = z11;
                            z3 = true;
                            z4 = z9;
                            z5 = z7;
                        } else {
                            sb4.append(sb5.toString());
                            sb4.append(a3);
                            if ('N' == c3) {
                                boolean z15 = z10;
                                z = z8;
                                z2 = z11;
                                z3 = z15;
                                z4 = z9;
                                z5 = true;
                            } else {
                                z2 = z11;
                                z3 = z10;
                                z = true;
                                z4 = z9;
                                z5 = z7;
                            }
                        }
                    } else {
                        z = z8;
                        z2 = z11;
                        z3 = true;
                        z4 = z9;
                        z5 = z7;
                    }
                } else {
                    Log.w("AddressFormatter", new StringBuilder(31).append("Could not format AddressField.").append(c3).toString());
                    z = z8;
                    z2 = z11;
                    z3 = true;
                    z4 = z9;
                    z5 = z7;
                }
                sb5.setLength(0);
                z7 = z5;
                z9 = z4;
                z12 = false;
                boolean z16 = z3;
                z11 = z2;
                z8 = z;
                z10 = z16;
            } else if (c3 == '%') {
                z12 = true;
            } else {
                sb5.append(c3);
            }
        }
        if (sb4.length() > 0 || !z10) {
            if (sb4.length() == 0 && sb5.length() > 0) {
                z9 = true;
            }
            sb4.append((CharSequence) sb5);
            sb3.append(f7249a.matcher(sb4).replaceAll(""));
        } else if (z11) {
            sb3.delete(sb3.length() - length, sb3.length());
        }
        if ((sparseBooleanArray == null || sparseBooleanArray.get(82)) && (sb3.length() == 0 || (z7 && !z8 && !z9))) {
            String a4 = a(bVar, 'R', str);
            if (!TextUtils.isEmpty(a4)) {
                if (sb3.length() > 0 && length > 0) {
                    sb3.append(str);
                }
                sb3.append(a4);
            }
        }
        return sb3.toString();
    }
}
