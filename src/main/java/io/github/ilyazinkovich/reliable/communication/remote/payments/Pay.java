package io.github.ilyazinkovich.reliable.communication.remote.payments;

import java.math.BigDecimal;

class Pay {

  final Long courierId;
  final BigDecimal amount;

  Pay(final Long courierId, final BigDecimal amount) {
    this.courierId = courierId;
    this.amount = amount;
  }
}
