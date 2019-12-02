package org.group.repository;

import java.util.List;

import org.group.model.Vocabulary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VocabularyR extends JpaRepository<Vocabulary, Integer> {

	List<Vocabulary> findByEnglishContaining(String keyword);

	List<Vocabulary> findByHashtagContaining(String keyword);

}
