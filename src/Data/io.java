package Data;
import java.util.InputMismatchException;
import java.util.Scanner;
import Data.operators;
public class io {
private double a,b;
String choice;
Scanner sc = new Scanner(System.in);
Operations operations = new Operations();
    boolean error = true;
    operators enumChoice;

operators operation;
    public void io() throws UnknownOperatorException{

        do {

           try {
                System.out.print("Podaj proszę liczbę a: ");
                operations.setA(sc.nextDouble());
                System.out.print("Podaj proszę liczbę b: ");
                operations.setB(sc.nextDouble());
                sc.nextLine();


                System.out.println("podaj rodzań działania: ");
                System.out.println("Dodawanie - wybierz +");
                System.out.println("Odejmowaie - wybierz -");
                System.out.println("Mnożenie - wybierz *");
                System.out.println("Dzielenie - wybierz /");
                System.out.print("Wybieram: ");
                choice = sc.nextLine();
                enumChoice = fromDescription(choice);
                error = false;


               System.out.println("Podana liczba A: " + operations.getA());
               System.out.println("Podana liczba B: " + operations.getB());

               switch (enumChoice){
                   case ADD -> {
                       System.out.println( Operations.addition(operations.getA(), operations.getB()));
                   }
                   case SUBTRACT -> {
                       System.out.println( Operations.subtract(operations.getA(), operations.getB()));
                   }
                   case MULTIPLY -> {
                       System.out.println( Operations.multiplication(operations.getA(),operations.getB()));
                   }
                   case DIVIDE -> {

                       System.out.println(Operations.divide(operations.getA(), operations.getB()));
                   }
               }

            }
            catch   (InputMismatchException e){
                error = true;
                System.err.println("Podana wartość, nie jest liczbą, spróbuj ponownie: ");

            }
            catch (UnknownOperatorException e){
                error = true;
                System.err.println("Wybrano błędne zadanie, wybierz ponownie: ");
            }
           catch (ArithmeticException e){
               error = true;
               System.err.println("Nie dzilimy przez zero!");
           }
            finally {
                sc.nextLine();
            }


        } while (error);


    }

    public operators fromDescription (String choice) throws  UnknownOperatorException{
        operators[] operator = operators.values();
        for (operators operators : operator) {
            if (operators.getDescription().equals(choice)){
                return operators;
            }
        }
        throw new UnknownOperatorException();
    }



    public boolean isError() {
        return error;
    }
}
