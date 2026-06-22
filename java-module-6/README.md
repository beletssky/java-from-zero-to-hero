# java-module-6

Модуль 6 — **Коллекции**: `List`, `Set`, `Map`, `Iterator`, `Comparable`/`Comparator`, утилиты `Collections`. Сборник из 40 учебных задач: каждая задача — это отдельный пакет с основным классом (`TaskNN`) и при необходимости вспомогательными классами (`Item`, `User`, `Permission` и т.д.). Тесты JUnit 5.

Главный акцент — практика с реальными данными: корзина покупок, словарь, кеш, фильтрация, группировка. Меньше зубрёжки методов — больше «решаем настоящую задачу».

## Что используем и что нет

**Используем:** `List`, `Set`, `Map`, `ArrayList`, `HashSet`, `TreeSet`, `HashMap`, `TreeMap`, `LinkedHashMap`, `Iterator`, `Comparable`, `Comparator`, `Collections`, `List.of`, `Set.of`, `Map.of`.

**НЕ используем (это уже следующие модули):** Stream API (`.stream().filter().collect()`), сложные generic-методы, concurrent-коллекции.

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

Один конкретный тест:

```bash
mvn test -Dtest=Task15Test#voteRegistry_returnsFalse_forRepeated
```

## Как выполнять

1. Клонировать репозиторий, перейти в `java-module-6`.
2. Открыть в IntelliJ IDEA как Maven-проект.
3. `mvn test` → все красные.
4. Взять любой красный тест, например `Task07Test`.
5. Открыть пакет `src/main/java/com/course/task07/` и реализовать классы: убрать `throw new UnsupportedOperationException(...)`, написать тело методов.
6. `mvn test -Dtest=Task07Test` → добиться зелёного.
7. Закоммитить и перейти к следующей задаче.

## Структура пакетов

Каждая задача = отдельный пакет `com.course.taskNN`, содержащий основной класс `TaskNN` плюс при необходимости вспомогательные классы (`Item`, `Permission`, `User`, `Product`, `Version`, …).

```
java-module-6/
├── pom.xml
├── README.md
└── src/
    ├── main/java/com/course/
    │   ├── task01/Task01.java
    │   ├── task03/Task03.java, Item.java
    │   ├── task05/Task05.java, Task.java
    │   ├── task14/Task14.java, Permission.java
    │   ├── ...
    │   └── task40/Task40.java
    └── test/java/com/course/
        ├── task01/Task01Test.java
        └── ... task40/Task40Test.java
```

## Содержание

| Блок | Задачи | Тема |
|------|--------|------|
| 1 | task01–task10 | `List` и `ArrayList`: добавление, фильтрация, переворот, дедупликация, пагинация |
| 2 | task11–task18 | `Set`, `HashSet`, `TreeSet`: уникальность, операции над множествами, `equals/hashCode` |
| 3 | task19–task28 | `Map`, `HashMap`, `TreeMap`, `LinkedHashMap`: частотный словарь, группировка, анаграммы |
| 4 | task29–task33 | `Iterator`, безопасное удаление (избегаем `ConcurrentModificationException`) |
| 5 | task34–task37 | `Comparable` (естественный порядок), `Comparator` (несколько критериев) |
| 6 | task38–task40 | ★ Совмещённые: индекс, голосование, расширенные операции над множествами |
