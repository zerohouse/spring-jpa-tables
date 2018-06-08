package com.zerohouse.tables;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public abstract class CreateTable extends IdTable {

    @Column
    protected Date createdAt;

    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }

}
