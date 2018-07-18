/*
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Java {

    public static void main(String[] args) throws Exception {

        Options options = new Options();

        Option input = new Option("i", "input", true, "input file to read data from");
        input.setRequired(true);
        input.setArgName("FILE PATH");
        options.addOption(input);

        Option output = new Option("o", "output", true, "output file to write the final result");
        output.setRequired(true);
        output.setArgName("FILE PATH");
        options.addOption(output);

        Option language = new Option("lang", "language", true, "Encoding Langauge");
        language.setArgName("LANGUAGE");
        options.addOption(language);

        CommandLineParser commandLineParser = new DefaultParser();
        HelpFormatter helpFormatter = new HelpFormatter();
        CommandLine commandLine;

        try {
            commandLine = commandLineParser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            helpFormatter.printHelp("utility-name", options);

            System.exit(1);
            return;
        }

        String inputFilePath = commandLine.getOptionValue("input");
        String outputFilePath = commandLine.getOptionValue("output");

        System.out.println("Input File Path : " + inputFilePath);
        System.out.println("output File path : " + outputFilePath);

    }

}*/
