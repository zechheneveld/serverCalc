package com.zech.serverCalc.data;

import com.zech.serverCalc.models.MathEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MathRepository {

    private List<MathEntry> allEntries = new ArrayList<>();

    public List<MathEntry> getAllEntries(){
        return allEntries;
    }

    public void addEntry(MathEntry mathEntry){
        allEntries.add(mathEntry);
    }
}
