package Formatter.Implementation;

import Formatter.Interface.IShapeFormatter;

public class UpperCaseFormatter implements IShapeFormatter {

    public String Format(String pWord) {
        return pWord.toUpperCase();
    }
}