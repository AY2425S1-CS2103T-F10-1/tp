package seedu.address.model.person;

import java.util.function.Predicate;

public class DescriptionContainsKeywordPredicate implements Predicate<Person> {
    private final String keyword;

    public DescriptionContainsKeywordPredicate(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean test(Person person) {
        return person.getDescription().value.toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof DescriptionContainsKeywordPredicate // instanceof handles nulls
                && keyword.equals(((DescriptionContainsKeywordPredicate) other).keyword)); // state check
    }
}
