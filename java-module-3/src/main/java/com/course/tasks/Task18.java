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
        if (!protocol.equals("http") && !protocol.equals("https")) {
            throw new IllegalArgumentException("");
        }
        if (host == null || host.isEmpty()) {
            throw new IllegalArgumentException("");
        }
        if (port < 1 || port > 65535) {
            throw new IllegalArgumentException("");
        }
        if (!path.startsWith("/")) {
            throw new IllegalArgumentException("");
        }
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public void setPort(int port) {
        if (port < 1 || port > 65535) {
            throw new IllegalArgumentException("");
        }
        this.port = port;
    }

    public void setPath(String path) {
        if (!path.startsWith("/")) {
            throw new IllegalArgumentException("");
        }
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task18 that = (Task18) o;
        return this.protocol.equals(that.protocol) && this.host.equals(that.host) && this.port == that.port && this.path.equals(that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, host, port, path);
    }

    @Override
    public String toString() {
        return (protocol + "://" + host + ":" + port + path);
    }
}
