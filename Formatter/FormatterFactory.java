package Formatter;

import Formatter.Implementation.LowerCaseFormatter;
import Formatter.Implementation.UpperCaseFormatter;
import Formatter.Interface.IShapeFormatter;

public class FormatterFactory { 
    public IShapeFormatter Get(FormatterType type) throws Exception {
        switch(type) {
            case Upper: 
                return new UpperCaseFormatter();
            case Lower:
                return new LowerCaseFormatter();
            default: 
                throw new Exception("Invalid formatter type");
        }
    }
}

enum FormatterType {
    Upper, 
    Lower
}