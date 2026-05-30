# java-from-zero-to-hero

Навчальний репозиторій з задачами на Java (Maven, JUnit 5).

## Структура

Три незалежні Maven-модулі, у кожного свій `pom.xml`:

| Модуль | Тема |
|---|---|
| `java-module-1` | базовий синтаксис, методи, умови, цикли |
| `java-module-2` | масиви, рядки, алгоритми |
| `java-module-3` | ООП (45 задач) |

Кожна задача — це клас `TaskNN` у `src/main/java/com/course/tasks/`, а перевірка до неї — тест `TaskNNTest` у `src/test/java/com/course/tasks/`.

---

## Як здавати домашнє завдання (важливо, прочитай повністю)

> **Головні правила:**
> 1. У `main` пушити **не можна** — він захищений. Усі домашки йдуть через Pull Request.
> 2. Свій PR ти націлюєш **не на `main`**, а на **свою персональну гілку `homework/<ім'я>`** (див. таблицю нижче).
> 3. PR можна злити, **тільки коли зелений** check **`Tests for changed files`** — тобто тести для змінених тобою задач проходять.

### Твоя персональна гілка

| Студент | GitHub | Твоя гілка для PR (база) |
|---|---|---|
| Артур | `pachvash-lab` | `homework/arthur` |
| Нікіта | `Lordeyser` | `homework/nikita` |
| Ліза | `lavrenchukkliza-prog` | `homework/liza` |
| Катя | `katefedchenko` | `homework/kate` |

Далі скрізь замість `homework/<ім'я>` підставляй **свою** гілку з таблиці.

### Крок 0 — один раз: клонувати репозиторій

```bash
git clone https://github.com/beletssky/java-from-zero-to-hero.git
cd java-from-zero-to-hero
```

### Крок 1 — оновити свою базову гілку

Перед кожною новою домашкою підтягни свіжу `homework/<ім'я>`:

```bash
git fetch origin
git switch homework/<ім'я>        # напр. git switch homework/kate
git pull origin homework/<ім'я>
```

### Крок 2 — створити гілку під завдання

Назви її зрозуміло, напр. `kate/module-01-tasks` або `nikita-dz-3`:

```bash
git switch -c <назва-гілки>       # напр. git switch -c kate/module-01-tasks
```

### Крок 3 — зробити завдання

Відкрий потрібний `TaskNN.java` у `src/main/java/com/course/tasks/` і впиши свою реалізацію замість `// TODO`.

### Крок 4 — запустити тести **локально** (до пушу!)

Весь модуль:

```bash
mvn -f java-module-1/pom.xml test
```

Тільки одну задачу (швидше):

```bash
mvn -f java-module-1/pom.xml test -Dtest=Task05Test
```

Кілька задач одразу:

```bash
mvn -f java-module-3/pom.xml test -Dtest=Task01Test,Task02Test
```

> Потрібен **JDK 21** і Maven. Перевір: `java -version` та `mvn -version`.

Домагайся `BUILD SUCCESS`, `Failures: 0, Errors: 0`.

### Крок 5 — закоммітити і запушити свою гілку

```bash
git add .
git commit -m "module-01: задачі 1-10"
git push -u origin <назва-гілки>
```

### Крок 6 — створити Pull Request у **свою** `homework/<ім'я>`

**Через сайт GitHub:**
1. Відкрий репозиторій → побачиш банер **Compare & pull request** → натисни.
2. **Обов'язково** зверху зміни **base** з `main` на **свою** `homework/<ім'я>`.
   (поля виглядають так: `base: homework/<ім'я>` ← `compare: <назва-гілки>`)
3. Додай назву й опис → **Create pull request**.

**Або через GitHub CLI (`gh`):**

```bash
gh pr create --base homework/<ім'я> --head <назва-гілки> \
  --title "module-01: задачі 1-10" --body "Готові задачі 1-10"
```

### Крок 7 — дочекатись зелених тестів

Унизу PR з'явиться перевірка **`Tests for changed files`**:
- 🟡 жовте коло — тести ще біжать, зачекай;
- ✅ зелена галочка — усі тести змінених задач пройшли, можна мерджити;
- ❌ червоний хрестик — якийсь тест упав. Натисни **Details**, подивись, який `TaskNNTest` і чому, виправ код, зроби новий `commit` + `push` у ту саму гілку — перевірка перезапуститься сама.

### Крок 8 — мердж

Коли check зелений — **викладач** зливає твій PR у `homework/<ім'я>`. Готово 🎉

---

## Часті проблеми

- **«Я не можу запушити в main / PR не дає смержити в main»** — так і має бути, main захищений. Націлюй PR на `homework/<ім'я>`.
- **Check червоний, а локально все ок** — перевір, що ти закоммітив і запушив усі файли (`git status`), і що використовуєш JDK 21.
- **PR показує «Waiting for status»** — зроби будь-який новий коміт у гілку й запуш; перевірка стартує на новий коміт.
- **Конфлікти в PR** — підтягни свіжу базу у свою гілку:
  ```bash
  git fetch origin
  git merge origin/homework/<ім'я>
  # розв'яжи конфлікти, потім:
  git add . && git commit && git push
  ```

## Запуск усіх тестів модуля (шпаргалка)

```bash
mvn -f java-module-1/pom.xml test      # модуль 1
mvn -f java-module-2/pom.xml test      # модуль 2
mvn -f java-module-3/pom.xml test      # модуль 3
```
