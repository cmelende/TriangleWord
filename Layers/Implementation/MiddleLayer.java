package Layers.Implementation;

import Layers.Interface.ILayer;

public class MiddleLayer implements ILayer {
    private int SpacePaddCount;
    private int CentralSpaceCount;
    private char Character;

    public MiddleLayer(int pSpacePaddCount, int pCentralSpaceCount, char pCharacter) {
        SpacePaddCount = pSpacePaddCount; 
        CentralSpaceCount = pCentralSpaceCount;
        Character = pCharacter;
    }

    public String ToString() {
        String value = "";

        value += GetSpacesPadd(SpacePaddCount);
        value += String.valueOf(Character);
        value += GetSpacesPadd(CentralSpaceCount);
        value += String.valueOf(Character);
        return value;
    }

    private static String GetSpacesPadd(int numberOfSpaces) {
        String val = "";
        for(int i = 0; i < numberOfSpaces; i++) {
            val += " ";
        }

        return val;
    }

    public void Output() {
        String val = this.ToString();
        System.out.println(val);
    }
}