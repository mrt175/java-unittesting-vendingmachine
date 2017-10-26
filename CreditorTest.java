package com.teamtreehouse.vending;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditorTest {

    private Creditor creditor;

    @Before
    public void setUp() throws Exception {
        creditor = new Creditor();
    }

    @Test
    public void addingFundsIncrementsAvailableFunds() throws Exception {
        creditor.addFunds(25);
        creditor.addFunds(25);

        assertEquals(50, creditor.getAvailableFunds());
    }

    @Test
    public void refundingReturnsAllAvailableFunds() throws Exception {
        //Arrange
        creditor. addFunds(10);

        //Act
        int refund = creditor.refund();

        //Assert
        assertEquals(10, refund);
    }

    @Test
    public void refundingResetsAvailableFunds() throws Exception {
        //Arrange
        creditor. addFunds(10);

        //Act
        int refund = creditor.refund();

        //Assert
        assertEquals(0, creditor.getAvailableFunds());
    }

    @After
    public void tearDown() throws Exception {

    }
}