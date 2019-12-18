package Layers.Implementation;

import Layers.Interface.ILayer;

public class BottomLayer implements ILayer {
    private String word;

    public BottomLayer(String pWord) {
        word = pWord;
    }

    public void Output() {
        String value = this.ToString();
        System.out.println(value);
    }

    public String ToString() {
        String value = "";
        for(int i = word.length()-1; i > 0; i--) {
            value += word.charAt(i);
        }
        for(int i = 0; i < word.length(); i++){
            value += word.charAt(i);
        }

        return value;
    }
}