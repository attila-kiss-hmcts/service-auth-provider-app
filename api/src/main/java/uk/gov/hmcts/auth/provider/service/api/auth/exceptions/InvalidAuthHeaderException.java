package uk.gov.hmcts.auth.provider.service.api.auth.exceptions;

import uk.gov.hmcts.reform.logging.exception.AlertLevel;
import uk.gov.hmcts.reform.logging.exception.UnknownErrorCodeException;

/**
 * SonarQube reports as error. Max allowed - 5 parents
 */
@SuppressWarnings("squid:MaximumInheritanceDepth")
public class InvalidAuthHeaderException extends UnknownErrorCodeException {

    public InvalidAuthHeaderException() {
        super(AlertLevel.P4, (Throwable) null);
    }
}
