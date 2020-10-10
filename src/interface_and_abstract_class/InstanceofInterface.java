package interface_and_abstract_class;

interface Printable4{
    void printLine(String str);
}

class GoodPrinter implements Printable4{

    @Override
    public void printLine(String str){
        System.out.println(str);
    }
}

class MultiPrinter extends GoodPrinter{

    @Override
    public void printLine(String str){
        super.printLine("Start of multi");
        super.printLine(str);
        super.printLine("end of multi");
    }
}

public class InstanceofInterface {
    public static void main(String[] args) {
        Printable4 prn1 = new GoodPrinter();
        Printable4 prn2 = new MultiPrinter();

        if(prn1 instanceof Printable4) // GoodPrinter는 Printable4를 직접 구현했다. -> true
            prn1.printLine("This is a simple printer");

        System.out.println();

        if(prn2 instanceof Printable4) // MultiPrinter는 Printable4를 간접 구현했다. -> true
            prn2.printLine("This is a multiful printer");
    }
}
