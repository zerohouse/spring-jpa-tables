package com.zerohouse.tables;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public abstract class IdDto {
    protected Long id;
}
