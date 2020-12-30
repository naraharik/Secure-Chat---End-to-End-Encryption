package com.narahari.securechatt;


/*
import com.facebook.android.crypto.keychain.AndroidConceal;
import com.facebook.crypto.CryptoConfig;
import com.facebook.crypto.exception.CryptoInitializationException;
import com.facebook.crypto.keychain.KeyChain;
import com.facebook.crypto.keygen.PasswordBasedKeyDerivation;

import java.util.Arrays;

public class PasswordGeneratedKeyChain implements KeyChain {
    private final CryptoConfig mConfig;
    private final PasswordBasedKeyDerivation mDerivation;
    private byte[] mKey;

    public PasswordGeneratedKeyChain(CryptoConfig config) {
        mConfig = config;
        mDerivation = AndroidConceal.get().createPasswordBasedKeyDerivation();
        mDerivation.setKeyLengthInBytes(config.keyLength);
    }

    public void setPassword(String pwd) { mDerivation.setPassword(pwd); }

    // used only for reading, it should read the salt from the same place the encrypted content is
    public void setSalt(byte[] salt) { mDerivation.setSalt(salt); }

    // used only for encrypting, you will need to store it in the same place you're writing the encrypted content
    public byte[] getSalt() { return mDerivation.getSalt(); }

    public void generate() throws CryptoInitializationException {
        mKey = mDerivation.generate();
    }

    /// implementing Key Chain

    // key for encryption
    public byte[] getCipherKey() {
        if (mKey == null) throw new IllegalStateException("You need to call generate() first");
        return mKey;
    }

    // key for mac
    public byte[] getMacKey() {
        // if you need mac you need a second derivation object
        throw new UnsupportedOperationException("implemented only for encryption, not mac");
    }

    // this is just a glorified "get me a new nonce"
    public byte[] getNewIV() {
        byte[] result = new byte[mConfig.ivLength];
        AndroidConceal.get().secureRandom.nextBytes(result);
        return result;
    }

    public void destroyKeys() {
        Arrays.fill(mKey, (byte) 0);
        mKey = null;
    }
}
*/


