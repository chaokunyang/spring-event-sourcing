package com.elasticjee.catalog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * {@link CatalogInfo}领域类提供基于关系数据库的管理能力
 * @author chaokunyang
 */
@Repository
public interface CatalogInfoRepository extends JpaRepository<CatalogInfo, String> {
    CatalogInfo findCatalogInfoByActive(@Param("active") Boolean active);
}