package ctorresg.smooksexamples.xmltojava;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	private Header header;
    private List<OrderItem> orderItems;

    /**
     * <p>
     * Creates a default instance of <code>Order</code>
     * </p>
     */
	public Order() {
		super();
	}

	/**
	 * <p>
	 * Creates an instance of <code>Order</code> with all its fields
	 * </p>
	 * @param header
	 * @param orderItems
	 */
	public Order(final Header header, final List<OrderItem> orderItems) {
		super();
		this.header = header;
		this.orderItems = orderItems;
	}

	/**
	 * @return the header
	 */
	public final Header getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public final void setHeader(final Header header) {
		this.header = header;
	}

	/**
	 * @return the orderItems
	 */
	public final List<OrderItem> getOrderItems() {
		return orderItems;
	}

	/**
	 * @param orderItems the orderItems to set
	 */
	public final void setOrderItems(final List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Order [header=");
		builder.append(header);
		builder.append(", orderItems=");
		builder.append(orderItems);
		builder.append("]");
		return builder.toString();
	}

}
