/*
 * This file was automatically generated by EvoSuite
 */

package com.ib.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.ib.client.Contract;
import com.ib.client.ContractDetails;
import com.ib.client.EWrapperMsgGenerator;
import com.ib.client.Execution;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.TagValue;
import com.ib.client.UnderComp;
import java.util.Vector;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EWrapperMsgGeneratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertNotNull(string0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((long) 34);
      assertEquals("current time = 34 (01-Jan-1970 01:00:34)", string0);
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("id=34 time = 34 open=34.0 high=34.0 low=34.0 close=34.0 volume=34 count=34 WAP=34.0");
      assertNotNull(string0);
      assertEquals("updateAccountTime: id=34 time = 34 open=34.0 high=34.0 low=34.0 close=34.0 volume=34 count=34 WAP=34.0", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("", "", "", "");
      assertEquals("updateAccountValue:    ", string0);
      assertNotNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(1055, 1055, 1055);
      assertNotNull(string0);
      assertEquals("id=1055  unknown=1055.0", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA((-1), "Oa0#fSgt2;Sy`xC@");
      assertNotNull(string0);
      assertEquals("FA: null Oa0#fSgt2;Sy`xC@", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation((-1489), underComp0);
      assertEquals("id = -1489 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
      assertNotNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("id=2  askPrice=2.0  noAutoExecute");
      assertNotNull(string0);
      assertEquals("accountDownloadEnd: id=2  askPrice=2.0  noAutoExecute", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails((-1), contractDetails0);
      assertEquals("reqId = -1 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
      assertNotNull(string0);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(12);
      assertNotNull(string0);
      assertEquals("reqId = 12 =============== end ===============", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(1794, 1794, "Next Valid Order ID: 1794", 1794, 1794, (double) 1794, 1794);
      assertNotNull(string0);
      assertEquals("updateMktDepth: 1794 1794 Next Valid Order ID: 1794 1794 1794 1794.0 1794", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(0, "FA: null Oa0#fSgt2;Sy`xC@");
      assertNotNull(string0);
      assertEquals("id  = 0 len = 25\nFA: null Oa0#fSgt2;Sy`xC@", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(1055);
      assertNotNull(string0);
      assertEquals("reqId = 1055 =============== end ===============", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(34, 34, 34, 34, 34, 34, 34, 34, 34);
      assertEquals("id=34 time = 34 open=34.0 high=34.0 low=34.0 close=34.0 volume=34 count=34 WAP=34.0", string0);
      assertNotNull(string0);
  }

  @Test
  public void test16()  throws Throwable  {
      Execution execution0 = new Execution();
      // Undeclared exception!
      try {
        EWrapperMsgGenerator.execDetails(2, (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(1794, "Next Valid Order ID: 1794", 1794, 1794, (double) 1794, 1794, 1794, (double) 1794, 1794, "Next Valid Order ID: 1794");
      assertNotNull(string0);
      assertEquals("order status: orderId=1794 clientId=1794 permId=1794 status=Next Valid Order ID: 1794 filled=1794 remaining=1794 avgFillPrice=1794.0 lastFillPrice=1794.0 parent Id=1794 whyHeld=Next Valid Order ID: 1794", string0);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(41, 41, 41, 41, 41, 41);
      assertNotNull(string0);
      assertEquals("updateMktDepth: 41 41 41 41 41.0 41", string0);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(1055, 1055, " status=", " status=");
      assertEquals("MsgId=1055 :: MsgType=1055 :: Origin= status= :: Message= status=", string0);
      assertNotNull(string0);
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("id = -1489 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0");
      assertNotNull(string0);
      assertEquals("SCANNER PARAMETERS:\nid = -1489 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(0, 0, "Next Valid Order ID: 0");
      assertNotNull(string0);
      assertEquals("id=0  bidSize=Next Valid Order ID: 0", string0);
  }

  @Test
  public void test22()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, 0, (double) 0, (String) null, 0.0, 0, (String) null, (double) 0, (double) 0);
      assertEquals("id=0  bidSize: basisPoints = 0.0/null impliedFuture = 0.0 holdDays = 0 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 0.0", string0);
      assertNotNull(string0);
  }

  @Test
  public void test23()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, (double) 0, 0.0, (double) 0, 0.0, (double) 652, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 0.0 0.0 0.0 0.0 652.0 null", string0);
      assertNotNull(string0);
  }

  @Test
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(1, "{ykQ*'^p'GvcR\u0005TJ", (double) 1, (double) 1, (double) 1, (double) 1, 1, 1, (double) 1, true);
      assertEquals("id=1 date = {ykQ*'^p'GvcR\u0005TJ open=1.0 high=1.0 low=1.0 close=1.0 volume=1 count=1 WAP=1.0 hasGaps=true", string0);
      assertNotNull(string0);
  }

  @Test
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(1055, 1055, 1055);
      assertNotNull(string0);
      assertEquals("id=1055  unknown=1055", string0);
  }

  @Test
  public void test26()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  @Test
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("Next Valid Order ID: 1794");
      assertEquals("Connected : The list of managed accounts are : [Next Valid Order ID: 1794]", string0);
      assertNotNull(string0);
  }

  @Test
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(41);
      assertEquals("id = 41 =============== end ===============", string0);
      assertNotNull(string0);
  }

  @Test
  public void test29()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(687, 687, contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 687 rank=687 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
      assertNotNull(string0);
  }

  @Test
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(0);
      assertNotNull(string0);
      assertEquals("id=0 =============== end ===============", string0);
  }

  @Test
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(2, 2, 2, 0);
      assertNotNull(string0);
      assertEquals("id=2  askPrice=2.0  noAutoExecute", string0);
  }

  @Test
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(1055, 1055, 1055, 1055);
      assertNotNull(string0);
      assertEquals("id=1055  unknown=1055.0  canAutoExecute", string0);
  }

  @Test
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1), (-1), (double) (-1), (double) (-1), (double) 1473L, (double) 1473L);
      assertEquals("id=-1  unknown: vol = N/A delta = -1.0", string0);
      assertNotNull(string0);
  }

  @Test
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, (double) 0, (double) 0, 1.7976931348623157E308);
      assertNotNull(string0);
      assertEquals("id=0  bidSize: vol = N/A delta = 0.0", string0);
  }

  @Test
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, (double) 13, (double) 0, (double) 0, 1.7976931348623157E308);
      assertNotNull(string0);
      assertEquals("id=0  modelOptComp: vol = 13.0 delta = 0.0: modelPrice = 0.0: pvDividend = N/A", string0);
  }

  @Test
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(2, 13, (double) 13, (double) 2, (-5.080579821457763), (-5.080579821457763));
      assertEquals("id=2  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
      assertNotNull(string0);
  }

  @Test
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1, 13, (double) 13, (double) 1, 1.7976931348623157E308, (double) 13);
      assertNotNull(string0);
      assertEquals("id=1  modelOptComp: vol = 13.0 delta = 1.0: modelPrice = N/A: pvDividend = 13.0", string0);
  }

  @Test
  public void test38()  throws Throwable  {
      Contract contract0 = new Contract(1055, " status=", "id=1055  unknown=1055", "id=1055  unknown=1055", (double) 1055, "id=1055  unknown=1055", "id=1055  unknown=1055", " status=", "id=1055  unknown=1055", "id=1055  unknown=1055", (Vector) null, "id=1055  unknown=1055", true, " status=", "id=1055  unknown=1055");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, "id=1055  unknown=1055", " status=", "O", 1055, Integer.MAX_VALUE, 1.7976931348623157E308, (String) null, "id=1055  unknown=1055");
      String string0 = EWrapperMsgGenerator.openOrder(1055, contract0, order0, orderState0);
      assertEquals("open order: orderId=1055 action=null quantity=0 symbol= status= exchange= status= secType=id=1055  unknown=1055 type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=id=1055  unknown=1055 client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=id=1055  unknown=1055 maintMargin= status= equityWithLoan=O commission=1055.0 minCommission=2.147483647E9 maxCommission= commissionCurrency=null warningText=id=1055  unknown=1055", string0);
      assertNotNull(string0);
  }

  @Test
  public void test39()  throws Throwable  {
      Vector<TagValue> vector0 = new Vector<TagValue>();
      Contract contract0 = new Contract(1, "BAG", "BAG", "BAG", (double) 1, "BAG", "BAG", "BAG", "BAG", "BAG", (Vector) vector0, "BAG", true, "BAG", "BAG");
      contract0.m_comboLegsDescrip = "BAG";
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, (String) null, (String) null, (String) null, 1.7976931348623157E308, 0, Integer.MAX_VALUE, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      assertEquals("open order: orderId=1 action=null quantity=0 symbol=BAG exchange=BAG secType=BAG type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=BAG client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false comboLegsDescrip=BAG status=null initMargin=null maintMargin=null equityWithLoan=null commission= minCommission=0.0 maxCommission=2.147483647E9 commissionCurrency=null warningText=null", string0);
      assertNotNull(string0);
  }

  @Test
  public void test40()  throws Throwable  {
      Vector<TagValue> vector0 = new Vector<TagValue>();
      Contract contract0 = new Contract(12, "BAG", "BAG", "BAG", (double) 12, "BAG", "BAG", "BAG", "BAG", "BAG", (Vector) vector0, "BAG", true, "BAG", "BAG");
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = (com.ib.client.UnderComp) underComp0;
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, (String) null, (String) null, (String) null, 1.7976931348623157E308, 0, Integer.MAX_VALUE, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(12, contract0, order0, orderState0);
      assertNotNull(string0);
      assertEquals("open order: orderId=12 action=null quantity=0 symbol=BAG exchange=BAG secType=BAG type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=BAG client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false underComp.conId =0 underComp.delta =0.0 underComp.price =0.0 status=null initMargin=null maintMargin=null equityWithLoan=null commission= minCommission=0.0 maxCommission=2.147483647E9 commissionCurrency=null warningText=null", string0);
  }
}
