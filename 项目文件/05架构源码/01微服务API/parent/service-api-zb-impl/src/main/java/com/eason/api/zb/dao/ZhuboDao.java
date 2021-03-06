package com.eason.api.zb.dao;

import com.eason.api.zb.po.ZbTZhubo;
import com.eason.api.zb.po.ZbUcUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Map;

public interface ZhuboDao extends JpaRepository<ZbTZhubo, Integer>, PagingAndSortingRepository<ZbTZhubo, Integer> {

    ZbTZhubo findByUserId(Integer userId);

    @Query(value = "SELECT COALESCE(SUM(t.points),0) FROM qvod_zb_t_consume_logs t WHERE t.send_uid=?1 and t.type=1",nativeQuery = true)
    Integer getDiamondGiftZBTotal(Integer userId);

    @Query(value = "SELECT COALESCE(SUM(t.points),0) FROM qvod_zb_t_consume_logs t WHERE t.send_uid=?1 ",nativeQuery = true)
    Integer getCostTotal(Integer userId);
}
