package com.example.webdevelopment_part2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/")
    public String start() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        return """
                Имя ученика: Беседина Софья Викторовна,
                Название проекта: Web-development_Part2,
                Дата создания проекта: 27.12.2022 г.,
                Описание проекта в свободной форме: проект создан для выполнения домашнего задания. Реализуется с помощью сборщика Maven и набора инструментов Framework. Язык - Java""";
    }
}
