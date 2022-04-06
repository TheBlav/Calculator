package App;
import Data.Operations;
import Data.UnknownOperatorException;
import Data.io;

import java.util.InputMismatchException;

public class AppControl {

    public void AppControl(){
        io inOut = new io();
        Operations operations = new Operations();

        try {
            inOut.io();
        } catch (UnknownOperatorException | InputMismatchException e) {
            e.getMessage();

        }
    }
}
