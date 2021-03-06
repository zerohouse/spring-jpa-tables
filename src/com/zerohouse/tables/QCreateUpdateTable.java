package com.zerohouse.tables;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QCreateUpdateTable is a Querydsl query type for CreateUpdateTable
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QCreateUpdateTable extends EntityPathBase<CreateUpdateTable> {

    private static final long serialVersionUID = 1162682819L;

    public static final QCreateUpdateTable createUpdateTable = new QCreateUpdateTable("createUpdateTable");

    public final QCreateTable _super = new QCreateTable(this);

    //inherited
    public final DateTimePath<java.util.Date> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public QCreateUpdateTable(String variable) {
        super(CreateUpdateTable.class, forVariable(variable));
    }

    public QCreateUpdateTable(Path<? extends CreateUpdateTable> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCreateUpdateTable(PathMetadata metadata) {
        super(CreateUpdateTable.class, metadata);
    }

}

