package com.zipcoin.redCoin.block.test;

import com.zipcoin.model.Block;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BlockTest {

    @Test
    public void constructBlockTest1(){
        Integer expectedBlockNumber = 1;
        String expectedPreviousHash = "1@a!23jk";
        Block block = new Block(expectedBlockNumber, expectedPreviousHash);
        Integer actualBlockNumber = block.getBlockNumber();
        String actualPreviousHash = block.getPreviousHash();
        assertEquals(expectedBlockNumber,actualBlockNumber);
        assertEquals(expectedPreviousHash, actualPreviousHash);
    }

    @Test
    public void constructBlockTest2(){
        Integer expectedBlockNumber = 1;
        Block block = new Block(expectedBlockNumber);
        Integer actualBlockNumber = block.getBlockNumber();
        assertEquals(expectedBlockNumber,actualBlockNumber);
    }

    @Test
    public void setGetPreviousHashTest(){
        Block block = new Block(1);
        String expectedPreviousHash = "2$345LKJ3";
        block.setPreviousHash(expectedPreviousHash);
        String actualPreviousHash = block.getPreviousHash();
        assertEquals(expectedPreviousHash,actualPreviousHash);
    }

    @Test
    public void iterateNonceTest(){
        Block block = new Block(1, "1@a!23jk");
        Integer nonce = 100;
        block.setNonce(nonce);
        block.iterateNonce();
        Integer expected = 101;
        Integer actual = block.getNonce();
        assertEquals(expected,actual);
    }

    @Test
    public void setGetNonceTest(){
        Block block = new Block(1, "1@a!23jk");
        Integer expected = 100;
        block.setNonce(expected);
        Integer actual = block.getNonce();
        assertEquals(expected,actual);
    }

    @Test
    public void updateGetCurrentHashTest(){
        Block block = new Block(1, "1@a!23jk");
        String expected = "A37ABD589F829326C5F56D42CFA4C7EC307D99FF2264FE1322A7431B6637338A";
        String actual = block.getCurrentHash();
        assertEquals(expected,actual);
    }

//    @Test
//    public void addGetTransactionTest(){
//        Block block = new Block(1, "1@a!23jk");
//        Transaction expected = new Transaction();
//        block.addTransaction(expected);
//        String transactions = block.getTransactions();
//        String actual = transactions;
//        assertTrue(expected.equals(actual));
//    }

}
