# java-module-4

Модуль 4 — **ООП часть 2**: наследование, полиморфизм, абстракция, `final`, `enum`. Сборник из 45 учебных задач: каждая задача — это отдельный пакет с несколькими связанными классами (родитель + наследники, abstract + конкретные реализации, interface + классы) и набором тестов JUnit 5.

## Требования

- JDK 21
- Maven 3.9+

## Сборка

```bash
mvn -q compile
```

## Запуск всех тестов

```bash
mvn test
```

Изначально все тесты падают красным, потому что тело каждого метода — это:

```java
// TODO: реализуй
throw new UnsupportedOperationException("TODO: реализуй");
```

## Запуск тестов одной задачи

```bash
mvn test -Dtest=Task07Test
```

Несколько сразу:

```bash
mvn test -Dtest=Task01Test,Task02Test
```

## Как выполнять

1. **Клонировать репозиторий** и перейти в `java-module-4`.
2. **Открыть в IntelliJ IDEA** как Maven-проект (`File → Open`, выбрать `pom.xml`).
3. **Запустить `mvn test`** — все тесты будут красными.
4. **Найти красный тест** (например `Task07Test`).
5. **Открыть соответствующий пакет** `src/main/java/com/course/task07/` и реализовать классы: убрать `throw new UnsupportedOperationException(...)`, написать поля, конструкторы, методы, переопределения с `@Override`, вызовы `super(...)`.
6. **Запустить тесты задачи** снова — добиться зелёного.
7. **Закоммитить** и переходить к следующей задаче.

## Структура пакетов

Каждая задача = отдельный пакет `com.course.taskNN`, содержащий все классы этой задачи. Тест — в одноимённом пакете под `src/test/java/`.

```
java-module-4/
├── pom.xml
├── README.md
└── src/
    ├── main/java/com/course/
    │   ├── task01/
    │   │   ├── Animal.java
    │   │   └── Dog.java
    │   ├── task02/
    │   │   ├── Vehicle.java
    │   │   └── Car.java
    │   ├── ...
    │   └── task45/
    │       ├── Light.java
    │       └── Intersection.java
    └── test/java/com/course/
        ├── task01/Task01Test.java
        ├── task02/Task02Test.java
        ├── ...
        └── task45/Task45Test.java
```

## Содержание

| Блок | Задачи | Тема |
|------|--------|------|
| 1 | task01–task10 | Базовое наследование (родитель + наследник) |
| 2 | task11–task20 | `@Override`, `super.method()`, instanceof, type casting, полиморфизм |
| 3 | task21–task28 | `abstract` классы и абстрактные методы |
| 4 | task29–task35 | `interface`, default-методы, множественные интерфейсы |
| 5 | task36–task40 | ★ Три уровня, `final`, abstract + interface вместе, repository |
| 6 | task41–task45 | `enum` и его использование в иерархиях |
