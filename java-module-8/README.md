# java-module-8

Модуль 8 — **лямбды, функциональные интерфейсы, `Optional`, Stream API**. Сборник из 50 учебных задач: каждая — статический метод (или несколько) в отдельном классе `TaskNN` + тесты JUnit 5. Общие модельные классы лежат в `com.course.model`.

45 обычных задач + 5 со звёздочкой (Task46–Task50).

## ⚠️ ПРАВИЛА МОДУЛЯ

Эти правила — суть модуля. Ученик обязан их соблюдать; преподаватель проверяет глазами (тесты только проверяют поведение).

1. **Внутри решений нельзя использовать `for`, `while`, `if`** — только Stream API. Тернарный оператор (`условие ? a : b`) — можно.
2. **`parallelStream()` и `.parallel()` — ЗАПРЕЩЕНЫ**.
3. **`reduce()` — ЗАПРЕЩЁН**. Вместо него используем `sum()` / `count()` / `max()` / `min()` / `average()` и готовые коллекторы.
4. **Возвращать `null` из методов нельзя** — для «может не быть значения» есть `Optional`.

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

Изначально все тесты падают красным — тело каждого метода задачи содержит:

```java
// TODO: реализуй (только Stream API, без for/if/reduce/parallel)
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

## Как работать с TODO

1. Открой проект в IntelliJ IDEA (`File → Open` → выбрать `pom.xml`).
2. `mvn test` — все красные.
3. Найди красный тест, например `Task07Test`.
4. Открой соответствующий `TaskNN.java` в `src/main/java/com/course/tasks/`.
5. Прочитай javadoc (там пример входа/выхода) и реализуй метод, **соблюдая правила модуля**.
6. `mvn test -Dtest=TaskNNTest` — добейся зелёного.
7. Закоммить и переходи дальше.

## Модельные классы (не трогать)

В пакете `com.course.model` — общие модели, они **уже реализованы** и используются в задачах:

- `Employee(String name, String dept, int salary, int age, List<String> skills)` — immutable.
- `Item(String name, double price)` — immutable.
- `Order(int id, String customer, List<Item> items)` — immutable.
- `Address(String city)` — city может быть `null`.
- `User(String name, Address address)` — address может быть `null`.

## Структура проекта

```
java-module-8/
├── pom.xml
├── README.md
└── src/
    ├── main/java/com/course/
    │   ├── model/          — Employee, Item, Order, Address, User
    │   └── tasks/          — Task01.java ... Task50.java
    └── test/java/com/course/tasks/
                             — Task01Test.java ... Task50Test.java
```

## Содержание блоков

| Блок | Задачи | Тема |
|------|--------|------|
| 1 | Task01–Task08 | Лямбды, method references (в комментарии — «старый» вариант с anonymous class) |
| 2 | Task09–Task14 | Функциональные интерфейсы (Function, Predicate, Consumer, Supplier), композиция |
| 3 | Task15–Task22 | `Optional` — избавляемся от `null`, `map`/`filter`/`orElse`/`orElseThrow` |
| 4 | Task23–Task37 | Stream: `filter`, `map`, `sorted`, `distinct`, `limit`, `count`, `sum`, `findFirst`, `allMatch` |
| 5 | Task38–Task45 | Collectors: `groupingBy`, `partitioningBy`, `counting`, `mapping`, `averagingInt`, `joining` |
| 6 | ★ Task46–Task50 | `flatMap`, комбинации, `Collectors.flatMapping` |
