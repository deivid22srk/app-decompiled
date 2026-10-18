package org.keyczar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import org.a.a.a;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.enums.KeyStatus;
import org.keyczar.enums.RsaPadding;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.KeyczarReader;

/* loaded from: classes2.dex */
public class GenericKeyczar extends Keyczar {
    private static final a LOG = a.a((Class<?>) GenericKeyczar.class);

    public GenericKeyczar(KeyczarReader keyczarReader) {
        super(keyczarReader);
    }

    public GenericKeyczar(String str) {
        super(str);
    }

    @Override // org.keyczar.Keyczar
    public boolean isAcceptablePurpose(KeyPurpose keyPurpose) {
        return true;
    }

    public KeyMetadata getMetadata() {
        return this.kmd;
    }

    public Set<KeyVersion> getVersions() {
        return Collections.unmodifiableSet(this.versionMap.keySet());
    }

    public KeyczarKey getKey(KeyVersion keyVersion) {
        return this.versionMap.get(keyVersion);
    }

    public void promote(int i) {
        KeyVersion version = getVersion(i);
        LOG.a(Messages.getString("Keyczar.PromotedVersion", version));
        switch (version.getStatus()) {
            case PRIMARY:
                throw new KeyczarException(Messages.getString("Keyczar.CantPromotePrimary", new Object[0]));
            case ACTIVE:
                version.setStatus(KeyStatus.PRIMARY);
                if (this.primaryVersion != null) {
                    this.primaryVersion.setStatus(KeyStatus.ACTIVE);
                }
                this.primaryVersion = version;
                return;
            case INACTIVE:
                version.setStatus(KeyStatus.ACTIVE);
                return;
            default:
                return;
        }
    }

    public void demote(int i) {
        KeyVersion version = getVersion(i);
        LOG.a(Messages.getString("Keyczar.DemotingVersion", version));
        switch (version.getStatus()) {
            case PRIMARY:
                version.setStatus(KeyStatus.ACTIVE);
                this.primaryVersion = null;
                return;
            case ACTIVE:
                version.setStatus(KeyStatus.INACTIVE);
                return;
            case INACTIVE:
                throw new KeyczarException(Messages.getString("Keyczar.CantDemoteScheduled", new Object[0]));
            default:
                return;
        }
    }

    public void addVersion(KeyStatus keyStatus) {
        addVersion(keyStatus, null, this.kmd.getType().defaultSize());
    }

    public void addVersion(KeyStatus keyStatus, int i) {
        addVersion(keyStatus, null, i);
    }

    public void addVersion(KeyStatus keyStatus, RsaPadding rsaPadding) {
        addVersion(keyStatus, rsaPadding, this.kmd.getType().defaultSize());
    }

    public void addVersion(KeyStatus keyStatus, RsaPadding rsaPadding, int i) {
        KeyczarKey genKey;
        if (i < this.kmd.getType().defaultSize()) {
            LOG.b(Messages.getString("Keyczar.SizeWarning", Integer.valueOf(i), Integer.valueOf(this.kmd.getType().defaultSize()), this.kmd.getType().toString()));
        }
        do {
            genKey = KeyczarKey.genKey(this.kmd.getType(), rsaPadding, i);
        } while (getKey(genKey.hash()) != null);
        addVersion(keyStatus, genKey);
    }

    public void addVersion(KeyStatus keyStatus, KeyczarKey keyczarKey) {
        KeyVersion keyVersion = new KeyVersion(numVersions() + 1, keyStatus, false);
        if (keyStatus == KeyStatus.PRIMARY) {
            if (this.primaryVersion != null) {
                this.primaryVersion.setStatus(KeyStatus.ACTIVE);
            }
            this.primaryVersion = keyVersion;
        }
        addKey(keyVersion, keyczarKey);
        LOG.a(Messages.getString("Keyczar.NewVersion", keyVersion));
    }

    public KeyVersion getVersion(int i) {
        KeyVersion version = this.kmd.getVersion(i);
        if (version == null) {
            throw new KeyczarException(Messages.getString("Keyczar.NoSuchVersion", Integer.valueOf(i)));
        }
        return version;
    }

    public void revoke(int i) {
        if (getVersion(i).getStatus() == KeyStatus.INACTIVE) {
            this.kmd.removeVersion(i);
            return;
        }
        throw new KeyczarException(Messages.getString("Keyczar.CantRevoke", new Object[0]));
    }

    private int numVersions() {
        return this.versionMap.size();
    }

    void publicKeyExport(String str) {
        KeyMetadata keyMetadata;
        if (str != null && !str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        KeyMetadata metadata = getMetadata();
        if (metadata.getType() == DefaultKeyType.DSA_PRIV) {
            if (metadata.getPurpose() == KeyPurpose.SIGN_AND_VERIFY) {
                keyMetadata = new KeyMetadata(metadata.getName(), KeyPurpose.VERIFY, DefaultKeyType.DSA_PUB);
            }
            keyMetadata = null;
        } else {
            if (metadata.getType() == DefaultKeyType.RSA_PRIV) {
                switch (metadata.getPurpose()) {
                    case DECRYPT_AND_ENCRYPT:
                        keyMetadata = new KeyMetadata(metadata.getName(), KeyPurpose.ENCRYPT, DefaultKeyType.RSA_PUB);
                        break;
                    case SIGN_AND_VERIFY:
                        keyMetadata = new KeyMetadata(metadata.getName(), KeyPurpose.VERIFY, DefaultKeyType.RSA_PUB);
                        break;
                }
            }
            keyMetadata = null;
        }
        if (keyMetadata == null) {
            throw new KeyczarException(Messages.getString("KeyczarTool.CannotExportPubKey", metadata.getType(), metadata.getPurpose()));
        }
        for (KeyVersion keyVersion : getVersions()) {
            KeyczarPublicKey keyczarPublicKey = ((KeyczarPrivateKey) getKey(keyVersion)).getPublic();
            if (KeyczarTool.getMock() == null) {
                writeFile(keyczarPublicKey.toString(), str + keyVersion.getVersionNumber());
            } else {
                KeyczarTool.getMock().setPublicKey(keyVersion.getVersionNumber(), keyczarPublicKey);
            }
            keyMetadata.addVersion(keyVersion);
        }
        if (KeyczarTool.getMock() == null) {
            writeFile(keyMetadata.toString(), str + "meta");
        } else {
            KeyczarTool.getMock().setPublicKeyMetadata(keyMetadata);
        }
    }

    void write(String str) {
        writeFile(this.kmd.toString(), str + "meta");
        for (KeyVersion keyVersion : getVersions()) {
            writeFile(getKey(keyVersion).toString(), str + keyVersion.getVersionNumber());
        }
    }

    void writeEncrypted(String str, Encrypter encrypter) {
        KeyMetadata metadata = getMetadata();
        metadata.setEncrypted(true);
        writeFile(metadata.toString(), str + "meta");
        for (KeyVersion keyVersion : getVersions()) {
            writeFile(encrypter.encrypt(getKey(keyVersion).toString()), str + keyVersion.getVersionNumber());
        }
    }

    void writeFile(String str, String str2) {
        File file = new File(str2);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            throw new KeyczarException(Messages.getString("KeyczarTool.UnableToWrite", file.toString()), e);
        }
    }
}
