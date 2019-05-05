/*
 * This file was automatically generated by EvoSuite
 * Sun May 05 03:12:36 GMT 2019
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.Contract;
import com.ib.client.ContractDetails;
import com.ib.client.EWrapperMsgGenerator;
import com.ib.client.Execution;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.UnderComp;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EWrapperMsgGenerator_ESTest extends EWrapperMsgGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      assertNotNull(contractDetails0);
      assertEquals(0.0, contractDetails0.m_coupon, 0.01);
      assertFalse(contractDetails0.m_putable);
      assertFalse(contractDetails0.m_callable);
      assertEquals(0.0, contractDetails0.m_minTick, 0.01);
      assertEquals(0, contractDetails0.m_underConId);
      assertFalse(contractDetails0.m_nextOptionPartial);
      assertEquals(0, contractDetails0.m_priceMagnifier);
      assertFalse(contractDetails0.m_convertible);
      
      String string0 = EWrapperMsgGenerator.scannerData(10, 0, contractDetails0, "", "com.ib.client.OrderState", "", "");
      assertEquals("id = 10 rank=0 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance= benchmark=com.ib.client.OrderState projection= legsStr=", string0);
      assertNotNull(string0);
      assertEquals(0.0, contractDetails0.m_coupon, 0.01);
      assertFalse(contractDetails0.m_putable);
      assertFalse(contractDetails0.m_callable);
      assertEquals(0.0, contractDetails0.m_minTick, 0.01);
      assertEquals(0, contractDetails0.m_underConId);
      assertFalse(contractDetails0.m_nextOptionPartial);
      assertEquals(0, contractDetails0.m_priceMagnifier);
      assertFalse(contractDetails0.m_convertible);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(0, (-1L), 5093.31693793, 619, (-2108.6), 889.0784922, 619, 712.0306181503094, 619);
      assertEquals("id=0 time = -1 open=5093.31693793 high=619.0 low=-2108.6 close=889.0784922 volume=619 count=619 WAP=712.0306181503094", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(1, (String) null, (-2031.8091418), 0.0, 1, 273.6277070787677, 2875, 0, 0, true);
      assertEquals("id=1 date = null open=-2031.8091418 high=0.0 low=1.0 close=273.6277070787677 volume=2875 count=0 WAP=0.0 hasGaps=true", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, (String) null, (-1086), (-1086), (-1.0), 0);
      assertEquals("updateMktDepth: 0 0 null -1086 -1086 -1.0 0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(10, 0, (String) null, 99, 0, 0.0, 99);
      assertEquals("updateMktDepth: 10 0 null 99 0 0.0 99", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(10, 0, 10, (-314), 1.7976931348623157E308, 0);
      assertEquals("updateMktDepth: 10 0 10 -314 1.7976931348623157E308 0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      assertNotNull(contract0);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, (-382), 0.0, 0.0, 0, 68.0, (-382), ":U1mjog3@F*W");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n-382 0.0 0.0 0.0 68.0 -382.0 :U1mjog3@F*W", string0);
      assertNotNull(string0);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("SCANNER PARAMETERS:", (String) null, "SCANNER PARAMETERS:", " =============== end ===============");
      assertEquals("updateAccountValue: SCANNER PARAMETERS: null SCANNER PARAMETERS:  =============== end ===============", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, "reqId = 10 =============== end ===============", 0, 1, 1.0, 1, 0, 0.0, (-2207), "h'+5vc_9Qr??WNDa;");
      assertEquals("order status: orderId=0 clientId=-2207 permId=1 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=0.0 parent Id=0 whyHeld=h'+5vc_9Qr??WNDa;", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus((-1602), "j", 0, 0, 0, 110, 110, 0, (-942), "W'*W");
      assertEquals("order status: orderId=-1602 clientId=-942 permId=110 status=j filled=0 remaining=0 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=110 whyHeld=W'*W", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(109, 1, (-2260.34018991), "2iwp'LMd<>Wsz#CTeH", 0, (-2311), "vB25o@=", 963, 3472.20748);
      assertEquals("id=109  bidPrice: basisPoints = -2260.34018991/2iwp'LMd<>Wsz#CTeH impliedFuture = 0.0 holdDays = -2311 futureExpiry = vB25o@= dividendImpact = 963.0 dividends to expiry = 3472.20748", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(0, 2558, 574.155268);
      assertEquals("id=0  unknown=574.155268", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 205.69153014917, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 205.69153014917: pvDividend = 13.0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 600, 611.67648352, 5662.74, 0.0);
      assertEquals("id=0  modelOptComp: vol = 600.0 delta = N/A: modelPrice = 5662.74: pvDividend = 0.0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-322), 309, 0, 1, 3758, 0);
      assertEquals("id=-322  unknown: vol = 0.0 delta = 1.0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize((-724), 235, 235);
      assertEquals("id=-724  unknown=235", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(27, 10, 0.0, (-2300));
      assertEquals("id=27  bidOptComp=0.0  canAutoExecute", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, (-1269), 1490.1, 109);
      assertEquals("id=0  unknown=1490.1  canAutoExecute", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Contract contract0 = new Contract();
      assertNotNull(contract0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      
      UnderComp underComp0 = new UnderComp();
      assertNotNull(underComp0);
      assertEquals(0, underComp0.m_conId);
      assertEquals(0.0, underComp0.m_delta, 0.01);
      assertEquals(0.0, underComp0.m_price, 0.01);
      
      contract0.m_underComp = underComp0;
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(2689, contract0.m_underComp);
      assertEquals("id = 2689 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
      assertNotNull(string0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, (-1906), (-1906), (-1906), (-65.0), (-1906), (-1906), "SCANNER PARAMETERS:\nid  = 0 len = 8\n[Q9pSQyS");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData(1394, 3593, (ContractDetails) null, (String) null, "order status: orderId=0 clientId=-1 permId=0 status=null filled=2126 remaining=0 avgFillPrice=0.0 lastFillPrice=-1191.913 parent Id=2126 whyHeld=null", "updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n-207 0.0 -207.0 -1.0 0.0 0.0 null", "com.ib.client.TagValue");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Contract contract0 = new Contract();
      assertNotNull(contract0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      
      Order order0 = new Order();
      assertNotNull(order0);
      assertEquals(0.0, order0.m_lmtPrice, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_stockRefPrice, 0.01);
      assertEquals(0, order0.m_origin);
      assertFalse(order0.m_overridePercentageConstraints);
      assertEquals(2, Order.AUCTION_IMPROVEMENT);
      assertEquals(0, order0.m_triggerMethod);
      assertEquals(1.7976931348623157E308, order0.m_percentOffset, 0.01);
      assertEquals(Integer.MAX_VALUE, order0.m_basisPointsType);
      assertEquals('n', Order.OPT_FARMM);
      assertEquals(0, order0.m_totalQuantity);
      assertEquals(1, Order.AUCTION_MATCH);
      assertEquals(0, order0.m_orderId);
      assertEquals(1.7976931348623157E308, order0.m_startingPrice, 0.01);
      assertEquals(0, order0.m_continuousUpdate);
      assertFalse(order0.m_whatIf);
      assertFalse(order0.m_sweepToFill);
      assertEquals(0, order0.m_clientId);
      assertEquals(0.0, order0.m_auxPrice, 0.01);
      assertEquals(Integer.MAX_VALUE, order0.m_referencePriceType);
      assertEquals(0, order0.m_ocaType);
      assertEquals(1.7976931348623157E308, order0.m_stockRangeLower, 0.01);
      assertFalse(order0.m_eTradeOnly);
      assertEquals('b', Order.OPT_BROKER_DEALER);
      assertEquals('?', Order.OPT_UNKNOWN);
      assertEquals(Integer.MAX_VALUE, order0.m_scaleInitLevelSize);
      assertEquals(0, order0.m_permId);
      assertTrue(order0.m_transmit);
      assertEquals('y', Order.OPT_SPECIALIST);
      assertEquals(0, order0.m_displaySize);
      assertEquals(1.7976931348623157E308, order0.m_stockRangeUpper, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_basisPoints, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_delta, 0.01);
      assertEquals(0, order0.m_parentId);
      assertEquals(3, Order.AUCTION_TRANSPARENT);
      assertEquals(1.7976931348623157E308, order0.m_deltaNeutralAuxPrice, 0.01);
      assertEquals(1, Order.FIRM);
      assertEquals('f', Order.OPT_FIRM);
      assertEquals(Integer.MAX_VALUE, order0.m_volatilityType);
      assertEquals(1.7976931348623157E308, order0.m_nbboPriceCap, 0.01);
      assertEquals(Integer.MAX_VALUE, order0.m_scaleSubsLevelSize);
      assertFalse(order0.m_firmQuoteOnly);
      assertEquals(1.7976931348623157E308, order0.m_scalePriceIncrement, 0.01);
      assertFalse(order0.m_blockOrder);
      assertFalse(order0.m_hidden);
      assertEquals('m', Order.OPT_ISEMM);
      assertFalse(order0.m_notHeld);
      assertFalse(order0.m_outsideRth);
      assertEquals(0, Order.CUSTOMER);
      assertEquals(1.7976931348623157E308, order0.m_trailStopPrice, 0.01);
      assertEquals('c', Order.OPT_CUSTOMER);
      assertEquals(0.0, order0.m_discretionaryAmt, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_volatility, 0.01);
      assertEquals(Integer.MAX_VALUE, order0.m_minQty);
      assertEquals(0, order0.m_auctionStrategy);
      assertEquals(0, order0.m_shortSaleSlot);
      assertFalse(order0.m_allOrNone);
      
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(1695, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData((-1269), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Execution execution0 = new Execution(1081, 3041, "UV$v\"S <-^", (String) null, "current time = -1354 (Dec 31, 1969 11:37:26 PM)", "id=888 =============== end ===============", "F.c~J[", (-3457), 0.0, 98, 758, 3041, 98);
      assertNotNull(execution0);
      assertEquals(758, execution0.m_liquidation);
      assertEquals(3041, execution0.m_clientId);
      assertEquals(98, execution0.m_permId);
      assertEquals(3041, execution0.m_cumQty);
      assertEquals(0.0, execution0.m_price, 0.01);
      assertEquals(98.0, execution0.m_avgPrice, 0.01);
      assertEquals(1081, execution0.m_orderId);
      assertEquals((-3457), execution0.m_shares);
      
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(1081, (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractMsg((Contract) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails((-2466), (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(0, (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Contract contract0 = new Contract(39, "jx3)PkPT)-EM*L", "order status: orderId=0 clientId=2674 permId=-1 status=id=0 time = -1 open=-235.5 high=0.0 low=-235.5 close=0.0 volume=0 count=0 WAP=0.0 filled=39 remaining=-711 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=-1321 whyHeld=jx3)PkPT)-EM*L", "", 485.1, "order status: orderId=0 clientId=2674 permId=-1 status=id=0 time = -1 open=-235.5 high=0.0 low=-235.5 close=0.0 volume=0 count=0 WAP=0.0 filled=39 remaining=-711 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=-1321 whyHeld=jx3)PkPT)-EM*L", "V", "", "V", "order status: orderId=0 clientId=2674 permId=-1 status=id=0 time = -1 open=-235.5 high=0.0 low=-235.5 close=0.0 volume=0 count=0 WAP=0.0 filled=39 remaining=-711 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=-1321 whyHeld=jx3)PkPT)-EM*L", (Vector) null, "", false, "Error - ", "jx3)PkPT)-EM*L");
      assertNotNull(contract0);
      assertEquals(485.1, contract0.m_strike, 0.01);
      assertEquals(39, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 39\nsymbol = jx3)PkPT)-EM*L\nsecType = order status: orderId=0 clientId=2674 permId=-1 status=id=0 time = -1 open=-235.5 high=0.0 low=-235.5 close=0.0 volume=0 count=0 WAP=0.0 filled=39 remaining=-711 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=-1321 whyHeld=jx3)PkPT)-EM*L\nexpiry = \nstrike = 485.1\nright = order status: orderId=0 clientId=2674 permId=-1 status=id=0 time = -1 open=-235.5 high=0.0 low=-235.5 close=0.0 volume=0 count=0 WAP=0.0 filled=39 remaining=-711 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=-1321 whyHeld=jx3)PkPT)-EM*L\nmultiplier = V\nexchange = \nprimaryExch = \ncurrency = V\nlocalSymbol = order status: orderId=0 clientId=2674 permId=-1 status=id=0 time = -1 open=-235.5 high=0.0 low=-235.5 close=0.0 volume=0 count=0 WAP=0.0 filled=39 remaining=-711 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=-1321 whyHeld=jx3)PkPT)-EM*L\n", string0);
      assertNotNull(string0);
      assertEquals(485.1, contract0.m_strike, 0.01);
      assertEquals(39, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Contract contract0 = new Contract();
      assertNotNull(contract0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      
      UnderComp underComp0 = new UnderComp();
      assertNotNull(underComp0);
      assertEquals(0.0, underComp0.m_price, 0.01);
      assertEquals(0, underComp0.m_conId);
      assertEquals(0.0, underComp0.m_delta, 0.01);
      
      contract0.m_underComp = underComp0;
      ContractDetails contractDetails0 = new ContractDetails(contract0, "^;c64", "reqId = 2970 =============== end ===============", 0L, (String) null, (String) null, 2970, " =============== end ===============", "^;c64", "", "_BIEc'6o7sR", (String) null, "?", "K/^l)i;C]a 7vw??fX", (String) null);
      assertNotNull(contractDetails0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0.0, contractDetails0.m_minTick, 0.01);
      assertFalse(contractDetails0.m_convertible);
      assertEquals(2970, contractDetails0.m_underConId);
      assertFalse(contractDetails0.m_putable);
      assertEquals(0.0, contractDetails0.m_coupon, 0.01);
      assertEquals(0, contractDetails0.m_priceMagnifier);
      assertFalse(contractDetails0.m_nextOptionPartial);
      assertFalse(contractDetails0.m_callable);
      
      Order order0 = new Order();
      assertNotNull(order0);
      assertEquals(1.7976931348623157E308, order0.m_deltaNeutralAuxPrice, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_stockRangeUpper, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_basisPoints, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_trailStopPrice, 0.01);
      assertEquals(1, Order.FIRM);
      assertEquals(0.0, order0.m_discretionaryAmt, 0.01);
      assertEquals(0.0, order0.m_auxPrice, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_delta, 0.01);
      assertEquals('f', Order.OPT_FIRM);
      assertEquals(1.7976931348623157E308, order0.m_nbboPriceCap, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_volatility, 0.01);
      assertEquals(0, order0.m_shortSaleSlot);
      assertEquals('c', Order.OPT_CUSTOMER);
      assertFalse(order0.m_hidden);
      assertFalse(order0.m_allOrNone);
      assertFalse(order0.m_firmQuoteOnly);
      assertEquals(1, Order.AUCTION_MATCH);
      assertEquals(0, order0.m_clientId);
      assertFalse(order0.m_notHeld);
      assertFalse(order0.m_whatIf);
      assertEquals('m', Order.OPT_ISEMM);
      assertEquals(Integer.MAX_VALUE, order0.m_minQty);
      assertEquals(0, Order.CUSTOMER);
      assertEquals(3, Order.AUCTION_TRANSPARENT);
      assertEquals(Integer.MAX_VALUE, order0.m_scaleSubsLevelSize);
      assertEquals(2, Order.AUCTION_IMPROVEMENT);
      assertEquals(1.7976931348623157E308, order0.m_stockRefPrice, 0.01);
      assertEquals(Integer.MAX_VALUE, order0.m_volatilityType);
      assertEquals('n', Order.OPT_FARMM);
      assertEquals(0, order0.m_parentId);
      assertEquals(Integer.MAX_VALUE, order0.m_scaleInitLevelSize);
      assertEquals(0, order0.m_permId);
      assertEquals(0, order0.m_orderId);
      assertEquals(0.0, order0.m_lmtPrice, 0.01);
      assertEquals(0, order0.m_origin);
      assertEquals(0, order0.m_auctionStrategy);
      assertEquals(1.7976931348623157E308, order0.m_startingPrice, 0.01);
      assertFalse(order0.m_sweepToFill);
      assertEquals(0, order0.m_triggerMethod);
      assertEquals(1.7976931348623157E308, order0.m_percentOffset, 0.01);
      assertFalse(order0.m_overridePercentageConstraints);
      assertEquals(Integer.MAX_VALUE, order0.m_basisPointsType);
      assertEquals(0, order0.m_ocaType);
      assertFalse(order0.m_eTradeOnly);
      assertEquals(1.7976931348623157E308, order0.m_stockRangeLower, 0.01);
      assertEquals(0, order0.m_totalQuantity);
      assertEquals(1.7976931348623157E308, order0.m_scalePriceIncrement, 0.01);
      assertEquals(Integer.MAX_VALUE, order0.m_referencePriceType);
      assertFalse(order0.m_outsideRth);
      assertFalse(order0.m_blockOrder);
      assertEquals(0, order0.m_displaySize);
      assertEquals(0, order0.m_continuousUpdate);
      assertTrue(order0.m_transmit);
      assertEquals('y', Order.OPT_SPECIALIST);
      assertEquals('b', Order.OPT_BROKER_DEALER);
      assertEquals('?', Order.OPT_UNKNOWN);
      
      OrderState orderState0 = new OrderState();
      assertNotNull(orderState0);
      assertEquals(0.0, orderState0.m_commission, 0.01);
      assertEquals(0.0, orderState0.m_minCommission, 0.01);
      assertEquals(0.0, orderState0.m_maxCommission, 0.01);
      
      String string0 = EWrapperMsgGenerator.openOrder(102, contractDetails0.m_summary, order0, orderState0);
      assertNotNull(string0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0.0, contractDetails0.m_minTick, 0.01);
      assertFalse(contractDetails0.m_convertible);
      assertEquals(2970, contractDetails0.m_underConId);
      assertFalse(contractDetails0.m_putable);
      assertEquals(0.0, contractDetails0.m_coupon, 0.01);
      assertEquals(0, contractDetails0.m_priceMagnifier);
      assertFalse(contractDetails0.m_nextOptionPartial);
      assertFalse(contractDetails0.m_callable);
      assertEquals(1.7976931348623157E308, order0.m_deltaNeutralAuxPrice, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_stockRangeUpper, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_basisPoints, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_trailStopPrice, 0.01);
      assertEquals(1, Order.FIRM);
      assertEquals(0.0, order0.m_discretionaryAmt, 0.01);
      assertEquals(0.0, order0.m_auxPrice, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_delta, 0.01);
      assertEquals('f', Order.OPT_FIRM);
      assertEquals(1.7976931348623157E308, order0.m_nbboPriceCap, 0.01);
      assertEquals(1.7976931348623157E308, order0.m_volatility, 0.01);
      assertEquals(0, order0.m_shortSaleSlot);
      assertEquals('c', Order.OPT_CUSTOMER);
      assertFalse(order0.m_hidden);
      assertFalse(order0.m_allOrNone);
      assertFalse(order0.m_firmQuoteOnly);
      assertEquals(1, Order.AUCTION_MATCH);
      assertEquals(0, order0.m_clientId);
      assertFalse(order0.m_notHeld);
      assertFalse(order0.m_whatIf);
      assertEquals('m', Order.OPT_ISEMM);
      assertEquals(Integer.MAX_VALUE, order0.m_minQty);
      assertEquals(0, Order.CUSTOMER);
      assertEquals(3, Order.AUCTION_TRANSPARENT);
      assertEquals(Integer.MAX_VALUE, order0.m_scaleSubsLevelSize);
      assertEquals(2, Order.AUCTION_IMPROVEMENT);
      assertEquals(1.7976931348623157E308, order0.m_stockRefPrice, 0.01);
      assertEquals(Integer.MAX_VALUE, order0.m_volatilityType);
      assertEquals('n', Order.OPT_FARMM);
      assertEquals(0, order0.m_parentId);
      assertEquals(Integer.MAX_VALUE, order0.m_scaleInitLevelSize);
      assertEquals(0, order0.m_permId);
      assertEquals(0, order0.m_orderId);
      assertEquals(0.0, order0.m_lmtPrice, 0.01);
      assertEquals(0, order0.m_origin);
      assertEquals(0, order0.m_auctionStrategy);
      assertEquals(1.7976931348623157E308, order0.m_startingPrice, 0.01);
      assertFalse(order0.m_sweepToFill);
      assertEquals(0, order0.m_triggerMethod);
      assertEquals(1.7976931348623157E308, order0.m_percentOffset, 0.01);
      assertFalse(order0.m_overridePercentageConstraints);
      assertEquals(Integer.MAX_VALUE, order0.m_basisPointsType);
      assertEquals(0, order0.m_ocaType);
      assertFalse(order0.m_eTradeOnly);
      assertEquals(1.7976931348623157E308, order0.m_stockRangeLower, 0.01);
      assertEquals(0, order0.m_totalQuantity);
      assertEquals(1.7976931348623157E308, order0.m_scalePriceIncrement, 0.01);
      assertEquals(Integer.MAX_VALUE, order0.m_referencePriceType);
      assertFalse(order0.m_outsideRth);
      assertFalse(order0.m_blockOrder);
      assertEquals(0, order0.m_displaySize);
      assertEquals(0, order0.m_continuousUpdate);
      assertTrue(order0.m_transmit);
      assertEquals('y', Order.OPT_SPECIALIST);
      assertEquals('b', Order.OPT_BROKER_DEALER);
      assertEquals('?', Order.OPT_UNKNOWN);
      assertEquals(0.0, orderState0.m_commission, 0.01);
      assertEquals(0.0, orderState0.m_minCommission, 0.01);
      assertEquals(0.0, orderState0.m_maxCommission, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1), (-1071), 0.0, 0.0, 0.0, (-1246));
      assertEquals("id=-1  unknown: vol = 0.0 delta = 0.0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-382), (-2), 1.7976931348623157E308, 1.7976931348623157E308, 1, 2875);
      assertEquals("id=-382  unknown: vol = N/A delta = N/A", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 600, 611.67648352, 0, 0.0);
      assertEquals("id=0  modelOptComp: vol = 600.0 delta = N/A: modelPrice = 0.0: pvDividend = 0.0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-2120), (-1046), (-2120), (-917.4), 492.48718577, 10);
      assertEquals("id=-2120  unknown: vol = N/A delta = N/A", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 0, 0, 0);
      assertEquals("id=0  bidSize=0.0  noAutoExecute", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(888, 888, (-1523), 888, (-1523), 98);
      assertEquals("updateMktDepth: 888 888 -1523 888 -1523.0 98", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(13, 0, "km");
      assertEquals("id=13  bidSize=km", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Contract contract0 = new Contract();
      assertNotNull(contract0);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(2689, contract0.m_underComp);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(3131, 619, (String) null, "updateAccountTime: FA:");
      assertEquals("MsgId=3131 :: MsgType=619 :: Origin=updateAccountTime: FA: :: Message=null", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-360), "qieAPS l%pCsqj'S7");
      assertEquals("id  = -360 len = 17\nqieAPS l%pCsqj'S7", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, (-207), 0.0, (-207), (-1), 0, 0.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n-207 0.0 -207.0 -1.0 0.0 0.0 null", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue(" TIF=", "id = -636 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", (String) null, (String) null);
      assertEquals("updateAccountValue:  TIF= id = -636 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0 null null", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(619, "yuN,)&]}BEo");
      assertEquals("FA: null yuN,)&]}BEo", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(600);
      assertEquals("reqId = 600 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(469);
      assertEquals("id=469 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(600);
      assertEquals("id = 600 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts((String) null);
      assertEquals("Connected : The list of managed accounts are : [null]", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, "accountDownloadEnd: Qc}GX5:~a~O^1", "reqId = 600 =============== end ===============", 829.6, (String) null, " TIF=", 600, (String) null, (String) null, "Error - ", (String) null, (String) null, (String) null, "accountDownloadEnd: Qc}GX5:~a~O^1", (String) null);
      String string0 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = accountDownloadEnd: Qc}GX5:~a~O^1\ntradingClass = reqId = 600 =============== end ===============\nminTick = 829.6\nprice magnifier = 0\norderTypes = null\nvalidExchanges =  TIF=\nunderConId = 600\nlongName = null\ncontractMonth = null\nindustry = Error - \ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = accountDownloadEnd: Qc}GX5:~a~O^1\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("Qc}GX5:~a~O^1");
      assertEquals("accountDownloadEnd: Qc}GX5:~a~O^1", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, "accountDownloadEnd: Qc}GX5:~a~O^1", "reqId = 600 =============== end ===============", 829.6, (String) null, " TIF=", 600, (String) null, (String) null, "Error - ", (String) null, (String) null, (String) null, "accountDownloadEnd: Qc}GX5:~a~O^1", (String) null);
      String string0 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = accountDownloadEnd: Qc}GX5:~a~O^1\ntradingClass = reqId = 600 =============== end ===============\nconid = 0\nminTick = 829.6\norderTypes = null\nvalidExchanges =  TIF=\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(600);
      assertEquals("reqId = 600 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((-1682L));
      assertEquals("current time = -1682 (Dec 31, 1969 11:31:58 PM)", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Contract contract0 = new Contract(39, "jx3)PkPT)-EM*L", "order status: orderId=0 clientId=2674 permId=-1 status=id=0 time = -1 open=-235.5 high=0.0 low=-235.5 close=0.0 volume=0 count=0 WAP=0.0 filled=39 remaining=-711 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=-1321 whyHeld=jx3)PkPT)-EM*L", "", 485.1, "order status: orderId=0 clientId=2674 permId=-1 status=id=0 time = -1 open=-235.5 high=0.0 low=-235.5 close=0.0 volume=0 count=0 WAP=0.0 filled=39 remaining=-711 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=-1321 whyHeld=jx3)PkPT)-EM*L", "V", "", "V", "order status: orderId=0 clientId=2674 permId=-1 status=id=0 time = -1 open=-235.5 high=0.0 low=-235.5 close=0.0 volume=0 count=0 WAP=0.0 filled=39 remaining=-711 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=-1321 whyHeld=jx3)PkPT)-EM*L", (Vector) null, "", false, "Error - ", "jx3)PkPT)-EM*L");
      Execution execution0 = new Execution((-1330), (-1), (String) null, "FfK)\"lHz6(yO,aYk0M", " clientId=", "", "pJ", 2674, 0, 3964, 39, (-472), (-1));
      String string0 = EWrapperMsgGenerator.execDetails((-1), contract0, execution0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(13, (-1906), 13);
      assertEquals("id=13  unknown=13", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("FA: null yuN,)&]}BEo");
      assertEquals("SCANNER PARAMETERS:\nFA: null yuN,)&]}BEo", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData((-847), "AobW$Xi5~+?JW", (-4346.65254261), (-4346.65254261), 632.7451476601, 0.0, (-847), (-1682), 0.0, true);
      assertEquals("id=-847 date = AobW$Xi5~+?JW open=-4346.65254261 high=-4346.65254261 low=632.7451476601 close=0.0 volume=-847 count=-1682 WAP=0.0 hasGaps=true", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("O");
      assertEquals("updateAccountTime: O", string0);
  }
}
