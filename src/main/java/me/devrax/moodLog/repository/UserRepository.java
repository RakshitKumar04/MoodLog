package me.devrax.moodLog.repository;

import me.devrax.moodLog.entity.JournalEntry;
import me.devrax.moodLog.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);
}
