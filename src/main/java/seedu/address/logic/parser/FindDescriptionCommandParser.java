package seedu.address.logic.parser;

import seedu.address.logic.commands.FindDescriptionCommand;
import seedu.address.logic.parser.exceptions.ParseException;

import java.util.Arrays;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

public class FindDescriptionCommandParser implements Parser<FindDescriptionCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the FindDescriptionCommand
     * and returns a FindDescriptionCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public FindDescriptionCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, FindDescriptionCommand.MESSAGE_USAGE));
        }

        String[] descriptionKeywords = trimmedArgs.split("\\s+");

        return new FindDescriptionCommand(new DescriptionContainsKeywordsPredicate(Arrays.asList(descriptionKeywords)));
    }
}
