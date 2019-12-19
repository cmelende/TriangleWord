package TriangleWord;

import java.util.ArrayList;
import Layers.Implementation.BottomLayer;
import Layers.Implementation.MiddleLayer;
import Layers.Implementation.TopLayer;

public class TriangleWord {
    private TopLayer topLayer;
    private ArrayList<MiddleLayer> middleLayers;
    private BottomLayer bottomLayer;
    private String word;

    public TriangleWord(String pWord) throws Exception {
        if(pWord.isEmpty() || pWord == null || !(pWord.length() > 3)) {
            throw new Exception("Word must be three characters long");
        }
        word = pWord;
        topLayer = new TopLayer(CalculateSpacePaddCount(0), pWord.charAt(0));
        middleLayers = CreateMiddleLayers();
        bottomLayer = new BottomLayer(pWord);
    }

    private int CalculateSpacePaddCount(int pRowNumber) {
        return GetHeight() - pRowNumber - 1;
    }

    private int CalculateCentralSpaceCount(int pRowNumber) {
        return GetBaseLength() - 2 - (CalculateSpacePaddCount(pRowNumber)*2);
    }

    private int GetHeight() { 
        return word.length();
    }

    private int GetBaseLength() {
        return (word.length()*2)- 1;
    }

    private ArrayList<MiddleLayer> CreateMiddleLayers() {
        ArrayList<MiddleLayer> layers = new ArrayList<MiddleLayer>();
        for(int i = 1; i < word.length() - 1; i++) {
            int numberOfBegginingSpaces = CalculateSpacePaddCount(i);
            int numberOFMiddleSpaces = CalculateCentralSpaceCount(i);
            
            MiddleLayer layer = new MiddleLayer(numberOfBegginingSpaces, numberOFMiddleSpaces , word.charAt(i));
            layers.add(layer);
        }

        return layers;
    }

    public void Output() {
        topLayer.Output();

        for (MiddleLayer middleLayer : middleLayers) {
            middleLayer.Output();
        }
        
        bottomLayer.Output();
    }
}