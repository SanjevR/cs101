

public class Main {
    
    public static void main(String[] args){
        VectorSet<Integer> sanjevIntTest = new VectorSet<>();
        //I'll add a duplicates to test the edgecase
        sanjevIntTest.add(1);
        sanjevIntTest.add(2);
        sanjevIntTest.add(3);
        sanjevIntTest.add(3);
        sanjevIntTest.add(3);

        System.out.println("Here is the Int Values " + sanjevIntTest);

        // now we'll test the same with String values
        VectorSet<String> sanjevStringTest = new VectorSet<>();

        sanjevStringTest.add("Sanjev");
        sanjevStringTest.add("sanjev");
        sanjevStringTest.add("sanjeev");
        sanjevStringTest.add("sanjev");
        sanjevStringTest.add("Sanjev");

        System.out.println("Here is my name spelled " + sanjevStringTest);
    }
}
