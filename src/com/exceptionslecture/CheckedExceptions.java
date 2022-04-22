package com.exceptionslecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("C://file.txt");
        FileReader fr = new FileReader(file);
        //throw new IOException(); //again unreachable but Java does not know - if the throws exception was not thrown, then we will throw
        //the IO exception on line 12
        //throw is when we want to throw an exception in the block of code - explicitly
        //throw new IOException - throw followed by the instance keyword - new followed by the exception
        //throws is used in the method signature! to indicate that an exception might be thrown
        //throws - we can say multiple errors separated by coma
        //throw - only one exception at a time
    }
}
