package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is always valid.
 */
public class Remark {
    /** The remark of the person */
    public final String value;

    /**
     * Constructs a {@code Remark}.
     *
     * @param remark A valid remark.
     */
    public Remark(String remark) {
        requireNonNull(remark);
        value = remark;
    }

    /**
     * Returns the string representation of this {@code Remark}.
     *
     * @return The remark as a string.
     */
    @Override
    public String toString() {
        return value;
    }

    /**
     * Checks if this {@code Remark} is equal to another object.
     *
     * @param other The object to compare to.
     * @return True if the other object is a {@code Remark} with the same value.
     */
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Remark // instanceof handles nulls
                && value.equals(((Remark) other).value)); // state check
    }

    /**
     * Returns the hash code of this {@code Remark}.
     *
     * @return The hash code of the remark.
     */
    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

