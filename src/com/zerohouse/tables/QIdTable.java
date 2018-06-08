package com.zerohouse.tables;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;

import static com.mysema.query.types.PathMetadataFactory.*;


/**
 * QIdTable is a Querydsl query type for IdTable
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
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

    public QIdTable(PathMetadata<?> metadata) {
        super(IdTable.class, metadata);
    }

}

