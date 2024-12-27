package me.devrax.moodLog.controller;

import me.devrax.moodLog.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
//    private Map<Long, JournalEntry> journalEntries = new HashMap<>();      //to store entries as we don't have database for now
//
//    @GetMapping
//    public List<JournalEntry> getAll() {
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry) {
//        journalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
//        return journalEntries.get(myId);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteJournalEntryById(@PathVariable Long myId) {
//        return journalEntries.remove(myId);
//    }
//
//    @PutMapping("id/{myId}")
//    public JournalEntry updateJournalEntryById(@PathVariable Long myId, @RequestBody JournalEntry myEntry) {
//        return journalEntries.put(myId, myEntry);
//    }

    @GetMapping
    public List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        return false;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId) {
        return null;
    }

    @PutMapping("id/{myId}")
    public JournalEntry updateJournalEntryById(@PathVariable Long myId, @RequestBody JournalEntry myEntry) {
        return null;
    }
}
