package wareHouseManagment;

import java.io.Serializable;

public class Item implements Serializable{
	private String productName;
	private int amount;
	private String description;
	public Item(String productName, int amount, String description) {
		this.productName = productName;
		this.amount = amount;
		this.description = description;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
