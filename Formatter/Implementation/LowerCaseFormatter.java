package Formatter.Implementation;

import Formatter.Interface.IShapeFormatter;

public class LowerCaseFormatter implements IShapeFormatter {

    public String Format(final String pWord) {
        return pWord.toLowerCase();
    }

}