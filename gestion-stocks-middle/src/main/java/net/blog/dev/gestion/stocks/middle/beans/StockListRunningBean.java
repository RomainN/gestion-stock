/**
 * 
 */
package net.blog.dev.gestion.stocks.middle.beans;

/**
 * @author Kiva
 * 
 */
public class StockListRunningBean extends StockListBean {

	private Float atr;

    private Float actualPrice;

	/**
	 * @return the atr
	 */
	public Float getAtr() {
		return atr;
	}

	/**
	 * @param atr
	 *            the atr to set
	 */
	public void setAtr(Float atr) {
		this.atr = atr;
	}

    public Float getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Float actualPrice) {
        this.actualPrice = actualPrice;
    }
}
