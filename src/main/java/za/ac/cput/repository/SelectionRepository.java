package za.ac.cput.repository;

import za.ac.cput.domain.Selection;

import java.util.HashMap;
import java.util.Map;

public class SelectionRepository implements ISelectionRepository{
    private static SelectionRepository instance = null;
    private Map<String,Selection> selectionMap;

    private SelectionRepository(){
        selectionMap = new HashMap<>();
    }

    public static SelectionRepository getInstance(){
        if(instance == null){
            instance = new SelectionRepository();
        }
        return instance;
    }


    @Override
    public void create(Selection selection) {

    }

    @Override
    public void save(Selection selection) {
        selectionMap.put(selection.getSelectionId(),selection);
    }
/*
    @Override
    public Selection read(String id) {
        return null;
    }
*/
    @Override
    public Selection findById(String id) {
        return selectionMap.get(id);
    }

    @Override
    public void delete(String id) {
    selectionMap.remove(id);
    }
}
