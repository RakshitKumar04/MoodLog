package me.devrax.moodLog.repository;

import me.devrax.moodLog.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {
}
