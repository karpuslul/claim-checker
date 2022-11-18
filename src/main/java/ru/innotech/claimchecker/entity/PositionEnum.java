package ru.innotech.claimchecker.entity;

import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.util.Optional;

@Slf4j
public enum PositionEnum {

    /**
     * Владелец организации.
     */
    OWNER,

    /**
     * Главный бухгалтер.
     */
    CHIEF_ACCOUNTANT;

    public static Optional<PositionEnum> fromString(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return Optional.empty();
        }
        val trimmedValue = value.trim();
        try {
            return Optional.of(
                    PositionEnum.valueOf(trimmedValue)
            );
        } catch (IllegalArgumentException e) {
            log.error("Тип должности не возможно определить по значению: '{}'", trimmedValue, e);
            return Optional.empty();
        }
    }

}