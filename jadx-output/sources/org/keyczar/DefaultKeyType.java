package org.keyczar;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.keyczar.enums.RsaPadding;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.UnsupportedTypeException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.KeyType;

/* loaded from: classes2.dex */
public enum DefaultKeyType implements KeyType {
    AES(Arrays.asList(128, 192, 256), 0),
    HMAC_SHA1(Arrays.asList(256), 20),
    DSA_PRIV(Arrays.asList(1024), 48),
    DSA_PUB(Arrays.asList(1024), 48),
    RSA_PRIV(Arrays.asList(4096, 2048, 1024), Arrays.asList(512, 256, 128)),
    RSA_PUB(Arrays.asList(4096, 2048, 1024), Arrays.asList(512, 256, 128)),
    EC_PRIV(Arrays.asList(256, 384, 521, 192), 70),
    EC_PUB(Arrays.asList(256, 384, 521, 192), 70),
    TEST(Arrays.asList(1), 0);

    private static Map<String, KeyType> typeMapping;
    private final List<Integer> acceptableSizes;
    private final Map<Integer, Integer> outputSizeMap = new HashMap();

    DefaultKeyType(List list, int i) {
        this.acceptableSizes = list;
        Iterator<Integer> it = this.acceptableSizes.iterator();
        while (it.hasNext()) {
            this.outputSizeMap.put(Integer.valueOf(it.next().intValue()), Integer.valueOf(i));
        }
        addToMapping(name(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    DefaultKeyType(List list, List list2) {
        this.acceptableSizes = list;
        for (int i = 0; i < list.size(); i++) {
            this.outputSizeMap.put(this.acceptableSizes.get(i), list2.get(i));
        }
        addToMapping(name(), this);
    }

    private static void addToMapping(String str, KeyType keyType) {
        if (typeMapping == null) {
            typeMapping = new HashMap();
        }
        typeMapping.put(str, keyType);
    }

    public static KeyType getTypeByName(String str) {
        return typeMapping.get(str);
    }

    @Override // org.keyczar.interfaces.KeyType
    public final int defaultSize() {
        return this.acceptableSizes.get(0).intValue();
    }

    @Override // org.keyczar.interfaces.KeyType
    public final int getOutputSize(int i) {
        return this.outputSizeMap.get(Integer.valueOf(i)).intValue();
    }

    @Override // org.keyczar.interfaces.KeyType
    public final int getOutputSize() {
        return getOutputSize(defaultSize());
    }

    @Override // org.keyczar.interfaces.KeyType
    public final boolean isAcceptableSize(int i) {
        return this.acceptableSizes.contains(Integer.valueOf(i));
    }

    @Override // org.keyczar.interfaces.KeyType
    public final List<Integer> getAcceptableSizes() {
        return Collections.unmodifiableList(this.acceptableSizes);
    }

    @Override // org.keyczar.interfaces.KeyType
    public final String getName() {
        return name();
    }

    @Override // org.keyczar.interfaces.KeyType
    public final KeyType.Builder getBuilder() {
        return new DefaultKeyBuilder();
    }

    final KeyType.Builder getRsaBuilder(RsaPadding rsaPadding) {
        if (this != RSA_PRIV) {
            throw new KeyczarException(Messages.getString("InvalidKeyType", this));
        }
        return new DefaultKeyBuilder(rsaPadding);
    }

    class DefaultKeyBuilder implements KeyType.Builder {
        private final RsaPadding padding;

        private DefaultKeyBuilder(RsaPadding rsaPadding) {
            this.padding = rsaPadding;
        }

        private DefaultKeyBuilder() {
            this.padding = null;
        }

        @Override // org.keyczar.interfaces.KeyType.Builder
        public KeyczarKey read(String str) {
            switch (DefaultKeyType.this) {
                case AES:
                    return AesKey.read(str);
                case HMAC_SHA1:
                    return HmacKey.read(str);
                case DSA_PRIV:
                    return DsaPrivateKey.read(str);
                case DSA_PUB:
                    return DsaPublicKey.read(str);
                case RSA_PRIV:
                    return RsaPrivateKey.read(str);
                case RSA_PUB:
                    return RsaPublicKey.read(str);
                default:
                    throw new UnsupportedTypeException(DefaultKeyType.this);
            }
        }

        @Override // org.keyczar.interfaces.KeyType.Builder
        public KeyczarKey generate(int i) {
            switch (DefaultKeyType.this) {
                case AES:
                    return AesKey.generate(i);
                case HMAC_SHA1:
                    return HmacKey.generate(i);
                case DSA_PRIV:
                    return DsaPrivateKey.generate(i);
                case DSA_PUB:
                case RSA_PUB:
                    throw new KeyczarException(Messages.getString("KeyczarKey.PublicKeyExport", DefaultKeyType.this));
                case RSA_PRIV:
                    return RsaPrivateKey.generate(i, this.padding);
                default:
                    throw new UnsupportedTypeException(DefaultKeyType.this);
            }
        }
    }
}
