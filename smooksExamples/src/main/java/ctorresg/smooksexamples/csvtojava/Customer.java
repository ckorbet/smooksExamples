package ctorresg.smooksexamples.csvtojava;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum Gender {Male, Female}

	private String firstName;
	private String lastName;
	private Gender gender;
	private int age;
	private String country;

	public Customer() {
		super();
	}

	public Customer(final String firstName,
				    final String lastName,
				    final Gender gender,
				    final int age,
				    final String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(final Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Custor [FirstName=");
		builder.append(firstName);
		builder.append(", LastName=");
		builder.append(lastName);
		builder.append(", Gender=");
		builder.append(gender);
		builder.append(", Age=");
		builder.append(age);
		builder.append(", Country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
	}

}
