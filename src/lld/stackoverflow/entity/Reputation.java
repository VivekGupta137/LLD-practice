package lld.stackoverflow.entity;

import lld.stackoverflow.enums.REPUTATION_TYPE;

public interface Reputation {
    public REPUTATION_TYPE getType();
    public int getReputationPoints();
}
