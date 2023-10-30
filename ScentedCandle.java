public class ScentedCandle extends Candle {
	private String scent;
	
	public String getScent() {
		return this.scent;
	}
	
	public void setScent(String scent) {
		this.scent = scent;
	}
	
	public void setHeight(int height) {
		this.height = height;
		this.price = 3.00 * height;
	}
}
