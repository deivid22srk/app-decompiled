package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.internal.zzas;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public abstract class zzam extends aq {
    private static String A;
    private static String B;
    private static zzas D;
    private static boolean G;
    protected static com.google.a.a.a.b g;
    protected static int h;
    private static Method m;
    private static Method n;
    private static Method o;
    private static Method p;
    private static Method q;
    private static Method r;
    private static Method s;
    private static Method t;
    private static Method u;
    private static Method v;
    private static Method w;
    private static Method x;
    private static Method y;
    private static String z;
    private static long C = 0;
    static boolean e = false;
    protected static com.google.android.gms.clearcut.a f = null;
    private static Random E = new Random();
    private static com.google.android.gms.common.b F = com.google.android.gms.common.b.a();
    protected static boolean i = false;
    protected static boolean j = false;
    protected static boolean k = false;
    protected static boolean l = false;

    class zza extends Exception {
        public zza() {
        }

        public zza(Throwable th) {
            super(th);
        }
    }

    protected zzam(Context context, av avVar, aw awVar) {
        super(context, avVar, awVar);
        com.google.a.a.a.b bVar = new com.google.a.a.a.b();
        g = bVar;
        bVar.f1406a = context.getPackageName();
    }

    private static String a(Context context, av avVar) {
        if (A != null) {
            return A;
        }
        if (p == null) {
            throw new zza();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) p.invoke(null, context);
            if (byteBuffer == null) {
                throw new zza();
            }
            String a2 = avVar.a(byteBuffer.array());
            A = a2;
            return a2;
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    private static String a(byte[] bArr, String str) {
        try {
            return new String(D.a(bArr, str), Keyczar.DEFAULT_ENCODING);
        } catch (zzas.zza e2) {
            throw new zza(e2);
        } catch (UnsupportedEncodingException e3) {
            throw new zza(e3);
        }
    }

    private static ArrayList<Long> a(MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        if (q == null || motionEvent == null) {
            throw new zza();
        }
        try {
            return (ArrayList) q.invoke(null, motionEvent, displayMetrics);
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    public static void a() {
        j = true;
    }

    private static String b(Context context, av avVar) {
        if (B != null) {
            return B;
        }
        if (s == null) {
            throw new zza();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) s.invoke(null, context);
            if (byteBuffer == null) {
                throw new zza();
            }
            String a2 = avVar.a(byteBuffer.array());
            B = a2;
            return a2;
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    public static void b() {
        k = true;
    }

    private static void c() {
        if (!G) {
            l = false;
        } else {
            d.b();
            l = true;
        }
    }

    static String d(Context context) {
        if (r == null) {
            throw new zza();
        }
        try {
            String str = (String) r.invoke(null, context);
            if (str == null) {
                throw new zza();
            }
            return str;
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    private static String e() {
        if (z == null) {
            throw new zza();
        }
        return z;
    }

    private static String e(Context context) {
        if (v == null) {
            throw new zza();
        }
        try {
            return (String) v.invoke(null, context);
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    private static Long f() {
        if (m == null) {
            throw new zza();
        }
        try {
            return (Long) m.invoke(null, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    private static Long f(Context context) {
        if (w == null) {
            throw new zza();
        }
        try {
            return (Long) w.invoke(null, context);
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    private static String g() {
        if (o == null) {
            throw new zza();
        }
        try {
            return (String) o.invoke(null, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    private static ArrayList<Long> g(Context context) {
        if (t == null) {
            throw new zza();
        }
        try {
            ArrayList<Long> arrayList = (ArrayList) t.invoke(null, context);
            if (arrayList == null || arrayList.size() != 2) {
                throw new zza();
            }
            return arrayList;
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    private static Long h() {
        if (n == null) {
            throw new zza();
        }
        try {
            return (Long) n.invoke(null, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    private static int[] h(Context context) {
        if (u == null) {
            throw new zza();
        }
        try {
            return (int[]) u.invoke(null, context);
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    private static int i(Context context) {
        if (x == null) {
            throw new zza();
        }
        try {
            return ((Integer) x.invoke(null, context)).intValue();
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    private static int j(Context context) {
        if (y == null) {
            throw new zza();
        }
        try {
            return ((Integer) y.invoke(null, context)).intValue();
        } catch (IllegalAccessException e2) {
            throw new zza(e2);
        } catch (InvocationTargetException e3) {
            throw new zza(e3);
        }
    }

    @Override // com.google.android.gms.internal.aq
    protected void b(Context context) {
        try {
            c();
            h = E.nextInt();
            a(0, h);
            try {
                a(1, g());
                a(1, h);
            } catch (zza e2) {
            }
            try {
                a(2, e());
                a(2, h);
            } catch (zza e3) {
            }
            try {
                long longValue = f().longValue();
                a(25, longValue);
                if (C != 0) {
                    a(17, longValue - C);
                    a(23, C);
                }
                a(25, h);
            } catch (zza e4) {
            }
            try {
                ArrayList<Long> g2 = g(context);
                a(31, g2.get(0).longValue());
                a(32, g2.get(1).longValue());
                a(31, h);
            } catch (zza e5) {
            }
            try {
                a(33, h().longValue());
                a(33, h);
            } catch (zza e6) {
            }
            try {
                if (!j || !k) {
                    a(27, a(context, this.c));
                }
                a(27, h);
            } catch (zza e7) {
            }
            try {
                a(29, b(context, this.c));
                a(29, h);
            } catch (zza e8) {
            }
            try {
                int[] h2 = h(context);
                a(5, h2[0]);
                a(6, h2[1]);
                a(5, h);
            } catch (zza e9) {
            }
            try {
                a(12, i(context));
                a(12, h);
            } catch (zza e10) {
            }
            try {
                a(3, j(context));
                a(3, h);
            } catch (zza e11) {
            }
            try {
                a(34, e(context));
                a(34, h);
            } catch (zza e12) {
            }
            try {
                a(35, f(context).longValue());
                a(35, h);
            } catch (zza e13) {
            }
            d();
        } catch (IOException e14) {
        }
    }

    @Override // com.google.android.gms.internal.aq
    protected final void c(Context context) {
        try {
            c();
            h = E.nextInt();
            try {
                a(2, e());
            } catch (zza e2) {
            }
            try {
                a(1, g());
            } catch (zza e3) {
            }
            try {
                a(25, f().longValue());
            } catch (zza e4) {
            }
            a(0, h);
            try {
                ArrayList<Long> a2 = a(this.f5880a, this.f5881b);
                a(14, a2.get(0).longValue());
                a(15, a2.get(1).longValue());
                if (a2.size() >= 3) {
                    a(16, a2.get(2).longValue());
                }
                a(14, h);
            } catch (zza e5) {
            }
            try {
                a(34, e(context));
            } catch (zza e6) {
            }
            try {
                a(35, f(context).longValue());
            } catch (zza e7) {
            }
            d();
        } catch (IOException e8) {
        }
    }

    protected static synchronized void a(String str, Context context, av avVar) {
        synchronized (zzam.class) {
            if (!e) {
                try {
                    D = new zzas(avVar);
                    z = str;
                    com.google.android.gms.ads.internal.apkg.f.a(context);
                    try {
                        byte[] a2 = D.a("rIJlecwCEg2h+f/1J8UGmizPBRBBY+Ey3fsyv2Sg4dA=");
                        byte[] a3 = D.a(a2, "qNRJDfwowPzIcfS7S2Iw8xSpjEPKru1hPPcGkNvNaN3EUapuXn4sc3fZAApn+cFZD4WU9NK7krSmyRIYUR7FGYuno84lVrz7gwjD/lQJn9NLQCpkaQKOEORtnWmitI9zi0IzR5L51eg8+6L81Bm9u02Ds4nGS8giKhT+M7dGYqUAIPLVAcsIukMHozI4l9NlU3Pg74gkiEvM2xVbBltD///oG3/bujv+qahW+kHxlG/zksYNk5HE92BMndRcpDUvVWWX6nAwlZNxrV6/VP8Zmn4w3/W1CQzw8Qdsk6B8m2LP2t0hqDLEeVfrVVtie+FDIIxq8TAFFO8ULolescKxyez2DUIqdAH3pA1EyKTJ5wLdFjDp4bk2QcXnhMs7Jixf1YytA5g1So12pD0qTShuiQncKNgAXkFTOrAP8KiXLEfeNaFSU0bYv8OiO2xzWgSuVPA4NmWo+XQ6IAKMLSGsIaKvwppYLXZ0Znq9OOSfKOfDsiEd8VuKdf+Q1/NCHJrSrvmeAuAywINw9Z6niiw7xABwWLiFc0K1mX5rz/LVUJLfX473G1mATrpNOOwwNYB3PzZQKLmxnq0JEVFcQwHWFOnYjn9whEFSTO477uxi4SQXtaAiUs4BR1aCsgYdLUWuXohOHewajlqIQKgCpPa1MtFaH8j8qV9f0irjnl9szoAxnkQ+RCgXR7sLiD7tFs/msucv3wpf7H4aqU9Or5cU0li8e8YaW/Cng0jHYNYaDd2+fd+YJI0jwzavukeLvdEGbxsLznb24TlwtuxJdJgG4L1FF2hTupb/qTFE6jJr+HQz0Bg1Sm4PkMTml7+pDiU9PYdwqEVKph01RJLp/lXf/taG6z4iJ7IQcOAO15Hheq25O9wZmEKnFU5U0ZuKDs0lBdflpacVKklcf4e1UqCIH/39Zh+YESoixBHsMwHMjr436J3BOjFoq5D7ctD77nIFHOa+QC1kFw4b7nqdFqPQwiCQcHz+RQUgWq9EfGaSb1iSgARma0GLoXEpXYd/RcL8nkPqVkS5IuI/dLT0gN873M3CT9wV/lmJXNBm5afDRC9r56FJOJ63AYgdL0XXMBxpTCQeDY8hZTQubYpOELt+gcaFFWftH56QRM2QAi5cQVPx9VSKQL6xulSaA0pN+cZaIgu860hzD5iBCnogmJiMQkO2nQcAPocyBvZ+J20IpVLg8Qzj0YaxyysbYEl2FyQT9J16Y2pcSTwy9IJFKnsXuC/1c5lkbNCTDux8EbHV8GQ+uYs9R1ZOA1knTK4wEv0hX44Ewk0WEUmbtGLNK8MoCwjgeox9kyx4os7JeY6D9++KIGA9K9ykReg6y26rDxsbLahqFUo7UpvYNEy1JhngP5qwrlwIhTJ8zhBP60rWDVLqP1WcokUs7ELxBJ99rKWcSQbLqe+Ldd37+8TSuuE50vBkT9BB/k7/HOjYJ6PxGCZt044xtRSSE0vnb+ANk5moB3/xleso11MhdDllM7rhhDylAEwb2dc7A9Ivh60f24bCKqSHfYkoWxm57bGSn0ZQnebWKWzuBvrkorSAxNO4f3Sg7uhp91koaKu7jF3QSd6P8TWcqD2zojzOKNZQQCXl895EvthMAbv0FA2uYA/aGkwBgl5y+wcABZ9jfL9Hz2iprUzNrYFceCajzosmkJ5f/m1glwVtNmjUMt6OLPbtpL/+NDZ7UP4v/Ys3hPL7IUOjYM6ZGlFZDi0GkqGwtTn81Tqu4QE+mxd18X9IoZJRVCoCXTt1DuRJ8STV0YwZlLcA8CEb75cccOGjwWfKFncqJ2gay6Tq1LtXYJ+31BqwZIRFNXutHcwG5EFA9ifDJDRTxy2Y460LQkH4eTBVhxOTokWHnx1XTEhQ1Ie/vTMg0WH4S+tWY2bLIdOoezjyOq6rLxaZjntIN7J4LFEnhuycOZzqnrBu4pX+yHm7+sV5pdx5ys8vXjTHn1UGeZzvlRmgKuiftAIe7tkrQQ61Z3OGKZvf6XCGAYwhSmdEJiH3dl8ttGMOPA3b5aqhpfC8yhg26O+sDgu9Sj/m/RVab7Kb7/xZ+/GHNck7PYgskYs94qOXOTdp1RwlYnY+mLktTqXtP4Kkbh2v5gPht6Uq+ELVpmyeU1XdkwygtSP53mM5WWuGE1oKSObLIkU8ycSaQSNehXuzWWtu141MRV2hwfhDXv/lNQQAc70AGRJeyphpKceUfzxx76aehztFI7T53N0By9mcgfZ9pprOQ2thcHVlcNbwXxloJXsWVdNPR/nTRfUt9txhnLindedBWOM7OY9zGYmsEXSDpC0UBk9vJvQwZdNd4BvfyCC9fgzW6yPaYc4y0MtYmG2CHncMNTvKHffHW8OtY68AsL92v2rwOeDMYWRFpcoRYg0SBf81Jf67CTpEtclrw1M9KvenPjCqyUbEHLCAgYpcbIEt1Y+fryL3SVoxXOP2y45Gsh6yNsbOGI7lH0EY6Yh84UqTbEjRKbfPuP8jIzdSz8PCKBPpGVKCyqsiJ0vAP70SpSMh8U7g2a6DJ7RKrKVEB7hODWJ74mZPT2V0MrJ1qCLZaBmw9LH0ewys/2SfjQ8nS8zDixYrPF1okxfMJbRcPzG7xt1l9ZYnYnzsLSKITJVR71VkB4Z9Ri34xPGtl294+bsjDCzjwD3qMc4PHqV2PW8WlPHnB9CeCRW6SJOs5R+acnZBnziW8dMfJpv1ux7+tzJZFov9lHIr0rP0I7NJb58IOUjkh1H6X8kL+NvCyHwS4DPybCJtC/GQmmlU9STGFwa8X2LY/mp6Z18EfSlyb/EPuh3gfpTAHgLnXqnLepMIIUvQCZfju48Jze9bW989Nvl0DlSvZn8R+YLZLzTp7A2webvWV1piyP/dl8glk+3Lam14kghOCePtP73xM7amq+XywqV1S6BZfTYWwEynqS26B9bwNL5mngOfCD4xSMemBz4OIFhLq4GZpGi2Nkj4fefNn/BpI6psSttVstv+SSTvIEms48dQnThzrhho5RthW69jr3610oQC6wujs+PE+eaqhSs5zD1c2207Vxk8QGb362LGoSmrz75mBFLtShHgtv6sIXlPhHRjBIuVyvtD2XIY5Ur39EvZwani+/bhLYx0kgwpMcJnhb9bbER2187CeWg8LInw7Z5wvI3GyP1R+hFDmOASfSAIWhKaaYwB+z9HtA5+n8XwfFkLf8YV8S+7HpbQOhfUdjhWq7sz+vtShetle6SjEYaFo0tlQCRKILE+HWfQ7AzGcbQLlO+Vxe2DmaE+8F25vEp4a4eLi2ZLJicVAdZEkHyVZQJls8Wz9O8yE0sL3xUsLFgKO5JDeY6nDl84ObKND5nVUqWcbH/6dviCkHr44oF59vAAL0vVBZa6JrL+bKLSVDETB3zsmWn51dKkVFdu5arJEvAOn5hQU5k74IqWAhd7RlgcZdArwP1+EDzea+euGymeN2bB8aYlvOEksigpapwdyzzTNA9O1gi+L+Hgo/ff6P6KuPN3ZA2hikoOKzn3j76aTzTggN5fx7kj/CQxxKJLmELiak4OY5QULRk2S8gBRnMcHhBP+8Q4D8Dx2017U8JL0ZHPMT9osAvLUltglu3OUs3H1voRx2JfUJftSL/SCn/9fp7imknFPfD7IEpzuW0+0ZNl36x1tDtizviN0xR34u0OECSWrJy6uQbCITZHoMCd8SVc9LKvcSgZYL8dMrXYXgA+q1vdfF8dJ3cXhhzUDMiOwjoxB8GIOn6nssKUCaU/8ww7E4hd/lVg/GLBp3/6Ha6fK6ZKk6Iarq3VEz+iSjQm6U0zJYYQ82oTDQWZTxf+uH+PYUB6Aac3TTiZNgsljTGL6L4j0tuzMd+Lpf8tJz6d+kCk6lNiRsu80A0XRmQg4MMZp/84EsghrEV3LhuzF9xfMl//uA5CqUy0TtIq4qG+iBbWwyLIsp/sewTPGgyZ+nhMQa4E7KqUhfocWbJJed8dAM1+ZpEobRVrHU4UD4glt2p6t8ExoU9Um28aurBTvGvE4QX0RJzlqIBqdoD0jPiKdtI9dGs9P+fYaMhplGieA38Ch4Jmj/yz1c6thJDRNXrlsysdt32Rsmp7VJMYlmjaQn5ixDsvp13KB20qskIsFEPxV3JV8TDllYmEY/Y4/kR3ttMnZVs36OisLNeyHQguWnsUpKSIe7ZDm+cpsCJjlLkKzf0pCrC7nBPaTCU5wOdL7qXIgXoEBu3eVADG2GJf3gWSxFmg1JrcwNMT+E9mnlpPksnNzNmSHVaCNpZSr3ImQH11p7OWhkX3Q2F0W23x4XYVzgpBCRC+74RvK/1MbOGV47I29NRhr/FZeJ0wC/vsa5BaFXo7UNI45j9XU3mrtDCSjiNUUsy7sxA+EtPfd02+xQ4+u9MnMeZqfRyuo9UFJyvg3+chnnJURKZq/QM+jCqtwMo0fO0OcsgWmCBbEcGwftriXstepbyNMOigWvazub9zABx0H++/eQ1ymQ7F2qDXVpqMoaMBIDa2LwDvekTVeWBEZKlWROZFhcv0Q3iaAKtTgn+JQR3TC8SLfGu+aYAV7pH/8DMZb1TwPx0peNLr/z1ozMgVEOsWlRlSb60XI+bfmLCN/svyD4Evxn0UJpPn2JZaqN9S0Inv7DPbAJ+NXuxEESGB+/I2Kwi14d1P7nGqBrdWStyDmfNNWyIvI5yvni8vdwn6Lap/FyZlMdRfZFbTUt+HYa6qCXbfJq+yYiZ+thpt4FicSGL/RvCLlYiUL08NN/evz1pXbgTk5y7HrZUe/Etgn3DrgXh33cIxcdpGChSFiYu3yCteLtgCew+vUjDGt0X44Qc0fNXmJGycv8m+kw4vAqH1/53Ts0t1pqvkT0/IRnnOcp5MJ+iqc19RFhClZI5WaxCM3Nr3YEhXuX5oqzXF7vJ1efIgrIOmqBvIWWrbnSdQcD3hOhttTFErRd6kfj+eW1TCku6m+Ex3ajIqrt2m7FQrnn5Vgy5ingn9rSf8KJbG5lZOooAiOst5YdOSCdcvETr+/oy9CV3UqIrXRvY9kF09bFq7wtxPesbWOeLcK6dSgDMumzNxIes9WsCsPK6uaZPT7n1pKfp1QwmRjNOZ3ie7XH3gnVYF0QHvNml4Z/GgP9SbAl3LqXZsDYCyosg1ILxJqxqcmjmjNx52Q4xmuJIA8LFnl6Z9teiCaarIhSOq5gy1zuISHZ7EKna9SMgX+WbcNBgzqogrw4kQEp+2zbpqWphafrpukgH8Mr/MJHEOc1cZn8Ik8xqIEMXm78RaJhq23uk/HzRihd3i3vfHd4Zd00CAjczWFKACyADnRtNLplH+mY+Es9SISTC4tavy1Uvh9Mz3VdDG/hTJohlgCJdX9+Pc5lQerS3qXJkFpQNesctJhKloSAL4R3bw5muz3eygLGrV3aKfh8R5aMBQ+JkF6lRKVu3VLdDQuQCx+HC2WWWJwACfdnFnqm56RzZnUiSUts0VYkHJ1m1SKxTi2/uoiN0r1if5k0rDFo7MqXNQPMyXBIjB2TRnolk7ZFmepfu4lGrM7BwER0JALe7/hnRE2XWluIgLzo9i348N7E5/zcOPFYDBFYas6uKAKvmZM2isbSD7ZXC5BivqB24ELk/rt03ganlkIsDNC/+8rFpOCkZyl6wDL9UmE5FOc0buVAyud+fS0U27YksYV4+EfCnYFLTBkfh8EzJdjIUD4n0yTRPcpfbfz3JfWFJ4u3g7NPEhkouLbjRQBIphD0cqYhww0Hz3Ig6mnW9N9YtDPuBuXnoq+D/mz4GaPq+qakCV4IICDbR8js8ge5NRGZ7PcsN2kTTCckAHdNcX4/FaWl5ywlsKbeU7g4gIbs31dUvquclFY6DMblAiElv5HJpXsaL4V/D+ua4VYSzAb8ubk5xgBlP/AypZgeRTDB/Yafk6KclFfJz0UZ8nGjpzuemDv6Gm1bqH5O0mq+SnjD5dZGb9mWDn4zO3PaczUjr3Tv2S8RNeAqphqmOCOR4BmQFfdhsK18D1OMF3tLY23pXKMqSQBhlDZ2xuUoWykPIgLnTWE7KWDYoVFcd5CEypAQBx1Dl3GR5HCmFb2kIoDuMx6fFRoHTwkvLH2oc31alA4B6Wt8YsrQKlHGDUsTmvo8GVQiXRb4l9wY1MmhDsd8WCOLHavl/QTgWw08VKYDnsO7bxn4TMikkgYPZiqQn4pBKxh3IFiFIRGOT67+M7yEa3IKyssD/i0uqvC1Xrf/GwItm6KudvkQgua7EkDclqfVSfzdZ3RfuhTeA0S71JWi4b5VlxvIFxoOZHxCo6PKks+Sqv1lEcR7F0Jo2fWfzE0Nff0aivfuPF7jwfmp2KWDaS5lTAS31UPGDJDsDiNUooRZpeNXb45ErxQgRWQvs6PNrj0TsG0NEbW1u1Q5mInc75Tg90DuW1lHga5ePYG+LMPZfiljNFIvHnpvaGpIKF7rV7gw==");
                        File cacheDir = context.getCacheDir();
                        if (cacheDir == null && (cacheDir = context.getDir("dex", 0)) == null) {
                            throw new zza();
                        }
                        File file = cacheDir;
                        File createTempFile = File.createTempFile("ads", ".jar", file);
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        fileOutputStream.write(a3, 0, a3.length);
                        fileOutputStream.close();
                        try {
                            DexClassLoader dexClassLoader = new DexClassLoader(createTempFile.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
                            Class loadClass = dexClassLoader.loadClass(a(a2, "NVrMgyDXngi1HMja2vu9w1f5iJelHefADUA4uUd5mEZRwSBAdm4/qy6dLm5W7XtJ"));
                            Class loadClass2 = dexClassLoader.loadClass(a(a2, "6GEp/4LNeka/VKypCmPIkIAdw5SB0kPV3bXrjRIjcoZ/MBMufiQspb8z/xnY0aJS"));
                            Class loadClass3 = dexClassLoader.loadClass(a(a2, "/9WY2X93JxywV3ebgGG6sFoNfc0S+/Vz8vUMbP9sSAMpOaEyqgHu4zPA78qMscj7"));
                            Class loadClass4 = dexClassLoader.loadClass(a(a2, "sxDeDQKLra7FaZXRTdLEmZd9OIPjaAa2nwLkTuhkw6u+J3onxLumwTyI8LF737lE"));
                            Class loadClass5 = dexClassLoader.loadClass(a(a2, "eLMWjwJ/7mciZZHOgSUDsgcN/SZX5fe5lF89M8HKGdRolXtCZs2JIkYKEY5J4oKr"));
                            Class loadClass6 = dexClassLoader.loadClass(a(a2, "B8hYZZar7XBkiBcZXIPOOZ73lIIU+SWfNEtNrAmDndQfyHQisoVsNbdKE/fC3EgK"));
                            Class loadClass7 = dexClassLoader.loadClass(a(a2, "RBlXIGmvwm9DPbs9Was7RRLUOPv3Q/ROw2ZrtmIbKCxYrdqL4Gz1bmRwNWmZwzze"));
                            Class loadClass8 = dexClassLoader.loadClass(a(a2, "aRx6mrrZQZQrjBhJNj0VVF/jgBd6x+GK0VAE2Jz4mu4BE4VEi6eQJK5QUfd/Qrgw"));
                            Class loadClass9 = dexClassLoader.loadClass(a(a2, "nDsYTkf8JZ4Tm/u+JqOTAON1FQnTIgPcYLeErXq/sIu8Q60h6L0j+2BZuEjdVxx2"));
                            Class loadClass10 = dexClassLoader.loadClass(a(a2, "bzZCUljDmgNFViSHqlMRvRsfV/QIX5SK6Q3xULWE8IozPHgcy16J7TvaWH1tH2uo"));
                            Class loadClass11 = dexClassLoader.loadClass(a(a2, "2naKbAxfnvXFt2NLPTZMmw9xBFGefovCamZW2RrRNQ3XqaA2t7SI1xzi2ZWNbb3X"));
                            Class loadClass12 = dexClassLoader.loadClass(a(a2, "mLhsiLvx/mVCTV4ak4VqfIU6RU8apVl7w4kRPEWwcxdCQP1AZdTgPuUclIWanu0H"));
                            Class loadClass13 = dexClassLoader.loadClass(a(a2, "DkWVWEBhyx3Q4rmYkguqgmfOY2ZkJd4AxOGEyrU3NvV45SAEjN2Bd2Ug8Rm2UsS1"));
                            m = loadClass.getMethod(a(a2, "AzFdb4e/pRBKL17OCcQ6E9u2skptmXAyXfd+uqGoR+U="), new Class[0]);
                            n = loadClass2.getMethod(a(a2, "r8U3aGDopAKCr6mVf575dtyr930jAqVkqaqaxy2dibw="), new Class[0]);
                            o = loadClass3.getMethod(a(a2, "IzCPsB4cZvkYltzGcAnHzzS1EC/ezICdsKOOnnSN6kE="), new Class[0]);
                            p = loadClass4.getMethod(a(a2, "oQ8FEGD2pumrQ1j+TtPoSf1mj/eCdg4WzLAs1h7vjLM="), Context.class);
                            q = loadClass5.getMethod(a(a2, "PWhRTh0tmukbtwDClRfbdzqS33VS8hyKb/3fzDL0uvg="), MotionEvent.class, DisplayMetrics.class);
                            r = loadClass6.getMethod(a(a2, "QzNz07+7jKpdV0mmEoiJN+cENg9htX3qJ5AVOpfkFEI="), Context.class);
                            s = loadClass7.getMethod(a(a2, "DelKHi3vAOfXJzUzBhf9RfIKHTzM9Xe89630YD3UQQU="), Context.class);
                            t = loadClass8.getMethod(a(a2, "okVGVigbzSZ9cUMhWZFOrBuig5RktNgFMWOQFrw4GuA="), Context.class);
                            u = loadClass9.getMethod(a(a2, "8gH4LVOm/28Ej0byyrzpvDhuENUV1jAnA0g6XV3AAaI="), Context.class);
                            v = loadClass10.getMethod(a(a2, "vdpqJzUpT6MwmhkVAf/0cAHnHDu5n+6EGRA/p+VEDQo="), Context.class);
                            w = loadClass11.getMethod(a(a2, "JBQ50zbroCrfvnpstQ1C2P1ib8Ii+BwOzwJRX+21Ttw="), Context.class);
                            x = loadClass12.getMethod(a(a2, "XRsMpdPzNdNHXKvUVRrY4FlJ0p36HXY+0o8qAPap8ng="), Context.class);
                            y = loadClass13.getMethod(a(a2, "50JpRbumtSiV67P25YuMuyc8G6ENzp9s9lyhXownaa0="), Context.class);
                            C = f().longValue();
                            E = new Random();
                            try {
                                d = new com.google.android.gms.common.api.n(context).a(com.google.android.gms.clearcut.a.c).b();
                                F = com.google.android.gms.common.b.a();
                                G = com.google.android.gms.common.b.a(context) == 0;
                                com.google.android.gms.ads.internal.apkg.f.a(context);
                                i = ((Boolean) com.google.android.gms.ads.internal.d.j().a(com.google.android.gms.ads.internal.apkg.f.ay)).booleanValue();
                                f = new com.google.android.gms.clearcut.a(context, "ADSHIELD");
                            } catch (NoClassDefFoundError e2) {
                            }
                            e = true;
                        } finally {
                            String name = createTempFile.getName();
                            createTempFile.delete();
                            new File(file, name.replace(".jar", ".dex")).delete();
                        }
                    } catch (zzas.zza e3) {
                        throw new zza(e3);
                    } catch (FileNotFoundException e4) {
                        throw new zza(e4);
                    } catch (IOException e5) {
                        throw new zza(e5);
                    } catch (ClassNotFoundException e6) {
                        throw new zza(e6);
                    } catch (NoSuchMethodException e7) {
                        throw new zza(e7);
                    } catch (NullPointerException e8) {
                        throw new zza(e8);
                    }
                } catch (zza e9) {
                } catch (UnsupportedOperationException e10) {
                }
            }
        }
    }

    private static void d() {
        if (!l || f == null) {
            return;
        }
        com.google.android.gms.clearcut.a aVar = f;
        aVar.e.a(TimeUnit.MILLISECONDS);
        d.d();
    }

    protected static void a(int i2, int i3) {
        if (l && i && f != null) {
            com.google.android.gms.clearcut.c a2 = f.a(af.a(g));
            a2.f5554a.f = i3;
            a2.f5554a.e = i2;
            a2.a(d);
        }
    }
}
