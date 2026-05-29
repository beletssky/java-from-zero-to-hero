package com.course.tasks;

import java.util.Objects;

/**
 * UA: Модель URL-адреси (Url).
 * <p>Поля:
 * <ul>
 *   <li>{@code protocol} — протокол (незмінне, final, лише "http" або "https").</li>
 *   <li>{@code host} — хост (незмінне, final, не порожній).</li>
 *   <li>{@code port} — порт (змінюване, 1..65535).</li>
 *   <li>{@code path} — шлях (змінюване, починається з "/").</li>
 * </ul>
 * Валідація: protocol "http"/"https"; host не порожній; port 1..65535; path починається з "/". Інакше IllegalArgumentException.
 * Сетери: {@code setPort(int)} (1..65535); {@code setPath(String)} (починається з "/").
 * toString у вигляді "protocol://host:port/path", напр. "https://example.com:8080/path".
 *
 * <p>RU: Модель URL-адреса (Url).
 * <p>Поля:
 * <ul>
 *   <li>{@code protocol} — протокол (неизменяемое, final, только "http" или "https").</li>
 *   <li>{@code host} — хост (неизменяемое, final, не пустой).</li>
 *   <li>{@code port} — порт (изменяемое, 1..65535).</li>
 *   <li>{@code path} — путь (изменяемое, начинается с "/").</li>
 * </ul>
 * Валидация: protocol "http"/"https"; host не пустой; port 1..65535; path начинается с "/". Иначе IllegalArgumentException.
 * Сеттеры: {@code setPort(int)} (1..65535); {@code setPath(String)} (начинается с "/").
 * toString в виде "protocol://host:port/path", напр. "https://example.com:8080/path".
 *
 * <p>Приклад / Пример: new Task18("https", "example.com", 8080, "/path") -&gt; "https://example.com:8080/path".
 */
public class Task18 {

    private final String protocol;
    private final String host;
    private int port;
    private String path;

    public Task18(String protocol, String host, int port, String path) {
        // TODO: реализуй
        validate(protocol, host, port, path);
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
    }

    private void validate(String protocol, String host, int port, String path) {
        if (protocol == null ||
                (!protocol.equals("http") && !protocol.equals("https"))) {
            throw new IllegalArgumentException();
        } else if (host.isEmpty()) {
            throw new IllegalArgumentException();
        } else if (port < 1 || port > 65535) {
            throw new IllegalArgumentException();
        } else if (!path.startsWith("/")) {
            throw new IllegalArgumentException();
        }
    }

    public String getProtocol() {
        // TODO: реализуй
        return protocol;
    }

    public String getHost() {
        // TODO: реализуй
        return host;
    }

    public int getPort() {
        // TODO: реализуй
        return port;
    }

    public String getPath() {
        // TODO: реализуй
        return path;
    }

    public void setPort(int port) {
        // TODO: реализуй
        validate(this.protocol, this.host, port, this.path);
        this.port = port;
    }

    public void setPath(String path) {
        // TODO: реализуй
        validate(this.protocol, this.host, this.port, path);
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task18 task18)) return false;
        return Objects.equals(this.protocol, task18.protocol)
                && Objects.equals(this.host, task18.host)
                && this.port == task18.port
                && Objects.equals(this.path, task18.path);

    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(protocol, host, port, path);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return String.format("%s://%s:%d%s", protocol, host, port, path);
    }
}
