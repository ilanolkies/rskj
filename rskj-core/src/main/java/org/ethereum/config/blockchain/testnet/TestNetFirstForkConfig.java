package org.ethereum.config.blockchain.testnet;

// TODO: find a proper name for the "FirstFork"
public class TestNetFirstForkConfig extends TestNetAfterBridgeSyncConfig {
    @Override
    public boolean isRfs55() {
        return true;
    }
}
