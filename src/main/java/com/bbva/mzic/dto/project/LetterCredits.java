package com.bbva.mzic.dto.project;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The LetterCredits class...
 */
public class LetterCredits implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	private String letter;
	private String reference;
	private int secuence;
	List<Banks> banks;
	Costumer costumer;

	public String getLetter() {
		return this.letter;
	}

	public void setLetter(final String letter) {
		this.letter = letter;
	}
	public String getReference() {
		return this.reference;
	}

	public void setReference(final String reference) {
		this.reference = reference;
	}

	public int getSecuence() {
		return this.secuence;
	}

	public void setSecuence(final int secuence) {
		this.secuence = secuence;
	}



	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterCredits rhs = (LetterCredits) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(name, rhs.letter)
					.append(surname, rhs.secuence)
					.append(surname, rhs.reference)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.letter)
			.append(this.reference)			
			.append(this.secuence)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("letter", letter)
			.append("reference", reference)
			.append("secuence", secuence)
			.toString();
	}
}
