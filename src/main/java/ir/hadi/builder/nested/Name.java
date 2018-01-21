package ir.hadi.builder.nested;

import java.util.List;

public class Name {
	private final String firstName;
	private final List<String> middleNames;
	private final String surname;

	public String getFirstName() {
		return firstName;
	}

	public List<String> getMiddleNames() {
		return middleNames;
	}

	public String getSurname() {
		return surname;
	}

	private Name(Builder builder) {
		this.firstName = builder.firstName;
		this.middleNames = builder.middleNames;
		this.surname = builder.surname;
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public static class Builder extends NestedBuilder<Account.Builder, Name> {
		private String firstName;
		private List<String> middleNames;
		private String surname;

		private Builder() {
		}

		public Builder firstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder middleNames(final List<String> middleNames) {
			this.middleNames = middleNames;
			return this;
		}

		public Builder surname(final String surname) {
			this.surname = surname;
			return this;
		}

		public Name build() {
			return new Name(this);
		}
	}
}