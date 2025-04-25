package org.example;

import org.example.ui.ConsoleUI;

//Котов Д.В., 14 группа
// ЗАДАЧА:
// Разработать консольное приложение "Менеджер задач", позволяющее пользователю:
// 1. Добавлять задачи (с названием, приоритетом и дедлайном)
// 2. Просматривать список всех задач
// 3. Фильтровать задачи по приоритету

public class Main {
    public static void main(String[] args) {
        new ConsoleUI().start();
    }
}