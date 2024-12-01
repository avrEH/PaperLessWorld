package com.paperlessworld.controller;

import com.paperlessworld.service.AuthService;
import com.paperlessworld.service.DocumentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

    private final AuthService authService;
    private final DocumentService documentService;

    public FileUploadController(AuthService authService, DocumentService documentService) {
        this.authService = authService;
        this.documentService = documentService;
    }

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        var user = authService.login(username, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "upload";
        } else {
            return "login";
        }
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file, @RequestParam Long userId, Model model) throws Exception {
        documentService.uploadFile(file, userId);
        model.addAttribute("message", "File uploaded successfully!");
        return "upload";
    }
}
