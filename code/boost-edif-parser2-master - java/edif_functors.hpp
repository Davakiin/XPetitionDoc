import org.apache.commons.lang3.StringUtils;

public class EdifFunctors {

    private EdifParseTreeBuilder ptb;

    public EdifFunctors(EdifParseTreeBuilder aPtb) {
        ptb = aPtb;
    }

    public void printStr(String str) {
        //System.out.println(str);
        ptb.printStr(str);
    }

    public void printInt(int i) {
        //System.out.println(i);
        ptb.printInt(i);
    }

    public void printDouble(double d) {
        //System.out.println(d);
        ptb.printDouble(d);
    }
}