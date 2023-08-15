import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: java Main <file name>");
            System.exit(1);
        }
        
        String file = args[0];
        EdifReader reader = new EdifReader();
        long start, end;
        
        start = System.currentTimeMillis();
        if(reader.Read(file)) {
            System.out.println("Done....");
            end = System.currentTimeMillis();
            double time_taken = ((double)(end - start))/1000;
            System.out.println("Time taken to parse the design: " + time_taken + " seconds");
            System.exit(0);
        } else {
            System.out.println("Failed....");
            end = System.currentTimeMillis();
            double time_taken = ((double)(end - start))/1000;
            System.out.println("Execution time: " + time_taken + " seconds");
            System.exit(1);
        }
    }
}