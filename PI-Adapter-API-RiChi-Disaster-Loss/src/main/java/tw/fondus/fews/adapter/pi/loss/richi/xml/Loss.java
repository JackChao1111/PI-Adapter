package tw.fondus.fews.adapter.pi.loss.richi.xml;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

/**
 * POJO disaster loss of API XML configuration.
 * 
 * @author Chao
 *
 */
public class Loss {
	@Element( name = "TOWN_ID" )
	private String townId;

	@Element( name = "TOWN_NA" )
	private String townName;
	
	@Element( name = "C1LOSS" )
	private BigDecimal c1Loss;
	
	@Element( name = "C1AREA" )
	private BigDecimal c1Area;
	
	@Element( name = "C2LOSS" )
	private BigDecimal c2Loss;
	
	@Element( name = "C2AREA" )
	private BigDecimal c2Area;
	
	@Element( name = "C3LOSS" )
	private BigDecimal c3Loss;
	
	@Element( name = "C3AREA" )
	private BigDecimal c3Area;
	
	@Element( name = "C4LOSS" )
	private BigDecimal c4Loss;
	
	@Element( name = "C4AREA" )
	private BigDecimal c4Area;
	
	@Element( name = "H1LOSS" )
	private BigDecimal h1Loss;
	
	@Element( name = "H1UNIT" )
	private BigDecimal h1Count;

	@Element( name = "H2LOSS" )
	private BigDecimal h2Loss;
	
	@Element( name = "H2UNIT" )
	private BigDecimal h2Count;

	@Element( name = "F1LOSS" )
	private BigDecimal f1Loss;
	
	@Element( name = "F1AREA" )
	private BigDecimal f1Area;

	@Element( name = "F2LOSS" )
	private BigDecimal f2Loss;
	
	@Element( name = "F2AREA" )
	private BigDecimal f2Area;

	@Element( name = "F3LOSS" )
	private BigDecimal f3Loss;
	
	@Element( name = "F3AREA" )
	private BigDecimal f3Area;

	@Element( name = "F4LOSS" )
	private BigDecimal f4Loss;
	
	@Element( name = "F4AREA" )
	private BigDecimal f4Area;

	@Element( name = "F5LOSS" )
	private BigDecimal f5Loss;
	
	@Element( name = "F5AREA" )
	private BigDecimal f5Area;

	@Element( name = "F6LOSS" )
	private BigDecimal f6Loss;
	
	@Element( name = "F6AREA" )
	private BigDecimal f6Area;
	
	@Element( name = "PLOSS" )
	private BigDecimal pLoss;
	
	@Element( name = "PAREA" )
	private BigDecimal pArea;
	
	@Element( name = "L1LOSS" )
	private BigDecimal l1Loss;
	
	@Element( name = "L1NUMBER" )
	private BigDecimal l1Number;
	
	@Element( name = "L2LOSS" )
	private BigDecimal l2Loss;
	
	@Element( name = "L2NUMBER" )
	private BigDecimal l2Number;
	
	@Element( name = "L3LOSS" )
	private BigDecimal l3Loss;
	
	@Element( name = "L3NUMBER" )
	private BigDecimal l3Number;
	
	@Element( name = "L4LOSS" )
	private BigDecimal l4Loss;
	
	@Element( name = "L4NUMBER" )
	private BigDecimal l4Number;
	
	@Element( name = "L5LOSS" )
	private BigDecimal l5Loss;
	
	@Element( name = "L5NUMBER" )
	private BigDecimal l5Number;
	
	@Element( name = "L6LOSS" )
	private BigDecimal l6Loss;
	
	@Element( name = "L6NUMBER" )
	private BigDecimal l6Number;

	public String getTownId() {
		return townId;
	}

	public void setTownId( String townId ) {
		this.townId = townId;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName( String townName ) {
		this.townName = townName;
	}

	public BigDecimal getC1Loss() {
		return c1Loss;
	}

	public void setC1Loss( BigDecimal c1Loss ) {
		this.c1Loss = c1Loss;
	}

	public BigDecimal getC1Area() {
		return c1Area;
	}

	public void setC1Area( BigDecimal c1Area ) {
		this.c1Area = c1Area;
	}

	public BigDecimal getC2Loss() {
		return c2Loss;
	}

	public void setC2Loss( BigDecimal c2Loss ) {
		this.c2Loss = c2Loss;
	}

	public BigDecimal getC2Area() {
		return c2Area;
	}

	public void setC2Area( BigDecimal c2Area ) {
		this.c2Area = c2Area;
	}

	public BigDecimal getC3Loss() {
		return c3Loss;
	}

	public void setC3Loss( BigDecimal c3Loss ) {
		this.c3Loss = c3Loss;
	}

	public BigDecimal getC3Area() {
		return c3Area;
	}

	public void setC3Area( BigDecimal c3Area ) {
		this.c3Area = c3Area;
	}

	public BigDecimal getC4Loss() {
		return c4Loss;
	}

	public void setC4Loss( BigDecimal c4Loss ) {
		this.c4Loss = c4Loss;
	}

	public BigDecimal getC4Area() {
		return c4Area;
	}

	public void setC4Area( BigDecimal c4Area ) {
		this.c4Area = c4Area;
	}

	public BigDecimal getH1Loss() {
		return h1Loss;
	}

	public void setH1Loss( BigDecimal h1Loss ) {
		this.h1Loss = h1Loss;
	}

	public BigDecimal getH1Count() {
		return h1Count;
	}

	public void setH1Count( BigDecimal h1Count ) {
		this.h1Count = h1Count;
	}

	public BigDecimal getH2Loss() {
		return h2Loss;
	}

	public void setH2Loss( BigDecimal h2Loss ) {
		this.h2Loss = h2Loss;
	}

	public BigDecimal getH2Count() {
		return h2Count;
	}

	public void setH2Count( BigDecimal h2Count ) {
		this.h2Count = h2Count;
	}

	public BigDecimal getF1Loss() {
		return f1Loss;
	}

	public void setF1Loss( BigDecimal f1Loss ) {
		this.f1Loss = f1Loss;
	}

	public BigDecimal getF1Area() {
		return f1Area;
	}

	public void setF1Area( BigDecimal f1Area ) {
		this.f1Area = f1Area;
	}

	public BigDecimal getF2Loss() {
		return f2Loss;
	}

	public void setF2Loss( BigDecimal f2Loss ) {
		this.f2Loss = f2Loss;
	}

	public BigDecimal getF2Area() {
		return f2Area;
	}

	public void setF2Area( BigDecimal f2Area ) {
		this.f2Area = f2Area;
	}

	public BigDecimal getF3Loss() {
		return f3Loss;
	}

	public void setF3Loss( BigDecimal f3Loss ) {
		this.f3Loss = f3Loss;
	}

	public BigDecimal getF3Area() {
		return f3Area;
	}

	public void setF3Area( BigDecimal f3Area ) {
		this.f3Area = f3Area;
	}

	public BigDecimal getF4Loss() {
		return f4Loss;
	}

	public void setF4Loss( BigDecimal f4Loss ) {
		this.f4Loss = f4Loss;
	}

	public BigDecimal getF4Area() {
		return f4Area;
	}

	public void setF4Area( BigDecimal f4Area ) {
		this.f4Area = f4Area;
	}

	public BigDecimal getF5Loss() {
		return f5Loss;
	}

	public void setF5Loss( BigDecimal f5Loss ) {
		this.f5Loss = f5Loss;
	}

	public BigDecimal getF5Area() {
		return f5Area;
	}

	public void setF5Area( BigDecimal f5Area ) {
		this.f5Area = f5Area;
	}

	public BigDecimal getF6Loss() {
		return f6Loss;
	}

	public void setF6Loss( BigDecimal f6Loss ) {
		this.f6Loss = f6Loss;
	}

	public BigDecimal getF6Area() {
		return f6Area;
	}

	public void setF6Area( BigDecimal f6Area ) {
		this.f6Area = f6Area;
	}

	public BigDecimal getpLoss() {
		return pLoss;
	}

	public void setpLoss( BigDecimal pLoss ) {
		this.pLoss = pLoss;
	}

	public BigDecimal getpArea() {
		return pArea;
	}

	public void setpArea( BigDecimal pArea ) {
		this.pArea = pArea;
	}

	public BigDecimal getL1Loss() {
		return l1Loss;
	}

	public void setL1Loss( BigDecimal l1Loss ) {
		this.l1Loss = l1Loss;
	}

	public BigDecimal getL1Number() {
		return l1Number;
	}

	public void setL1Number( BigDecimal l1Number ) {
		this.l1Number = l1Number;
	}

	public BigDecimal getL2Loss() {
		return l2Loss;
	}

	public void setL2Loss( BigDecimal l2Loss ) {
		this.l2Loss = l2Loss;
	}

	public BigDecimal getL2Number() {
		return l2Number;
	}

	public void setL2Number( BigDecimal l2Number ) {
		this.l2Number = l2Number;
	}

	public BigDecimal getL3Loss() {
		return l3Loss;
	}

	public void setL3Loss( BigDecimal l3Loss ) {
		this.l3Loss = l3Loss;
	}

	public BigDecimal getL3Number() {
		return l3Number;
	}

	public void setL3Number( BigDecimal l3Number ) {
		this.l3Number = l3Number;
	}

	public BigDecimal getL4Loss() {
		return l4Loss;
	}

	public void setL4Loss( BigDecimal l4Loss ) {
		this.l4Loss = l4Loss;
	}

	public BigDecimal getL4Number() {
		return l4Number;
	}

	public void setL4Number( BigDecimal l4Number ) {
		this.l4Number = l4Number;
	}

	public BigDecimal getL5Loss() {
		return l5Loss;
	}

	public void setL5Loss( BigDecimal l5Loss ) {
		this.l5Loss = l5Loss;
	}

	public BigDecimal getL5Number() {
		return l5Number;
	}

	public void setL5Number( BigDecimal l5Number ) {
		this.l5Number = l5Number;
	}

	public BigDecimal getL6Loss() {
		return l6Loss;
	}

	public void setL6Loss( BigDecimal l6Loss ) {
		this.l6Loss = l6Loss;
	}

	public BigDecimal getL6Number() {
		return l6Number;
	}

	public void setL6Number( BigDecimal l6Number ) {
		this.l6Number = l6Number;
	}

}
