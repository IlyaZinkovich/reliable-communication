package io.github.ilyazinkovich.reliable.communication.remote.payments;

import java.math.BigDecimal;

public class Pay {

  private final Long courierId;
  private final BigDecimal amount;

  public Pay(final Long courierId, final BigDecimal amount) {
    this.courierId = courierId;
    this.amount = amount;
  }
}