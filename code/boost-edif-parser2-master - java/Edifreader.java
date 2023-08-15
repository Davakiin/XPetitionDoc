import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

public class EdifReader {

    public boolean read(String filename) {
        EdifParseTreeBuilder ptb = new EdifParseTreeBuilder();

        EdifLexer lexer = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            br.close();
            String input = sb.toString();

            lexer = new EdifLexer(new ANTLRInputStream(new StringReader(input)));
        } catch (IOException e) {
            System.out.println("Cannot open file to read....");
            return false;
        }

        TokenStream tokens = new CommonTokenStream(lexer);
        EdifParser parser = new EdifParser(tokens);
        parser.setBuilder(ptb);

        EdifParser.EdifContext edifContext = parser.edif();

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("-------------------------");
            System.out.println("Parsing succeeded");
            System.out.println("-------------------------");
            return true;
        } else {
            System.out.println("-------------------------");
            System.out.println("Parsing failed");
            System.out.println("-------------------------");
            return false;
        }
    }
}