package com.supersecure.pl;

import com.supersecure.pl.Database;


class CommonManager {

	private final Validator validator = new Validator();

	public String manage(String input) throws IllegalInputException {
		final String command = getCommand(input);
		final String[] options = getOptions(input);


		switch (command) {
		case "add": {
			validator.validate(options, new String[] { ".+"}, 1);
			return Database.getInstance().add(options[0]);
		}
		case "delete": {
			validator.validate(options,new String[] { ".+"},1);
			return Database.getInstance().delete(options[0]);
		}
		case "find": {
			validator.validate(options,new String[] { ".+"},1);
			return Database.getInstance().find(options[0]);
		}
		case "rate": {
			validator.validate(options, new String[] {".+","\\d{1,2}"}, 2);
			return Database.getInstance().rate(options[0],Integer.parseInt(options[1]));
		}
		case "similar": {
			validator.validate(options,new String[] { ".+"},1);
			String[] languages = Database.getInstance().findSimilarNamedLanguages(options[0]);
			StringBuilder sb = new StringBuilder();
			for (String language : languages) {
				sb.append(language+", ");
			}
			return sb.toString();
		}
		case "top": {
			return Database.getInstance().top();
		}
		default: throw new IllegalInputException("unknown command: "+command);
		}

	}

	private String[] getOptions(String input) {
		String options = input.replaceFirst(getCommand(input)+" ", "");
		return options.split("\\s");
	}

	private String getCommand(String input) {
		return input.split("\\s")[0];
	}

}

class Manager extends CommonManager {

	@Override
	public String manage(String input) {

		try {
			return super.manage(input);
		} catch (IllegalInputException e) {
			return e.getMessage();
		}

	}

}

class Validator {

	public void validate(String[] options, String[] pattern, int length)
			throws IllegalInputException {
		if(length > options.length) {
			throw new IllegalInputException("illegal number of options: "+options.length);
		}
		
		for (int i = 0;i<options.length;i++) {
			if (!options[i].matches(pattern[i])) {
				throw new IllegalInputException("options:" + options[i]
						+ " does not match: " + pattern[i]);
			}
		}
	}

}

class IllegalInputException extends Exception {

	private static final long serialVersionUID = 1L;

	public IllegalInputException(String string) {
		super(string);
	}

}