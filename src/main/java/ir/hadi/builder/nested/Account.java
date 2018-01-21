package ir.hadi.builder.nested;

public class Account {
	private final Long id;
	private final String email;
	private final Name name;
	private final Address address;

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public Name getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
	
	public static Builder newBuilder() {
		return new Builder();
	}

	private Account(Builder builder) {
		this.id = builder.id;
		this.email = builder.email;
		this.name = builder.name;
		this.address = builder.address;
	}

	public static class Builder {
		private Long id;
		private String email;
		private Name name;
		private Address address;
		
		private Builder() {
		}

		public Builder id(final Long id) {
			this.id = id;
			return this;
		}

		public Builder email(final String email) {
			this.email = email;
			return this;
		}

		public Builder withName(final Name name) {
			this.name = name;
			return this;
		}

		public Builder withAddress(final Address address) {
			this.address = address;
			return this;
		}

		// to add manually
		private Name.Builder builderName = Name.newBuilder().withParentBuilder(this);
		private Address.Builder builderAddress = Address.newBuilder().withParentBuilder(this);

		public Name.Builder addName() {
			return this.builderName;
		}

		public Address.Builder addAddress() {
			return this.builderAddress;
		}

		public Account build() {
			return new Account(this);
		}
	}

}