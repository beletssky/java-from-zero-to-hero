package com.course.tasks;

import com.course.model.Address;
import com.course.model.User;
import java.util.Optional;

public final class Task21 {

  private Task21() {}

  /**
   * Возвращает город пользователя. Любое из звеньев цепочки может быть {@code null}:
   * сам {@code user}, {@code user.getAddress()} или {@code address.getCity()}.
   * Если хотя бы одно звено отсутствует — возвращается {@code "город неизвестен"}.
   *
   * <p>Флагман блока: лестница null-проверок из 8 строк превращается в одну цепочку
   * {@link Optional#ofNullable(Object)} + {@code map} + {@code orElse}, без единого {@code if}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code cityOf(null) -> "город неизвестен"}</li>
   *   <li>{@code cityOf(new User("Anna", null)) -> "город неизвестен"}</li>
   *   <li>{@code cityOf(new User("Anna", new Address(null))) -> "город неизвестен"}</li>
   *   <li>{@code cityOf(new User("Anna", new Address("Kyiv"))) -> "Kyiv"}</li>
   * </ul>
   */
  public static String cityOf(User user) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
