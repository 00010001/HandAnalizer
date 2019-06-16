package com.jcombat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
@Controller

public class UploadController {

    @PostMapping(value = "/")
    public String uploadingPost(@RequestParam("uploadingFiles") MultipartFile[] uploadingFiles) throws IOException {
        for (MultipartFile uploadedFile : uploadingFiles) {
            List<String> x = getLines(uploadedFile);
            x.size();
        }
        return "redirect:/";
    }

    private List<String> getLines(MultipartFile multipart){
        BufferedReader br;
        List<String> result = new ArrayList<>();
        try {

            String line;
            InputStream is = multipart.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                result.add(line);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
}
