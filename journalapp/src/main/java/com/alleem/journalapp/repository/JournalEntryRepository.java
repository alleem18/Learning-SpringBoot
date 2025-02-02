package com.alleem.journalapp.repository;

import com.alleem.journalapp.entry.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public  interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {



}
