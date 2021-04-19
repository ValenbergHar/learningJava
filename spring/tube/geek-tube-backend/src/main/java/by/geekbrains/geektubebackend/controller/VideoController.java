package by.geekbrains.geektubebackend.controller;


import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RequestMapping("/api/v1/video")
@RestController
public class VideoController {
    private final Logger logger = (Logger) LoggerFactory.getLogger(VideoController.class);
}
