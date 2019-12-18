package Layers.Implementation;

import Layers.Interface.ILayer;

public class TopLayer implements ILayer {
    private int SpacePaddCount;
    private char Character;

    public TopLayer(int pSpacePaddCount, char pCharacter) {
        SpacePaddCount = pSpacePaddCount;
        Character = pCharacter;
    }

    public void Output() {
        String value = this.ToString();
        System.out.println(value);
    }

    public String ToString() {
        String value = "";
        for(int i = 0; i < SpacePaddCount; i++) {
            value += " ";
        }
        value += String.valueOf(Character);

        return value;
    }
}