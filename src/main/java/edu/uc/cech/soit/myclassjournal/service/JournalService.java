package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates the ability to save and get all journals.
 */
@Service
public class JournalService implements IJournalService {
    // Store journals in an arraylist
    List<JournalEntry> journal = new ArrayList<>();

    /**
     * Save a journal into our arraylist.
     * @param journalEntry the entry to save.
     */
    @Override
    public void save(JournalEntry journalEntry) {
        journal.add(journalEntry);
    }

    /**
     * Get all journals
     * @return the arraylist containing all journals
     */
    @Override
    public List<JournalEntry> fetchAll() {
        return journal;
    }
}
