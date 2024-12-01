package com.paperlessworld.service;

import com.paperlessworld.entity.Document;
import com.paperlessworld.repository.DocumentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public void uploadFile(MultipartFile file, Long userId) throws IOException {
        Document document = new Document();
        document.setFileName(file.getOriginalFilename());
        document.setFileData(file.getBytes());
        document.setUser(new User());
        document.getUser().setId(userId);
        documentRepository.save(document);
    }

    public List<Document> getDocumentsByUser(Long userId) {
        return documentRepository.findByUserId(userId);
    }
}
