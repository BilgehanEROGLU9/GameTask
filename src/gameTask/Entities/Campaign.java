package gameTask.Entities;

public class Campaign{
	private int campaignId;
	private int discountRate;
	private double price;
	private double finalPrice;

	public Campaign() {
		
	
	}

	public Campaign(int campaignId, int discountRate, double price, double finalPrice) {
		super();
		this.campaignId = campaignId;
		this.discountRate = discountRate;
		this.price = price;
		this.finalPrice = finalPrice;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getFinalPrice() {
		return this.price-(this.price*this.discountRate/100);
	};
	

	
	

}
