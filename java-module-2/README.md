# java-module-2

Продолжение `java-module-1`. Сборник из 35 учебных задач по Java для начинающих по темам **методы, массивы, String, Wrappers**. Каждая задача — отдельный класс `TaskNN` с одним публичным статическим методом и набором тестов JUnit 5 (`TaskNNTest`).

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

Изначально все тесты падают красным, потому что в каждом методе стоит:

```java
// TODO: реализуй
throw new UnsupportedOperationException("TODO: реализуй ...");
```

## Запуск тестов одной задачи

```bash
mvn test -Dtest=Task07Test
```

Можно несколько сразу:

```bash
mvn test -Dtest=Task01Test,Task02Test
```

## Как выполнять

1. **Клонировать репозиторий** и перейти в каталог `java-module-2`.
2. **Открыть в IntelliJ IDEA** как Maven-проект (`File → Open` и выбрать `pom.xml`).
3. **Запустить `mvn test`** — все тесты будут красными.
4. **Найти красный тест** — взять любой из непройденных, например `Task01Test`.
5. **Открыть соответствующий `TaskNN.java`** в `src/main/java/com/course/tasks/`.
6. **Заменить `TODO`** на реальную реализацию (убрать `throw new UnsupportedOperationException(...)`).
7. **Запустить `mvn test` снова** — убедиться, что тесты этой задачи стали зелёными.
8. **Закоммитить изменения**:
   ```bash
   git add src/main/java/com/course/tasks/TaskNN.java
   git commit -m "Task NN: реализация"
   ```
9. **Перейти к следующей задаче.**

## Структура проекта

```
java-module-2/
├── pom.xml
├── README.md
└── src/
    ├── main/java/com/course/tasks/
    │   ├── Task01.java
    │   ├── Task02.java
    │   └── ... Task35.java
    └── test/java/com/course/tasks/
        ├── Task01Test.java
        ├── Task02Test.java
        └── ... Task35Test.java
```

## Содержание задач

### Блок 1. Методы

| №  | Класс  | Тема                                       |
|----|--------|--------------------------------------------|
| 01 | Task01 | `square(int n)` — квадрат числа            |
| 02 | Task02 | `inRange(int n, int min, int max)` — диапазон |
| 03 | Task03 | `celsiusToFahrenheit(double c)` — конвертация |
| 04 | Task04 | `max3(int, int, int)` через `max2`         |
| 05 | Task05 | Перегрузка `sum(int,int)` и `sum(int,int,int)` |

### Блок 2. Массивы

| №  | Класс  | Тема                                       |
|----|--------|--------------------------------------------|
| 06 | Task06 | `sumArray(int[])` — сумма                  |
| 07 | Task07 | `maxArray(int[])` — максимум               |
| 08 | Task08 | `minArray(int[])` — минимум                |
| 09 | Task09 | `avgArray(int[])` — среднее                |
| 10 | Task10 | `indexOf(int[], int)`                      |
| 11 | Task11 | `contains(int[], int)`                     |
| 12 | Task12 | `countEvens(int[])`                        |
| 13 | Task13 | `reverse(int[])` — новый массив            |
| 14 | Task14 | `doubleEach(int[])`                        |
| 15 | Task15 | `filterPositive(int[])`                    |
| 16 | Task16 | `secondMax(int[])` — второе уникальное     |
| 17 | Task17 | `concat(int[], int[])`                     |

### Блок 3. String

| №  | Класс  | Тема                                       |
|----|--------|--------------------------------------------|
| 18 | Task18 | `countChar(String, char)`                  |
| 19 | Task19 | `reverseString(String)`                    |
| 20 | Task20 | `isPalindromeString(String)`               |
| 21 | Task21 | `toTitleCase(String)`                      |
| 22 | Task22 | `countWords(String)`                       |
| 23 | Task23 | `removeVowels(String)`                     |
| 24 | Task24 | `isAnagram(String, String)`                |
| 25 | Task25 | `repeat(String, int)`                      |

### Блок 4. Wrappers

| №  | Класс  | Тема                                       |
|----|--------|--------------------------------------------|
| 26 | Task26 | `parseOrDefault(String, int)`              |
| 27 | Task27 | `sumOrZero(Integer, Integer)`              |
| 28 | Task28 | `isDigitOnly(String)`                      |
| 29 | Task29 | `findMax(Integer[])`                       |
| 30 | Task30 | `safeDivide(Integer, Integer)`             |

### Блок 5. На подумать

| №  | Класс  | Тема                                       |
|----|--------|--------------------------------------------|
| 31 | Task31 | `sortAsc(int[])` без `Arrays.sort`         |
| 32 | Task32 | `removeDuplicates(int[])`                  |
| 33 | Task33 | `mostFrequentWord(String)`                 |
| 34 | Task34 | `rotateRight(int[], int)`                  |
| 35 | Task35 | `isValidBrackets(String)` — стек скобок    |
