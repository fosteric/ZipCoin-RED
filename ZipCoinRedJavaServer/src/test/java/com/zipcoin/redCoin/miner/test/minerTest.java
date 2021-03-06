package com.zipcoin.redCoin.miner.test;

import com.zipcoin.model.Block;
import com.zipcoin.utilities.Miner;
import org.junit.Assert;
import org.junit.Test;

public class minerTest {

    Block block = new Block(0);
    Miner miner = new Miner();

    @Test
    public void testMine_When_HashcodeCheck_Is_False(){

        miner.setHashCodeCheck(false);
        int x = block.getNonce();
        miner.mine(block);
        int y = block.getNonce();

        Assert.assertTrue(y > x);
    }

    @Test
    public void testMine_When_HashcodeCheck_Is_True(){

        miner.setHashCodeCheck(true);
        int x = block.getNonce();
        miner.mine(block);
        int y = block.getNonce();

        Assert.assertTrue(y == x);
    }

}
