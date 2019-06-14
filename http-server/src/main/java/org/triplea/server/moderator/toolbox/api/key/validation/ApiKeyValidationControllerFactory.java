package org.triplea.server.moderator.toolbox.api.key.validation;

import org.jdbi.v3.core.Jdbi;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Factory class to create api key validation and security (rate-limiting) classes.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ApiKeyValidationControllerFactory {

  public static ApiKeyValidationController apiKeyValidationController(final Jdbi jdbi) {
    return new ApiKeyValidationController(ApiKeyValidationServiceFactory.apiKeyValidationService(jdbi));
  }
}