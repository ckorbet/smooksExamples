package ctorresg.smooksexamples.xmltojava;

import java.io.Serializable;

public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private long productId;
    private Integer quantity;
    private double price;

    /**
     * <p>
     * Creates an instance of <code>OrderItem</code>
     * </p>
     */
	public OrderItem() {
		super();
	}

	/**
	 * <p>
	 * Creates an instance of <code>OrderItem</code> with all its fields
	 * </p>
	 * @param productId
	 * @param quantity
	 * @param price
	 */
	public OrderItem(final long productId, final Integer quantity, final double price) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}

	/**
	 * @return the productId
	 */
	public final long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public final void setProductId(final long productId) {
		this.productId = productId;
	}

	/**
	 * @return the quantity
	 */
	public final Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public final void setQuantity(final Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public final double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public final void setPrice(final double price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("OrderItem [productId=");
		builder.append(productId);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
}
