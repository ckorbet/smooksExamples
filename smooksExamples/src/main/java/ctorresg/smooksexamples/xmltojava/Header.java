package ctorresg.smooksexamples.xmltojava;

import java.io.Serializable;
import java.util.Date;

public class Header implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date date;
	private Long customerNumber;
	private String customerName;

	/**
	 * <p>
	 * Creates an instance of <code>Header</code>
	 * </p>
	 */
	public Header() {
		super();
	}

	/**
	 * <p>
	 * Creates an instance of <code>header</code> with
	 * all its fields
	 * </p>
	 * @param date
	 * @param customerNumber
	 * @param customerName
	 */
	public Header(final Date date, final Long customerNumber, final String customerName) {
		super();
		this.date = date;
		this.customerNumber = customerNumber;
		this.customerName = customerName;
	}

	/**
	 * @return the date
	 */
	public final Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public final void setDate(final Date date) {
		this.date = date;
	}

	/**
	 * @return the customerNumber
	 */
	public final Long getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * @param customerNumber the customerNumber to set
	 */
	public final void setCustomerNumber(final Long customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * @return the customerName
	 */
	public final String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public final void setCustomerName(final String customerName) {
		this.customerName = customerName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Header [date=");
		builder.append(date);
		builder.append(", customerNumber=");
		builder.append(customerNumber);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append("]");
		return builder.toString();
	}







}
