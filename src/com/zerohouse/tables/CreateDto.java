package com.zerohouse.tables;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class CreateDto extends IdDto {
    protected Date createdAt;
}
