package org.group.service;

import org.group.repository.VocabularyR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VocabularyS {
	
	@Autowired
	public VocabularyR vocabR;
}
