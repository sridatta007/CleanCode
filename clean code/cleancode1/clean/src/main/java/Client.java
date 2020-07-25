import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Client {
    public static void main(String[] args) {
        PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        Deposit deposit = new Deposit((double) 200000, 10, 7.5);
        Double simpleInterest = deposit.simpleInterest();
        Double compoundInterest = deposit.comPoundInterest();
        out.println("Simple Interest is: " + simpleInterest);
        out.println("Compound Interest is: " + compoundInterest);
    }
}