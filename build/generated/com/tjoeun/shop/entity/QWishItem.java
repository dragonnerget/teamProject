package com.tjoeun.shop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWishItem is a Querydsl query type for WishItem
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWishItem extends EntityPathBase<WishItem> {

    private static final long serialVersionUID = 1926871081L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWishItem wishItem = new QWishItem("wishItem");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QItem item;

    public final QMember member;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public final QWish wish;

    public QWishItem(String variable) {
        this(WishItem.class, forVariable(variable), INITS);
    }

    public QWishItem(Path<? extends WishItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWishItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWishItem(PathMetadata metadata, PathInits inits) {
        this(WishItem.class, metadata, inits);
    }

    public QWishItem(Class<? extends WishItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItem(forProperty("item")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
        this.wish = inits.isInitialized("wish") ? new QWish(forProperty("wish"), inits.get("wish")) : null;
    }

}

