package com.zerohouse.tables;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public abstract class IdTable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
}
