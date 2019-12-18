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

    public TriangleWord(String pValue) throws Exception {
        if(pValue.isEmpty() || pValue == null || !(pValue.length() > 3)) {
            throw new Exception("Word must be three characters long");
        }
        word = pValue;
        topLayer = new TopLayer(CalculateSpacePaddCount(0), pValue.charAt(0));
        middleLayers = CreateMiddleLayers();
        bottomLayer = new BottomLayer(pValue);
    }

    private int CalculateSpacePaddCount(int rowNumber) {
        return GetHeight() - rowNumber - 1;
    }

    private int CalculateCentralSpaceCount(int rowNumber) {
        return GetBaseLength() - 2 - (CalculateSpacePaddCount(rowNumber)*2);
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