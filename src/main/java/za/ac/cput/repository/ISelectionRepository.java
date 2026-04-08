package za.ac.cput.repository;

import za.ac.cput.domain.Selection;

public interface ISelectionRepository {
    void create(Selection selection);
    void save(Selection selection);
   // Selection read(String id);
    Selection findById(String id);
    void delete(String id);
}
