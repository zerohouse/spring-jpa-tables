package com.zerohouse.tables;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QIdTable is a Querydsl query type for IdTable
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QIdTable extends EntityPathBase<IdTable> {

    private static final long serialVersionUID = -1528985651L;

    public static final QIdTable idTable = new QIdTable("idTable");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QIdTable(String variable) {
        super(IdTable.class, forVariable(variable));
    }

    public QIdTable(Path<? extends IdTable> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIdTable(PathMetadata metadata) {
        super(IdTable.class, metadata);
    }

}

