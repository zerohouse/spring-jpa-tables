package com.zerohouse.tables;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QCreateTable is a Querydsl query type for CreateTable
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QCreateTable extends EntityPathBase<CreateTable> {

    private static final long serialVersionUID = -893748340L;

    public static final QCreateTable createTable = new QCreateTable("createTable");

    public final QIdTable _super = new QIdTable(this);

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public QCreateTable(String variable) {
        super(CreateTable.class, forVariable(variable));
    }

    public QCreateTable(Path<? extends CreateTable> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCreateTable(PathMetadata metadata) {
        super(CreateTable.class, metadata);
    }

}

